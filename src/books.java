public class books {
    public static void main(String[] args) {
        System.out.println("reading books");
        int[][] pageNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < pageNumbers.length; ++i) {
            for(int j = 0; j < pageNumbers[i].length; ++j) {
                System.out.println(pageNumbers[i][j]);
            }
        }
    }
}
