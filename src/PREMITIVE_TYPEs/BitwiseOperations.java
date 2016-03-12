/**
 * 
 */
package PREMITIVE_TYPEs;

/**
 * @author amit
 *
 */
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class BitwiseOperations {

	public int getPowfofTwo(int val) {
	
		int pow = 0;
		while (true) {
			val = val/2;
			if (val != 0) {
				pow++;
			} else {
				break;
			}
		}
		return pow;
		
	}
	public void showBits(int ip) {
		int opt, mask;
		
		int pow = getPowfofTwo(ip); // (int) Math.log((double)(ip));
//		System.out.println(pow);
		for (int i = pow; i >= 0; i--) {
			mask = 1 << i;
			opt = ip & mask;
//			System.out.println(opt);
			System.out.print(opt == 0 ? "0" : "1");
		}	 
	}
	
	public void reverseBits(int ip) {
		boolean negorpos = (ip > 0) ? true : false;
		int input = Math.abs(ip);
		int opnum = 0;
		List<Integer> digits = new ArrayList<Integer>(); 
		 while(input != 0) {
//			 digits.add((input%10));
			 opnum = opnum * 10 + input%10;
			 input = input/10;
		 }
//		int digitslen = (digits).size();
//		 for (int i = 0; i<digitslen; i++) {
//			 opnum += Math.pow(10.0,(digitslen - 1 -i))*digits.get(i);
//		 }
		 System.out.println("\n"+(negorpos ? "" : "-")+opnum);
	}
	
	/**
	 * The Main Function
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitwiseOperations btwsoprtn = new BitwiseOperations();
		btwsoprtn.showBits(9);
		btwsoprtn.reverseBits(-11235);
	}

}
