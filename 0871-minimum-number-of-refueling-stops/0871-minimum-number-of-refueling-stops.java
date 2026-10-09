class Solution {
    class Pair{
        int first;
        int second;
        Pair(int f, int s){
            first = f;
            second = s;
        }
    }
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> {
                {
                    if(a.second != b.second)
                        return b.second - a.second;
                    return 0;
                }
            }
        );
        int stop = 0;
        int count = 0;
        while(startFuel < target){
            while(count < stations.length && stations[count][0] <= startFuel){
                pq.add(new Pair(stations[count][0],stations[count][1]));
                count++;
            }
            if(pq.isEmpty()) return -1;
            startFuel += pq.poll().second;
            stop++;
        }
        return stop;
    }
}