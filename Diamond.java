package pattern;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				for(int row=1;row<=5;row++) {
					for(int column=1;column<=5-row;column++) {
						System.out.print(" ");
					}//end for column
					
					for(int k=1;k<=row;k++) {
						System.out.print("* ");
					}//end for k
					System.out.println();
				}//end for row
				for(int row=4;row>=1;row--) {
					for(int column=1;column<=5-row;column++) {
						System.out.print(" ");
					}//end for column
					
					for(int k=1;k<=row;k++) {
						System.out.print("* ");
					}//end for k
					System.out.println();
				}//end for row

	}//end main

}//end class
