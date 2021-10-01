package co.micol.exam1001;

public class RankAgorithm {
	private int[] grade = { 80, 100, 50, 80, 73, 42 };
	private int[] rank; // 크기가 설정도 안되잇고 초기화도 안되잇어요.

	private void rank() {
		rank = new int[grade.length];
		for (int i = 0; i < rank.length; i++) { // rank 배열 초기화
			rank[i] = 1;
		}

//		for (int i : rank) {			// enhanced for 는 출력할때 사용
//			i = 1;
//		}

		for (int i = 0; i < grade.length - 1; i++) {
			for (int j = i + 1; j < grade.length; j++) {
				if (grade[i] > grade[j]) {
					rank[j]++;
				} else if (grade[i] < grade[j]) {
					rank[i]++;
				}
			}
		}
		//  여기서는 이 지역성을 가진 rank라는 배열이 값이 선언이 된거.;
	}

	public String toString() {
		rank();
		for (int g : grade) {
			System.out.print(g + " ");
		}
		System.out.println();
		for (int r : rank) {
			System.out.print(r + " ");
		}
		return null;
	}

}
