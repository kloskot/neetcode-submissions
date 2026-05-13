class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int pointer = 0; pointer < temperatures.length - 1; pointer++){
            int curr = temperatures[pointer];
            int scanner = pointer + 1;
            int counter = 1;
            while(curr >= temperatures[scanner]){
                scanner++;
                counter++;
                if(scanner == temperatures.length){
                    break;
                }
            }
            if(scanner != temperatures.length){
                ans[pointer] = counter;
            }
        }
        return ans;
    }
}
