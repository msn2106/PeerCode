package rolo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) throws Exception {
		int[] ans=pushZeros(new int[] {9,0,0,8,0,3});
		System.out.println(Arrays.toString(ans));
		
	}
	public static int[] pushZeros(int num[]){
	
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
				num[count]=num[i];
				count++;
			}
		}
		while(count<num.length) {
			num[count++]=0;
		}
	return num;
	}
	
	public static void swap(int[] num, int i, int j) {
		int temp=num[i];
		num[i]=num[j];
		num[j]=temp;
	}

	
}
