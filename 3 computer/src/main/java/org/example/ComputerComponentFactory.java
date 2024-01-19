package org.example;

public interface ComputerComponentFactory {
    Processor createProcessor();
    RAM createRAM();
    PowerSupply createPowerSupply();
    ExpansionCard createGraficCard();
    SystemBlock createSystemBlock();
    MotherBoard createMotherBoard();
}
