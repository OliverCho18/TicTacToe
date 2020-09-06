public class piece{
  boolean pieceType; //true is X, false is O
  int locationX; //x axis location
  int locationY; //y axis location

  //blank constructor
  public piece(){
    pieceType=true;
    locationX=null;
    locationY=null;
  }

  //constructor
  public piece(boolean type, int selectedLocationX, int selectedLocationY){
    pieceType=type;
    locationX=selectedLocationX;
    loactionY=selectedLocationY;
  }

}
