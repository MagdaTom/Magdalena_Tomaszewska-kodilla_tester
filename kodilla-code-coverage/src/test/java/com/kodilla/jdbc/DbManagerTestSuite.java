package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    private DbManager dbManager;
    private Statement statement;
    private ResultSet rs;

    @BeforeEach
    public void initConnection()throws SQLException{
        dbManager = DbManager.getInstance();
    }

    @Test
    public void testConnect(){
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);
        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        String countUsersWith2AndMorePosts = "Select Count(*)\n" +
        "from users u\n" +
                "inner join posts p\n" +
                "on u.id = p.user_id\n" +
                "group by p.user_id\n" +
                "having count(*) >=2;";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(countUsersWith2AndMorePosts);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        //When
        String sqlQuery = "Select u.firstname, u.lastname, Count(*)\n" +
                "from users u\n" +
                "inner join posts p\n" +
                "on u.id = p.user_id\n" +
                "group by p.user_id\n" +
                "having count(*) >=2;";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("firstname") + ", " + rs.getString("lastname"));
            counter++;
        }
        int expected = count;
        Assertions.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }
}
