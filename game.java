public class game{
  private char[][] board;
  private char currentPlayerMark;

  public game(){
    currentPlayerMark='x';
  }

  public void intializeBoard(){
    //initalize 2d array
    board=new char[3][3];

    //fill array with dashes
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        board[i][j]='-';
      }
    }
  }

  public void printBoard(){
    //print the array
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

  public boolean isBoardFull(){
    boolean result=true;

    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(board[i][j]=='-'){
          result=false;
        }
      }
    }
    return result;
  }

  public boolean checkForWin(){
    if(checkRowForWin()==true){
      System.out.println(checkRowForWin());
      return true;
    }
    else if(checkColumnForWin()==true){
      System.out.println(checkColumnForWin());
      return true;
    }
    else if(checkDiagonalForWin()==true){
      System.out.println(checkDiagonalForWin());
      return true;
    }
    else{
      return false;
    }
  }

  public boolean checkRowForWin(){
    boolean result=false;
    for(int i=0;i<3;i++){
      if((board[i][0]==board[i][1])&&(board[i][0]==board[i][2])){
        result=true;
      }
    }
    return result;
  }

  public boolean checkColumnForWin(){
    boolean result=false;
    for(int j=0;j<3;j++){
      if((board[0][j]==board[1][j])&&(board[0][j]==board[2][j])){
        result=true;
      }
    }
    return result;
  }

  public boolean checkDiagonalForWin(){
    boolean result=false;
    if((board[1][1]==board[2][2])&&(board[1][1]==board[0][0])){
      result=true;
    }
    if((board[1][1]==board[0][2])&&(board[1][1]==board[2][0])){
      result=true;
    }
    return result;
  }

  public void changePlayer(){
    if (currentPlayerMark=='x'){
      currentPlayerMark='y';
    }
    else{
      currentPlayerMark='x';
    }
  }

  public boolean placeMark(int row, int col){
    if (board[row][col]=='-'){
      board[row][col]=currentPlayerMark;
      return true;
    }
    else{
      return false;
    }
  }

  public char getCurrentPlayerMark(){
    return currentPlayerMark;
  }
}
