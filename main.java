import java.util.*;

public class main{
  public static void main(String[] args){
    System.out.println("Welcome to Tic Tac Toe");
    game test=new game();
    test.intializeBoard();
    Scanner scan=new Scanner(System.in);
    do{
      System.out.println("Current Board");
      test.printBoard();
      int row;
      int col;
      do{
        System.out.println("Player " + test.getCurrentPlayerMark() + ": please enter a row and column to enter your mark.");
        row=scan.nextInt()-1;
        col=scan.nextInt()-1;
      }
      while(!test.placeMark(row,col));
      test.changePlayer();
    }
    while(!test.checkForWin() && !test.isBoardFull());
    if(test.isBoardFull() && !test.checkForWin()){
      System.out.println("Game ended in a tie");
    }
    else{
      System.out.println("Current Board");
      test.printBoard();
      test.changePlayer();
      System.out.println(test.getCurrentPlayerMark() + " Wins!");
    }
  }
}
