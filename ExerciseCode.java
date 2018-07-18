package com.Exercise2.code;

public class ExerciseCode {
	public int checkPalindrome(int number) {
		int temp, revNum = 0;
		while (number != 0) {
			temp = number % 10;
			revNum = revNum * 10 + temp;
			number /= 10;
		}
		return revNum;
	}

	public int powerOfFour(int num) {
		while (num > 0) {
			if (num == 1) {
				return 1;
			}
			if (num % 4 != 0) {
				return 0;
			} else {
				num = num / 4;

			}
		}
		return 0;
	}
}
