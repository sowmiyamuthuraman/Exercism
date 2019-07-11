import java.util.Collections;
import java.util.Arrays;

class DnDCharacter {

    private int strength, dexterity, constitution, intelligence, wisdom, charisma, hitPoints;

    DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitPoints = 10 + modifier(constitution);
    }

    int rollDice() {
        return (int) Math.floor((Math.random() * 6)) + 1;
    }

    int ability() {
        int max = Integer.MIN_VALUE;
        int[] diceValues = new int[4];
        for (int i = 0; i < 4; i++) {
            diceValues[i] = rollDice();
        }
        Arrays.sort(diceValues);
        return Arrays.stream(diceValues, 1, 4).sum();
    }

    int modifier(int input) {
        return (int) Math.floor(((double) input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitPoints;
    }

}
