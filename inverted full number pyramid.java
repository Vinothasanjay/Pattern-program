class HelloWorld {
    public static void main(String[] args) {
        int n = 5; // The number of levels in the pyramid
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print numbers in descending order
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7 
    1 2 3 4 5 
      1 2 3 
        1 
