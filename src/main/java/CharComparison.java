public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        int minLength = Math.min(a.length, b.length); // Find the length of the shorter array

        for (int i = 0; i < minLength; i++) {
            if (a[i] < b[i]) {
                return -1; // A is less than B
            }
            if (a[i] > b[i]) {
                return 1; // A is greater than B
            }
        }

        // If we reached here, all characters in the range of the shorter array are equal.
        // Now check if the lengths are different.
        if (a.length < b.length) {
            return -1; // A is shorter, hence less
        } else if (a.length > b.length) {
            return 1; // A is longer, hence greater
        }

        return 0;
        
    }
}
