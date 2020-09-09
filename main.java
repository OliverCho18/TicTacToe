/*Creator: Oliver Cho
 *Date: 9/9/2020
 *File Description: This file contains the main class which runs the Tic Tac Toe game
 */
import java.util.*;

public class main{
  public static void main(String[] args){
    System.out.println("Welcome to Tic Tac Toe");
    //create an instnce of the game called test
    game test=new game();
    //initialize the test's game board
    test.intializeBoard();
    //create a scanner to accept user input
    Scanner scan=new Scanner(System.in);
    do{
      System.out.println("Current Board");
      test.printBoard();
      int row;
      int col;

      //ask user to enter input and adjust input entered by user
      do{
        System.out.println("Player " + test.getCurrentPlayerMark() + ": please enter a row and column to enter your mark.");
        row=scan.nextInt()-1;
        col=scan.nextInt()-1;
      }
      //while the requested location is open
      while(!test.placeMark(row,col));
      test.changePlayer();
    }
    //while there isnt a winner and the board is not full
    while(!test.checkForWin() && !test.isBoardFull());
    //if the board is full or there is no winner then end the game
    if(test.isBoardFull() && !test.checkForWin()){
      System.out.println("Game ended in a tie");
    }
    //otherwise there is a winner so print the win statement and end the game
    else{
      System.out.println("Current Board");
      test.printBoard();
      test.changePlayer();
      System.out.println(test.getCurrentPlayerMark() + " Wins!");
    }
  }
}
