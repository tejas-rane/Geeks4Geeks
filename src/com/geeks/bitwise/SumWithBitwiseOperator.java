package com.geeks.bitwise;

public class SumWithBitwiseOperator {
	public int getSum(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		
		return a;
	}
	public int getDiff(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;

		while (b != 0) {
			int borrow = (~a) & b;
			a = a ^ b;
			b = borrow << 1;
		}
		
		return a;
	}
	public int findComplement(int num) {
		String binString = Integer.toBinaryString(num);
		int pow = binString.length();
		int val = (int) Math.pow(2, pow);
		int compliment = (num)^(val-1);
        return compliment;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumWithBitwiseOperator s = new SumWithBitwiseOperator();
		System.out.println(s.getSum(3, 5));
		System.out.println(s.getDiff(3, 5));
		System.out.println(s.findComplement(5));
	}

}
