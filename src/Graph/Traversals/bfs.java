package Graph.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean v[] = new boolean[adj.size()];
        Queue<Integer> q =  new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        q.add(0);
        v[0] = true;

        while(!q.isEmpty())
        {
            int node =  q.poll();
            al.add(node);

            for(int it : adj.get(node))
            {
                if(v[it]==false)
                {
                    v[it] =true;
                    q.add(it);
                }
            }
        }
        return al;
    }
}