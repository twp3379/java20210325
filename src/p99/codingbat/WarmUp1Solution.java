package p99.codingbat;

public class WarmUp1Solution {
	public boolean icyHot(int temp1, int temp2) {

		if (temp1 < 0 && temp2 > 100) {
			return true;
		}

		if (temp1 > 100 && temp2 < 0) {
			return true;
		}

		return false;
		/*
		 * return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
		 */
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	public String backAround(String str) {
		String res = "";
		int len = str.length();
		String last = str.substring(len - 1, len);

		res = last + str + last;

		return res;
	}

}