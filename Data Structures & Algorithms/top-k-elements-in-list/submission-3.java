class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Map value -> count
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int curr : nums) {
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            }
            else{
                map.put(curr, 1);
            }
        }

        //Bucket sort
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int key: map.keySet()){
            if(bucket[map.get(key)] == null){
                bucket[map.get(key)] = new ArrayList<>();
            }
            bucket[map.get(key)].add(key);
        }

        //Return condition
        int[] result = new int[k];
        int counter = 0;
        for(int j = bucket.length - 1; j >= 0 && counter < k; j--){
            if(bucket[j] == null){
                continue;
            }
            else{
                for(int key: bucket[j]){
                    result[counter] = key;
                    counter++;
                }
            }
        }
        
        return result;

    }
}