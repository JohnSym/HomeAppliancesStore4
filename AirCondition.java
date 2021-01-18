public class AirCondition extends HomeAppliancesStore {
    /**variable statements*/
        private int length;
        private int height;
        private int depth;
        private String manufacturer_name;
        private String device_name;
        private String device_type;
        private int energy_consumption;
        private boolean air_filter;
        private int cooling_power;
        private int heating_Power;
        private boolean ionist;
        private boolean Ecological_Coolant_R32;
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
                /**Constructor for initializing the Air Condition objects*/
        AirCondition(int length, int height, int depth, String manufacturer_name, String device_name,
               String device_type, int energy_consumption, int cooling_Power, int heating_Power ,
               boolean Ecological_Coolant_R32, boolean air_filter ,boolean ionist){
            this.length=length;
            this.height=height;
            this.depth=depth;
            this.manufacturer_name=manufacturer_name;
            this.device_name=device_name;
            this.device_type=device_type;
            this.energy_consumption=energy_consumption;
            this.cooling_power=cooling_Power;
            this.heating_Power=heating_Power;
            this.Ecological_Coolant_R32=Ecological_Coolant_R32;
            this.air_filter=air_filter;
            this.ionist=ionist;
        }
                    /**Function for Air Condition device to print objects*/
        public void PrintAirCondition() {
            System.out.println("\ndevice details: ");
            System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
            System.out.println("Manufacturer: " + manufacturer_name);
            System.out.println("Device name: " + device_name);
            System.out.println("device type: " + device_type);
            System.out.println("energy consumption: " + energy_consumption);
            System.out.println("cooling power: " + cooling_power);
            System.out.println("heating power: " + heating_Power);
            System.out.println("Ecological coolant (R32): " + Ecological_Coolant_R32);
            System.out.println("air filter: " + air_filter);
            System.out.println("ionist: " + ionist);
        }
    /**Counter return to HomeApplianceStore*/
    public int getCounterAirCondition() {
        return Counter;}
        private void periodicMaintenance(){
        }
}
