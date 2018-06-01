import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Smile {
    public static void main(String[] args) {
        String path = args[0];
        BufferedImage img;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            String workingDir = System.getProperty("user.dir");
            System.out.println(path + " Datei mit diesem Namen nicht gefunden,\n gesucht wird in diesem Verzeichnis : " + workingDir + "\n auch an die Dateiendung denken");
            return;
        }



        JFrame frame = new AppFrame("APP-Übung 05");
        JPanel companel = new JPanel(new BorderLayout());
        JPanel gamepanel = new JPanel(new BorderLayout());
        JPanel exitpanel = new JPanel(new BorderLayout());
        frame.add(companel,BorderLayout.NORTH);
        frame.add(gamepanel,BorderLayout.CENTER);
        frame.add(exitpanel,BorderLayout.SOUTH);

        JLabel label = new JLabel("Rouds: ");
        JButton start = new JButton("Start");
        JButton exit = new JButton("Exit");
        JEditorPane text = new JEditorPane();
        JTa

        companel.add(label,BorderLayout.WEST);
        companel.add(text, BorderLayout.CENTER);
        companel.add(start, BorderLayout.EAST);

        exitpanel.add(exit);

        AppMouseAdapter m = new AppMouseAdapter();
        exit.addMouseListener(m);

        frame.pack();
        frame.setVisible(true);
    }

}
