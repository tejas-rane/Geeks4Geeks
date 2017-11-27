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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumWithBitwiseOperator s = new SumWithBitwiseOperator();
		System.out.println(s.getSum(3, 5));
	}

}
