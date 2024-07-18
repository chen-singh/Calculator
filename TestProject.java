import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calculator1 extends JFrame implements ActionListener {
    JTextField t1;

    String str,str1,str2;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

    public calculator1(){
        t1=new JTextField(20);
        str=str1=str2="";

        b=new JButton("+");
        b1=new JButton("-");
        b2=new JButton("*");
        b3=new JButton("/");
        b4=new JButton("9");
        b5=new JButton("8");
        b6=new JButton("7");
        b7=new JButton("6");
        b8=new JButton("5");
        b9=new JButton("4");
        b10=new JButton("3");
        b11=new JButton("2");
        b12=new JButton("1");
        b13=new JButton("0");
        b14=new JButton("=");
        b15=new JButton(".");
        b16=new JButton("C");

        add(t1);
        add(b4);add(b5);add(b6);add(b);
        add(b9);add(b8);add(b7);add(b1);
        add(b10);add(b11);add(b12);add(b2);
        add(b15);add(b13);add(b14);add(b3);
        add(b16);




        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        setVisible(true);
        setLayout(new  FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,250);

    }
    public void actionPerformed(ActionEvent ae){
 String s=ae.getActionCommand();
if (s.charAt(0)>='0' && s.charAt(0)<='9' || s.charAt(0)=='.'){
    if (!str1.equals(""))
        str2=str2+s;
else{
    str=str+s;
    }
t1.setText(str+str1+str2);

    } else if (s.charAt(0)=='C') {
    str=str1=str2="";
    t1.setText(str+str1+str2);
    } else if (s.charAt(0)=='=') {

    int t2;

    if (str1.equals("+"))

        t2 = (Integer.parseInt(str)) + (Integer.parseInt(str2));
    else if (str1.equals("-"))

        t2=Integer.parseInt(str)-Integer.parseInt(str2);
    else if (str1.equals("*"))
        t2=Integer.parseInt(str)*Integer.parseInt(str2);

    else
        t2=Integer.parseInt(str)/Integer.parseInt(str2);

    t1.setText(str+str1+str2+"="+t2);
    str=Integer.toString(t2);
    str1=str="";
}
else {
    if (str1.isEmpty() || str2.isEmpty())
        str1=s;
    else {
        int t2;
         if (str1.equals("+"))

            t2 = Integer.parseInt(str)+ Integer.parseInt(str2);
        else if (str1.equals("-"))

            t2=Integer.parseInt(str)-Integer.parseInt(str2);
        else if (str1.equals("*"))
            t2=Integer.parseInt(str)*Integer.parseInt(str2);

        else
            t2=Integer.parseInt(str)/Integer.parseInt(str2);

        str=Integer.toString(t2);
        str1=s;
        str2="";
    }
    t1.setText(str+str1+str2);

}

    }
    }


class TestProject {
    public static void main(String[] args) {
      new calculator1();


    }


}







