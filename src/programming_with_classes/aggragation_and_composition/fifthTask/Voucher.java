package programming_with_classes.aggragation_and_composition.fifthTask;

import java.util.ArrayList;

public class Voucher {
    private final String name;
    private final VoucherType voucherType;
    private final String transport;
    private final String food;
    private final int duration;
    private final int price;
    private static ArrayList<Voucher> vouchers = new ArrayList<>();

    public String getTransport() {
        return transport;
    }

    public String getFood() {
        return food;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Voucher> getVouchers() {
        return vouchers;
    }

    public Voucher(VoucherType type, String name, String transport, String food, int duration, int price) {
        this.voucherType = type;
        this.name = name;
        this.transport = transport;
        this.food = food;
        this.duration = duration;
        this.price = price;
        vouchers.add(this);
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }

    @Override
    public String toString() {
        return "------\n" + "\"" + name + "\"\n" + "Type: " + voucherType + "\nHow to get: " + transport + "\nFood: " + food + "\nDuration: " + duration
                + "\nPrice: " + price + "€\n------";
    }
}
