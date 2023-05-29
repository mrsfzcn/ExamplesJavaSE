package array;

public class Q004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * dizide 13 var ise 13 ve bir sonraki eleman toplama eklenmeden toplam sonucu
		 * bulan algoritma
		 */

		int[] nums = { 1, 13, 5, 1, 13, 1 };

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i++;
				continue;
			}
			sum += nums[i];
		}
		System.out.println(sum);
	}
}