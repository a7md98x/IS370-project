import java.io.*;
import java.util.*;

class stck {
    static void st_push(Stack<Integer>stack,int x,int times){
        for (int i = 0; i < times; i++) {
            stack.push(x);
        }

    }


    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
 
        for(int i = 0; i<1; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }



    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        st_push(stack,999,1);
        stack_pop(stack);
        st_push(stack,8,1);

        stack_search(stack, 2);
        stack_search(stack, 6);
        
    }
}