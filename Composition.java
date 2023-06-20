
class laptop{
    private String screen;
    private String ram;
    private String hardDrive;
    private String opticalDisk;
    private String keyboard;
    private processor processor;
    private graphicsCard graphicsCard;

    public laptop(String screen, String ram, String hardDrive, String opticalDisk, String keyboard, processor processor, graphicsCard graphicsCard) {
        this.screen = screen;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.opticalDisk = opticalDisk;
        this.keyboard = keyboard;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "screen='" + screen + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", opticalDisk='" + opticalDisk + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ",\nprocessor=" + processor +
                ",\ngraphicsCard=" + graphicsCard +
                '}';
    }

    public String getScreen() {
        return screen;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getOpticalDisk() {
        return opticalDisk;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public processor getProcessor() {
        return processor;
    }

    public graphicsCard getGraphicsCard() {
        return graphicsCard;
    }
}

class processor{
    private String series;
    private String thread;
    private String cores;
    private String generation;

    public processor(String series, String thread, String cores, String generation) {
        this.series = series;
        this.thread = thread;
        this.cores = cores;
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "processor{" +
                "series='" + series + '\'' +
                ", thread='" + thread + '\'' +
                ", cores='" + cores + '\'' +
                ", generation='" + generation + '\'' +
                '}';
    }

    public String getSeries() {
        return series;
    }

    public String getThread() {
        return thread;
    }

    public String getCores() {
        return cores;
    }

    public String getGeneration() {
        return generation;
    }
}

class graphicsCard{
    private String brand;
    private String memory;
    private String series;

    public graphicsCard(String brand, String memory, String series) {
        this.brand = brand;
        this.memory = memory;
        this.series = series;
    }

    @Override
    public String toString() {
        return "graphicsCard{" +
                "brand='" + brand + '\'' +
                ", memory='" + memory + '\'' +
                ", series='" + series + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    public String getSeries() {
        return series;
    }
}

public class Composition {

    public static void main(String[] args) {

        laptop lap = new laptop("14.2" , "DDR4" , "2TB" ,
                "NVMeI" , "backlit" ,
                new processor("intel" , "8" , "4" , "7") ,
                new graphicsCard("NVidia" , "24 GB" , "RTX3090"));

        System.out.println(lap);

        System.out.println();
        System.out.println(lap.getProcessor());
        System.out.println(lap.getProcessor().getSeries());
    }
}
