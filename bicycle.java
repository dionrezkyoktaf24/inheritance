public class bicycle extends vehicle {
    String bikeType;

    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    @Override
    public void print() {
        super.print();

        System.out.println("Tipe Sepeda: " + bikeType);
    }
}
