package Chapter8;

public class Exercise08_03 {

	static final int STUDENT = 0;
    static final int GRADE = 1;
    public static void main(String args[]) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] studentGrades = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {

            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;

            }
            studentGrades[i][STUDENT] = i;
            studentGrades[i][GRADE] = correctCount;
        }

        sort(studentGrades);

        for (int i = 0; i < studentGrades.length; i++ ) {
            System.out.println("Student " + studentGrades[i][STUDENT] + "'s correct count is " +
                    studentGrades[i][GRADE]);
        }
    }

    public static void sort(int[][] m) {

        for (int i = 0; i < m.length - 1; i++) {
            int currentIndex = i;
            int currentMin = m[i][GRADE];
            int studentNum = m[i][STUDENT];

            for (int j = i + 1; j < m.length; j++) {
                if (currentMin > m[j][GRADE]) {
                    currentMin = m[j][GRADE];
                    studentNum = m[j][STUDENT];
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                m[currentIndex][GRADE] = m[i][GRADE];
                m[currentIndex][STUDENT] = m[i][STUDENT];
                m[i][GRADE] = currentMin;
                m[i][STUDENT] = studentNum;
            }
        }
    }
	
}
