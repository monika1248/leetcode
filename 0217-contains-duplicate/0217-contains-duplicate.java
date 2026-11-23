
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> v = new HashSet<>();

        for (int n : nums) {
            if (v.contains(n)) {
                return true;
            }
            v.add(n);
        }

        return false;
    }
}
