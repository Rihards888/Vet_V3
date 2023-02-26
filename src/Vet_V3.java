import java.awt.Component;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Feb 26 09:23:28 EET 2023
 */



/**
 * @author PC
 */
public class Vet_V3 extends JPanel {
    public Vet_V3() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Rihards Priedolins
        ResourceBundle bundle = ResourceBundle.getBundle("prop");
        drLabel = new JLabel();
        scrollPane1 = new JScrollPane();
        searchField = new JTextPane();
        searshButton = new JButton();
        patientLable = new JLabel();
        scrollPane2 = new JScrollPane();
        patientList = new JList();
        SkatKartButton = new JButton();
        JaunKartButton = new JButton();
        DzestKartButton = new JButton();
        PackartLable = new JLabel();
        scrollPane3 = new JScrollPane();
        PacienKartTable = new JTable();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
        new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
        , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
        , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 )
        ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener(
        new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );

        //---- drLabel ----
        drLabel.setText(bundle.getString("Vet_V3.drLabel.text"));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(searchField);
        }

        //---- searshButton ----
        searshButton.setText(bundle.getString("Vet_V3.searshButton.text"));

        //---- patientLable ----
        patientLable.setText(bundle.getString("Vet_V3.patientLable.text"));

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(patientList);
        }

        //---- SkatKartButton ----
        SkatKartButton.setText(bundle.getString("Vet_V3.SkatKartButton.text"));

        //---- JaunKartButton ----
        JaunKartButton.setText(bundle.getString("Vet_V3.JaunKartButton.text"));

        //---- DzestKartButton ----
        DzestKartButton.setText(bundle.getString("Vet_V3.DzestKartButton.text"));

        //---- PackartLable ----
        PackartLable.setText(bundle.getString("Vet_V3.PackartLable.text"));

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(PacienKartTable);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searshButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(patientLable)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SkatKartButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JaunKartButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DzestKartButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(PackartLable))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(drLabel)))
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(searshButton)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(patientLable)
                        .addComponent(PackartLable))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SkatKartButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JaunKartButton)
                            .addGap(18, 18, 18)
                            .addComponent(DzestKartButton))
                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE))
                    .addGap(73, 73, 73))
        );
        layout.linkSize(SwingConstants.VERTICAL, new Component[] {scrollPane1, searshButton});
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Rihards Priedolins
    private JLabel drLabel;
    private JScrollPane scrollPane1;
    private JTextPane searchField;
    private JButton searshButton;
    private JLabel patientLable;
    private JScrollPane scrollPane2;
    private JList patientList;
    private JButton SkatKartButton;
    private JButton JaunKartButton;
    private JButton DzestKartButton;
    private JLabel PackartLable;
    private JScrollPane scrollPane3;
    private JTable PacienKartTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
