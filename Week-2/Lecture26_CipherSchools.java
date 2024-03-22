public class Lecture26_CipherSchools {
        static int setMini(int[] A, int N) {
            int mini = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if (A[i] < mini) {
                    mini = A[i];
                }
            }
            return mini;
        }
    
        static int setMaxi(int[] A, int N) {
            int maxi = Integer.MIN_VALUE;
    
            for (int i = 0; i < N; i++) {
                if (A[i] > maxi) {
                    maxi = A[i];
                }
            }
            return maxi;
        }
    
        public static void main(String[] args) {
            int[] A = { 4, 9, 6, 5, 2, 3 };
            int N = 6;
            System.out.println("Minimum element is: " + setMini(A, N));
            System.out.println("Maximum element is: " + setMaxi(A, N));
        }
}
    
