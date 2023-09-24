package OOPS;

public class interfae {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    }
}
  

interface chessPlayer{
    void moves();
}


class Queen implements chessPlayer{
    public void moves(){
System.out.println("left right up down diagonal");
    }
}
class Rook implements chessPlayer{
    public void moves(){
System.out.println("left right up down ");
    }
}
class King implements chessPlayer{
    public void moves(){
System.out.println("left right up down diagonal --- by one step");
    }
}