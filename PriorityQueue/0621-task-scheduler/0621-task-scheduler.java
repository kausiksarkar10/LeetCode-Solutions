class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> mp=new HashMap<>();
        PriorityQueue<Integer> max=new PriorityQueue<>((a,b)->b-a);
        for(char task:tasks){
            mp.put(task,mp.getOrDefault(task,0)+1);
        }
        for(int freq:mp.values()){
            max.offer(freq);
        }
        int time=0;
        while(!max.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n+1;i++){
                if(!max.isEmpty()){
                    temp.add(max.poll());
                }
            }
            for(int freq:temp){
                if(--freq>0){
                    max.offer(freq);
                }
            }
            time+=max.isEmpty()?temp.size():n+1;
        }
        return time;
    }
}