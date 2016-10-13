import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int actualD=in.nextInt();
		int actualM=in. nextInt();
		int actualY=in.nextInt();
		int expectD=in.nextInt();
		int expectM=in.nextInt();
		int expectY=in.nextInt();
		long formula=0;
		if(actualM==expectM && actualY==expectY){
			if(actualD>expectD)
				formula=15*(actualD-expectD);
		}else if(actualD==expectD && actualY==expectY){
			if(actualM>expectM)
				formula=500*(actualM-expectM);
		}else if(actualD==expectD && actualM==expectM){
			if(actualY>expectY)
				formula=10000*(actualY-expectY);
		}else{
			if(actualY>expectY)
				formula=( 15*(actualD-expectD) )+( (actualM+(12-expectM))*500 );
		}
		System.out.println(formula);
    }
}
