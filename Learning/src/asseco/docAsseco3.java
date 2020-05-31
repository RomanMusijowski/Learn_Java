package asseco;

import java.util.Arrays;

public class docAsseco3 {
    public static void main(String[] args) {

    }
    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < A.length; k++) {
            //tutaj był if który sprawdzał czy k jest mniejsze od i
            //ale dosyć zakręcony
            if (k < i ) {//coś jeszcze tutaj było
                i+=1;
            }
            if (A[i] == B[k]) {
                return A[i];
            }
        }
        return -1;
    }
}
