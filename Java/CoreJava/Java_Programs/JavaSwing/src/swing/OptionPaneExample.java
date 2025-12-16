package swing;

import javax.swing.*;  
public class OptionPaneExample {  
JFrame f;  
OptionPaneExample(){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"Hello, Welcome.");  
}  
public static void main(String[] args) {  
    new OptionPaneExample();  
}  
}  