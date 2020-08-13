package devfoundry.testing.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTestSuite {


    @ParameterizedTest
    @ValueSource(ints = {0, 1, 99, 100})
    public void shouldNotThrowExceptionIfFirstCoordinateIsBetween0And100Inclusive(int x) {
        assertDoesNotThrow(() -> new Coordinates(x, 5));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/positiveNumbers.csv", numLinesToSkip = 1)
    public void shouldNotThrowExceptionForBothCoordinatesWithValuesBetweenZeroAnd100Inclusive(int x, int y) {
        assertDoesNotThrow(() -> new Coordinates(x, y));
    }

    @Test
    public void shouldThrowExceptionForConstructorWithValuesAbove100() {
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(101, 0));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersAbove100.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionForConstructorWithValuesAbove100MoreExamples(int x, int y) {
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(x, y));
    }

    @Test
    public void shouldThrowExceptionForConstructorWithValuesBelow0() {
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(-1, 0));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersBelow0.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionForConstructorWithValuesBelow0MoreExamples(int x, int y) {
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(x, y));
    }

    @Test
    public void copyShouldReturnNewObject() {
        //given
        Coordinates coordinates = new Coordinates(5, 5);
        //when
        Coordinates copy = Coordinates.copy(coordinates, 0, 0);
        //Coordinates coordinates1 = coordinates;
        //then
        assertEquals(copy, coordinates);
        assertNotSame(copy, coordinates);
        //assertSame(coordinates, coordinates1); ten sam obiekt; a equals - taki sam;

    }

    @Test
    public void copyShouldAddCoordinates(){
        //given
        Coordinates coordinates = new Coordinates(5, 5);
        //when
        Coordinates copy = Coordinates.copy(coordinates, 2, 3);
        //then
        assertEquals(7, copy.getX());
        assertEquals(8, copy.getY());
        assertThat(copy.getX(), equalTo(7));

    }

}