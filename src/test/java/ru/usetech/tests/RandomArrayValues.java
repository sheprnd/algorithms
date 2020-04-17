package ru.usetech.tests;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class RandomArrayValues {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			int q = parseInt(RandomStringUtils.randomNumeric(1));
			list.add(q);
		}
		System.out.println(list);
	}
}
