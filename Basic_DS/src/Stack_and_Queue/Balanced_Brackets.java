//Question

//1. You are given a string exp representing an expression.
//2. You are required to check if the expression is balanced 
//i.e. closing brackets and opening brackets match up well.
//
//e.g.
//[(a + b) + {(c + d) * (e / f)}] -> true
//[(a + b) + {(c + d) * (e / f)]} -> false
//[(a + b) + {(c + d) * (e / f)} -> false
//([(a + b) + {(c + d) * (e / f)}] -> false
//
//Constraints
//0 <= str.length <= 100
//
//Format
//Input
//A string str
//
//Output
//true or false
//
//Example
//Sample Input
//
//[(a + b) + {(c + d) * (e / f)}]
//
//Sample Output
//true

//Code=>>

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str = scn.nextLine();
	
	Stack<Character> st = new Stack<>();
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(ch == '(' || ch == '{' || ch == '[') {
			st.push(ch);
		}else if(ch == ')') {
			boolean val = handleClosing(st, '(');
			if(val == false) {
				System.out.println(val);
				return;
			}
		}else if(ch == '}') {
			boolean val = handleClosing(st, '{');
			if(val == false) {
				System.out.println(val);
				return;
			}
		}else if(ch == ']') {
			boolean val = handleClosing(st, '[');
			if(val == false) {
				System.out.println(val);
				return;
			}
		}else {
			
		}
	}
	if(st.size() == 0) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
}

public static boolean handleClosing(Stack<Character> st, char corresoch) {
	if(st.size() == 0) {
		return false;
	}else if(st.peek() != corresoch) {
		return false;
	}else {
		st.pop();
		return true;
	}
 }
}

//approach 
// 1. opening bracket ko daal do
//2. jb closing bracket aayega to dekhiye ki top pr uska counter part h ki nhi h,, agr nhi h to false 
//3. stack khali h , closing bracket aaya stack khali h to false

//1. opening bracket h to push
//2. closing bracket to check kariye ki counter part h ki nhi.. agr h to pop nhi to false
//3. close me pop karenge agr size non zero hai aur appropriate chij pari h.. agr size zero h to bhi false .. agr appropriate chij nhi pari to bhi false
//4. appropriate chij nhi pari tomiss match hua h, size zero h to closing bracket jada a gye h...


