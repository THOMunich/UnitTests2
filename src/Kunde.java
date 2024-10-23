public class Kunde {
    private String name;
    private int nummerKunde;

    Kunde(String name, int nummer){
        this.name = name;
        this.nummerKunde= nummer;
    }
    public String getName(){
        return name;
    }
    public int getNummerKunde(){
        return nummerKunde;
    }
}
