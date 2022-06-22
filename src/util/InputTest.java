package util;

import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input changes = new Input();
        changes.yesNo();
        changes.getInt();
        changes.getInt(10, 25);
        changes.getDouble();
        changes.getDouble(1, 15);
    }
}
