package may21;

import java.util.*;

public class snqdemo {

	public static void stack_Demo() {
		Stack<Integer> st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		while (st.size() > 0) {
			System.out.println(st.peek());
			st.pop();
		}
	}

	public static void printarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void SmallestNo(String str) {
		Stack<Integer> st = new Stack();
		int j = 1;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			st.push(j++); // pushing j and incrementing
			// pushing the answer // no case for 'd' as incrementing will be
			// done in both cases
			// of d and i

			// pushing and poping(whole stack) the stack
			if (ch == 'i') {

				while (st.size() > 0) {
					System.out.print(st.peek() + " ");
					st.pop();
				}

			}
		}
		// these last lines only for cases with single s or i;
		st.push(j++);
		while (st.size() > 0) {
			System.out.print(st.peek() + " ");
			st.pop();
		}

	}

	// next greater element
	public static void NGE(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack();
		ans[arr.length - 1] = -1;
		st.push(arr[arr.length - 1]);
		for (int i = arr.length - 2; i >= 0; i--) {

			while (st.size() > 0 && arr[i] > st.peek()) { // not
															// while(arr[i]>st.peek()
															// && st.size()>0)
				st.pop(); // check size first as next condition asks for st.peek
			}

			// either stack empty or peek greater than arr[i]
			// if(st.size()==0){
			// ans[i]=-1;
			// }
			// else{
			// ans[i]=st.peek();
			/* } OR USE -> */ ans[i] = st.size() == 0 ? -1 : st.peek();

			st.push(arr[i]);

		}
		for (int j = 0; j < ans.length; j++) {
			System.out.print(ans[j] + " ");
		}
	}

	// 2nd way to code NGE
	public static void NGE_Second(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> st = new Stack();
		st.push(0);
		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] > arr[st.peek()]) {
				res[st.peek()] = arr[i];
				st.pop();
			}
			st.push(i);
		}

		while (st.size() > 0) {
			res[st.peek()] = -1;
			st.pop();
		}
		System.out.println(" ");
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j] + " ");
		}
	}

	// next smallest element Right
	public static int[] NSERight(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> st = new Stack();
		st.push(arr.length - 1);
		res[arr.length - 1] = arr.length;
		for (int i = arr.length - 2; i >= 0; i--) {
			while (st.size() > 0 && arr[i] < arr[st.peek()]) {

				st.pop();
			}
			res[i] = st.size() > 0 ? st.peek() : arr.length;
			st.push(i);
		}

		printarray(res);
		return res;
	}

	// next smallest element Left
	public static int[] NSELeft(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> st = new Stack();
		st.push(0);
		res[0] = -1;

		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) {

				st.pop();
			}
			res[i] = st.size() > 0 ? st.peek() : -1;
			st.push(i);
		}

		printarray(res);
		return res;
	}

	// maximum area rectangle
	public static void MAR(int[] arr) {
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		left = NSELeft(arr);
		right = NSERight(arr);
		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = (right[i] - left[i] - 1) * arr[i];
		}

		printarray(ans);

	}

	public static int findmax(int[] arr) {
		Stack<Integer> st = new Stack();
		st.push(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > st.peek()) {
				st.pop();
				st.push(arr[i]);
			}
		}
		return st.peek();

	}

	// Sliding window k is the window
	public static void SW(int[] arr, int k) {
		int[] nge = new int[arr.length];
		Stack<Integer> st = new Stack();
		st.push(arr.length - 1);
		nge[arr.length - 1] = arr.length;
		for (int i = arr.length - 2; i >= 0; i--) {
			while (st.size() > 0 && arr[i] > arr[st.peek()]) {

				st.pop();
			}
			nge[i] = st.size() > 0 ? st.peek() : arr.length;
			st.push(i);
		}

		int[] res = new int[arr.length - k + 1];
		int j = 0;
		for (int i = 0; i < arr.length - k + 1; i++) {
			if (j < i) {
				j = i;
			}
			while (nge[j] < i + k) {
				j = nge[j];
			}
			res[i] = j;
		}
		for (int i = 0; i < res.length; i++) {
			res[i] = arr[res[i]];
		}
		printarray(res);
	}

	// duplicacy of brackets brackets are balanced
	public static boolean duplicatebrackets(String str) {
		Stack<Character> st = new Stack();
		boolean check = false;
		char ch = str.charAt(0);
		st.push(ch);
		for (int i = 1; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == ')') {
				if (st.peek() == '(') {
					check = true;
				}

				else {
					while (st.peek() != '(' || st.size() == 0) {
						st.pop();
					}
					st.pop();
				}
			}

			else {

				st.push(ch);
			}
		}

		return check;
	}

	// celebrity problem using left right ,,,true if celebrity and false if not
	public static boolean CelebrityProblem(boolean[][] arr) {
		int left = 0;
		int right = arr.length - 1;
		boolean check = true;
		while (left < right) {
			// if left know right
			if (arr[left][right] == true) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println(left);
		// now check for last element
		for (int i = 0; i < arr.length; i++) {
			if (i != left) {
				if (arr[i][left] == false || arr[left][i] == true) {
					check = false;
					break;
				}
			}
		}

		return check;
	}

	// very important learn it
	static class Interval implements Comparable<Interval> {
		int start;
		int end;

		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		// can return +ve -ve or 0 as value if +ve this.start>o.start,
		// understand -ve and 0
		public int compareTo(Interval o) {
			return this.start - o.start;
		}
	}

	// overlaping intervals
	public static void Overlapinginterval(int[] start, int[] end) {
		Interval[] intvs = new Interval[start.length];
		for (int i = 0; i < start.length; i++) {
			Interval intv = new Interval(start[i], end[i]);
			intvs[i] = intv;
		}
		Arrays.sort(intvs);

		Stack<Interval> st = new Stack<>();
		st.push(intvs[0]);

		for (int i = 1; i < intvs.length; i++) {
			if (intvs[i].start <= st.peek().end) {
				st.peek().end = Math.max(st.peek().end, intvs[i].end);
			} else {
				st.push(intvs[i]);
			}

		}

		while (st.size() > 0) {
			System.out.println(st.peek().start + " " + st.peek().end);
			st.pop();
		}
	}
	
	//next greatest element using index and start from ennd
	public static  int[] NGE_index(int [] arr){
		Stack<Integer> st=new Stack<>();
		int [] val=new  int[arr.length];
		st.push(arr.length-1);
		
		for(int i=arr.length-2;i>=0;i++){
			while(st.size()!=0 && arr[i]>=arr[st.peek()]){
				val[st.peek()]+=1;
				
				st.pop();
			}
			
			st.push(i);
		}	
		return val;
	}
	// Stack spin
	public static void Stackspin(int[] arr) {
		int[] span=new int[arr.length];
		
	}

	//Stack span
	public static void stackspan(int[] arr){
		Stack<Integer> st=new Stack<>();
		int[] res =new int[arr.length];
		res[0]=1;
		st.push(0);
		for(int i=1;i<arr.length;i++){
			res[i]=1;
			while(st.size()>0 && arr[st.peek()]<arr[i]){
				res[i]+=res[st.peek()];
				st.pop();
				
			}
			st.push(i);
			
			
		}
		
		printarray(res);
	}
	// balanced bracket
	public static boolean Balancedbracket(String str) {
		Stack<Character> st = new Stack();
		boolean check = true;
		char ch = str.charAt(0);
		st.push(ch);
		for (int i = 1; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == ')' || ch == '}' || ch == ']') {
				if (st.size() == 0) {
					
					check = false;
					break;
				}
				
				
				while (!(st.peek() == '(' || st.peek() == '{' || st.peek() == '[')) {
					
					st.pop();
					
				}
				
				if (ch - st.peek()==1 || ch-st.peek()==2) {
					st.pop();
					
				} 
					else {
					check = false;
					break;
				}
				

			}

			else {

				st.push(ch);
			}
		}
		if (st.size() != 0) {
			
			check = false;
		}

		return check;

	}

	public static int getpriority(char ch) {
		if (ch == '+' || ch == '-') {
			return 1;
		} else if (ch == '*' || ch == '/' || ch == '%') {
			return 2;
		} else if (ch == '^') {
			return 3;
		} else {
			return 0;
		}

	}

	public static int PerformOperation(char ch, int a, int b) {
		if (ch == '+') {
			return b + a;
		} else if (ch == '-') {
			return b - a;
		} else if (ch == '*') {
			return b * a;
		} else if (ch == '/') {
			return b / a;
		} else if (ch == '^') {
			return (int) Math.pow(b, a);
		} else if (ch == '%') {
			return b % a;
		} else {
			return 0;
		}

	}
	// evaluation of infix expression

	public static void infixval(String exp) {
		Stack<Integer> vs = new Stack<>();
		Stack<Character> os = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (ch == '(') {
				os.push(ch);
			} 
			else if (ch == ')') {
				while (!(os.peek() == '(')) {
					char c1 = os.pop();
					int n1 = vs.pop();
					int n2 = vs.pop();
					vs.push(PerformOperation(c1, n1, n2));
					System.out.println(vs);
				}
				os.pop();
			} 
			else if (ch >= '0' && ch <= '9') {
				vs.push(ch - '0');
				System.out.println(vs);
			} 
			else {

				int pri = getpriority(ch);

				while (!(os.size() == 0  || os.peek() == '(' ||  pri >= getpriority(os.peek())) 
						 ) {
					char c1 = os.pop();
					int n1 = vs.pop();
					int n2 = vs.pop();
					vs.push(PerformOperation(c1, n1, n2));
					System.out.println(vs);

				}
				os.push(ch);

			}
		}

		while (!(os.size() == 0)) {
			char c1 = os.pop();
			int n1 = vs.pop();
			int n2 = vs.pop();
			vs.push(PerformOperation(c1, n1, n2));
		}

		System.out.println(vs);

	}

	//conversion of infix to postfix
	public static void infixTopostfix(String exp){
		Stack<Character> os=new Stack<>();
		String postfix="";
		
		for(int i=0;i<exp.length();i++){
			char ch=exp.charAt(i);
			if(ch=='('){
				os.push(ch);	
			}
			else if(ch==')'){
				while(os.peek()!='('){
					char c1=os.pop();
					postfix+=c1;
				}
				os.pop();
			}
			else if (ch>='0' && ch<='9'){
				postfix+=ch;
			}
			else{
				while(os.size()>0 && os.peek()!='(' && getpriority(os.peek())>= getpriority(ch)){
					char op=os.pop();
					postfix+=op;
				}
				os.push(ch);
			}
			
		}
		while(os.size()>0){
			char op=os.pop();
			postfix+=op;
		}
		System.out.println(postfix);
		
		
	}
	
	//solving post ,conversion of post to infix and convert post to pre
	public static void post123(String post){
		Stack<Integer> es=new Stack<>();
		Stack<String> is=new Stack<>();
		Stack<String> pres=new Stack<>();
		
		for(int i=0;i<post.length();i++){
			char ch=post.charAt(i);
			
			if(ch>='0' && ch<='9'){
				es.push(ch-'0');
				is.push("" +ch);
				pres.push(""+ ch);
			}
			else {
				//for es
				int n1=es.pop();
				int n2=es.pop();
				int num=PerformOperation(ch, n1, n2);
				es.push(num);
				//for is
				String i1=is.pop();
				String i2=is.pop();
				String ival="(" +i2+ ch +i1+ ")";
				is.push(ival);
				//for  pres
				String pv1=pres.pop();
				String pv2=pres.pop();
				String pval=ch+pv2+pv1;
				pres.push(pval);
			}
			
			
		}
		System.out.println(es);
		System.out.println(is);
		System.out.println(pres);
	}
	
	//solving prefix,conversion pre to infix and pre to postfix
	public static void pre123(String pre){
		Stack<Integer> eval=new Stack<>();
		Stack<String> in=new Stack<>();
		Stack<String> post=new Stack<>();
		
		for(int i=pre.length()-1;i>=0;i--){
			char ch=pre.charAt(i);
			if(ch>='0' &&ch<='9'){
				eval.push(ch-'0');
				in.push(""+ch);   //can't do in.push(ch) as  in is  a  string type and ch is  char
				post.push(""+ch);
				
			}
			
			else{
				// for eval
				int n1=eval.pop();
				int n2=eval.pop();
				int num=PerformOperation(ch, n2, n1);
				eval.push(num);
				//for  converting pri to in
				String i1=in.pop();
				String i2=in.pop();
				String ival="("+i1+ch+i2+")";
				in.push(ival);
				
				//for converting in to post
				String p1=post.pop();
				String p2=post.pop();
				String  postval=p1+p2+ch;
				post.push(postval);
				
			}
			
		}
		
		System.out.println(eval);
		System.out.println(in);
		System.out.println(post);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// stack_Demo();
		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
//		int[] arr = { 70, 50, 65, 100, 120, 75, 65, 52, 90 };
//		int[] arr1 = { 6, 2, 5, 4, 5, 1, 6 };
//		// NGE(arr);
//		// NGE_Second(arr);
//		// SmallestNo(str);
//		// MAR(arr1);
//		// SW(arr1, 3);
//		boolean[][] celeb = { { false, false, true, false, true, true }, { true, false, true, true, true, true },
//				{ true, false, false, true, true, false }, { false, false, false, false, true, false },
//				{ false, false, false, false, false, false }, { true, false, true, true, true, false } };
//
//		// String str=scn.next();
//		// System.out.println(duplicatebrackets(str));
//		// System.out.println(CelebrityProblem(celeb));
//		int[] start = { 22, 17, 19, 12, 3, 2, 6 };
//		int[] end = { 26, 20, 23, 15, 7, 4, 9 };

		// Overlapinginterval(start, end);
		// System.out.println(Balancedbracket(str));
	//	infixval(str);           //8+2/(3+2)^(1*1+3) 
		//infixTopostfix(str);
		//post123(str);
		//	pre123(str);
		 int [] stock={15,32,17,10,30,40,15,10,8,30,20};
		 stackspan(stock);
	}

}
