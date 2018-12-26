package dec26;

public class modifingastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("abc");
		System.out.println(sb.toString());
		sb.append("def");                        //add new char to a string 
		System.out.println(sb.toString());
		sb.setCharAt(1, 'p');                    //changes 1 char of any position
		System.out.println(sb.toString());
		sb.deleteCharAt(2);
		System.out.println(sb.toString());       //deletes  char at a any position 
	}

}
