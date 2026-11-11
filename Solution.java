
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        // Option 1: Buy individual items only
        long option1 = (long) cost1 * need1 + (long) cost2 * need2;

        // Option 2: Buy type 3 items for the common requirement
        long common = Math.min(need1, need2);

        long option2 = (long) common * costBoth
                     + (long) (need1 - common) * cost1
                     + (long) (need2 - common) * cost2;

        // Option 3: Buy type 3 items for both requirements,
        // even if some extra items are purchased
        long option3 = (long) Math.max(need1, need2) * costBoth;

        return Math.min(option1, Math.min(option2, option3));
    }
}
