public class convertible extends car {
    public convertible(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
        super(numWheels, price, numDoors, isElectric, roofType);
    }
    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This is a convertible car.");
    }
}
