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
        private JCheckBox checkBox1;
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
        radioButton3 = new JRadioButton("");
        buttons.add(radioButton1);
        buttons.add(radioButton2);
        buttons.add(radioButton3);
 
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
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(emailLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(emailField))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton1, GroupLayout.Alignment.TRAILING)
                    .addComponent(radioButton2, GroupLayout.Alignment.TRAILING)
                    .addComponent(checkBox1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton3, GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(210, 210, 210)
                        .addComponent(nextButton)))
//                    .addGroup(panelLayout.createSequentialGroup()
//                        .addContainerGap()
//                        .addComponent(scrollPane1)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(emailLabel)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );
        ;
        
        frame.add(panel);
        frame.setVisible(true);
        
        

    }
    private void refundFrame(){
        createFrame();
        frame.add(panel);
        
        radioButton1 = new JRadioButton("Request All Information");
        radioButton2 = new JRadioButton("W2-Received, Request Client Info W/S");
        radioButton3 = new JRadioButton("");
        
        
        buttons.add(radioButton1);
        buttons.add(radioButton2);
 
        checkBox1 = new JCheckBox("Add - Fees Depend on Per Case");
        scrollPane1 = new JScrollPane();
       
        
        
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
