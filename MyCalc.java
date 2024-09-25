import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyCalc extends WindowAdapter implements ActionListener{
    JFrame f;
    Label l1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button add,sub,mult,div,moddiv,calc,clr,pts,back,neg;
    double xd;
    double num1,num2,check;
    void helloWOrld(){
        System.out.println("helloWorld --pariajt");
    }
    MyCalc(){
        f=new JFrame("CALCULATOR");
        l1=new Label();
        l1.setBackground(new Color(0,255,0));
        l1.setBounds(50,50,260,60);

        b1=new Button("1");
            b1.setBounds(50,340,50,50);
        b2=new Button("2");
            b2.setBounds(120, 340,50, 50);
        b3=new Button("3");
            b3.setBounds(190, 340,50, 50);
        b4=new Button("4");
            b4.setBounds(50, 270,50, 50);
        b5=new Button("5");
            b5.setBounds(120, 270,50, 50);
        b6=new Button("6");
            b6.setBounds(190, 270,50, 50);
        b7=new Button("7");
            b7.setBounds(50, 200,50, 50);
        b8=new Button("8");
            b8.setBounds(120, 200,50, 50);
        b9=new Button("9");
            b9.setBounds(190, 200,50, 50);
        b0=new Button("0");
            b0.setBounds(120, 410,50, 50);
        neg=new Button("+/-");
            neg.setBounds(50,410,50,50);
        pts=new Button(".");
            pts.setBounds(190,410,50,50);
        back=new Button("BACK");
            back.setBounds(120,130,50,50);

        add=new Button("+");
            add.setBounds(260,340,50,50);
        sub=new Button("-");
            sub.setBounds(260,270,50,50);
        mult=new Button("*");
            mult.setBounds(260,200,50,50);
        div=new Button("/");
            div.setBounds(260,130,50,50);
        moddiv=new Button("%");
            moddiv.setBounds(190,130,50,50);
        calc=new Button("=");
            calc.setBounds(245,410,65,50);
        clr=new Button("CE"); 
            clr.setBounds(50,130,65,50);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        neg.addActionListener(this);
        pts.addActionListener(this);
        back.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        moddiv.addActionListener(this);
        calc.addActionListener(this);
        clr.addActionListener(this); 

        f.addWindowListener(this);
        f.add(l1);
        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b0);
        f.add(neg);f.add(pts);f.add(back);
        f.add(add);f.add(sub);f.add(mult);f.add(div);f.add(moddiv);f.add(calc);f.add(clr);
        
        f.setSize(380,520);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.CYAN);
    }
    public void windowClosing(WindowEvent e) {
        f.dispose();
      }
    public void actionPerformed(ActionEvent e){
        String z,zt;
        if(e.getSource()==b1){
            zt=l1.getText();
            z=zt+"1";
            l1.setText(z);
        }
        if(e.getSource()==b2){
            zt=l1.getText();
            z=zt+"2";
            l1.setText(z);
        }
        if(e.getSource()==b3){
            zt=l1.getText();
            z=zt+"3";
            l1.setText(z);
        }
        if(e.getSource()==b4){
            zt=l1.getText();
            z=zt+"4";
            l1.setText(z);
        }
        if(e.getSource()==b5){
            zt=l1.getText();
            z=zt+"5";
            l1.setText(z);
        }
        if(e.getSource()==b6){
            zt=l1.getText();
            z=zt+"6";
            l1.setText(z);
        }
        if(e.getSource()==b7){
            zt=l1.getText();
            z=zt+"7";
            l1.setText(z);
        }
        if(e.getSource()==b8){
            zt=l1.getText();
            z=zt+"8";
            l1.setText(z);
        }
        if(e.getSource()==b9){
            zt=l1.getText();
            z=zt+"9";
            l1.setText(z);
        }
        if(e.getSource()==b0){
            zt=l1.getText();
            z=zt+"0";
            l1.setText(z);
        }
        if(e.getSource()==pts){
            zt=l1.getText();
            z=zt+".";
            l1.setText(z);
        }
        if(e.getSource()==neg){
            zt=l1.getText();
            z="-"+zt;
            l1.setText(z);
        }
        if(e.getSource()==back){
            zt=l1.getText();
            try{
              z=zt.substring(0, zt.length()-1);
              }catch(StringIndexOutOfBoundsException f){return;}
            l1.setText(z);
        }
        if(e.getSource()==add){
            try{
              num1=Double.parseDouble(l1.getText());
              }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
              }
            z="";
            l1.setText(z);
            check=1;
        }
        if(e.getSource()==sub){
            try{
              num1=Double.parseDouble(l1.getText());
              }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
              }
            z="";
            l1.setText(z);
            check=2;
          }
        if(e.getSource()==mult){
            try{
              num1=Double.parseDouble(l1.getText());
              }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
              }
            z="";
            l1.setText(z);
            check=3;
          }
        if(e.getSource()==div){
            try{
              num1=Double.parseDouble(l1.getText());
              }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
              }
            z="";
            l1.setText(z);
            check=4;
          }
        if(e.getSource()==moddiv){
            try{
              num1=Double.parseDouble(l1.getText());
              }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
              }
            z="";
            l1.setText(z);
            check=5;
          }
        if(e.getSource()==calc){
            try {
                num2=Double.parseDouble(l1.getText());
            } catch (Exception f) {
                l1.setText("ENTER number First ");
                return;
            }
            if(check==1){
                xd=num1+num2;
            }
            if(check==2){
                xd=num1-num2;
            }
            if(check==3){
                xd=num1*num2;
            }
            if(check==4){
                xd=num1/num2;
            }
            if(check==5){
                xd=num1%num2;
            }
            l1.setText(String.valueOf(xd));
        }
        if(e.getSource()==clr){
            num1=0;
            num2=0;
            check=0;
            xd=0;
            z="";
            l1.setText(z);
        }
    }
    public static void main(String[] args) {
        new MyCalc();
    }
}
