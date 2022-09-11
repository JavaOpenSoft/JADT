import jadt.core.Label;
import jadt.core.Window;

public class WindowTest {

    public static void main(String[] args) {
        Window window = new Window();
        Label label = new Label("Hello world!");
        window.add(label);
    }
}
