public class Device {

    String code;
    String producer;
    String type;
    double price;
    String info;

    Device(String cd, String pr, String tp, double prc){
        this.code = cd;
        this.producer = pr;
        this.type = tp;
        this.price = prc;
    }

    Device(String cd, String pr, String tp){
        this.code = cd;
        this.producer = pr;
        this.type = tp;
    }

    void getInfo(){
         System.out.println("Kod: " + code + ", producent: " + producer + ", typ: " + type +
            ", cena: " + price);
    }

}
