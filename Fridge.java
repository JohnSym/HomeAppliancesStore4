public class Fridge extends HomeAppliancesStore {
    /**variable statements*/
    private int length;
    private int height;
    private int depth;
    private String manufacturer_name;
    private String device_name;
    private String device_type;
    private int energy_consumption;
    private boolean no_frost;
    private int total_capacity;
    private int maintenance_capacity;
    private int freezing_capacity;
    private boolean Built_in;
    /** Getters and Setters*/
    public int getlength () {
        return length;
    }

    public void setlength (int newlength){
        this.length = newlength;
    }

    public int getheight () {
        return height;
    }

    public void setheight (int newheight){
        this.height = newheight;
    }

    public int getdepth () {
        return depth;
    }

    public void setdepth (int newdepth){
        this.depth = newdepth;
    }

    public String getmanufacturer_name () {
        return manufacturer_name;
    }

    public void setmanufacturer_name (String newmanufacturer_name){
        this.manufacturer_name = newmanufacturer_name;
    }

    public String getdevice_name () {
        return device_name;
    }

    public void setdevice_name (String newdevice_name){
        this.device_name = newdevice_name;
    }

    public String getdevice_type () {
        return device_type;
    }

    public void setdevice_type (String newdevice_type){
        this.device_type = newdevice_type;
    }

    public int getenergy_consumption () {
        return energy_consumption;
    }

    public void setenergy_consumption (int newenergy_consumption) {
        this.energy_consumption = newenergy_consumption;
    }
            /**Constructor for initializing the Fridge objects*/
    Fridge(int length, int height, int depth, String manufacturer_name, String device_name,
           String device_type, int energy_consumption, int freezing_capacity, int maintenance_capacity ,
           int total_capacity, boolean no_frost ,boolean Built_in){
        this.length=length;
        this.height=height;
        this.depth=depth;
        this.manufacturer_name=manufacturer_name;
        this.device_name=device_name;
        this.device_type=device_type;
        this.energy_consumption=energy_consumption;
        this.freezing_capacity=freezing_capacity;
        this.maintenance_capacity=maintenance_capacity;
        this.total_capacity=total_capacity;
        this.no_frost=no_frost;
        this.Built_in=Built_in;
        ++Counter;
    }
                        /**Function for Fridge device to print objects*/
    public void PrintFridge() {
        System.out.println("\ndevice details: ");
        System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
        System.out.println("Manufacturer: " + manufacturer_name);
        System.out.println("Device name: " + device_name);
        System.out.println("device type: " + device_type);
        System.out.println("energy consumption: " + energy_consumption);
        System.out.println("freezing capacity: " + freezing_capacity);
        System.out.println("maintenance_capacity: " + maintenance_capacity);
        System.out.println("total capacity: " + total_capacity);
        System.out.println("no frost: " + no_frost);
        System.out.println("built in: " + Built_in);

    }
    /**Counter return to HomeApplianceStore*/
    public int getCounterFridge() {
        return Counter;}
    private void periodicMaintenance(){
    }
}

