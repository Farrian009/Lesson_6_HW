public class Laptop {

    protected int ram;
    protected int rom;
    protected String typeHardDrive;
    protected String os;
    protected String color;
    protected int screenSize;
    protected String manufacture;
    protected int price;

    public Laptop(int ram, int rom, String typeHardDrive, String os, String color, int screenSize, String manufacture, int price){
        this.ram = ram;
        this.rom = rom;
        this.typeHardDrive = typeHardDrive;
        this.os = os;
        this.color = color;
        this.screenSize = screenSize;
        this.manufacture = manufacture;
        this.price = price;
    }

    public Laptop(){

    }

    public int getRam(){
        return this.ram;
    }

    public String getManufacture(){
        return this.manufacture;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return manufacture+ "/" + os + "/" + screenSize + "/" + price;
    }

    @Override
    public boolean equals(Object obj) {
        return false;

    }

    @Override
    public int hashCode() {
        return os.hashCode() + 7*rom + 11*color.hashCode() + 17*screenSize;
    }





}
