package pattern;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=10;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}//end for j
			
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}//end for k
			System.out.println();
		}//end for i
	}//end main

}//end class
