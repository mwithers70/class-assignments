public class Player {
    private String name;
    private int tempCash;
    private int grandCash;
    private int turnCash;
    private int wins;

    public Player(String name){
        this.name = name;
        wins = grandCash = tempCash = turnCash = 0;
    }

    public void addWin(){wins++;}
    public int getWins(){return wins;}

     public String getName(){ return name;}
     public void setName(String name) {this.name = name;}

     public void addTempCash(int cash, int multi){tempCash += (cash*multi);}
     public void setTempCash(int cash){this.tempCash=cash;}
     public int getTempCash() {return tempCash;}

     public void setTurnCash(int cash){this.turnCash = cash;}
     public int getTurnCash(){return turnCash;}

     public void addSolvedCash(){grandCash = (turnCash + tempCash);}
     public void addGrandCash(int multi){grandCash += (tempCash*multi);}
     public int getGrandCash(){return grandCash;}

     public int getTotalCash(){return tempCash+grandCash;}
     public void setBankrupt(){tempCash = 0;}


}//end of class Player
