class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return res;
    }
    //traverse framework
    public void traverse(int[][] graph, int s, LinkedList<Integer> path){
        path.addLast(s);
        
        int n = graph.length;
        if(s == n - 1){
            res.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }
        //visit every node's neighbours
        for(int v: graph[s]){
            traverse(graph, v, path);
        }
        //remove s from path
        path.removeLast();
    }
}