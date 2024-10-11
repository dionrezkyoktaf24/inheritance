import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Pilih jenis kendaraan: ");
        System.out.println("1. Car");
        System.out.println("2. Bicycle");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Input untuk Car
            System.out.println("Masukkan detail untuk mobil (Car):");
            System.out.print("Jumlah roda: ");
            int numWheels = scanner.nextInt();
            System.out.print("Harga: ");
            double price = scanner.nextDouble();
            System.out.print("Jumlah pintu: ");
            int numDoors = scanner.nextInt();
            System.out.print("Apakah mobil elektrik? (true/false): ");
            boolean isElectric = scanner.nextBoolean();
            scanner.nextLine();

            System.out.print("Jenis atap (hardtop atau softtop): ");
            String roofType = scanner.nextLine();

            System.out.print("Apakah ini mobil convertible? (true/false): ");
            boolean isConvertible = scanner.nextBoolean();

            car car;
            if (isConvertible) {
                car = new convertible(numWheels, price, numDoors, isElectric, roofType);
            } else {
                car = new car(numWheels, price, numDoors, isElectric, roofType);
            }
            car.print();

            System.out.print("Apakah mobil ini mendapat diskon? (true/false): ");
            boolean applyDiscount = scanner.nextBoolean();
            if (applyDiscount) {
                System.out.print("Masukkan persentase diskon untuk mobil: ");
                double discountCar = scanner.nextDouble();
                double finalPriceCar = car.applyDiscount(discountCar);
                System.out.println("Harga setelah diskon untuk mobil: Rp." + finalPriceCar);
            } else {
                System.out.println("Harga mobil tanpa diskon: Rp." + car.price);
            }

        } else if (choice == 2) {
            // Input untuk Bicycle
            System.out.println("Masukkan detail untuk sepeda (Bicycle):");
            System.out.print("Jumlah roda: ");
            int numWheels = scanner.nextInt();
            System.out.print("Harga: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Jenis sepeda: ");
            String bikeType = scanner.nextLine();

            bicycle bicycle = new bicycle(numWheels, price, bikeType);
            bicycle.print();

            System.out.print("Apakah sepeda ini mendapat diskon? (true/false): ");
            boolean applyDiscount = scanner.nextBoolean();
            if (applyDiscount) {
                System.out.print("Masukkan persentase diskon untuk sepeda: ");
                double discountBicycle = scanner.nextDouble();
                double finalPriceBicycle = bicycle.applyDiscount(discountBicycle);
                System.out.println("Harga setelah diskon untuk sepeda: Rp." + finalPriceBicycle);
            } else {
                System.out.println("Harga sepeda tanpa diskon: Rp." + bicycle.price);
            }

        } else {
            System.out.println("Pilihan tidak valid, harap masukkan 1 atau 2.");
        }

        scanner.close();
    }
}
