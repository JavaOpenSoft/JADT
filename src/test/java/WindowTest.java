
import jadt.core.Menu;
import jadt.core.Window;

public class WindowTest {

    public static void main(String[] args) {
        Window window = new Window();
        Menu menu = new Menu("What the");
        menu.setFont("Arial", "Bold", 10);
        System.out.println(menu.getFontName());
    }
}
