public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
    }

    static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(n - j + 1 + " ");

            }
            System.out.println();
        }
    }
}
