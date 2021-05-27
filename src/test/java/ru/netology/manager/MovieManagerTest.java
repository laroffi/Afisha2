package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private MovieItem first = new MovieItem(1, 1, "RED");
    private MovieItem second = new MovieItem(2, 2, "SAW");
    private MovieItem third = new MovieItem(3, 3, "Love Actually");
    private MovieItem fourth = new MovieItem(4, 4, "VHS");
    private MovieItem fifth = new MovieItem(5, 5, "SAW2");
    private MovieItem sixth = new MovieItem(6, 6, "Frozen");
    private MovieItem seventh = new MovieItem(7, 7, "FrozenII");
    private MovieItem eighth = new MovieItem(8, 8, "Loosers");
    private MovieItem ninth = new MovieItem(9, 9, "Twins");
    private MovieItem tenth = new MovieItem(10, 10, "Friends");
    private MovieItem eleventh = new MovieItem(11, 11, "Ghost");



    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
//        manager.add(tenth);

    }

    @Test
    public void shouldShowWhatsThere9() {

        MovieItem item = new MovieItem();
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
   assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowIf11() {
        manager.add(tenth);
        manager.add(eleventh);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
    assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldShowMinus1() {
        MovieManager manager = new MovieManager(-2);

        MovieItem[] expected = new MovieItem[] {};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow0() {
     manager = new MovieManager();

        MovieItem[] expected = new MovieItem[]{};
        MovieItem [] actual = manager.getAll();
    }
    @Test
    public void shouldRemoveIfExists() {
        int idToRemove = 5;
        manager.removeById(idToRemove);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{ninth, eighth, seventh, sixth, fourth, third, second, first};


        assertArrayEquals(expected, actual);
    }
@Test
    public void shouldChangeMaxAmount() {
       MovieManager manager = new MovieManager(3);
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{seventh, sixth, fifth};

    assertArrayEquals(expected, actual);

}



}

