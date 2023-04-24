public class Laptop {
    public static void main(String[] args){
        Laptop macbook = new Laptop("US English(standard)", "Magic Track Pad", "13 inch", "(2) USB Type-c & (1) Aux");
        System.out.format("Laptop: Macbook, Keyboard: %s, Mouse: %s, Screen: %s, Ports: %s", macbook.keyboard, macbook.mousePad, macbook.Screen, macbook.Ports);
    }
    String keyboard;
    String mousePad;
    String Screen;
    String Ports;
    public Laptop(String keyboard, String mousePad, String Screen, String Ports){
        this.keyboard = keyboard;
        this.mousePad = mousePad;
        this.Screen = Screen;
        this.Ports = Ports;
    }

}
