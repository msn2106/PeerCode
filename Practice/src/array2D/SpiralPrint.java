package array2D;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printspiral(int[][] arr) {
		
		int d=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(d==1) {
					System.out.print(arr[i][j]+" ");
				}else if (d==2) {
					System.out.print(arr[i+j][arr.length-1-i+1]+" ");
				}else if (d==3) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print(arr[i][j]+" ");
				}
				
			}
			
			d=d==4?0:d++;
		}
	}

}
