import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameControl extends JFrame{
    private int ScreenW = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int ScreenH = Toolkit.getDefaultToolkit().getScreenSize().height;
    private int frmW = 1000,frmH = 800,MarioX = 500,MarioY = 600;
    private JLabel jlabMario = new JLabel();
    private JLabel jlabGround = new JLabel();
    private JButton jbStart = new JButton("Start");
    private JLabel jlCount = new JLabel("Count");
    private JTextField jtxCount = new JTextField("0");
    private JLabel jlTime = new JLabel("Time :");
    private JTextField jtxTime = new JTextField("0");
    private JPanel jpnSouth = new JPanel(new GridLayout(1,7,3,3));
    private Container cp;
    public GameControl(){
        init();
    }
    private void init(){
        this.setTitle("Game");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(ScreenW/2-frmW/2,ScreenH/2-frmH/2,frmW,frmH);
        this.setLayout(null);
        this.add(jlabMario);
        this.add(jlabGround);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        jlabMario.setBounds(MarioX,MarioY,100,50);
        jlabMario.setOpaque(true);
        jlabMario.setBackground(Color.BLUE);
        jlabGround.setBounds(0,670,1000,40);
        jlabGround.setBackground(new Color(0x855E2C));
        jlabGround.setOpaque(true);
        jpnSouth.add(jbStart);
        jpnSouth.add(jlCount);
        jpnSouth.add(jtxCount);
        jpnSouth.add(jlTime);
        jpnSouth.add(jtxTime);
        cp.add(jpnSouth,BorderLayout.SOUTH);

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_RIGHT:
                        MarioX++;
                        jlabMario.setLocation(MarioX,MarioY);
                        break;
                    case KeyEvent.VK_LEFT:
                        MarioX--;
                        jlabMario.setLocation(MarioX,MarioY);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }



}