package homework_9.data;

public enum Planets {
    MERCURY("mercury", 88){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    },

    VENUS("venus", 225){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    },
    EARTH("earth", 365){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    },
    MARS("mars", 687){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    },
    JUPITER("jupiter", 4333){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    },
    SATURN("saturn", 10759){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    },
    URANUS("uranus", 30687){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    },
    NEPTUNE("neptune", 60200){
        @Override
        public String toString() {
            return this.getName() + ", " + this.getYearLength();
        }
    };
    private String name;

    private int yearLength;
    private Planets(String name, int yearLength){
        this.name = name;
        this.yearLength = yearLength;
    }
    public String getName(){
        return name;
    }

    public int getYearLength(){
        return yearLength;
    }

}
