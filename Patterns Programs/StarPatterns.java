public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5;
        for (int row = 1; row <= rows; row++) {
            System.out.println("* ".repeat(row));
        }
        System.out.println("Pyramid");
        for (int row = 1; row <= rows; row++) {
            System.out.println(" ".repeat(rows - row) + "* ".repeat(row));
        }
        System.out.println("Reverse pyramid");
        for (int row = rows; row >= 1; row--) {
            System.out.println(" ".repeat(rows - row) + "* ".repeat(row));
        }
        System.out.println("Diamond");
        for (int row = 1; row <= rows * 2 - 1; row++) {
            int width = row <= rows ? row : rows * 2 - row;
            System.out.println(" ".repeat(rows - width) + "* ".repeat(width));
        }
        int[][] spiral = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        for (int[] line : spiral) System.out.println(java.util.Arrays.toString(line));
    }
}