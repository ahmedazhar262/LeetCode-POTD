import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the arrays in ascending order
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;
        int gPointer = 0;
        int sPointer = 0;

        // Iterate through the arrays
        while (gPointer < g.length && sPointer < s.length) {
            // Check if the current cookie size is sufficient for the current child's greed factor
            if (s[sPointer] >= g[gPointer]) {
                contentChildren++;
                gPointer++; // Move to the next child
            }

            sPointer++; // Move to the next cookie, whether or not it satisfies the child's greed factor
        }

        return contentChildren;
    }
}
