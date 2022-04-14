package com.varun.recursion;

import java.util.Stack;

public class SortStackDescending {
    public void sort(Stack<Integer> stack){
        if(stack.size()==1){
            return;
        }

        int temp = stack.peek();
        stack.pop();

        sort(stack);

        insert(stack, temp);
    }

    private void insert(Stack<Integer> stack, int temp) {
        if(stack.empty()|| stack.peek() <= temp){
            stack.push(temp);
            return;
        }

        int val = stack.peek();
        stack.pop();

        insert(stack, temp);

        stack.push(val);
    }
}
