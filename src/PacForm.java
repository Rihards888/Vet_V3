import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
/*
 * Created by JFormDesigner on Tue Feb 28 14:05:44 EET 2023
 */



/**
 * @author PC
 */
public class PacForm extends JFrame {
    public PacForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Rihards Priedolins
        ResourceBundle bundle = ResourceBundle.getBundle("prop");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        labelPacID = new JLabel();
        vards = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        textAreaVards = new JTextArea();
        scrollPane2 = new JScrollPane();
        textAreaUzvards = new JTextArea();
        label3 = new JLabel();
        scrollPane3 = new JScrollPane();
        textPane1 = new JTextPane();
        label4 = new JLabel();
        scrollPane4 = new JScrollPane();
        textAreaTel = new JTextArea();
        formattedTextField1 = new JFormattedTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        labelPac = new JLabel();
        label1 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        formattedTextField3 = new JFormattedTextField();
        comboBox1 = new JComboBox();
        label9 = new JLabel();
        comboBox2 = new JComboBox();
        label10 = new JLabel();
        checkBox1 = new JCheckBox();
        label11 = new JLabel();
        formattedTextField2 = new JFormattedTextField();
        label12 = new JLabel();
        label13 = new JLabel();
        checkBox2 = new JCheckBox();
        label14 = new JLabel();
        checkBox3 = new JCheckBox();
        label15 = new JLabel();
        checkBox4 = new JCheckBox();
        label16 = new JLabel();
        comboBox3 = new JComboBox();
        label17 = new JLabel();
        comboBox4 = new JComboBox();
        label18 = new JLabel();
        comboBox5 = new JComboBox();
        button1 = new JButton();
        label19 = new JLabel();
        scrollPane5 = new JScrollPane();
        scrollPane6 = new JScrollPane();
        list1 = new JList();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
            0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
            .BOTTOM,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt.Color.
            red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
            beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- labelPacID ----
                labelPacID.setText(bundle.getString("PacForm.labelPacID.text"));

                //---- vards ----
                vards.setText(bundle.getString("PacForm.vards.text"));

                //---- label2 ----
                label2.setText(bundle.getString("PacForm.label2.text"));

                //======== scrollPane1 ========
                {

                    //---- textAreaVards ----
                    textAreaVards.setPreferredSize(new Dimension(1, 22));
                    scrollPane1.setViewportView(textAreaVards);
                }

                //======== scrollPane2 ========
                {

                    //---- textAreaUzvards ----
                    textAreaUzvards.setPreferredSize(new Dimension(1, 22));
                    scrollPane2.setViewportView(textAreaUzvards);
                }

                //---- label3 ----
                label3.setText(bundle.getString("PacForm.label3.text"));

                //======== scrollPane3 ========
                {
                    scrollPane3.setViewportView(textPane1);
                }

                //---- label4 ----
                label4.setText(bundle.getString("PacForm.label4.text"));

                //======== scrollPane4 ========
                {

                    //---- textAreaTel ----
                    textAreaTel.setMinimumSize(new Dimension(1, 22));
                    textAreaTel.setPreferredSize(new Dimension(1, 22));
                    textAreaTel.setFocusCycleRoot(true);
                    scrollPane4.setViewportView(textAreaTel);
                }

                //---- formattedTextField1 ----
                formattedTextField1.setMinimumSize(new Dimension(49, 28));
                formattedTextField1.setPreferredSize(new Dimension(49, 28));

                //---- label5 ----
                label5.setText(bundle.getString("PacForm.label5.text"));

                //---- label6 ----
                label6.setText(bundle.getString("PacForm.label6.text"));

                //---- labelPac ----
                labelPac.setText(bundle.getString("PacForm.labelPac.text"));

                //---- label1 ----
                label1.setText(bundle.getString("PacForm.label1.text"));

                //---- label7 ----
                label7.setText(bundle.getString("PacForm.label7.text"));

                //---- label8 ----
                label8.setText(bundle.getString("PacForm.label8.text"));

                //---- formattedTextField3 ----
                formattedTextField3.setPreferredSize(new Dimension(49, 22));

                //---- comboBox1 ----
                comboBox1.setPreferredSize(new Dimension(79, 22));

                //---- label9 ----
                label9.setText(bundle.getString("PacForm.label9.text"));

                //---- label10 ----
                label10.setText(bundle.getString("PacForm.label10.text"));

                //---- checkBox1 ----
                checkBox1.setText(bundle.getString("PacForm.checkBox1.text"));
                checkBox1.setPreferredSize(new Dimension(33, 22));

                //---- label11 ----
                label11.setText(bundle.getString("PacForm.label11.text"));

                //---- formattedTextField2 ----
                formattedTextField2.setPreferredSize(new Dimension(49, 22));

                //---- label12 ----
                label12.setText(bundle.getString("PacForm.label12.text"));

                //---- label13 ----
                label13.setText(bundle.getString("PacForm.label13.text"));

                //---- checkBox2 ----
                checkBox2.setText(bundle.getString("PacForm.checkBox2.text"));

                //---- label14 ----
                label14.setText(bundle.getString("PacForm.label14.text"));

                //---- checkBox3 ----
                checkBox3.setText(bundle.getString("PacForm.checkBox3.text"));

                //---- label15 ----
                label15.setText(bundle.getString("PacForm.label15.text"));

                //---- checkBox4 ----
                checkBox4.setText(bundle.getString("PacForm.checkBox4.text"));

                //---- label16 ----
                label16.setText(bundle.getString("PacForm.label16.text"));

                //---- comboBox3 ----
                comboBox3.setPreferredSize(new Dimension(79, 22));

                //---- label17 ----
                label17.setText(bundle.getString("PacForm.label17.text"));

                //---- comboBox4 ----
                comboBox4.setPreferredSize(new Dimension(60, 22));

                //---- label18 ----
                label18.setText(bundle.getString("PacForm.label18.text"));

                //---- comboBox5 ----
                comboBox5.setPreferredSize(new Dimension(60, 22));

                //---- button1 ----
                button1.setText(bundle.getString("PacForm.button1.text"));

                //---- label19 ----
                label19.setText(bundle.getString("PacForm.label19.text"));

                //======== scrollPane6 ========
                {
                    scrollPane6.setViewportView(list1);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(labelPacID)
                                    .addGap(30, 30, 30)
                                    .addComponent(labelPac)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label1))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(vards)
                                        .addComponent(label2)
                                        .addComponent(label5))
                                    .addGap(32, 32, 32)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(contentPanelLayout.createParallelGroup()
                                                .addComponent(label3)
                                                .addComponent(label4))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(contentPanelLayout.createParallelGroup()
                                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(label6)
                                .addComponent(label12)
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                        .addComponent(label10)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label11)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(formattedTextField2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                        .addComponent(label7)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label8)
                                        .addGap(18, 18, 18)
                                        .addComponent(formattedTextField3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label9)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(label13)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(checkBox2))
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addComponent(label19)
                                                    .addComponent(label16))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(label14)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(checkBox3))
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(label17)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39)
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(label15)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBox4))
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(label18)
                                                .addGap(18, 18, 18)
                                                .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addComponent(button1)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelPacID)
                                .addComponent(labelPac)
                                .addComponent(label1))
                            .addGap(26, 26, 26)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(vards)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3)
                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5))
                            .addGap(29, 29, 29)
                            .addComponent(label6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8)
                                .addComponent(formattedTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label9)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label10)
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11)
                                    .addComponent(formattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(label12)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label13)
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkBox2)
                                        .addComponent(checkBox4)
                                        .addComponent(label15)
                                        .addComponent(label14)
                                        .addComponent(checkBox3))))
                            .addGap(20, 20, 20)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label17)
                                .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label18)
                                .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label16)
                                .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(label19)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 110, Short.MAX_VALUE))
                                .addComponent(scrollPane6, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button1))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("PacForm.okButton.text"));
                buttonBar.add(okButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("PacForm.cancelButton.text"));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Rihards Priedolins
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel labelPacID;
    private JLabel vards;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea textAreaVards;
    private JScrollPane scrollPane2;
    private JTextArea textAreaUzvards;
    private JLabel label3;
    private JScrollPane scrollPane3;
    private JTextPane textPane1;
    private JLabel label4;
    private JScrollPane scrollPane4;
    private JTextArea textAreaTel;
    private JFormattedTextField formattedTextField1;
    private JLabel label5;
    private JLabel label6;
    private JLabel labelPac;
    private JLabel label1;
    private JLabel label7;
    private JLabel label8;
    private JFormattedTextField formattedTextField3;
    private JComboBox comboBox1;
    private JLabel label9;
    private JComboBox comboBox2;
    private JLabel label10;
    private JCheckBox checkBox1;
    private JLabel label11;
    private JFormattedTextField formattedTextField2;
    private JLabel label12;
    private JLabel label13;
    private JCheckBox checkBox2;
    private JLabel label14;
    private JCheckBox checkBox3;
    private JLabel label15;
    private JCheckBox checkBox4;
    private JLabel label16;
    private JComboBox comboBox3;
    private JLabel label17;
    private JComboBox comboBox4;
    private JLabel label18;
    private JComboBox comboBox5;
    private JButton button1;
    private JLabel label19;
    private JScrollPane scrollPane5;
    private JScrollPane scrollPane6;
    private JList list1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
