class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }   

        PriorityQueue<Integer> freqHeap = new PriorityQueue<>(Collections.reverseOrder()); 
        freqHeap.addAll(mp.values());

        int totalkeys = 0;
        int keypos = 0;

        while(!freqHeap.isEmpty()){
            totalkeys += (keypos / 8 + 1) * freqHeap.poll();
            keypos++;
        }

        return totalkeys;
    }
}