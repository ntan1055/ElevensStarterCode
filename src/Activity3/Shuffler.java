package Activity3;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = rand(int);


    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3, 18, 21, 23, 35, 36, 38, 41, 44, 55, 59, 62};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        nt[] shuffled = new int[VALUE_COUNT];
        int indexCount = 0;

        for (int i=0; i<VALUE_COUNT/2; i++) {
            shuffled[indexCount] = values[i];
            indexCount += 2;
        }

        indexCount = 1;

        for (int i=VALUE_COUNT/2; i<shuffled.length; i++) {
            if (indexCount == shuffled.length) break;
            shuffled[indexCount] = values[s];
            indexCount += 2;
        }

        for (int i=0; i<VALUE_COUNT; i++) {
            values[i] = shuffled[i];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        int indexCount = VALUE_COUNT - 1;
        int randomInt;
        int temp;

        for (indexCount=indexCount; indexCount>1; indexCount--) {
            randomInt = (int) (Math.random() * VALUE_COUNT);
            temp = values[indexCount];
            values[indexCount] = values[randomInt];
            values[randomInt] = temp;
        }
    }
}
}
