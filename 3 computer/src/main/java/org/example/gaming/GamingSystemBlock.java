package org.example.gaming;

import org.example.MotherBoard;
import org.example.PowerSupply;
import org.example.SystemBlock;

public class GamingSystemBlock implements SystemBlock {
    private MotherBoard motherBoard;
    private PowerSupply powerSupply;

    @Override
    public void turnOn() {
    }

    @Override
    public void turnOff() {
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
}
