package main.java;

import main.java.Queen;

public class QueenAttackCalculator {
    private static final String QUEEN_IS_NULL = "You must supply valid positions for both Queens.";
    private static final String SAME_POSITION = "Queens cannot occupy the same position.";
    private Queen blackQueen, whiteQueen;
    private String errorMsg;

    public QueenAttackCalculator(Queen blackQueen, Queen whiteQueen) {
        if (blackQueen == null || whiteQueen == null) {
            errorMsg = QUEEN_IS_NULL;
        } else if ((blackQueen.getXPosition() == whiteQueen.getXPosition())
                && (blackQueen.getYPosition() == whiteQueen.getYPosition())) {
            errorMsg = SAME_POSITION;
        }
        if (errorMsg != null) {
            throw new IllegalArgumentException(errorMsg);
        }
        this.blackQueen = blackQueen;
        this.whiteQueen = whiteQueen;
    }

    public boolean canQueensAttackOneAnother() {
        boolean isAttackable = false;
        if (blackQueen.getXPosition() == whiteQueen.getXPosition()
                || blackQueen.getYPosition() == whiteQueen.getYPosition()
                || ((Math.abs(blackQueen.getXPosition() - whiteQueen.getXPosition()) == Math.abs(blackQueen.getYPosition() - whiteQueen.getYPosition())))) {
            isAttackable = true;

        }
        return isAttackable;
    }
}