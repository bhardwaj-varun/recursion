package com.varun.recursion;

import java.util.Stack;
public class SortStackAscending {

    public void sort(Stack stack){
            //base condition
            if(stack.size() == 1 ){
                return;
            }

            //hypothesis
            int temp = (int) stack.peek();
            stack.pop();
            sort(stack);

            //induction
            insert(stack, temp);
    }

    public void insert(Stack stack, int temp){
        //base condition
        try{
         if(stack.size()==0 || ((int)stack.peek() >= temp)){
            stack.push(temp);
            return;
        }

        //hypothesis
        int val = (int) stack.peek();
                stack.pop();

        insert(stack, temp);

        //induction
        stack.push(val);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
