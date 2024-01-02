
// Convert an Array Into a 2D Array With Conditions

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
         Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        List<List<Integer>> res = new ArrayList<>();
        while (!mp.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            List<Integer> delt = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                row.add(key);
                value--;

                if (value == 0) {
                    delt.add(key);
                }

                entry.setValue(value);
            }

            res.add(row);

            for (int key : delt) {
                mp.remove(key);
            }
        }

        return res;
    }
}