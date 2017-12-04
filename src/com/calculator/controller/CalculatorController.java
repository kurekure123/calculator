package com.calculator.controller;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CalculatorController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "", test = "";
		boolean inputok = true;
		System.out.print("첫번째 숫자입력");
		num1 = s.nextInt();
		System.out.print("연산자 입력");
		opcode = s.next();
		System.out.print("두번째 숫자 입력");
		num2 = s.nextInt();
		switch (opcode) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		default:
			inputok = false;
			break;
		}
		if (!inputok) {
			test = "사칙 연산자만 입력해주세요";
		} else {
			test = String.format("%d %s %d = %d", num1, opcode, num2, result);
		}
		System.out.print(test);
	}

}
