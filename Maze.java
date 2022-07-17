package com.jap.maze;

public class Maze {

    // This method builds the character maze from the given integer maze
    public char[][] buildMaze(int[][] maze)
    {
          // use the below declaration
         // char[][] mazeChar = new char[maze[0].length][maze[0].length];


        return new char[0][0];
    }

    //Solve the given maze by using recursion
    public boolean solve(char[][] mazeChar,int i, int j) {

        return false;
    }
 
    //This method prints the maze like a grid
    public void printMaze(char[][] mazeChar)
    {

    }
    public static void main(String[] args) {
        //Declare the integer 2D array that needs to be passed to the method to build the maze
        int[][] maze = {
                {1,3,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,1,0,1,0,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,1,0,1,1,1,0,1},
                {1,0,0,0,1,1,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,0,0,1,1,1,0,1},
                {1,0,1,0,1,1,1,0,1,0,0,0,1},
                {1,0,1,0,1,0,0,0,1,1,1,0,1},
                {1,0,1,0,1,1,1,0,1,0,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,1,4,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1}};

        char mazeChar[][];
        Maze mazeObj = new Maze();
        // Call the method - buildMaze(maze);

        System.out.println("The maze skeleton");
        System.out.println("-----------------");
        // Print the maze
        // Call the method - printMaze(mazeChar);

        System.out.println("The solved maze skeleton");
        System.out.println("-----------------");
        // Solve the maze
        // Call the method - Start from 'S' which is at position (0,1) in the mazeChar array
        // solve(mazeChar,0,1);

        // Print the maze
        // Call the method - printMaze(mazeChar);
    }

}
