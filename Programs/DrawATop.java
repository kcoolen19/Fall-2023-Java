public class DrawATop {
    public static final int TEST_SIZE = 3;
    public static final int DOUBLE_SIZE = 2;
    public static final String STAR_SIGN = "*";
    public static final String EQUAL_SIGN = "=";
    public static final String DOUBLE_BAR = "||";
    public static final String SPACE = " ";

    public static void main(String[] args) {
        topPart();
        middlePart();
        bottomPart();
    }

    public static void topPart() {
        for (int line = 1; line <= TEST_SIZE; line++) {
            for (int space = 1; space <= (TEST_SIZE - 1); space++) {
                System.out.print(SPACE);
            }
            System.out.println(DOUBLE_BAR);
        }
    }

    public static void middlePart() {
        middleTopPart();
        middleEqualPart();
        middleBottomPart();
    }

    public static void middleTopPart() {
        for (int line = 1; line <= TEST_SIZE; line++) {
            for (int space = 1; space <= (TEST_SIZE - line); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (line - 1); star++) {
                System.out.print(STAR_SIGN);
            }
            System.out.print(DOUBLE_BAR);
            for (int star = 1; star <= (line - 1); star++) {
                System.out.print(STAR_SIGN);
            }
            System.out.println();
        }
    }

    public static void middleEqualPart() {
        for (int equal = 1; equal <= (TEST_SIZE * DOUBLE_SIZE); equal++) {
            System.out.print(EQUAL_SIGN);
        }
        System.out.println();
    }

    public static void middleBottomPart() {
        for (int line = 1; line <= TEST_SIZE; line++) {
            for (int space = 1; space <= (line - 1); space++) {
                System.out.print(SPACE);
            }
            for (int star = 1; star <= (TEST_SIZE - line); star++) {
                System.out.print(STAR_SIGN);
            }
            System.out.print(DOUBLE_BAR);
            for (int star = 1; star <= (TEST_SIZE - line); star++) {
                System.out.print(STAR_SIGN);
            }
            System.out.println();
        }
    }

    public static void bottomPart() {
        bottomStick();
        base();
    }

    public static void bottomStick() {
        bottomTwoSticks();
        bottomTwoSticks();
    }

    public static void bottomTwoSticks() {
        for (int line = 1; line <= TEST_SIZE; line++) {
            for (int space = 1; space <= (TEST_SIZE - 1); space++) {
                System.out.print(SPACE);
            }
            System.out.println(DOUBLE_BAR);
        }
    }

    public static void base() {
        for (int line = 1; line <= TEST_SIZE; line++) {
            for (int equal = 1; equal <= (TEST_SIZE * DOUBLE_SIZE); equal++) {
                System.out.print(EQUAL_SIGN);
            }
            System.out.println();
        }
    }
}
