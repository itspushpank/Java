package CSE;

public class CalcuCse {
    int a;
    int b;
    public CalcuCse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        System.out.println(a + b);
    }
    private void diff() {
        System.out.println(a - b);
    }
    public void product() {
        System.out.println(a * b);
    }

    protected void divide() {
        System.out.println(a / b);
    }
}


