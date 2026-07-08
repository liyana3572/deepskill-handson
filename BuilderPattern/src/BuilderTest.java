public class BuilderTest {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder("Intel i3", "8GB")
                .build();

        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .storage("2TB NVMe SSD")
                .gpu("NVIDIA RTX 4090")
                .bluetooth(true)
                .wifi(true)
                .build();

        Computer officePC = new Computer.Builder("AMD Ryzen 5", "16GB")
                .wifi(true)
                .build();

        System.out.println(basicPC);
        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}