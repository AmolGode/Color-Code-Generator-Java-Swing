/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgbcolorgenerator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.datatransfer.*;


/**
 *
 * @author ASUS
 */
public class RgbColorGenerator extends JFrame implements AdjustmentListener ,ActionListener {

    /**
     * @param args the command line arguments
     */
    
    static JScrollBar s1;
    static JScrollBar s2;
    static JScrollBar s3,s4;
    static Font f1,f2,f3;
    static JTextField tf1,tf2,tf3,tf4RGB,tfHEX,tfOpc,tf5,tfOpcHEX;
    static JPanel tfColor;
    static Color c;
    static JLabel red,green,blue,opacity;
    static JLabel heading,opcText;
    int x,y,z,opc;
    String r,g,b,opcHEX;
    JButton copy,copy2,copyHEX,copyOpcHEX;
    
    RgbColorGenerator(String str)
    {
        super(str);
        
        f1 = new Font("Raleway", Font.BOLD, 25);
        f2 = new Font("Raleway", Font.BOLD, 45);
        f3 = new Font("Releway",Font.BOLD,65);

        s1 = new JScrollBar(JScrollBar.HORIZONTAL,0,10,0,265);
        s2 = new JScrollBar(JScrollBar.HORIZONTAL,0,10,0,265);
        s3 = new JScrollBar(JScrollBar.HORIZONTAL,0,10,0,265);
        s4 = new JScrollBar(JScrollBar.HORIZONTAL,255,10,0,265);
        
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        s4.addAdjustmentListener(this);
        
        red = new JLabel("( RANGE 0 - 255 ) RED");
        green = new JLabel("( RANGE 0 - 255 ) GREEN");
        blue = new JLabel("( RANGE 0 - 255 ) BLUE");
        heading = new JLabel(" RGB() , RGBA() AND HEX COLOUR GENERATOR ");
        opacity = new JLabel("( RANGE 0 - 1 ) ALPHA <OPACITY>");
        opcText = new JLabel("I'AM COLOR OPACITY");
        
        
       tf1 = new JTextField("0");
       tf2 = new JTextField("0");
       tf3 = new JTextField("0");
       tf5 = new JTextField("1.0");
       tfHEX = new JTextField("#000000");
       tfOpcHEX = new JTextField("#000000ff");
       tf4RGB = new JTextField("RGB( 0 , 0 , 0 )");
       tfOpc = new JTextField("RGBA( 0 , 0 , 0 , 1.0 )");
       
       tf1.setEditable(false);       
       tf2.setEditable(false);
       tf3.setEditable(false);
       tf4RGB.setEditable(false);
       tf5.setEditable(false);
       tfOpc.setEditable(false);
       tfOpcHEX.setEditable(false);
       tfHEX.setEditable(false);


       
       tfColor = new JPanel();
       
       copy = new JButton("copy");
       copy2 = new JButton("copy");
       copyHEX = new JButton("copy");
       copyOpcHEX = new JButton("copy");
       
       copy.setBounds(330,740,150,50);
       copy.setFont(f1);
       copy.setForeground(Color.WHITE);
       Color tmpc = new Color(x,y,z);
       copy.setBackground(tmpc);
       
       copyHEX.setBounds(700,740,150,50);
       copyHEX.setFont(f1);
       copyHEX.setForeground(Color.WHITE);
       copyHEX.setBackground(tmpc);
       
       
       copy2.setBounds(1340,740,150,50);
       copy2.setFont(f1);
       copy2.setForeground(Color.WHITE);
       copy2.setBackground(Color.BLACK);

       copyOpcHEX.setBounds(1340,690,150,50);
       copyOpcHEX.setFont(f1);
       copyOpcHEX.setForeground(Color.WHITE);
       copyOpcHEX.setBackground(Color.BLACK);
       
        tf1.setBounds(410,160,150,50);      
        tf2.setBounds(410,300,150,50);
        tf3.setBounds(410,450,150,50);
        tf4RGB.setBounds(10,740,320,50);
        tf5.setBounds(830,470,150,50);
        tfHEX.setBounds(500,740,200,50);
        tfOpc.setBounds(930,740,410,50);
        tfOpcHEX.setBounds(930,690,410,50);
        
        tfColor.setBounds(10,510,800,220);

        s1.setBounds(10,70,1500,90);
        s2.setBounds(10,210,1500,90);
        s3.setBounds(10,360,1500,90);
        s4.setBounds(830,520,660,90);
        
        red.setBounds(10,150,400,70);
        red.setFont(f1);
        red.setForeground(Color.RED);
        
        green.setBounds(10,290,400,70);
        green.setFont(f1);
        green.setForeground(Color.GREEN);
        
        opacity.setBounds(980,470,500,50);
        opacity.setFont(f1);
        c = new Color(0 , 241 , 248);
        opacity.setForeground(c);
        
        blue.setBounds(10,440,400,70);
        blue.setFont(f1);
        blue.setForeground(Color.BLUE);
        
        heading.setBounds(100,0,1300,80);
        heading.setFont(f2);
        heading.setForeground(Color.BLUE);
        
        opcText.setBounds(830,600,800,90);
        opcText.setFont(f3);
        c = new Color(0,0,0,210);
        opcText.setForeground(c);
        
        
        tf1.setBackground(Color.red);
        tf1.setForeground(Color.WHITE);
        tf1.setFont(f1);
        tf2.setBackground(Color.green);
        tf2.setForeground(Color.WHITE);
        tf2.setFont(f1);
        tf3.setBackground(Color.blue);
        tf3.setForeground(Color.WHITE);
        tf3.setFont(f1);
        c = new Color( 3 , 77 , 123 );
        tf4RGB.setBackground(c);
        tf4RGB.setForeground(Color.WHITE);
        tf4RGB.setFont(f1);
        tfHEX.setBackground(c);
        tfHEX.setForeground(Color.WHITE);
        tfHEX.setFont(f1);
        c = new Color(0 , 241 , 248);
        tf5.setBackground(c);
        tf5.setForeground(Color.WHITE);
        tf5.setFont(f1);
        
        c = new Color( 3 , 77 , 123 );
        tfOpc.setBackground(c);
        tfOpc.setForeground(Color.WHITE);
        tfOpc.setFont(f1);
        
        tfOpcHEX.setBackground(c);
        tfOpcHEX.setForeground(Color.WHITE);
        tfOpcHEX.setFont(f1);
        
        c = new Color(0,0,0);
        tfColor.setBackground(c);
        
        add(opcText);
        add(copy);
        add(copy2);
        add(copyHEX);
        add(copyOpcHEX);
        add(opacity);
        add(heading);
        add(red);
        add(green);
        add(blue);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4RGB);
        add(tf5);
        add(tfOpcHEX);
        add(tfHEX);
        add(tfOpc);
        add(tfColor);
        add(s1);
        add(s2);
        add(s3);
        add(s4);
 
        
        
        setSize(1950,1100);
        setLocation(0,0);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        copy.addActionListener(this);
        copy2.addActionListener(this);
        copyHEX.addActionListener(this);
        copyOpcHEX.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        c = new Color(x,y,z);
        if(ae.getSource()==copy)
        {
            copy(tf4RGB.getText().toLowerCase());
            copy2.setBackground(Color.BLACK);
            copy2.setText("copy");
            copyHEX.setBackground(c);
            copyHEX.setText("copy");
            copyOpcHEX.setBackground(Color.BLACK);
            copyOpcHEX.setText("copy");
            
            copy.setBackground(Color.GREEN);
            copy.setText("copied");
        }else if(ae.getSource()==copy2)
        {
            copy(tfOpc.getText().toLowerCase());
            copy.setBackground(c);
            copy.setText("copy");
            copyHEX.setBackground(c);
            copyHEX.setText("copy");
            copyOpcHEX.setBackground(Color.BLACK);
            copyOpcHEX.setText("copy");
            
            copy2.setBackground(Color.GREEN);
            copy2.setText("copied");
        }else if(ae.getSource()==copyHEX)
        {
            copy(tfHEX.getText());
            copy.setBackground(c);
            copy.setText("copy");
            copy2.setBackground(Color.BLACK);
            copy2.setText("copy");
            copyOpcHEX.setBackground(Color.BLACK);
            copyOpcHEX.setText("copy");
            
            copyHEX.setBackground(Color.GREEN);
            copyHEX.setText("copied");
        }else if(ae.getSource()==copyOpcHEX)
        {
            copy(tfOpcHEX.getText());
            copyOpcHEX.setBackground(Color.GREEN);
            copyOpcHEX.setText("copied");
            
            copy2.setBackground(Color.BLACK);
            copy2.setText("copy");
            copyHEX.setBackground(c);
            copyHEX.setText("copy");
            copy.setBackground(c);
            copy.setText("copy");
        }
     }
    
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        x = s1.getValue();
        y = s2.getValue();
        z = s3.getValue();
        opc = s4.getValue();
        
        tf1.setText(""+x);
        tf2.setText(""+y);
        tf3.setText(""+z);
        
        c = new Color(x,y,z);
        tfColor.setBackground(c);
        heading.setForeground(c);
        copy.setBackground(c);
        copy.setText("copy");
        tf4RGB.setText("RGB( "+x+" , "+y+" , "+z+" )");
        
        copyHEX.setBackground(c);
        copyHEX.setText("copy");
        r = Integer.toHexString(x);
        g = Integer.toHexString(y);
        b = Integer.toHexString(z);
        if(r.length()==1)
        {
            r =0+""+r;
        }
        if(g.length()==1)
        {
            g =0+""+g;
        }
        if(b.length()==1)
        {
            b =0+""+b;
        }
        tfHEX.setText("#"+r+g+b);
        
        c = new Color(x,y,z,opc);
        opcText.setForeground(c);
        copy2.setBackground(Color.BLACK);
        copy2.setText("copy");
        double opc1 = 0.01*( opc / 2.55 );
        String op = String.valueOf(opc1);
        try{
            op=op.substring(0,4);
        }catch(Exception exc){
            
        }
        tf5.setText(""+op);
        tfOpc.setText("RGBA( "+x+" , "+y+" , "+z+" , "+op+" )");
        
        copyOpcHEX.setBackground(Color.BLACK);
        copyOpcHEX.setText("copy");
        opcHEX = Integer.toHexString(opc);
        if(opcHEX.length() == 1)
        {
            opcHEX=0+""+opcHEX;
        }
        tfOpcHEX.setText("#"+r+g+b+opcHEX);
    }
    
    void copy(String str)
    {
        try{
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection = new StringSelection(str);
            clipboard.setContents(selection,null);
        }catch(Exception e)
        {
        }
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
                 new RgbColorGenerator("RGB and RGBA Colur Generator");
    }
    
}
