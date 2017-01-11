public static String longestPal(String a) {
		// create new array to hold results
		int[][] arr = new int[a.length() + 1][a.length() + 1];
		// reverse string a
		String b = new StringBuffer(a).reverse().toString();

		// complete the Longest common subsequence array
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					arr[i + 1][j + 1] = arr[i][j] + 1;
				} else {
					arr[i + 1][j + 1] = Math.max(arr[i + 1][j], arr[i][j + 1]);
				}
			}
		}
		String str = "";
		int x = a.length();
		int y = b.length();
		//trace back form bottom of LCS array
		while (x > 0 && y > 0) {
			if (arr[x][y] == arr[x - 1][y]) {
				x--;
			} else if (arr[x][y] == arr[x][y - 1]) {
				y--;
			} else {
				if (a.charAt(x - 1) == b.charAt(y - 1)) {
					str += a.charAt(x - 1);
					x--;
					y--;
				}
			}
		}
		// return the largest palindrome 
		return str;
	}