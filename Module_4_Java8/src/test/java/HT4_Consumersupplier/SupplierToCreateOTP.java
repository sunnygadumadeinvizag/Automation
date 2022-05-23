package HT4_Consumersupplier;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierToCreateOTP {

    public static void main(String[] args) {


        IntSupplier sp = () -> Integer.valueOf(new DecimalFormat("0000000").format(new Random().nextInt(9999999)));

        System.out.println(sp.getAsInt());
    }

}
