package com.loops;

import java.util.*;

public class whilel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("1. Sum of digits\r\n" + "2. Count digits\r\n" + "3. Reverse a number\r\n"
					+ "4. Product of digits\r\n" + "5. Largest digit\r\n" + "6. Smallest digit\r\n"
					+ "7. Check Palindrome\r\n" + "8. Check Armstrong Number\r\n" + "9. Check Perfect Number\r\n"
					+ "10. Check Prime Number\r\n" + "11. Check Strong Number\r\n" + "12. Check Automorphic Number\r\n"
					+ "13. Check Neon Number\r\n" + "14. Check Harshad Number\r\n" + "15. Check Spy Number\r\n"
					+ "16. Check Duck Number\r\n" + "17. Check Happy Number\r\n" + "18. Check Disarium Number\r\n"
					+ "19. Fibonacci Series\r\n" + "20. Factorial");

			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			System.out.println("Enter the number");
			int n = sc.nextInt();

			switch (ch) {

			case 1:
				sumDig(n);
				break;

			case 2:
				countDig(n);
				break;

			case 3:
				reverse(n);
				break;

			case 4:
				prodDig(n);
				break;

			case 5:
				largestDig(n);
				break;
			case 6:
				smallestDig(n);
				break;
			case 7:
				palindrome(n);
				break;
			case 8:
				ArmStrong(n);
				break;
			case 9:
				perfect(n);
				break;
			case 10:
				boolean status = isPrime(n);
				if (status) {
					System.out.println("the given number is a prime number");
				} else {
					System.out.println("the given number is not prime number");
				}
				break;
			case 11:
				StrongNum(n);
				break;
			case 12:
				Atmospheric(n);
				break;
			case 13:
				neon(n);
				break;
			case 14:
				harshadNum(n);
				break;
			case 15:
				spyNum(n);
				break;
			case 16:
				boolean status1 = isduckNum(n);
				if (status1) {
					System.out.println("the given number is duck number");
				} else {
					System.out.println("the given  number is not  duck number");
				}
				// remove Zeros
				duckNum(n);
				break;

			default:
				System.out.println("Invalid choice");
			}

			System.out.print("Do you want to continue? (yes/no): ");
			choice = sc.next();
		}

		System.out.println("Program ended.");

	}

	static void sumDig(int n) {
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println("Sum of the digit is " + sum);
	}

	static void countDig(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Count of the digits:" + count);
	}

	static void reverse(int n) {
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;// 567-->0*10+7==>7*10+6==>76*10+5=>765
			rev = rev * 10 + r;
		}
		System.out.println("Reverse the number:" + rev);
	}

	static void prodDig(int n) {
		int r = 0;
		int prod = 1;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			prod = prod * r;
		}
		System.out.println("Product:" + prod);
	}

	static void largestDig(int n) {
		int max = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			if (max < r) {
				max = r;
			}
		}
		System.out.println("Largest number is " + max);
	}

	static void smallestDig(int n) {
		int min = 10;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			if (min > r) {
				min = r;
			}
		}
		System.out.println("Largest number is " + min);
	}

	static void palindrome(int n) {
//		Check whether a number is a palindrome.
//		Input: 12321
//		Output: Palindrome
		int rev = 0;
		int r = 0;
		int o = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;// 12321-->0*10+1==>1*10+2=>12*10+3==>123*10+2==>1232*10+1==>12321
								// 567-->0*10+7==>7*10+6==>76*10+5=>765
		}
		if (o == rev) {
			System.out.println(o + " is a Palindrome number ");
		} else {
			System.out.println(o + "is not a palindome number");
		}

	}

	static void ArmStrong(int n) {
//		An Armstrong number is a number 
		// where the sum of each digit raised to the power of the number of digits
		// equals the original number.
//		Example: 153
//		153 has 3 digits, so raise every digit to power 3:
//		1³ + 5³ + 3³
//		= 1 + 125 + 27
//		= 153
		int num = n;
		int org = n;
		int dig = 0;
		int count = 0;
		double sum = 0;
		double p = 0;
		while (num > 0) {
			dig = num % 10;
			num = num / 10;
			count++;
		}
		while (n > 0) {
			dig = n % 10;
			n = n / 10;
			p = Math.pow(dig, count);
			sum = sum + p;
		}
		if (sum == org) {
			System.out.println(org + " is a ArmStrong Number");
		} else {
			System.out.println(org + " is not a ArmStrong number");
		}
	}

	static void perfect(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			if (n % i == 0) {
				sum = sum + i;
				System.out.println(i + " ");
				break;

			}
			i++;
		}
		if (n == sum) {
			System.out.println("the given number is a Perfect number");
		} else {
			System.out.println("the Given number is not a Perfect number");
		}
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 1 || n == 0) {
			return false;
		}
		int t = 2;
		while (t <= n / 2) {
			if (n % t == 0) {
				status = false;
				break;
			}
			t++;
		}
		return status;
	}

	static void StrongNum(int n) {
//		145
//
//		Digits: 1, 4, 5
//		1!=1
//		4!=24
//		5!=120
//		Sum = 1+24+120=145
//
//		Since the sum equals the original number, 145 is a strong number.
//
//		2
//		2!=2
//		So, 2 is a strong number.
//		
		int org = n;
		int r = 0;

		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact = fact * i;

			}
			System.out.println("fact" + fact);
			sum = sum + fact;
		}
		System.out.println(sum);
		if (sum == org) {
			System.out.println("the given numbr is a Strong Number");
		} else {
			System.out.println("the given number is not Strong number");
		}
	}

	static void Atmospheric(int n) {
//		Automorphic Number
//		An Automorphic Number is a number whose square ends with the same number.
//		Examples
//		5
//
//		5 pow 2
//		=25
//		25 ends with 5
//		So, 5 is an Automorphic Number.
//		6
//		6 pow 2
//		=36
//		36 ends with 6
//		So, 6 is an Automorphic Number.
		int pow = n * n;
		int last = pow % 10;
		if (last == n) {
			System.out.println("the given number is a  Automorphic Number");

		} else {
			System.out.println("the given number is not  Automorphic Number");
		}

	}

	static void neon(int n) {
//		A Neon Number is a number where the sum of the digits of its square is equal to the original number.
//		Example: 9
//		First, find the square:
//		9 × 9 = 81
//		Now add the digits:
//		8 + 1 = 9
//		Since the sum is equal to the original number:
//		9 is a Neon Number.
		int pow = n * n;
		int sum = 0;
		while (pow > 0) {
			int r = pow % 10;
			pow = pow / 10;
			sum = sum + r;
		}
		if (sum == n) {
			System.out.println("the given number is a neon number");
		} else {
			System.out.println("the given number is  not neo number ");
		}
	}

	static void harshadNum(int n) {
//		Example: 18
//
//		First, find the sum of digits:
//		1 + 8 = 9
//		Now check:
//		18 % 9 = 0
//		Since 18 is divisible by 9, 18 is a Harshad Number.

//		Example: 21
//		2 + 1 = 3
//		21 % 3 = 0
//		So 21 is a Harshad Number.
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		if (n % sum == 0) {
			System.out.println("the given number is a Hashad number");
		} else {
			System.out.println("The given number is not harshad number");
		}
	}

	static void spyNum(int n) {
//		A Spy Number is a number where the sum of its digits is equal to the product of its digits.
//		Example: 1124
//		Sum of digits:
//		1 + 1 + 2 + 4 = 8
//		Product of digits:
//		1 × 1 × 2 × 4 = 8

		int prod = 1;
		int sum = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
			prod = prod * r;
		}
		System.out.println("sum:" + sum + "prod:" + prod);
		if (sum == prod) {
			System.out.println("the given number is a Spy number");

		} else {
			System.out.println("the given number is not Spy number");
		}
	}

	static boolean isduckNum(int n) {
		int r = 0;
		boolean status = false;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			if (r == 0) {
				status = true;
				break;
			}
		}
		return status;
	}

	static void duckNum(int n) {
		int r = 0;
		int pow = 1, num = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			if (r == 0) {
				continue;
			}
			num = r * pow + num;
			pow = pow * 10;
		}
		System.out.println("Skip Zero:" + num);
	}

}
