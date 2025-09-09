package builder;

public class Main {

    public static void main(String[] args) {
        //Builder
        PcBuilder pcBuilder = new PcBuilder();
        pcBuilder.Processor("x86").RAM("8gb").SSD("1tb").PlacaVideo("NVIDIA");
        Pc pc = pcBuilder.build();
        System.out.println(pc.toString());
    }
}
