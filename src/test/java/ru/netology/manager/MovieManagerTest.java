package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager(5);
    private MovieItem first = new MovieItem(1, 1, "RED");
    private MovieItem second = new MovieItem(2, 2, "SAW");
    private MovieItem third = new MovieItem(3, 3, "Love Actually");
    private MovieItem fourth = new MovieItem(4, 4, "VHS");
    private MovieItem fifth = new MovieItem(5, 5, "SAW2");
    private MovieItem sixth = new MovieItem(6, 6, "Frozen");
//    private MovieItem seventh = new MovieItem(7, 7, "FrozenII");
//    private MovieItem eighth = new MovieItem(8, 8, "Loosers");
//    private MovieItem ninth = new MovieItem(9, 9, "Twins");
//    private MovieItem tenth = new MovieItem(10, 10, "Friends");
//    private MovieItem eleventh = new MovieItem(11, 11, "Ghost");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);

    }
        @Test
        public void shouldRemoveIfExists() {
            int idToRemove = 3;
            manager.removeById(idToRemove);

            MovieItem[] actual = manager.getAll();
            MovieItem[] expected = new MovieItem[]{sixth, fifth, fourth, second, first};

    assertArrayEquals(expected, actual);

        }
    @Test
    public void shouldShowWhatsThere() {

        MovieItem item = new MovieItem();
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{sixth, fifth, fourth, third, second};
   assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowIf4() {
      MovieManager manager = new MovieManager(4);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{sixth, fifth, fourth, third};
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
        MovieManager manager = new MovieManager(0);

        MovieItem[] expected = new MovieItem[]{};
        MovieItem [] actual = manager.getAll();
    }
//        @Test
//        public void shouldNotRemoveIfNotExists() {
//            int idToRemove = 4;
//
//            manager.removeById(idToRemove);
//
//            PurchaseItem[] actual = manager.getAll();
//            PurchaseItem[] expected = new PurchaseItem[]{third, second, first};
//
//            assertArrayEquals(expected, actual);
//        }



}

