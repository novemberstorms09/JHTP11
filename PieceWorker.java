//<Week3Program1>- PieceWorker Subclass
//<CSIS 312>

package week3program1;

public class PieceWorker extends Employee {
    //Declare variables
    private double wage;
    private double piece;
    
    // 5 arguement Constructor
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double piece){
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setPiece(piece);
    }

    //set & get wage
    public void setWage(double amountOfWage){
        wage = amountOfWage;
    }
  
    public double getWage(){
        return wage;
    }
    
    //set & get piece
    public void setPiece(double numberOfPieces){
        piece = numberOfPieces;
    }
    
    public double getPiece(){
        return piece;
    }
    
    //determine earnings by doing wage times pieces
   
    @Override
    public double earnings(){
        return getWage() * getPiece();
    }
    
    @Override
    public String toString(){
    return String.format("Piece worker name: %s%n%s: $%,.2f; %s: %.2f", super.toString(),
            "The wage earned for each piece made:", getWage(), "The number of pieces made:", getPiece());
    }
}
