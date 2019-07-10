package main.java;

public class Queen {
    private int x, y;
    private String errorMsg;
    private static final String NEGATIVE_ROW_INDEX = "Queen position must have positive row.";
    private static final String NEGATIVE_COLUMN_INDEX = "Queen position must have positive column.";
    private static final String GREATER_ROW_INDEX = "Queen position must have row <= 7.";
    private static final String GREATER_COLUMN_INDEX = "Queen position must have column <= 7.";

    public Queen(int x, int y) {
        if (x < 0) {
            errorMsg = NEGATIVE_ROW_INDEX;
        } else if (y < 0) {
            errorMsg = NEGATIVE_COLUMN_INDEX;
        } else if (x > 7) {
            errorMsg = GREATER_ROW_INDEX;
        } else if (y > 7) {
            errorMsg = GREATER_COLUMN_INDEX;
        }
        if (errorMsg != null) {
            throw new IllegalArgumentException(errorMsg);
        }
        this.x = x;
        this.y = y;

    }

    public int getXPosition(){
        return x;
    }

    public int getYPosition(){
        return y;
    }
}