public class Car{
    int Year;
    String Color;

    Car(int Year, String Color){
        this.Year=Year;
        this.Color=Color;
    }

    public static void main(String[] args){
        Car volvo = new Car(1887,"Red");
        System.out.println("Năm sản xuất: " + volvo.Year);
        System.out.println("Màu xe: " + volvo.Color);
    }
}