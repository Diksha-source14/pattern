package pattern;

public class NumberPattern {

	public static void main(String[] args){
		// TODO Auto-generated constructor stub
		for(int row=1;row<=5;row++) {
			for(int column=1;column<=row;column++) {
				System.out.print(column+" ");
			}//end for column
			System.out.println();
		}//end for row
	}//end main

}//end class
