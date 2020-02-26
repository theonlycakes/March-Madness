import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args)  {
        Frame f = new Frame();
        f.setSize(400,400);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.show();
    }
}
