/*Creator: Oliver Cho
 *Date: 9/9/2020
 *File Description: This file contains the game class and all function and varialbes
 *related to the running the Tic Tac Toe game.
 */
public class game{
  //2d array meant to represent the tic tac toe board
  private char[][] board;
  //char variable representing the mark of the player whose turn it is
  private char currentPlayerMark;

  //blank constructor
  public game(){
    currentPlayerMark='x';
  }

  //function to setup the tic tac toe board
  public void intializeBoard(){
    //initalize 2d array
    board=new char[3][3];

    //fill array/board with dashes
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        board[i][j]='-';
      }
    }
  }

  //function to print the board
  public void printBoard(){
    System.out.println("------");
    for(int i=0;i<3;i++){
      System.out.print("|");
      for(int j=0;j<3;j++){
        System.out.print(board[i][j]+"|");
      }
      System.out.println();
      System.out.println("------");
    }
  }

  //function to check if the board is filled out
  //if the board is full return true, otherwise return false
  public boolean isBoardFull(){
    boolean result=true;

    //for each location in the array look and see if the value is a dash
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(board[i][j]=='-'){
          result=false;
        }
      }
    }
    return result;
  }

  //function to check if the game has been won by either player
  //if there is a 3 in a row in any direction return true, otherwise return false
  public boolean checkForWin(){
    //check the rows
    if(checkRowForWin()==true){
      return true;
    }
    //check the columns
    else if(checkColumnForWin()==true){
      return true;
    }
    //check the diagonals
    else if(checkDiagonalForWin()==true){
      return true;
    }
    else{
      return false;
    }
  }

  //function to check rows for 3 in a row
  //if there is a row with matching 3 in a row return true, otherwise return false
  public boolean checkRowForWin(){
    boolean result=false;
    //for each row, compare all the values and make sure there is no blank
    for(int i=0;i<3;i++){
      if((board[i][0]==board[i][1])&&(board[i][1]==board[i][2])&&(board[i][0]!='-')){
        result=true;
      }
    }
    return result;
  }

  //function to check columns for 3 in a column
  //if there is a column with matching 3 in a column return true, otherwise return false
  public boolean checkColumnForWin(){
    boolean result=false;
    //for each column, compare all the values and make sure there is no blank
    for(int j=0;j<3;j++){
      if((board[0][j]==board[1][j])&&(board[0][j]==board[2][j])&&(board[0][j]!='-')){
        result=true;
      }
    }
    return result;
  }

  //function to check diagonals for 3 matching
  //if all 3 values in a diagonal match return true, otherwise return false
  public boolean checkDiagonalForWin(){
    boolean result=false;

    //check diagonal from top left to bottom right for matching values
    if((board[1][1]==board[2][2])&&(board[1][1]==board[0][0])&&(board[1][1]!='-')){
      result=true;
    }
    //check diagonal from top right to bottomw left for matching values
    if((board[1][1]==board[0][2])&&(board[1][1]==board[2][0])&&(board[1][1]!='-')){
      result=true;
    }
    return result;
  }

  //function to alternate the player mark
  public void changePlayer(){
    //if the player mark is x change it to o
    if (currentPlayerMark=='x'){
      currentPlayerMark='o';
    }
    //otherwise the player mark is o so set it to x
    else{
      currentPlayerMark='x';
    }
  }

  //function to place the mark in the entered location
  //if the locaiton is occupied return false, otherwise place and return true
  public boolean placeMark(int row, int col){
    //if the location is empty place the players mark
    if (board[row][col]=='-'){
      board[row][col]=currentPlayerMark;
      return true;
    }
    //otherwise return false
    else{
      return false;
    }
  }

  //function to return the current player's mark
  public char getCurrentPlayerMark(){
    return currentPlayerMark;
  }
}
