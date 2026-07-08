public class Computer {

    private final String cpu;
    private final String ram;


    private final String storage;
    private final String gpu;
    private final boolean hasBluetooth;
    private final boolean hasWifi;


    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
                ", GPU=" + gpu + ", Bluetooth=" + hasBluetooth + ", WiFi=" + hasWifi + "]";
    }


    public static class Builder {
        private final String cpu;
        private final String ram;

        private String storage = "256GB SSD";
        private String gpu = "Integrated Graphics";
        private boolean hasBluetooth = false;
        private boolean hasWifi = false;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder bluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder wifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}