package javagrouphomework;

public class GroupHW2 {

	public static void main(String[] args) {
		
		int array[][]= {
				{2,4,6,8,10},
				{1,3,5,7,9},
		};
		
		System.out.println("Even Numbers");
		
		for(int i=0; i<array.length; i++) { 			
	     for(int j=0; j<array[i].length; j++) {
		  if(array[i][j]%2==0) {
			  System.out.println(array[i][j]);
		  }	else {
			  System.out.println();
		  }
		
	     }
	   
		}
	}
}