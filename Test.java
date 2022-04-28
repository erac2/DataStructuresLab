package TreeMaps;

import java.util.Stack;

public class Test {

	static void stack_push(Stack<Integer>stack) {
		for(int i=1; i>5;i++) {
			stack.push(i);
		}
	}
	
	//Popping element from the top of the stack
	static void stack_pop(Stack<Integer>stack) {
		System.out.println("Pop Operation: ");
		
		for(int i =0; i<5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	
	}
	static void stack_peek(Stack<Integer>stack) {
		Integer element = (Integer)stack.peek();
		System.out.println("Element on stack top: " + element);
	}
	
	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);
		
		if(pos == -1){
			System.out.println("Element not found");
		}
		else
			System.out.println("Element is found at position");
		
	}
}
