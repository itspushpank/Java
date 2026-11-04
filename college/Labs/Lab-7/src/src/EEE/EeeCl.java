package EEE;

import CSE.CalcuCse;
import CSE.CseLab;

public class EeeCl {
    public static void main(String[] args) {
        CseLab cseLab = new CseLab();
        cseLab.printer();

        CalcuCse clcu = new CalcuCse(4,8);
        clcu.sum();

        clcu.product();
    }
}
