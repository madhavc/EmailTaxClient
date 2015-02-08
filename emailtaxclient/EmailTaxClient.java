/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailtaxclient;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author madhavchhura
 */
public class EmailTaxClient  {
        private ButtonGroup buttons ;
        private JButton nextButton, backButton, submitButton;
        private JCheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
        JFrame frame, frame1;
        private JLabel nameLabel, emailLabel;
        private JPanel panel;
        private JRadioButton refundButton, needInfoButton, radioButton1, radioButton2, radioButton3, radioButton4;
        private JScrollPane scrollPane1;
        private JTextField nameField, emailField;
    
    public EmailTaxClient() {

        mainFrame();
        
        
    }
    
    private void createFrame() {
        frame = new JFrame("Email Tax Client");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        panel = new JPanel();
        
        buttons = new ButtonGroup();
        
        nameLabel = new JLabel("Client Name:");
        emailLabel = new JLabel("Client Email:");
        nameField = new JTextField();
        emailField = new JTextField();
        nextButton = new JButton("Next");
        backButton = new JButton("Back");
    }

   
    private void mainFrame(){
        createFrame();
        needInfoButton = new JRadioButton("Need Info Email");
        refundButton = new JRadioButton("E-Forms or Refund Email");
        buttons.add(needInfoButton);
        buttons.add(refundButton);

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(needInfoButton.isSelected()){
                    frame.setVisible(false);
                    needInfoFrame();

                }
                else{
                    frame.setVisible(false);
                    refundFrame();
                }
            }
        });

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(refundButton)
                    .addComponent(needInfoButton))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(needInfoButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refundButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        frame.add(panel);
        frame.setVisible(true);
        
    }
    private void needInfoFrame() {
        
        createFrame();
        frame.add(panel);
        
        radioButton1 = new JRadioButton("Request All Information");
        radioButton2 = new JRadioButton("W2-Received, Request Client Info W/S");
        radioButton3 = new JRadioButton("Documents Recieved InProgress");
        radioButton4 = new JRadioButton("More Info Needed");
        buttons.add(radioButton1);
        buttons.add(radioButton2);
        buttons.add(radioButton3);
        buttons.add(radioButton4);
        
        checkBox1 = new JCheckBox("Add - Fees Depend on Per Case");
        scrollPane1 = new JScrollPane();
        
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                frame.setVisible(false);
                mainFrame();
                
            }
        });
       
        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);

        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(emailLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(emailField,GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(radioButton1, GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton2, GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton3, GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton4, GroupLayout.Alignment.LEADING)
                    .addComponent(checkBox1, GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18))
                    
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGap(18, 18, 18))
                    .addComponent(scrollPane1, 300, 400, 600)
                .addGap(18, 18, 18))
                .addGroup(panelLayout.createSequentialGroup()
                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(backButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,10, Short.MAX_VALUE)
                    .addComponent(nextButton)
                .addGap(18,18,18))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
            .addGroup(panelLayout.createSequentialGroup()
                
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap()
                    
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(emailLabel)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(checkBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                )
        );
        
        frame.add(panel);
        frame.setVisible(true);
        
        

    }
    private void refundFrame(){
        createFrame();
        frame.add(panel);
        
        
        checkBox1 = new JCheckBox("Send E-File Forms");
        checkBox2 = new JCheckBox("Send Engagement Letter");
        checkBox3 = new JCheckBox("Request Payment");
        checkBox4 = new JCheckBox("Send Tax Copy");
        
        JLabel federalRefundLabel = new JLabel("Fedeal Refund:");
        JTextField federalRefundField = new JTextField("");
        
        JLabel stateRefundLabel = new JLabel("State Refund:");
        JTextField stateRefundField = new JTextField("");
        
        
        JButton addState = new JButton("Add Another State");
        addState.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        
        
        scrollPane1 = new JScrollPane();
        
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                frame.setVisible(false);
                mainFrame();
                
            }
        });
       
        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);

        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(emailLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(emailField,GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(radioButton1, GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton2, GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton3, GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton4, GroupLayout.Alignment.LEADING)
                    .addComponent(checkBox1, GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18))
                    
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGap(18, 18, 18))
                    .addComponent(scrollPane1, 300, 400, 600)
                .addGap(18, 18, 18))
                .addGroup(panelLayout.createSequentialGroup()
                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                    .addComponent(backButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,10, Short.MAX_VALUE)
                    .addComponent(nextButton)
                .addGap(18,18,18))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
            .addGroup(panelLayout.createSequentialGroup()
                
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap()
                    
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(emailLabel)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(checkBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                )
        );
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new EmailTaxClient();
            }
        });
    }

    
    

}
