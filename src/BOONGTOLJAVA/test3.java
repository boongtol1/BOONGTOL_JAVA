package BOONGTOLJAVA;

import java.math.BigDecimal;

public class test3 {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("0.1");
        BigDecimal increment = new BigDecimal("0.1");
        BigDecimal max = new BigDecimal("1.0");
        
        while (x.compareTo(max) <= 0) {
            System.out.println(x);
            x = x.add(increment);
        }
    }
}
