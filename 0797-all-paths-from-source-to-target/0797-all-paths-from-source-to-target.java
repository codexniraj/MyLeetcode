class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> path = new ArrayList<>();
        path.add(0);
        
        findAllPaths(graph, 0, path, ans);
        return ans;
    }
    public void findAllPaths(int[][] graph, int source,
                            List<Integer> path, List<List<Integer>> ans) {
        if(source == graph.length - 1){
            ans.add(new ArrayList<>(path));
            return;
        }
        int[] allPaths = graph[source];
        for(int node : allPaths){
            path.add(node);
            findAllPaths(graph, node, path, ans);
            path.remove(path.size() - 1);
        }
        return;
    }
}