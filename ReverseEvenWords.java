package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Test for Even word";
		String revStr = "";
		String[] splitStr = test.split(" ");
		System.out.println("Given String is :" + test);
		for (int i = 0; i < splitStr.length; i++) {
			if (i % 2 != 0) {
				for (int j = splitStr[i].length() - 1; j >= 0; j--) {
					revStr += splitStr[i].charAt(j);
				}

				test = test.replace(splitStr[i], revStr);
				revStr = "";
			}

		}

		System.out.println(test);
	}

}