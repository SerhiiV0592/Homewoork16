public enum Season {
    SUMMER(22), AUTUMN(10), WINTER(-10), SPRING(12);

    private int middletemperature;

    Season(int middletemperature) {
        this.middletemperature = middletemperature;
    }

    public int getMiddletemperature() {
        return middletemperature;
    }

    public void showTemperature(){
        System.out.println("Middle temperature is "+ middletemperature);
    }
}
