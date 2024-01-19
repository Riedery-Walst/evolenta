package org.example.gaming;

import org.example.ExpansionCard;
import org.example.MotherBoard;
import org.example.Processor;
import org.example.RAM;

public class GamingMotherBoard implements MotherBoard {
    private RAM gamingRam;
    private Processor gamingProcessor;
    private ExpansionCard expansionCard;
    @Override
    public void powerUp() {

    }

    public void setGamingRam(RAM gamingRam) {
        this.gamingRam = gamingRam;
    }

    public void setGamingProcessor(Processor gamingProcessor) {
        this.gamingProcessor = gamingProcessor;
    }

    public void setExpansionCard(ExpansionCard expansionCard) {
        this.expansionCard = expansionCard;
    }

    @Override
    public void connectComponents() {

    }

    @Override
    public void storeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void writeData() {

    }
}
