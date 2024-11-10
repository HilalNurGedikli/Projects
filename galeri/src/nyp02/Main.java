package nyp02;

public class Main {
    public static void main(String[] args) {
        Artist ressam1=new Artist("Hilal Nur GEDİKLİ");
        Creation resim1= new Creation("yildizligece");
        ressam1.setKey(123);
        resim1.setPrize(10000);
        ressam1.setCreation(resim1);
        System.out.println(ressam1.getCreation().getPrize());
        System.out.println("hi");
        ressam1.infogive("Hilal Nur GEDİKLİ");
        ressam1.infoGiveProtected(123,"Hilal Nur GEDİKLİ");
        ressam1.infoGiveProtected(234,"Hilal Nur GEDİKLİ");
        ressam1.infoGiveProtected(234,"Hilal NuGEDİKLİ");
        Artist ressam2=new Artist("Burak BURAN");
        ressam2.setKey(1234);
        ressam2.infoGiveProtected(1234,"Burak BURAN");

        }
}