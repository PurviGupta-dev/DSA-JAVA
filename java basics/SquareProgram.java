public  class SquareProgram {

    static int findSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int answer = findSquare(6);

        System.out.println("Square = " + answer);
    }
}
