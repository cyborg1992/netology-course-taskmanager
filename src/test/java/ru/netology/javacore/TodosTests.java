package ru.netology.javacore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodosTests {
    Todos todos;

    @BeforeEach
    void setUp() {
        todos = new Todos();
        todos.addTask("test");
    }

    @AfterEach
    void tearDown() {
        todos = null;
    }

    @Test
    void testAddTask() {
        Assertions.assertTrue(todos.addTask("test2"));
        Assertions.assertFalse(todos.addTask("test"));
    }

    @Test
    void testRemoveTask() {
        Assertions.assertTrue(todos.removeTask("test"));
        Assertions.assertFalse(todos.removeTask("test"));
    }

    @Test
    void testGetAllTasks() {
        String expected = "test";
        String actual = todos.getAllTasks();
        Assertions.assertEquals(expected, actual);
    }
}
