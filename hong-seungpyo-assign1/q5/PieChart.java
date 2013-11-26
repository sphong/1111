package q5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This application draws a pie chart with eight equal slices, 
 * all coloured with a different color.</p>
 *
 * @author Seungpyo Hong
 * @version 1.0
 */
public class PieChart extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 165;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 90;

    /**<p>Static variable represents coordinates of the circle's center.</p>*/
    private static final int XY = 100;
    /**<p>Static variable represents the width and height of the arcs.</p>*/
    private static final int WIDTH_HEIGHT = 200;
    /**<p>Static variable represents the angle of the arcs.</p>*/
    private static final int ANGLE = 45;
    /**<p>Static variable represents the size of the window.</p>*/
    private static final int WINDOW = 400;



    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public PieChart() {
        super("Cut the pie!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(WINDOW, WINDOW); 
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {

        /**
         * <p>The default constructor that retrieves an image to draw.</p>
         */
        public BusinessCardPanel() {
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.white);

            // Text above the pie chart
            g.setColor(Color.black);
            g.drawString("Have a slice!", X_POSITION, Y_POSITION);

            // Integer that represents the start angle of the arcs.
            int startAngle = ANGLE;

            // First slice
            g.setColor(Color.blue);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

            // Second slice
            startAngle += ANGLE;
            g.setColor(Color.yellow);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

            // Third slice
            startAngle += ANGLE;
            g.setColor(Color.green);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

            // Fourth slice
            startAngle += ANGLE;
            g.setColor(Color.orange);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

            // Fifth slice
            startAngle += ANGLE;
            g.setColor(Color.cyan);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

            // Sixth slice
            startAngle += ANGLE;
            g.setColor(Color.magenta);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

            // Seventh slice
            startAngle += ANGLE;
            g.setColor(Color.gray);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

            // Eighth slice
            startAngle += ANGLE;
            g.setColor(Color.pink);
            g.fillArc(XY, XY, WIDTH_HEIGHT, WIDTH_HEIGHT, startAngle, ANGLE);

        }
    }

    /**
     * <p>The main method.</p>
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        new PieChart();

    }

};
