package org.saro;
public class Prime_number {
	public static void main(String[] args) {
	//Scanner ob=new Scanner(System.in);
	//int a=ob.nextInt();
//	for(int i=a.length()-1;i>=0;i--) {
//		System.out.print(a.charAt(2));
//	}
		System.out.println("Prime Number of 1 to 100");
		for(int i=2;i<=100;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count=1;
				}
			}
				if(count!=1) {
					System.out.println(i+"is prime number");
				}
			}
		}
}