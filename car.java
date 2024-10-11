public class car extends vehicle {
    int numDoors;
    boolean isElectric;
    String roofType;

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

    public car(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
        super(numWheels, price);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
        this.roofType = roofType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("----------------------------");
        System.out.println("         DATA MOBIL");
        System.out.println("----------------------------");
        System.out.println("Mobil Mempunyai " + numDoors + " Pintu");
        System.out.println("Tipe Mobil Electric: "+isElectric);
        System.out.println("Tipe Atap Pada Mobil Yaitu: "+roofType);
        System.out.println("Harga awal Mobil Yaitu: Rp."+price);
        System.out.println("");
    }
}
