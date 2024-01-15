class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> winners = new ArrayList<>();
        List<Integer> loosers1 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        HashMap<Integer, Integer> winnersMap = new HashMap<>();
        HashMap<Integer, Integer> losersMap = new HashMap<>();

        for(int[] pair : matches){
            if(winnersMap.containsKey(pair[0])) winnersMap.put(pair[0], winnersMap.get(pair[0])+1);
            else winnersMap.put(pair[0],1);

            if(losersMap.containsKey(pair[1])) losersMap.put(pair[1],losersMap.get(pair[1])+1);
            else losersMap.put(pair[1],1);
        }

        for (var entry : winnersMap.entrySet())
            if (!losersMap.containsKey(entry.getKey())) winners.add(entry.getKey());


        for (var entry : losersMap.entrySet())
            if(entry.getValue()==1) loosers1.add(entry.getKey());

        Collections.sort(winners);
        Collections.sort(loosers1);
        res.add(winners);
        res.add(loosers1);
        return res;
    }
}