import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
//    Java doc!
    private static void createAndShowGUI() {
//        create and set up the window
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //add hello world label
        JLabel label = new JLabel("Hello, World!");
        frame.getContentPane().add(label);

        //Display the window
        frame.pack();
        frame.setVisible(true);
    }
}

