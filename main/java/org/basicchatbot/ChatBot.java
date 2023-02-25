package org.basicchatbot;
import java.awt.Color;
import java.io.Serial;

import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JTextArea;
        import javax.swing.JTextField;

class Chatbot extends JFrame {

    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;
    private final JTextArea ca= new JTextArea();
    private final JTextField cf=new JTextField();
    private final JButton b=new JButton();

    // Layout and Properties defined in Constructer
    Chatbot(){

        JFrame f=new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400,400);
        f.getContentPane().setBackground(Color.cyan);
        f.setTitle("ChatBot");
        f.add(ca);
        f.add(cf);
        ca.setSize(300,310);
        ca.setLocation(1, 1);
        ca.setBackground(Color.BLACK);
        cf.setSize(300,20);
        cf.setLocation(1,320);
        f.add(b);
        JLabel l = new JLabel();
        l.setText("SEND");
        b.add(l);
        b.setSize(400,20);
        b.setLocation(300,320);

        b.addActionListener(e -> {

            // Message sents on Click button
            if(e.getSource()==b) {

                String text=cf.getText().toLowerCase();
                ca.setForeground(Color.GREEN);
                ca.append("You-->"+text+"\n");
                cf.setText("");

                if(text.contains("hi")) {
                    replyMeth("Hi there");
                }
                else if(text.contains("hello")) {
                    replyMeth("Hello to you too");
                }
                else if(text.contains("how are you")) {
                    replyMeth("I'm Good :).Thankyou for asking");
                }
                else if(text.contains("what is your name")) {
                    replyMeth("I'm the Trending ChatBot");
                }
                else if(text.contains("how old are you")) {
                    replyMeth("well it depends on when you clicked run");
                }
                else if(text.contains("gender")) {
                    replyMeth("I'm a thing and hence cannot fall under any gender,whatsoever but i'm a reliable one that's for sure");
                }
                else if(text.contains("can you tell me a joke")) {
                    replyMeth("""
                            why did a scarecrow got an award!
                            Because he was Out-standing in his field
                            For more type 'one more'""");
                }
                else if(text.contains("one more")) {
                    replyMeth("What did the mermaid wear to her math class?"+"\n"+"An algae-bra!");
                }
                else if(text.contains("bye")) {
                    replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
                }
                else
                    replyMeth("I Can't Understand");

            }

        });

    }
    public void replyMeth(String s) {                          // Reply Method
        ca.append("ChatBot-->"+s+"\n");
    }


}
