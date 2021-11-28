public class Test {

    public static void main(String[] args) {
        Animal cat = Animal.CAT;
        Animal dog = Animal.DOG;
        Animal mouse = Animal.MOUSE;
        Animal frog = Animal.FROG;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        Season spring = Season.SPRING;
        cat.animalSays();
        dog.animalSays();
        mouse.animalSays();
        frog.animalSays();
        summer.showTemperature();
        autumn.showTemperature();
        winter.showTemperature();
        spring.showTemperature();

    }
}
