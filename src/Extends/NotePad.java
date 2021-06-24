package Extends;

public class NotePad extends Computer{
    private char color;

    public NotePad(String CPU, int memory, int disk, char color) {
        super(CPU, memory, disk);
        this.color = color;
    }
    public void printInfo(){
        System.out.println(getDetails() + " color=" + color);
    }
}
