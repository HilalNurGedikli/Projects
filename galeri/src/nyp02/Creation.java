package nyp02;

public class Creation {
    private int prize;
    private String name;

    public void setPrize(int prize){
        this.prize=prize;
    }
    public int getPrize(){return prize;}
    public Creation(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

}
