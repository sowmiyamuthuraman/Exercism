import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

enum Allergen {
    EGGS(1), PEANUTS(2), SHELLFISH(4), STRAWBERRIES(8), TOMATOES(16), CHOCOLATE(32), POLLEN(64), CATS(128);

    private final int score;

    Allergen(int score) {
        this.score = score;
    }

    int getScore() {
        return score;
    }
}

class Allergies {
    int score;
    List<Allergen> allergiesList = new ArrayList<Allergen>();

    Allergies(int score) {

        this.score = score > 256 ? score - (score / 256) * 256 : score;
        Allergen[] enumList = Allergen.values();
        for (int i = enumList.length - 1; i >= 0 && score != 0; i--) {
            int allergenScore = enumList[i].getScore();
            if (allergenScore <= this.score) {
                this.score = this.score - enumList[i].getScore();
                allergiesList.add(enumList[i]);
            }
        }
        Collections.reverse(allergiesList);
    }

    boolean isAllergicTo(Allergen allergen) {
        return allergiesList.contains(allergen);

    }

    List<Allergen> getList() {
        return allergiesList;
    }

}
