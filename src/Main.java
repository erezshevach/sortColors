public class Main {
    public static void main(String[] args) {
        char[] colors = new char[] {'y','r','g','y','g','r','g','r','r','y','g','r','y',};
        sortColorsRYG(colors);
        System.out.println(colors);
    }

    public static void sortColorsRYG (char[] colors) {
        if (colors.length < 2) return;
        int unsortedIndex = bringColorToFront(colors, 0, 'r');
        if (unsortedIndex < colors.length - 2) bringColorToFront(colors, unsortedIndex, 'y');
    }

    private static int bringColorToFront(char[] colors, int startIndex, char color) {
        int unsortedIndex = startIndex;
        int seeker = unsortedIndex + 1;
        while (seeker < colors.length) {
            if (colors[unsortedIndex] == color) {
                unsortedIndex++;
                if (seeker <= unsortedIndex) seeker = unsortedIndex + 1;
            } else {
                if (colors[seeker] == color) {
                    colors[seeker] = colors[unsortedIndex];
                    colors[unsortedIndex] = color;
                    unsortedIndex++;
                }
                seeker++;
            }
        }
        return unsortedIndex;
    }
}