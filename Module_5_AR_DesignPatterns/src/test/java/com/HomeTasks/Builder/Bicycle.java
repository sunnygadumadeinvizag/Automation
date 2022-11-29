package com.HomeTasks.Builder;

public class Bicycle {
    private final boolean gears;
    private final boolean doubleStands;
    private final boolean doubleSeats;
    private final boolean carrier;

    public boolean isGears() {
        return gears;
    }

    public boolean isDoubleStands() {
        return doubleStands;
    }

    public boolean isDoubleSeats() {
        return doubleSeats;
    }

    public boolean isCarrier() {
        return carrier;
    }

    private Bicycle(BicycleBuilder builder){
        this.gears=builder.gears;
        this.doubleStands=builder.doubleStands;
        this.doubleSeats=builder.doubleSeats;
        this.carrier=builder.carrier;
    }

    public static class BicycleBuilder{
        private boolean gears;
        private boolean doubleStands;
        private boolean doubleSeats;
        private boolean carrier;

        public BicycleBuilder(){
        }
        public BicycleBuilder gears(boolean gears){
            this.gears=gears;
            return this;
        }
        public BicycleBuilder doubleStands(boolean doublestands){
            this.doubleStands=doublestands;
            return this;
        }
        public BicycleBuilder doubleSeats(boolean doubleSeats){
            this.doubleSeats=doubleSeats;
            return this;
        }
        public BicycleBuilder carrier(boolean carrier){
            this.carrier=carrier;
            return this;
        }
        public Bicycle build()
        {
            return new Bicycle(this);
        }
    }
}
