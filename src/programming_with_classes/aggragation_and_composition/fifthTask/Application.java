package programming_with_classes.aggragation_and_composition.fifthTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

    private static final Scanner input = new Scanner(System.in);
    static ArrayList<Voucher> vouchersBase = createVouchers();


    private static ArrayList<Voucher> createVouchers() {
    Voucher canaryIslandsCruise = new Voucher(VoucherType.CRUISE, "Canary islands cruise", "Liner", "All inclusive", 12, 639);
    Voucher cubaCruise = new Voucher(VoucherType.CRUISE, "Cruise in Cuba", "Liner", "All inclusive", 7, 509);

    Voucher krasnayaPolyanaExcursion = new Voucher(VoucherType.EXCURSION, "Krasnaya polyana", "Bus", "Dry ration", 1, 14);
    Voucher saintMaloExcursion = new Voucher(VoucherType.EXCURSION, "Saint-Malo - the city of corsairs", "Bus", "Not included", 1, 90);

    Voucher warsawShopTour = new Voucher(VoucherType.SHOPPING, "Shop tour in Warsaw", "Minibus", "Not included", 1, 20);
    Voucher berlinShopTour = new Voucher(VoucherType.SHOPPING, "Berlin shop tour", "Bus", "Breakfasts", 4, 136);

    Voucher abanoTermeTreatment = new Voucher(VoucherType.TREATMENT, "Rest and treatment in Abano Terme", "Airplane", "All inclusive", 7, 707);
    Voucher bormioTrearment = new Voucher(VoucherType.TREATMENT, "Downhill skiing in Bormio", "Airplane", "All inclusive",  7, 535);
    return Voucher.getVouchers();
    }

    static void run() {
        System.out.println("Make your choice:" +
                "\n1. Show all vouchers" +
                "\n2. Sort vouchers" +
                "\n3. Find voucher for me");
        switch (input.next()) {
            case "1":
                showAllVouchers();
                choiceVoucher();
                break;
            case "2":
                sortVouchers();
                break;
            case "3":
                findVoucherApp();
                break;
            default:
                System.out.println("Error!");
        }
    }

    private static void findVoucherApp() {
        System.out.println("Select the type of tour:" +
                "\n1. Excursion" +
                "\n2. Cruise" +
                "\n3. Shopping" +
                "\n4. Treatment");
        VoucherType type = VoucherType.EXCURSION;
        switch (input.next()) {
            case "1":
                type = VoucherType.EXCURSION;
                break;
            case "2":
                type = VoucherType.CRUISE;
                break;
            case "3":
                type = VoucherType.SHOPPING;
                break;
            case "4":
                type = VoucherType.TREATMENT;
                break;
            default:
                System.out.println("Error!");
        }
        System.out.println("Choose the price that suits you: ");
        int counter = 1;
        for (int i = 0; i < vouchersBase.size(); i++) {
            if (vouchersBase.get(i).getVoucherType() == type) {
                System.out.println(counter + ". " + vouchersBase.get(i).getPrice());
                counter++;
            }
        }
        int number = input.nextInt();

        if (number > counter || number < 0) System.out.println("Error!");
        else System.out.println("Your voucher:\n" + vouchersBase.get(number-1));
    }

    private static void sortVouchers() {
        System.out.println("Sort vouchers" +
                "\n1. By price" +
                "\n2. By duration");
        switch (input.next()){
            case "1":
                sortByPrice();
                break;
            case "2":
                sortByDuration();
                break;
            default:
                System.out.println("Error!");
        }
        showAllVouchers();
    }

    private static void sortByDuration() {
        Voucher[] vouchers = Voucher.getVouchers().toArray(new Voucher[0]);

        for (int i = 0; i < vouchers.length - 1; i++) {
            for (int j = i + 1; j < vouchers.length; j++) {
                if (vouchers[i].getDuration() > vouchers[j].getDuration()) {
                    Voucher temp = vouchers[i];
                    vouchers[i] = vouchers[j];
                    vouchers[j] = temp;
                }
            }
        }
        vouchersBase = new ArrayList<Voucher>(List.of(vouchers));
    }

    private static void sortByPrice() {
        Voucher[] vouchers = vouchersBase.toArray(new Voucher[0]);
        for (int i = 0; i < vouchers.length - 1; i++) {
            for (int j = i + 1; j < vouchers.length; j++) {
                if (vouchers[i].getPrice() > vouchers[j].getPrice()) {
                    Voucher temp = vouchers[i];
                    vouchers[i] = vouchers[j];
                    vouchers[j] = temp;
                }
            }
        }
        vouchersBase = new ArrayList<Voucher>(List.of(vouchers));
    }

    private static void showAllVouchers() {
        int number = 1;
        for (Voucher voucher :
                vouchersBase) {
            System.out.println(number + "\n" + voucher);
            number++;
        }
    }

    private static void choiceVoucher() {
        System.out.println("Choice your voucher");
        ArrayList<Voucher> vouchers = Voucher.getVouchers();
        int number = input.nextInt();
        if (number > Voucher.getVouchers().size()) System.out.println("Error!");
        else System.out.println("Your voucher:\n" + vouchers.get(number - 1));
    }
}
