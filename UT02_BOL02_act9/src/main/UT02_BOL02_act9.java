package main;

public class UT02_BOL02_act9 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			boolean primo = true;
			
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			
			if (primo) {
				System.out.print(i + " ");
			}
		}
	}
}
