package com.varun.recursion;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SortStackAscendingTest {

    @Test
    void TestSortMethod() {
        Stack< Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        stack.push(0);
        stack.push(1);

        Stack<Integer> sortedStack = new Stack<>();
        sortedStack.push(5);
        sortedStack.push(2);
        sortedStack.push(1);
        sortedStack.push(0);
        System.out.println("Unsorted");
        System.out.println(stack);

        //sort

        SortStackAscending sortStackAscending = new SortStackAscending();
        sortStackAscending.sort(stack);

        System.out.println("Sorted");
        System.out.println(stack);

        //assert

        assertTrue(sortedStack.equals(stack));
    }
}