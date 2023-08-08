package src.game;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MemoryGame {

    private int turns; // To store how many turns a user has taken. Total allowed are 15.
    private CustomIcon[] icons; // Array of CustomIcon objects.
    private JLabel previousFlippedCard; // Will store reference to JLabel that was flipped first.
    private int iconsFlipped; // At a time, user is allowed to flip 2 icons at max.
    private int pairsFound; // To keep track of how many pairs found. If 6 found, user wins.

    public MemoryGame() {
       turns = 0;
       iconsFlipped = 0;
       pairsFound = 0;
       previousFlippedCard = null;

        icons = new CustomIcon[12];
        String[] flowerLocations = {
                "/usercode/memory-game/images/nature1.jpg",
                "/usercode/memory-game/images/nature2.jpg",
                "/usercode/memory-game/images/nature3.jpg",
                "/usercode/memory-game/images/nature4.jpg",
                "/usercode/memory-game/images/nature5.jpg",
                "/usercode/memory-game/images/nature6.jpg"
        };
        for (int i = 0; i < 12; i++) {
            String currentFlowerLocation = flowerLocations[i % 6];
            CustomIcon icon = new CustomIcon(currentFlowerLocation);
            icons[i] = icon;
        }

        List<CustomIcon> iconsList = new ArrayList<>(Arrays.asList(icons));
        Collections.shuffle(iconsList);
        iconsList.toArray(icons);

    }

    // Getters
    public int getTurns() {
        return turns;
    }

    public CustomIcon getCustomIcon(int index) {
        return icons[index];
    }

    public JLabel getPreviousFlippedCard() {
        return previousFlippedCard;
    }

    public int getIconsFlipped() {
        return iconsFlipped;
    }

    public int getPairsFound() {
        return pairsFound;
    }

    // Setters

    public void incrementTurns() {
        turns = turns + 1;
    }

    public void resetTurns() {
        turns = 0;
    }

    public void setPreviousFlippedCard(JLabel previousFlippedCard) {
        this.previousFlippedCard = previousFlippedCard;
    }

    public void incrementIconsFlipped() {
        iconsFlipped = iconsFlipped + 1;
    }

    public void resetIconsFlipped() {
        iconsFlipped = 0;
    }

    public void incrementPairsFound() {
        pairsFound = pairsFound + 1;
    }

    public void resetPairsFound() {
        pairsFound = 0;
    }

    public void resetGame() {
        turns = 0;
        previousFlippedCard = null;
        iconsFlipped = 0;
        pairsFound = 0;

        List<CustomIcon> iconsList = new ArrayList<>(Arrays.asList(icons));
        Collections.shuffle(iconsList);
        iconsList.toArray(icons);

        for (int i = 0; i < 12; i++) {
            icons[i].setDone(false);
            icons[i].setFlipped(false);
        }
    }
}
