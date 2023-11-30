package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

		static void kadaiB() {
			Random random = new Random();
			int randomValue = random.nextInt(100);
			randomValue = +1;


			System.out.println(randomValue+"がでました。");




		}
}