package util;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        // Test getString method
        System.out.println("getString: " + input.getString());
        // Test yesNo method
        System.out.println("yesNo: " + input.yesNo());
        // Test getInt(min, max) method
        System.out.println("getInt(min, max): " + input.getInt(0, 10));
        // Test getInt() method
        System.out.println("getInt: " + input.getInt());
        // Test getDouble(min, max) method
        System.out.println("getDouble(min, max): " + input.getDouble(0.0, 10.0));
        // Test getDouble() method
        System.out.println("getDouble: " + input.getDouble());
    }
}