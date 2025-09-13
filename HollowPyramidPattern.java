package pattern;

public class HollowPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=10;
		
		for(int i=1;i<=row;i++ ) {
			
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}//end for j
			
			for(int k=1;k<=2*i-1;k++) {
				
				if(k==1||k==2*i-1||i==row) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}//end if-else
			}//end for k
			System.out.println();
		}//end for i
	}//end main

}//end class
