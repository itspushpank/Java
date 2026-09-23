import java.util.Scanner;

class Electricity{
    public static void main(String[] args) {

        Domestic d = new Domestic();
        d.calculateBill();

        Commercial c =new Commercial();
        c.calculateBill();
        
    }
}

interface ElectricityBill {

    void calculateBill();
}

class Domestic implements ElectricityBill{
    final double price = 20;


    public void calculateBill(){
        System.out.println("DOMESTIC------");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the units consumed :");
        double unit =s.nextDouble();
        
        
        System.out.println("Total Domestic bill : " + (price * unit));
    }
}

class Commercial implements ElectricityBill{
    final double price = 34;
    public void calculateBill(){
        
        System.out.println("COMMERCIAL------");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the units consumed :");
        double unit =s.nextDouble();

        System.out.println("Total Commercial bill : " + (price * unit));
    }
}

