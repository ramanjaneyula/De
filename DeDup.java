package Basic;

import java.util.ArrayList;
import java.util.Arrays;


public class DeDup {

	public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
		20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,	
		13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

	public static ArrayList<Integer> dedup_loop(int[] duparray) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int dup_cnt;

		for (int i = 0; i < duparray.length; i++) {

			dup_cnt = 0;

			for (int j = i + 1; j < duparray.length; j++) {

				if (duparray[i] == duparray[j]) {
					dup_cnt++;
				}

			}

			if (dup_cnt == 0) {
				list.add(duparray[i]);

			}
		}

		return list;

	}

	public static ArrayList<Integer> dedup_sort(int[] duparray) {

		ArrayList<Integer> List = new ArrayList<Integer>();

		Arrays.sort(duparray);

		for (int i = 0; i < duparray.length - 1; i++) {

			if (duparray[i] != duparray[i + 1]) {

				List.add(duparray[i]);

			}


		}

		List.add(duparray[duparray.length - 1]);

		return List;

	}

	
	public static void main(String[] args) {

		ArrayList<Integer> deduparray = dedup_loop(randomIntegers);

		for (Integer k : deduparray) {

			System.out.println(k);

		}
		
		ArrayList<Integer> deduparray_srt = dedup_sort(randomIntegers);

		for (Integer l : deduparray_srt) {

			System.out.println(l);

		}

	}

}
