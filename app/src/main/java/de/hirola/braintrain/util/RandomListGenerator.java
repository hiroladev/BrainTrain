package de.hirola.braintrain.util;

import de.hirola.braintrain.model.Color;

import java.util.*;

public class RandomListGenerator {

    private final List<Color> randomList;

    public RandomListGenerator() {
        // build the list with colors
        randomList = new ArrayList<>(Color.values().length);
        // add all possible colors to the list
        randomList.addAll(Arrays.asList(Color.values()));
    }
    public List<Color> getRandomList(int round) {
        if (round < 0) {
            round = 0;
        }
        // add a number of random colors to the list
        Random random = new Random();
        for (int i = 0; i < round; i++) {
            randomList.add(randomList.get(random.nextInt(Color.values().length)));
        }
        return randomList;
    }
}
