package Day11;
import java.util.*;

public class StackPushPopExample {

	public static void main(String[] args) {

		//creating an object of Stack class
		Stack<Integer> stk = new Stack<>();
		System.out.println("Stack: " + stk);
		
		//pushing elements into the stack
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);
		pushelmnt(stk, 11);
		pushelmnt(stk, 45);
		pushelmnt(stk, 18);

		//popping elements from the stack
		popelemnt(stk);
		popelemnt(stk);

		//throws exception if the stack is empty
		
		try
		{
			popelemnt(stk);
		}
		catch(EmptyStackException e)
		{
			System.out.println("Empty stack");
		}
	}
	//performing push operation
	static void pushelmnt(Stack stk, int x)
	{
		//invoking push() method
		stk.push(new Integer(x));
		System.out.println("Push ->" + x);
		//prints modified stack
		System.out.println("Stack: " + stk);
	}
	
	//performing pop operation
	static void popelemnt(Stack stk) {
		System.out.print("pop -> ");
		//invoking pop() method
		Integer x = (Integer)stk.pop();
		System.out.println(x);
		//prints modified stack
		System.out.println("Stack: " + stk);
	}

}
