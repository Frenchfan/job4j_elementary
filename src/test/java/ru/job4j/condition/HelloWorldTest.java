package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void checkNumberHelloWorld() {
        String s = HelloWorld.checkNumber(15);
        assertThat(s, is("Hello, World!!!"));
    }

    @Test
    public void checkNumberHello() {
        String s = HelloWorld.checkNumber(9);
        assertThat(s, is("Hello"));
    }

    @Test
    public void checkNumberWorld() {
        String s = HelloWorld.checkNumber(25);
        assertThat(s, is("World"));
    }

    @Test
    public void checkNumberDefault() {
        String s = HelloWorld.checkNumber(14);
        assertThat(s, is("Operation not support"));
    }

    @Test
    public void calculateIs400() {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int rsl = HelloWorld.calculate(hours);
        assertThat(rsl, is(400));
    }

    @Test
    public void calculateIs410() {
        int[] hours = {10, 10, 10, 0, 8, 0, 0};
        int rsl = HelloWorld.calculate(hours);
        assertThat(rsl, is(410));
    }

    @Test
    public void calculateIs690() {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = HelloWorld.calculate(hours);
        assertThat(rsl, is(690));
    }

    @Test
    public void checkTrue() {
        boolean rsl = HelloWorld.check2("", "");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean rsl = HelloWorld.check2("sparkling", "groups");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkFalse() {
        boolean rsl = HelloWorld.check2("booking", "grabber");
        assertThat(rsl, is(false));
    }
}