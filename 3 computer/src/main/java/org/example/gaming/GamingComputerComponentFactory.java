package org.example.gaming;

import org.example.*;

public class GamingComputerComponentFactory implements ComputerComponentFactory {
    @Override
    public Processor createProcessor() {
        return new GamingProcessor();
    }

    @Override
    public RAM createRAM() {
        return new GamingRAM();
    }

    @Override
    public PowerSupply createPowerSupply() {
        return new GamingPowerSupply();
    }

    @Override
    public ExpansionCard createGraficCard() {
        return new GamingGraphicCard();
    }

    @Override
    public SystemBlock createSystemBlock() {
        return new GamingSystemBlock();
    }

    @Override
    public MotherBoard createMotherBoard() {
        return new GamingMotherBoard();
    }

}
