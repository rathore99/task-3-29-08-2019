package com.ssi.task3.stringclass;

public class Question4 {

	public static void main(String[] args) {
		String cities[] = { "bhopal", "agra", "mumbai", "chennai", "pune", "delhi" };
		String key;
		int i, j;

		for (i = 1; i < cities.length; ++i) {
			key = cities[i];
			j = i - 1;

			while (j >= 0 && key.compareTo(cities[j]) <= -1) {

				cities[j + 1] = cities[j];
				j = j - 1;

			}
			cities[j + 1] = key;

		}
		for (String city : cities)
			System.out.print(city + " ");

	}

}
