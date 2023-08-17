import Helpers.PrintMatrix;
public class Maze {
    public static boolean isSafe(int[][] maze, int[][] visited, int x, int y, int n) {
        // Check if the current position is within the maze boundaries and is a valid move.
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && visited[x][y] == 0);
    }

    public static boolean traverseMaze(int[][] maze, int[][] visited, int x, int y, int n) {
        // If we have reached the destination, return true.
        if (x == n - 1 && y == n - 1) {
            visited[x][y] = 1;
            return true;
        }

        // Check if the current position is a valid move.
        if (isSafe(maze, visited, x, y, n)) {
            // Mark the current position as visited (1).
            visited[x][y] = 1;

            // Move right
            if (traverseMaze(maze, visited, x + 1, y, n)) {
                return true;
            }
            // Move down
            if (traverseMaze(maze, visited, x, y + 1, n)) {
                return true;
            }

            // If we reach here, it means both right and down moves are not valid, so backtrack.
            // Reset the current position as unvisited (0).
            visited[x][y] = 0;
        }

        // If the current position is not a valid move, backtrack.
        return false;
    }

    public static void main(String[] args) {
        int n = 5; // Size of the maze (nxn)
        int[][] maze = {
            {1, 0, 1, 1, 0},
            {1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 1, 0, 0, 1}
        };
        int[][] visited = new int[n][n]; // Initialize the visited matrix with all zeros
        System.out.println("\n\nName = Harsh Sahu");
        System.out.println("Reg. No = 21BSA10129");
        System.out.println("\nOriginal Maze : ");
        PrintMatrix.printMatrix(maze);
        System.out.println();
        if (traverseMaze(maze, visited, 0, 0, n)) {
            System.out.println("Path found! The maze is traversable.");
        } else {
            System.out.println("No path found! The maze is not traversable.");
        }
        System.out.println("\nPath from Source to Destination");
        PrintMatrix.printMatrix(visited);
    }
}
