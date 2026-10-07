class ElectricityConnection {
    void calculateBill() {
        System.out.println("Calculating electricity bill...");
    }
}

class DomesticConnection extends ElectricityConnection {
    private int units = 150;

    @Override
    void calculateBill() {
        double bill;
        if (units <= 125) {
            bill = units * 10;
        } else {
            bill = 125 * 10 + (units - 125) * 15;
        }
        System.out.println("Domestic Connection Bill: " + bill + " (Units consumed: " + units + ")");
    }
}

class CommercialConnection extends ElectricityConnection {
    private int units = 120;

    @Override
    void calculateBill() {
        double bill;
        if (units <= 100) {
            bill = units * 20;
        } else {
            bill = 100 * 20 + (units - 100) * 25;
        }
        System.out.println("Commercial Connection Bill: " + bill + " (Units consumed: " + units + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricityConnection domestic = new DomesticConnection();
        ElectricityConnection commercial = new CommercialConnection();

        domestic.calculateBill();
        commercial.calculateBill();
    }
}