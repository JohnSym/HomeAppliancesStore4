public class Oven extends HomeAppliancesStore {
    /**variable statements*/
        private int length;
        private int height;
        private int depth;
        private String manufacturer_name;
        private String device_name;
        private String device_type;
        private int energy_consumption;
        private int oven_capacity;
        private int ways_of_baking;
        private boolean digital_Screen;
        private boolean telescopic_Mechanism;
        private String switches;
        /** Getters and Setters*/
        public int getlength() {
            return length;
        }

        public void setlength(int newlength) {
            this.length = newlength;
        }

        public int getheight() {
            return height;
        }

        public void setheight(int newheight) {
            this.height = newheight;
        }

        public int getdepth() {
            return depth;
        }

        public void setdepth(int newdepth) {
            this.depth = newdepth;
        }

        public String getmanufacturer_name() {
            return manufacturer_name;
        }

        public void setmanufacturer_name(String newmanufacturer_name) {
            this.manufacturer_name = newmanufacturer_name;
        }

        public String getdevice_name() {
            return device_name;
        }

        public void setdevice_name(String newdevice_name) {
            this.device_name = newdevice_name;
        }

        public String getdevice_type() {
            return device_type;
        }

        public void setdevice_type(String newdevice_type) {
            this.device_type = newdevice_type;
        }

        public int getenergy_consumption() {
            return energy_consumption;
        }

        public void setenergy_consumption(int newenergy_consumption) {
            this.energy_consumption = newenergy_consumption;
        }

        public static void Object_Size() {

        }
                    /**Constructor for initializing the Oven objects*/
         Oven(int length, int height, int depth, String manufacturer_name, String device_name,
                          String device_type, int energy_consumption, int oven_capacity, int ways_of_Baking,
                          boolean telescopic_Mechanism, boolean digital_Screen, String switches) {
            this.length = length;
            this.height = height;
            this.depth = depth;
            this.manufacturer_name = manufacturer_name;
            this.device_name = device_name;
            this.device_type = device_type;
            this.energy_consumption = energy_consumption;
            this.oven_capacity = oven_capacity;
            this.ways_of_baking = ways_of_Baking;
            this.telescopic_Mechanism = telescopic_Mechanism;
            this.digital_Screen = digital_Screen;
            this.switches = switches;
        }
                /**Function for Oven device to print objects*/
        public void PrintOven() {
            System.out.println("\ndevice details: ");
            System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
            System.out.println("Manufacturer: " + manufacturer_name);
            System.out.println("Device name: " + device_name);
            System.out.println("device type: " + device_type);
            System.out.println("energy consumption: " + energy_consumption);
            System.out.println("oven capacity: " + oven_capacity);
            System.out.println("ways of baking: " + ways_of_baking);
            System.out.println("telescopic mechanism: " + telescopic_Mechanism);
            System.out.println("digital screen: " + digital_Screen);
            System.out.println("switches: " + switches);
        }
    /**Counter return to HomeApplianceStore*/
    public int getCounterOven() {
        return Counter;}

        private void periodicMaintenance() {
        }
}
