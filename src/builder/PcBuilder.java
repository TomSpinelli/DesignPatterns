package builder;

public class PcBuilder {
    private String processor;
    private String placaVideo;
    private String ram;
    private String ssd;

    public Pc build(){
        return new Pc(this);
    }

     public PcBuilder Processor(String processor) {
        this.processor =  processor;
         return this;
    }

    public PcBuilder PlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public PcBuilder RAM(String ram) {
        this.ram = ram;
        return this;
    }

    public PcBuilder SSD(String ssd) {
        this.ssd = ssd;
        return this;
    }

    public String getProcessor() {
        return this.processor;
    }
    public String getPlacaVideo() {
        return placaVideo;
    }
    public String getRAM() {
        return ram;
    }
    public String getSSD() {
        return ssd;
    }



}
