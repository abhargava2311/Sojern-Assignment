package com.compareversion;
public class CompareUtility {

	public int compareVersion(String v1, String v2) {

		String[] version1 = v1.split("\\.");
		String[] version2 = v2.split("\\.");

		int length = Math.max(version1.length, version2.length);

		for (int i = 0; i < length; i++) {
			int num1 = (i < version1.length) ? Integer.parseInt(version1[i]) : 0;
			int num2 = (i < version2.length) ? Integer.parseInt(version2[i]) : 0;

			if (num1 > num2)
				return 1;
			if (num2 > num1)
				return -1;
		}

		return 0;
	}
}
