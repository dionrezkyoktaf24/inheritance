public class vehicle {
    int numWheels;
    double price;

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public void print() {

        System.out.println("----------------------------");
        System.out.println("         DATA SEPEDA");
        System.out.println("----------------------------");

        System.out.println("Sepeda dengan " + numWheels + " Roda,");
        System.out.println("Harga Sepeda : Rp." +price);
        System.out.println("Harga Awal Sepeda : Rp."+price);
    }

    public double applyDiscount(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
}
