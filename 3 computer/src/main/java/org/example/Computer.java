package org.example;

public abstract class Computer {
    private ExpansionCard expansionCard;
    private GraphicCard graphicCard;
    private PowerSupply powerSupply;
    private MotherBoard motherBoard;
    private Processor processor;
    private RAM ram;
    private SystemBlock systemBlock;

    public void setExpansionCard(ExpansionCard expansionCard) {
        this.expansionCard = expansionCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public ExpansionCard getExpansionCard() {
        return expansionCard;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }
}
