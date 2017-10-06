
public class Question1 {

	public static void main(String[] args) {

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i <= 12; i++)
			System.out.println(daysLeft(days, i));

	}

	public static int daysLeft(int[] months, int month) {
		if (month == 12)
			return 0;
		else {

			int days = 0;
			for (int i = month; i < 12; i++)
				days += months[i];
			return days;
		}
	}
}
