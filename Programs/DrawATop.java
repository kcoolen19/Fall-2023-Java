public class DrawATop {
    public static final int SIZE = 2;

    public static void main(String[] args) {
        topPart();
        middlePart();
        bottomPart();
    }

    public static void topPart() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= (SIZE - 1); space++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void middlePart() {
        middleTopPart();
        middleEqualPart();
        middleBottomPart();
    }

    public static void middleTopPart() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= (SIZE - line); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (line - 1); star++) {
                System.out.print("*");
            }
            System.out.print("||");
            for (int star = 1; star <= (line - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void middleEqualPart() {
        for (int equal = 1; equal <= (SIZE * 2); equal++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void middleBottomPart() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= (line - 1); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (SIZE - line); star++) {
                System.out.print("*");
            }
            System.out.print("||");
            for (int star = 1; star <= (SIZE - line); star++) {
                System.out.print("*");
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
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= (SIZE - 1); space++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void base() {
        for (int line = 1; line <= SIZE; line++) {
            for (int equal = 1; equal <= (SIZE * 2); equal++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
