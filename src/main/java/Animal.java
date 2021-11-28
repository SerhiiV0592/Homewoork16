public enum Animal {
    DOG("Bark"), CAT("Meow"), MOUSE("Pipipi"), FROG("QwaQwa");
    public String voice;


    Animal(String voice) {
        this.voice = voice;
    }
    public String getVoice() {
        return voice;
    }

    public void animalSays(){
        System.out.println("Animal make sound "+ voice);
    }


}
