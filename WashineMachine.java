public class WashineMachine extends HomeAppliancesStore{
    /**variable statements*/
        private int length;
        private int height;
        private int depth;
        private String manufacturer_name;
        private String device_name;
        private String device_type;
        private int energy_consumption;
        private int RPM;
        private int Washing_capacity;
        private int Number_of_Programs;
        private boolean smart_properties;
        private int Washing_Noise_Level;
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
                    /**Constructor for initializing the WashineMachine objects*/
         WashineMachine(int length, int height, int depth, String manufacturer_name, String device_name,
                  String device_type, int energy_consumption, int Washing_capacity , int Washing_Noise_Level ,
                  boolean smart_properties , int Number_of_programms , int RPM ) {
            this.length = length;
            this.height = height;
            this.depth = depth;
            this.manufacturer_name = manufacturer_name;
            this.device_name = device_name;
            this.device_type = device_type;
            this.energy_consumption = energy_consumption;
            this.Number_of_Programs=Number_of_programms;
            this.smart_properties=smart_properties;
            this.RPM=RPM;
            this.Washing_capacity=Washing_capacity;
            this.Washing_Noise_Level=Washing_Noise_Level;
        }
                    /**Function for Washine Machine device to print objects*/
        public void PrintWashineMchine() {
            System.out.println("\ndevice details: ");
            System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
            System.out.println("Manufacturer: " + manufacturer_name);
            System.out.println("Device name: " + device_name);
            System.out.println("device type: " + device_type);
            System.out.println("energy consumption: " + energy_consumption);
            System.out.println("Washine noise level: " +Washing_Noise_Level);
            System.out.println("Washine capacity: " +Washing_capacity);
            System.out.println("smart properties: " +smart_properties);
            System.out.println("Number of programms: " +Number_of_Programs);
            System.out.println("Number of RPM's: " +RPM);
        }
        /**Counter return to HomeApplianceStore*/
    public int getCounterWashineMachine() {
        return Counter;}

        private void periodicMaintenance() {
        }
}
