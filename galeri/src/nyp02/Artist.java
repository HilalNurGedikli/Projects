package nyp02;

import javax.crypto.NullCipher;
import java.util.Objects;

public class Artist {
    private String name;
    private int key;
    private Creation creation;
    public  Artist(String name){
        this.name=name;
    }
    public int getKey(){return key;}
    public void setKey(int key){
        this.key=key;
    }
    public void setCreation(Creation creation){
        this.creation=creation;
    }
    public String getName(){
        return name;
    }
    public Creation getCreation(){
        return creation;
    }
    public void infogive(String name){
        if (this.name==name){
            String r;
            r="hello my name is"+getName();
            if(this.creation!=null){
                r+=" eserimimn adı "+this.creation.getName()
            + " bu da fiyatı:";
            }
            System.out.println(r);
            System.out.println(this.creation.getPrize());
        }  else{
            System.out.println("boyle biri yok");
        }
    }
    public void infoGiveProtected(int key,String name){
        if (Objects.equals(this.name, name)){
            if(Objects.equals(this.key,key)){
                String r;
                r="corrected! hello my name is"+getName();
                if(this.creation!=null){
                    r+=" eserimin adı "+this.creation.getName()
                            + " bu da fiyatı:";
                }
                else{
                    r+= " this artist have no project";
                }
                System.out.println(r);
            }
            else{System.out.println("false key try again");}

        }
        else{
            System.out.println("boyle biri yok");
        }
    }

}
