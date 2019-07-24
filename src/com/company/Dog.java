package com.company;

public final class Dog extends Pet {

    private String name;
    private String breed;
    private String commands;

    public Dog(int age, Color color, Shelter shelter) {
        super(age, color, shelter);

    }

    public Dog() {

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(5, Color.BROWN, new Shelter("Собачии рынок", "Бишкек"));
        this.name = name;
        this.breed = breed;

    }

    public Dog(String name, String breed, Color color, Shelter shelter, String commands) {
        super(5, Color.BROWN, new Shelter("Собачии рынок", "Бишкек"));
        this.name = name;
        this.breed = breed;
        this.commands = commands;

    }

    public void makeVoice() {
        System.out.println("Гаф гаф");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Гаф гаф ");
        }
        System.out.println();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println();
    }

    public String getInfo() {
        return super.getInfo() + "имя" + name
                + "порода: " + breed
                + "команды: " + commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setComands(String commands) {
        this.commands = commands;
    }


}