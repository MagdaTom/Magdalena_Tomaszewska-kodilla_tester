package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate2";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("Urgent", DESCRIPTION);
        TaskList taskList1 = new TaskList("Urgent", DESCRIPTION);
        taskListRepository.save(taskList);
        taskListRepository.save(taskList1);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals(2, readTaskLists.size());

        //CleanUp
        taskListRepository.deleteAll();
    }
}
