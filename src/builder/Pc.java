package builder;

public class Pc {

    private final String processor;

    private final String placaVideo;

    private final String ram;

    private final String ssd;

    private final String motherboard;

    public Pc(PcBuilder pcBuilder){
        this.processor = pcBuilder.getProcessor();
        this.placaVideo = pcBuilder.getPlacaVideo();
        this.ram = pcBuilder.getRAM();
        motherboard = "DANURI";
        this.ssd = pcBuilder.getSSD();
    }

    @Override
    public String toString(){
        return "CPU " + this.processor +
                ", GPU " + this.placaVideo +
                ", RAM " + this.ram +
                ", SSD " + this.ssd +
                ", MOTHERBOARD " + this.motherboard;
    }
}
