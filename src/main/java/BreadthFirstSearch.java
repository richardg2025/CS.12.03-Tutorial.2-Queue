
public class BreadthFirstSearch {


    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed
     */
    public static int[] bfs(int[][] graph) {

        // Create a Queue and add the first node (0) to it.
        // Use your Queue class that you just created!
        CISQueue<Integer> q = new CISQueue<>(0);

        // Create a visited array.
        // This array will track whether we have visited a specific node.
        boolean[] visited = new boolean[9999];

        // Create a bfs array and a bfs index.
        // This array will track the order that the nodes were visited.
        int[] bfsArr = new int[9999];
        int bfsArr_index = 0;

        // Add the first node (0) to the bfs array.
        bfsArr[bfsArr_index++] = 0;

        // Record the first node as having been visited.
        visited[0] = true;

        // Time to traverse the graph!
        // While the queue is not empty ...
        while (!q.isEmpty()) {
            int currentNode = q.dequeue();
            visited[currentNode] = true;
            for (int neighbour : graph[currentNode]) {
                if (visited[neighbour]) continue;
                visited[neighbour] = true;
                q.enqueue(neighbour);
                bfsArr[bfsArr_index++] = neighbour;
            }
        }

            // Dequeue (poll) the queue and store this value in a variable called currentNode.

            // Record this node as visited.

            // Explore the current nodes neighbouring nodes.
            // For each neighbouring node ...

                // Store the neighbour in a variable called neighbour.

                // If neighbour hasn't been visited before ...
                // Mark neighbour as visited.
                // Add neighbour to the queue.
                // Add neighbour to bfs.

        // Return bfs.
        return bfsArr;
    }
}
