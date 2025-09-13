package pattern;

public class ReverseTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int column=1;column<=row;column++) {
				System.out.print("* ");
			}//end for column
			System.out.println();
		}//end for row
	}//end main

}//end class
