class chessBoard

{
    public static void main(String args[])
    {
        int row = 8;
        int col = 8;
        String[][] array = new String[row][col];

        array[0][0] = "♖";
        array[0][1] = "♘";
        array[0][2] = "♗";
        array[0][3] = "♕";
        array[0][4] = "♔";
        array[0][5] = "♗";
        array[0][6] = "♘";
        array[0][7] = "♖";

        array[1][0] = "♙";
        array[1][1] = "♙";
        array[1][2] = "♙";
        array[1][3] = "♙";
        array[1][4] = "♙";
        array[1][5] = "♙";
        array[1][6] = "♙";
        array[1][7] = "♙";

    }
}