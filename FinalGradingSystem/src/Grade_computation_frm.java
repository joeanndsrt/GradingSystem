import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.math.*;
import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Grade_computation_frm extends javax.swing.JFrame {
    
     Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public void subjects()
   {
       String sql = "Select * from subjects";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           mysubs.setModel(DbUtils.resultSetToTableModel(rs));
           mysubs.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    public void students()
   {
       String sql = "Select * from MyStudents";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           mystud_table.setModel(DbUtils.resultSetToTableModel(rs));
           mystud_table.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    
public void disable()
{
        save.setEnabled(false);
        update.setEnabled(false);
        clear.setEnabled(false);
        delete.setEnabled(false);
        add.setEnabled(false);
        edit.setEnabled(false);
        exit.setEnabled(false);
}

public void add()
{
        save.setEnabled(true);
        update.setEnabled(false);
        clear.setEnabled(true);
        delete.setEnabled(false);
        add.setEnabled(false);
        edit.setEnabled(false);
        exit.setEnabled(true);
}

public void edit()
{
        save.setEnabled(false);
        update.setEnabled(true);
        clear.setEnabled(true);
        delete.setEnabled(true);
        add.setEnabled(false);
        edit.setEnabled(false);
        exit.setEnabled(true);
}

public void save()
{
        save.setEnabled(false);
        update.setEnabled(false);
        clear.setEnabled(false);
        delete.setEnabled(false);
        add.setEnabled(true);
        edit.setEnabled(true);
        exit.setEnabled(false);
}

public void update()
{
        save.setEnabled(false);
        update.setEnabled(false);
        clear.setEnabled(false);
        delete.setEnabled(false);
        add.setEnabled(true);
        edit.setEnabled(true);
        exit.setEnabled(false);
}


public void written_works_tg()
{
                double wt, wo, a;
        String total;
        
        wt = Double.parseDouble(ww_total.getText());
        wo = Double.parseDouble(ww_over.getText());
        
        a = ((wt/wo)*50)+50;
      //  a = wt;
        total = String.format("%.0f", a);
        tg.setText(total);
}


public void written_works_percent()
{
        double a, b, c, percentw, d2;
        String total;
        percentw = Double.parseDouble(txtwwpercent.getText());
        
        a = Double.parseDouble(tg.getText());
        d2 = percentw / 100;
        b = (a * d2);
        total = String.format("%.0f", b);
        ww_percent.setText(total);
}

public void ptotal_tg()
{
        double ptotal, pover, a;
        String total;
        
        ptotal = Double.parseDouble(pt_total.getText());
        pover = Double.parseDouble(pt_over.getText());
        
        a = ((ptotal/pover)*50)+50;
      //  a = wt;
        total = String.format("%.0f", a);
        pt_tg.setText(total);
}

public void ptotal_percent()
{
        double aaa, baa, caa, percentpt , d1;
        
        String total;
        percentpt = Double.parseDouble(txtptpercent.getText());
        
        aaa = Double.parseDouble(pt_tg.getText());
        d1 = percentpt / 100;
        baa = (aaa * d1);
        total = String.format("%.0f", baa);
        pt_percent.setText(total);
}

public void qas_tg()
{
double qat, qao, a, b, c;
String total;

qat = Double.parseDouble(qa_total.getText());
qao = Double.parseDouble(qa_over.getText());

a = ((qat/qao)*50)+50;
total = String.format("%.0f", a);
qa_tg.setText(total);
}

public void qas_percent()
{
double a, b, c, percentqt, d;
String total;

percentqt = Double.parseDouble(txtqtpercent.getText());

a = Double.parseDouble(qa_tg.getText());
d = (percentqt / 100 );

b = a * d ;
//total = String.format("%0.f", a);
qa_percent.setText(""+b);
}

public void final_grade()
{
double wwp, ptp, qap, a, b;
String total ;

wwp = Double.parseDouble(ww_percent.getText());
ptp = Double.parseDouble(pt_percent.getText());
qap = Double.parseDouble(qa_percent.getText());

a = wwp + ptp + qap;

txt_fg.setText(""+a);
}

public void secrete_code()
{
       double z11, z21, z31, z41, z51, z61, z71, z81, a,b,c;

        String total,ab,bb;
        z11 = Double.parseDouble(txtq1.getText());
           z21 = Double.parseDouble(txtq2.getText());
           z31 = Double.parseDouble(txtq3.getText());
            z41 = Double.parseDouble(txtq4.getText());
           z51 = Double.parseDouble(txtq5.getText());
           z61 = Double.parseDouble(txtq6.getText());
           z71 = Double.parseDouble(txtq7.getText());
           z81 = Double.parseDouble(txtq8.getText());

        b = z11+z21+z31+z41+z51+z61+z71+z81;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
       
       
       double scwt, scwo, sca;
        String sctotal;
        
        scwt = Double.parseDouble(ww_total.getText());
        scwo = Double.parseDouble(ww_over.getText());
        
        a = ((scwt/scwo)*50)+50;
      //  a = wt;
        sctotal = String.format("%.0f", a);
        tg.setText(sctotal);
       
        double scfa, scfb, scfc, scfpercentw, scfd2;
        String scftotal;
        scfpercentw = Double.parseDouble(txtwwpercent.getText());
        
        a = Double.parseDouble(tg.getText());
        scfd2 = scfpercentw / 100;
        b = (a * scfd2);
        scftotal = String.format("%.0f", b);
        ww_percent.setText(scftotal);
        
        
}
    
public void mytable()
{
    String sql = "Select ID, Last_Name, First_Name, Subject, ww_total as Total, tg as TG, ww_percent as Percent, pt_total as Total, pt_tg as TG, pt_percent as Percent, qa_total as Total, qa_tg as TG, qa_percent as Percent, Final_Grade from grade_computation  ";
try
{
    pst = con.prepareStatement(sql);
    rs = pst.executeQuery();
    grade9.setModel(DbUtils.resultSetToTableModel(rs));
    grade9.setAutoCreateRowSorter(true);
    
}
catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void mytable1()
{
   String sql = "Select ID, Last_Name,First_Name, Middle_Name, Subject, Section,Grade_Level, Specialization, "
           + "Quiz_1, Quiz_2, Quiz_3, Quiz_4, Quiz_5, Quiz_6, Quiz_7, Quiz_8, "
           + "Activity_1, Activity_2,Activity_3,Activity_4,Activity_5,Activity_6,Activity_7,Activity_8,"
           + "Assignment_1,Assignment_2,Assignment_3,Assignment_4,"
           + "Class_Participation,"
           + "Transfer_Task,"
           + "Monthly_Test,"
           + "Summative_Test,"
           + "Quarterly_Test,"
            + " Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8, Act1,Act2,Act3,Act4,Act5,Act6,Act7,Act8,Ass1,Ass2,Ass3,Ass4,Class_part,Trans_task,Monthly,Summative,Quarterly,pt_pt, pt_qa, pt_ww, "
           + "Total_Quiz, ww_total, ww_over, tg, ww_percent, pt_total, pt_over, pt_tg, pt_percent, qa_total, qa_over, qa_tg, qa_percent, Final_Grade from grade_computation ";
try
{
    pst = con.prepareStatement(sql);
    rs = pst.executeQuery(); 
    mytable.setModel(DbUtils.resultSetToTableModel(rs));
    mytable.setAutoCreateRowSorter(true);
    
}
catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}


public void clear()
{
last.setText("");
id.setText("");
first.setText("");
middle.setText("");
section.setText("");
grade.setText("");
spec.setText("");
subject.setText("");
txtq1.setText("");txtq2.setText("");txtq3.setText("");txtq4.setText("");
txtq5.setText("");txtq6.setText("");txtq7.setText("");txtq8.setText("");
q1.setText("");q2.setText("");q3.setText("");q4.setText("");q5.setText("");q6.setText("");q7.setText("");q8.setText("");
txtact1.setText("");txtact2.setText("");txtact3.setText("");txtact4.setText("");txtact5.setText("");txtact6.setText("");txtact7.setText("");txtact8.setText("");
act1.setText("");act2.setText("");act3.setText("");act4.setText("");act5.setText("");act6.setText("");act7.setText("");act8.setText("");
txtass1.setText("");txtass2.setText("");txtass3.setText("");txtass4.setText("");
ass1.setText("");ass2.setText("");ass3.setText("");ass4.setText("");
txt_cp.setText("");cp.setText("");
txt_tt.setText("");tt.setText("");
txt_mt.setText("");mt.setText("");
txtsum1.setText("");sum1.setText("");
txt_qt.setText("");qt.setText("");

txtptpercent.setText("");
txtqtpercent.setText("");
txtwwpercent.setText("");

ww_total.setText("");ww_over.setText("");tg.setText("");ww_percent.setText("");

pt_total.setText("");pt_over.setText("");pt_tg.setText("");pt_percent.setText("");

qa_total.setText("");qa_over.setText("");qa_tg.setText("");qa_percent.setText("");

}



    
    public Grade_computation_frm() {
        initComponents();
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        main.add(center);
        main.repaint();
        main.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        middle = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        spec = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        aq1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        q8 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtq1 = new javax.swing.JTextField();
        txtq2 = new javax.swing.JTextField();
        txtq3 = new javax.swing.JTextField();
        txtq4 = new javax.swing.JTextField();
        txtq5 = new javax.swing.JTextField();
        txtq6 = new javax.swing.JTextField();
        txtq7 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        q6 = new javax.swing.JTextField();
        q7 = new javax.swing.JTextField();
        txtq8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtact1 = new javax.swing.JTextField();
        txtact2 = new javax.swing.JTextField();
        txtact3 = new javax.swing.JTextField();
        txtact4 = new javax.swing.JTextField();
        txtact5 = new javax.swing.JTextField();
        txtact6 = new javax.swing.JTextField();
        txtact7 = new javax.swing.JTextField();
        txtact8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        act1 = new javax.swing.JTextField();
        act2 = new javax.swing.JTextField();
        act3 = new javax.swing.JTextField();
        act4 = new javax.swing.JTextField();
        act5 = new javax.swing.JTextField();
        act6 = new javax.swing.JTextField();
        act7 = new javax.swing.JTextField();
        act8 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtact9 = new javax.swing.JTextField();
        txtact10 = new javax.swing.JTextField();
        txtact11 = new javax.swing.JTextField();
        txtact12 = new javax.swing.JTextField();
        txtact13 = new javax.swing.JTextField();
        txtact14 = new javax.swing.JTextField();
        txtact15 = new javax.swing.JTextField();
        txtact16 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        act9 = new javax.swing.JTextField();
        act10 = new javax.swing.JTextField();
        act11 = new javax.swing.JTextField();
        act12 = new javax.swing.JTextField();
        act13 = new javax.swing.JTextField();
        act14 = new javax.swing.JTextField();
        act15 = new javax.swing.JTextField();
        act16 = new javax.swing.JTextField();
        txtacttotal1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtass1 = new javax.swing.JTextField();
        txtass2 = new javax.swing.JTextField();
        txtass3 = new javax.swing.JTextField();
        txtass4 = new javax.swing.JTextField();
        txtsum1 = new javax.swing.JTextField();
        txtsum2 = new javax.swing.JTextField();
        ass1 = new javax.swing.JTextField();
        ass2 = new javax.swing.JTextField();
        ass3 = new javax.swing.JTextField();
        ass4 = new javax.swing.JTextField();
        sum1 = new javax.swing.JTextField();
        sum2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_cp = new javax.swing.JTextField();
        txt_tt = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        tt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_mt = new javax.swing.JTextField();
        txt_qt = new javax.swing.JTextField();
        mt = new javax.swing.JTextField();
        qt = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        txtwwpercent = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        txtptpercent = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        txtqtpercent = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel23 = new javax.swing.JPanel();
        ll = new javax.swing.JScrollPane();
        mytable = new javax.swing.JTable();
        hide = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        ww_total = new javax.swing.JTextField();
        tg = new javax.swing.JTextField();
        ww_over = new javax.swing.JTextField();
        ww_percent = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        pt_total = new javax.swing.JTextField();
        pt_tg = new javax.swing.JTextField();
        pt_over = new javax.swing.JTextField();
        pt_percent = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        qa_total = new javax.swing.JTextField();
        qa_tg = new javax.swing.JTextField();
        qa_over = new javax.swing.JTextField();
        qa_percent = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txt_fg = new javax.swing.JTextField();
        qa_tg1 = new javax.swing.JTextField();
        qa_over1 = new javax.swing.JTextField();
        qa_percent1 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        txtqtotal = new javax.swing.JTextField();
        txtquiz_over = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        txtacttotal = new javax.swing.JTextField();
        txtact_over = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        txtastotal = new javax.swing.JTextField();
        txtass_over = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        search = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mystud_table = new javax.swing.JTable();
        view = new javax.swing.JPanel();
        SEARCH = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grade9 = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        search1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        mysubs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1253, 699));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setMaximumSize(new java.awt.Dimension(1253, 699));
        main.setMinimumSize(new java.awt.Dimension(1253, 699));
        main.setPreferredSize(new java.awt.Dimension(1253, 699));
        main.setLayout(new java.awt.CardLayout());

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setMaximumSize(new java.awt.Dimension(1253, 699));
        center.setMinimumSize(new java.awt.Dimension(1253, 699));
        center.setPreferredSize(new java.awt.Dimension(1253, 699));

        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 161, 29));

        last.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 161, 29));

        first.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 161, 29));

        middle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 161, 29));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Middle Name");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("ID Number:");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("First Name:");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Last Name:");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        subject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 161, 29));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Subject");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Section");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        section.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 161, 29));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Grade Level");
        jPanel8.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        grade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 161, 29));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Specialization");
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        spec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 161, 29));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_15px.png"))); // NOI18N
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel52MousePressed(evt);
            }
        });
        jPanel8.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_15px.png"))); // NOI18N
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel53MousePressed(evt);
            }
        });
        jPanel8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, -1, -1));

        aq1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Quizzes:");
        jLabel31.setOpaque(true);
        aq1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 85, 28));

        q8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q8KeyReleased(evt);
            }
        });
        aq1.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 40, -1));

        jLabel32.setText("Quiz 1");
        aq1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 37, -1, -1));

        jLabel38.setText("Quiz 2");
        aq1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 63, -1, -1));

        jLabel39.setText("Quiz 3");
        aq1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 89, -1, -1));

        jLabel40.setText("Quiz 4");
        aq1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 118, -1, -1));

        jLabel41.setText("Quiz 8");
        aq1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel42.setText("Quiz 5");
        aq1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel43.setText("Quiz 6");
        aq1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel44.setText("Quiz 7");
        aq1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        txtq1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq1KeyReleased(evt);
            }
        });
        aq1.add(txtq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));

        txtq2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq2KeyReleased(evt);
            }
        });
        aq1.add(txtq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, -1));

        txtq3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq3KeyReleased(evt);
            }
        });
        aq1.add(txtq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 40, -1));

        txtq4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq4KeyReleased(evt);
            }
        });
        aq1.add(txtq4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, -1));

        txtq5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq5KeyReleased(evt);
            }
        });
        aq1.add(txtq5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 40, -1));

        txtq6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq6KeyReleased(evt);
            }
        });
        aq1.add(txtq6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 40, -1));

        txtq7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq7KeyReleased(evt);
            }
        });
        aq1.add(txtq7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 40, -1));

        q1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q1KeyReleased(evt);
            }
        });
        aq1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 40, -1));

        q2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q2KeyReleased(evt);
            }
        });
        aq1.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 40, -1));

        q3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q3KeyReleased(evt);
            }
        });
        aq1.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 40, -1));

        q4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q4KeyReleased(evt);
            }
        });
        aq1.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 40, -1));

        q5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q5KeyReleased(evt);
            }
        });
        aq1.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, -1));

        q6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q6KeyReleased(evt);
            }
        });
        aq1.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 40, -1));

        q7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q7KeyReleased(evt);
            }
        });
        aq1.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 40, -1));

        txtq8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtq8KeyReleased(evt);
            }
        });
        aq1.add(txtq8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 40, -1));

        jLabel6.setText("Over");
        aq1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel9.setText("Total");
        aq1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel48.setText("Total");
        aq1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel49.setText("Over");
        aq1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Activities:");
        jLabel10.setOpaque(true);
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 28));

        txtact1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact1KeyReleased(evt);
            }
        });
        jPanel3.add(txtact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));

        txtact2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact2KeyReleased(evt);
            }
        });
        jPanel3.add(txtact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, -1));

        txtact3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact3KeyReleased(evt);
            }
        });
        jPanel3.add(txtact3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 40, -1));

        txtact4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact4KeyReleased(evt);
            }
        });
        jPanel3.add(txtact4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, -1));

        txtact5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact5KeyReleased(evt);
            }
        });
        jPanel3.add(txtact5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 40, -1));

        txtact6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact6KeyReleased(evt);
            }
        });
        jPanel3.add(txtact6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 40, -1));

        txtact7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact7KeyReleased(evt);
            }
        });
        jPanel3.add(txtact7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 40, -1));

        txtact8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact8KeyReleased(evt);
            }
        });
        jPanel3.add(txtact8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 40, -1));

        jLabel11.setText("Activity 4");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel12.setText("Activity 1");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 37, -1, -1));

        jLabel13.setText("Activity 2");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel14.setText("Activity 3");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel15.setText("Activity 5");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel16.setText("Activity 6");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel17.setText("Activity 7");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel18.setText("Activity 8");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        act1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act1KeyReleased(evt);
            }
        });
        jPanel3.add(act1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, -1));

        act2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act2KeyReleased(evt);
            }
        });
        jPanel3.add(act2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 40, -1));

        act3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act3KeyReleased(evt);
            }
        });
        jPanel3.add(act3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, -1));

        act4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act4KeyReleased(evt);
            }
        });
        jPanel3.add(act4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 40, -1));

        act5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act5KeyReleased(evt);
            }
        });
        jPanel3.add(act5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 40, -1));

        act6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act6KeyReleased(evt);
            }
        });
        jPanel3.add(act6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 40, -1));

        act7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act7KeyReleased(evt);
            }
        });
        jPanel3.add(act7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 40, -1));

        act8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                act8KeyReleased(evt);
            }
        });
        jPanel3.add(act8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 40, -1));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Activities:");
        jLabel26.setOpaque(true);
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 28));
        jPanel10.add(txtact9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));
        jPanel10.add(txtact10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, -1));
        jPanel10.add(txtact11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 40, -1));
        jPanel10.add(txtact12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, -1));
        jPanel10.add(txtact13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 40, -1));
        jPanel10.add(txtact14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 40, -1));
        jPanel10.add(txtact15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 40, -1));
        jPanel10.add(txtact16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 40, -1));

        jLabel27.setText("Activity 4");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel33.setText("Activity 1");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 37, -1, -1));

        jLabel34.setText("Activity 2");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel35.setText("Activity 3");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel36.setText("Activity 5");
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel37.setText("Activity 6");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel45.setText("Activity 7");
        jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel46.setText("Activity 8");
        jPanel10.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
        jPanel10.add(act9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, -1));
        jPanel10.add(act10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 40, -1));
        jPanel10.add(act11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, -1));
        jPanel10.add(act12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 40, -1));
        jPanel10.add(act13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 40, -1));
        jPanel10.add(act14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 40, -1));
        jPanel10.add(act15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 40, -1));
        jPanel10.add(act16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 40, -1));
        jPanel10.add(txtacttotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, -1));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 520, 160));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Summative Test:");
        jLabel1.setOpaque(true);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 160, 28));

        jLabel2.setText("1");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 10, -1));

        jLabel3.setText("2");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 10, -1));

        jLabel4.setText("3");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 10, -1));

        jLabel5.setText("4");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 10, -1));

        jLabel7.setText("1");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel8.setText("2");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        txtass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtass1KeyReleased(evt);
            }
        });
        jPanel4.add(txtass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));

        txtass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtass2KeyReleased(evt);
            }
        });
        jPanel4.add(txtass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, -1));

        txtass3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtass3KeyReleased(evt);
            }
        });
        jPanel4.add(txtass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 40, -1));

        txtass4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtass4KeyReleased(evt);
            }
        });
        jPanel4.add(txtass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, -1));

        txtsum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsum1KeyReleased(evt);
            }
        });
        jPanel4.add(txtsum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 40, -1));
        jPanel4.add(txtsum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 40, -1));

        ass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ass1KeyReleased(evt);
            }
        });
        jPanel4.add(ass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 40, -1));

        ass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ass2KeyReleased(evt);
            }
        });
        jPanel4.add(ass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 40, -1));

        ass3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ass3KeyReleased(evt);
            }
        });
        jPanel4.add(ass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 40, -1));

        ass4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ass4KeyReleased(evt);
            }
        });
        jPanel4.add(ass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 40, -1));

        sum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sum1KeyReleased(evt);
            }
        });
        jPanel4.add(sum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, -1));
        jPanel4.add(sum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 40, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Assignment:");
        jLabel25.setOpaque(true);
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 28));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Class Participation:");
        jLabel28.setOpaque(true);
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 28));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Transfer Task:");
        jLabel19.setOpaque(true);
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 140, 28));

        txt_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpActionPerformed(evt);
            }
        });
        txt_cp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cpKeyReleased(evt);
            }
        });
        jPanel5.add(txt_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));

        txt_tt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ttKeyReleased(evt);
            }
        });
        jPanel5.add(txt_tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 40, -1));

        cp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpKeyReleased(evt);
            }
        });
        jPanel5.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 40, -1));

        tt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ttKeyReleased(evt);
            }
        });
        jPanel5.add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Montly Test:");
        jLabel29.setOpaque(true);
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 28));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Quarterly Test:");
        jLabel30.setOpaque(true);
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 140, 28));

        txt_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mtActionPerformed(evt);
            }
        });
        txt_mt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_mtKeyReleased(evt);
            }
        });
        jPanel6.add(txt_mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 40, -1));

        txt_qt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_qtKeyReleased(evt);
            }
        });
        jPanel6.add(txt_qt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 40, -1));

        mt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mtKeyReleased(evt);
            }
        });
        jPanel6.add(mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 40, -1));

        qt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtKeyReleased(evt);
            }
        });
        jPanel6.add(qt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, -1));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel13.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 40));

        save.setText("Save");
        save.setEnabled(false);
        save.setFocusPainted(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel13.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel13.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        edit.setText("Edit");
        edit.setSelected(true);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel13.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, 40));

        clear.setText("Clear");
        clear.setEnabled(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel13.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 100, 40));

        delete.setText("Delete");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel13.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 100, 40));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel13.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 100, 40));

        jPanel14.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setText("View Grades");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, 80));

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Percentage in Written Work", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        txtwwpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwwpercentActionPerformed(evt);
            }
        });
        txtwwpercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtwwpercentKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtwwpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtwwpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Percentage in Performance Tasks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        txtptpercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtptpercentKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtptpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtptpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Percentage in Quarterly Assessment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        txtqtpercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtqtpercentKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(txtqtpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtqtpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llMouseClicked(evt);
            }
        });

        mytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mytableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mytableMouseEntered(evt);
            }
        });
        ll.setViewportView(mytable);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 5121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ll, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        jScrollPane6.setViewportView(jPanel23);

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(centerLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerLayout.createSequentialGroup()
                                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aq1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4421, 4421, 4421))
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(centerLayout.createSequentialGroup()
                    .addGap(0, 4550, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aq1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(centerLayout.createSequentialGroup()
                    .addGap(0, 484, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 186, Short.MAX_VALUE)))
        );

        main.add(center, "card7");

        hide.setMaximumSize(new java.awt.Dimension(1253, 699));
        hide.setMinimumSize(new java.awt.Dimension(1253, 699));
        hide.setPreferredSize(new java.awt.Dimension(1253, 699));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("written work"));
        jPanel9.setOpaque(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ww_total, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(tg))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ww_over, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ww_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ww_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ww_over, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ww_percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Performance Task"));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pt_tg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pt_over, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_over, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pt_tg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Quarterly Test"));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qa_tg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qa_total, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qa_over, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qa_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qa_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qa_over, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qa_tg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qa_percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Final Grade"));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qa_tg1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qa_over1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qa_percent1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qa_over1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qa_tg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qa_percent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("all quizes"));

        txtqtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtqtotalKeyReleased(evt);
            }
        });

        txtquiz_over.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtquiz_overKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtqtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtquiz_over, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtqtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquiz_over, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("all activities"));

        txtacttotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtacttotalKeyReleased(evt);
            }
        });

        txtact_over.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtact_overKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtacttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtact_over, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtacttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtact_over, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("all assignment"));

        txtastotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtastotalKeyReleased(evt);
            }
        });

        txtass_over.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtass_overKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(txtastotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtass_over, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtastotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtass_over, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("all quizes"));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hideLayout = new javax.swing.GroupLayout(hide);
        hide.setLayout(hideLayout);
        hideLayout.setHorizontalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hideLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hideLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hideLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hideLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(hideLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hideLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        hideLayout.setVerticalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hideLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hideLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hideLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(428, Short.MAX_VALUE))
        );

        main.add(hide, "card3");

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setMaximumSize(new java.awt.Dimension(1253, 699));
        search.setMinimumSize(new java.awt.Dimension(1253, 699));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        mystud_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        mystud_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mystud_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mystud_table);

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(4276, Short.MAX_VALUE))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );

        main.add(search, "card2");

        view.setBackground(new java.awt.Color(255, 255, 255));
        view.setMaximumSize(new java.awt.Dimension(1253, 699));
        view.setMinimumSize(new java.awt.Dimension(1253, 699));

        SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SEARCHKeyTyped(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grade9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        grade9.setColumnSelectionAllowed(true);
        grade9.getTableHeader().setReorderingAllowed(false);
        grade9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade9MouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(grade9);
        grade9.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 1290, 790));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("   Grade");
        jLabel54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, 90, 26));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setText("           Performance Tasks");
        jLabel55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 280, 26));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setText("         Quarterly Assessment");
        jLabel56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 280, 26));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setText("               Written Work");
        jLabel57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 270, 26));

        jLabel58.setText("jLabel5");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        jScrollPane2.setViewportView(jPanel2);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(854, 854, 854)
                        .addComponent(jButton2))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(4275, Short.MAX_VALUE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );

        main.add(view, "card2");

        search1.setBackground(new java.awt.Color(255, 255, 255));
        search1.setMaximumSize(new java.awt.Dimension(1253, 699));
        search1.setMinimumSize(new java.awt.Dimension(1253, 699));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        mysubs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        mysubs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mysubsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(mysubs);

        javax.swing.GroupLayout search1Layout = new javax.swing.GroupLayout(search1);
        search1.setLayout(search1Layout);
        search1Layout.setHorizontalGroup(
            search1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(search1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(4276, Short.MAX_VALUE))
        );
        search1Layout.setVerticalGroup(
            search1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );

        main.add(search1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtqtotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtotalKeyReleased
        // TODO add your handling code here:
        double qt1, ast, mt1, st, a, b;
        String total;

        qt1 = Double.parseDouble(txtqtotal.getText());
        ast = Double.parseDouble(txtastotal.getText());
        mt1 = Double.parseDouble(txt_mt.getText());
        st = Double.parseDouble(txtsum1.getText());

        a = qt1 + ast + mt1 + st;
        total = String.format("%.0f",a);
        ww_total.setText(total);

    }//GEN-LAST:event_txtqtotalKeyReleased

    private void txtquiz_overKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquiz_overKeyReleased
        // TODO add your handling code here:
        double qo, aso, mto, sto, a, b;
        String total;

        qo = Double.parseDouble(txtquiz_over.getText());
        aso = Double.parseDouble(txtass_over.getText());
        mto = Double.parseDouble(mt.getText());
        sto = Double.parseDouble(sum1.getText());

        a = qo + aso + mto + sto;
        total = String.format("%.0f",a);
        ww_over.setText(total);
    }//GEN-LAST:event_txtquiz_overKeyReleased

    private void txtacttotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtacttotalKeyReleased
        // TODO add your handling code here:
        double act, cp1, tt1, a, b;
        String total;

        act = Double.parseDouble(txtacttotal.getText());
        cp1 = Double.parseDouble(txt_cp.getText());
        tt1 = Double.parseDouble(txt_tt.getText());

        a = act + cp1 + tt1;
        total = String.format("%.0f", a);
        pt_total.setText(total);
    }//GEN-LAST:event_txtacttotalKeyReleased

    private void txtact_overKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact_overKeyReleased
        // TODO add your handling code here:
        double aover, cp1, tt1, a;
        String total;

        aover = Double.parseDouble(txtact_over.getText());
        cp1 = Double.parseDouble(cp.getText());
        tt1 = Double.parseDouble(tt.getText());

        a = aover + cp1 + tt1;
        total = String.format("%.0f", a);
        pt_over.setText(total);
    }//GEN-LAST:event_txtact_overKeyReleased

    private void txtastotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtastotalKeyReleased
        // TODO add your handling code here:
        double qt1, ast, mt1, st, a, b;
        String total;

        qt1 = Double.parseDouble(txtqtotal.getText());
        ast = Double.parseDouble(txtastotal.getText());
        mt1 = Double.parseDouble(txt_mt.getText());
        st = Double.parseDouble(txtsum1.getText());

        a = qt1 + ast + mt1 + st;
        total = String.format("%.0f",a);
        ww_total.setText(total);
    }//GEN-LAST:event_txtastotalKeyReleased

    private void txtass_overKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtass_overKeyReleased
        // TODO add your handling code here:
        double qo, aso, mto, sto, a, b;
        String total;

        qo = Double.parseDouble(txtquiz_over.getText());
        aso = Double.parseDouble(txtass_over.getText());
        mto = Double.parseDouble(mt.getText());
        sto = Double.parseDouble(sum1.getText());

        a = qo + aso + mto + sto;
        total = String.format("%.0f",a);
        ww_over.setText(total);
    }//GEN-LAST:event_txtass_overKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        main.add(view);
        main.repaint();
        main.revalidate();
        
        mytable();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void q8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q8KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        a2 = Double.parseDouble(q2.getText());
        a3 = Double.parseDouble(q3.getText());
        a4 = Double.parseDouble(q4.getText());
        a5 = Double.parseDouble(q5.getText());
        a6 = Double.parseDouble(q6.getText());
        a7 = Double.parseDouble(q7.getText());
        a8 = Double.parseDouble(q8.getText());

        b = a1 + a2 + a3 +a4 + a5 + a6 + a7 + a8;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q8KeyReleased

    private void txtq1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq1KeyReleased
        /*     double q1, q2, q3, q4, q5, q6, q7, q8;
        q1 = Double.valueOf(txtq1.getText());
        q2 = Double.valueOf(txtq2.getText());
        q3 = Double.valueOf(txtq3.getText());

        double a;
        a = q1 + q2 + q3;
        txtqtotal.setText(""+a);
        */
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        //   q2 = Double.parseDouble(txtq2.getText());
        //   q3 = Double.parseDouble(txtq3.getText());
        //    q4 = Double.parseDouble(txtq4.getText());
        //   q5 = Double.parseDouble(txtq5.getText());
        //   q6 = Double.parseDouble(txtq6.getText());
        //   q7 = Double.parseDouble(txtq7.getText());
        //   q8 = Double.parseDouble(txtq8.getText());

        b = q11;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
    }//GEN-LAST:event_txtq1KeyReleased

    private void txtq2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq2KeyReleased
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        q21 = Double.parseDouble(txtq2.getText());
        /*    q3 = Double.parseDouble(txtq3.getText());
        q4 = Double.parseDouble(txtq4.getText());
        q5 = Double.parseDouble(txtq5.getText());
        q6 = Double.parseDouble(txtq6.getText());
        q7 = Double.parseDouble(txtq7.getText());
        q8 = Double.parseDouble(txtq8.getText());
        */
        b = q11 + q21;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
    }//GEN-LAST:event_txtq2KeyReleased

    private void txtq3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq3KeyReleased
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        q21 = Double.parseDouble(txtq2.getText());
        q31 = Double.parseDouble(txtq3.getText());
        /*    q4 = Double.parseDouble(txtq4.getText());
        q5 = Double.parseDouble(txtq5.getText());
        q6 = Double.parseDouble(txtq6.getText());
        q7 = Double.parseDouble(txtq7.getText());
        q8 = Double.parseDouble(txtq8.getText());
        */
        b = q11 + q21 + q31;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
    }//GEN-LAST:event_txtq3KeyReleased

    private void txtq4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq4KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        q21 = Double.parseDouble(txtq2.getText());
        q31 = Double.parseDouble(txtq3.getText());
        q41 = Double.parseDouble(txtq4.getText());
        /*    q5 = Double.parseDouble(txtq5.getText());
        q6 = Double.parseDouble(txtq6.getText());
        q7 = Double.parseDouble(txtq7.getText());
        q8 = Double.parseDouble(txtq8.getText());
        */
        b = q11 + q21 + q31 + q41;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
    }//GEN-LAST:event_txtq4KeyReleased

    private void txtq5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq5KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        q21 = Double.parseDouble(txtq2.getText());
        q31 = Double.parseDouble(txtq3.getText());
        q41 = Double.parseDouble(txtq4.getText());
        q51 = Double.parseDouble(txtq5.getText());
        /*    q6 = Double.parseDouble(txtq6.getText());
        q7 = Double.parseDouble(txtq7.getText());
        q8 = Double.parseDouble(txtq8.getText());
        */
        b = q11 + q21 + q31 + q41 + q51;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);

    }//GEN-LAST:event_txtq5KeyReleased

    private void txtq6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq6KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        q21 = Double.parseDouble(txtq2.getText());
        q31 = Double.parseDouble(txtq3.getText());
        q41 = Double.parseDouble(txtq4.getText());
        q51 = Double.parseDouble(txtq5.getText());
        q61 = Double.parseDouble(txtq6.getText());
        /*    q7 = Double.parseDouble(txtq7.getText());
        q8 = Double.parseDouble(txtq8.getText());
        */
        b = q11 + q21 + q31 + q41 + q51 + q61;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
    }//GEN-LAST:event_txtq6KeyReleased

    private void txtq7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq7KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        q21 = Double.parseDouble(txtq2.getText());
        q31 = Double.parseDouble(txtq3.getText());
        q41 = Double.parseDouble(txtq4.getText());
        q51 = Double.parseDouble(txtq5.getText());
        q61 = Double.parseDouble(txtq6.getText());
        q71 = Double.parseDouble(txtq7.getText());
        //   q8 = Double.parseDouble(txtq8.getText());

        b = q11 + q21 + q31 + q41 + q51 + q61 + q71;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
    }//GEN-LAST:event_txtq7KeyReleased

    private void q1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q1KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        //   a2 = Double.parseDouble(txtq2.getText());
        //   a3 = Double.parseDouble(txtq3.getText());
        //    a4 = Double.parseDouble(txtq4.getText());
        //   a5 = Double.parseDouble(txtq5.getText());
        //   a6 = Double.parseDouble(txtq6.getText());
        //   a7 = Double.parseDouble(txtq7.getText());
        //   a8 = Double.parseDouble(txtq8.getText());

        b = a1;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q1KeyReleased

    private void q2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q2KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        a2 = Double.parseDouble(q2.getText());
        //   a3 = Double.parseDouble(txtq3.getText());
        //    a4 = Double.parseDouble(txtq4.getText());
        //   a5 = Double.parseDouble(txtq5.getText());
        //   a6 = Double.parseDouble(txtq6.getText());
        //   a7 = Double.parseDouble(txtq7.getText());
        //   a8 = Double.parseDouble(txtq8.getText());

        b = a1 + a2;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q2KeyReleased

    private void q3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q3KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        a2 = Double.parseDouble(q2.getText());
        a3 = Double.parseDouble(q3.getText());
        //    a4 = Double.parseDouble(txtq4.getText());
        //   a5 = Double.parseDouble(txtq5.getText());
        //   a6 = Double.parseDouble(txtq6.getText());
        //   a7 = Double.parseDouble(txtq7.getText());
        //   a8 = Double.parseDouble(txtq8.getText());

        b = a1 + a2 + a3;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q3KeyReleased

    private void q4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q4KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        a2 = Double.parseDouble(q2.getText());
        a3 = Double.parseDouble(q3.getText());
        a4 = Double.parseDouble(q4.getText());
        //   a5 = Double.parseDouble(txtq5.getText());
        //   a6 = Double.parseDouble(txtq6.getText());
        //   a7 = Double.parseDouble(txtq7.getText());
        //   a8 = Double.parseDouble(txtq8.getText());

        b = a1 + a2 + a3 +a4;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q4KeyReleased

    private void q5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q5KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        a2 = Double.parseDouble(q2.getText());
        a3 = Double.parseDouble(q3.getText());
        a4 = Double.parseDouble(q4.getText());
        a5 = Double.parseDouble(q5.getText());
        //   a6 = Double.parseDouble(txtq6.getText());
        //   a7 = Double.parseDouble(txtq7.getText());
        //   a8 = Double.parseDouble(txtq8.getText());

        b = a1 + a2 + a3 +a4 + a5;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q5KeyReleased

    private void q6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q6KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        a2 = Double.parseDouble(q2.getText());
        a3 = Double.parseDouble(q3.getText());
        a4 = Double.parseDouble(q4.getText());
        a5 = Double.parseDouble(q5.getText());
        a6 = Double.parseDouble(q6.getText());
        //   a7 = Double.parseDouble(txtq7.getText());
        //   a8 = Double.parseDouble(txtq8.getText());

        b = a1 + a2 + a3 +a4 + a5 + a6;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q6KeyReleased

    private void q7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q7KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(q1.getText());
        a2 = Double.parseDouble(q2.getText());
        a3 = Double.parseDouble(q3.getText());
        a4 = Double.parseDouble(q4.getText());
        a5 = Double.parseDouble(q5.getText());
        a6 = Double.parseDouble(q6.getText());
        a7 = Double.parseDouble(q7.getText());
        //   a8 = Double.parseDouble(txtq8.getText());

        b = a1 + a2 + a3 +a4 + a5 + a6 + a7;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtquiz_over.setText(total);
    }//GEN-LAST:event_q7KeyReleased

    private void txtq8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtq8KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtq1.getText());
        q21 = Double.parseDouble(txtq2.getText());
        q31 = Double.parseDouble(txtq3.getText());
        q41 = Double.parseDouble(txtq4.getText());
        q51 = Double.parseDouble(txtq5.getText());
        q61 = Double.parseDouble(txtq6.getText());
        q71 = Double.parseDouble(txtq7.getText());
        q81 = Double.parseDouble(txtq8.getText());

        b = q11 + q21 + q31 + q41 + q51 + q61 + q71 + q81;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtqtotal.setText(total);
    }//GEN-LAST:event_txtq8KeyReleased

    private void txtact1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact1KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        //   q2 = Double.parseDouble(txtq2.getText());
        //   q3 = Double.parseDouble(txtq3.getText());
        //    q4 = Double.parseDouble(txtq4.getText());
        //   q5 = Double.parseDouble(txtq5.getText());
        //   q6 = Double.parseDouble(txtq6.getText());
        //   q7 = Double.parseDouble(txtq7.getText());
        //   q8 = Double.parseDouble(txtq8.getText());

        b = q11;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact1KeyReleased

    private void txtact2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact2KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        q21 = Double.parseDouble(txtact2.getText());
        //   q3 = Double.parseDouble(txtq3.getText());
        ///    q4 = Double.parseDouble(txtq4.getText());
        //    q5 = Double.parseDouble(txtq5.getText());
        //   q6 = Double.parseDouble(txtq6.getText());
        //    q7 = Double.parseDouble(txtq7.getText());
        //   q8 = Double.parseDouble(txtq8.getText());

        b = q11 + q21;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact2KeyReleased

    private void txtact3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact3KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        q21 = Double.parseDouble(txtact2.getText());
        q31 = Double.parseDouble(txtact3.getText());
        ///    q4 = Double.parseDouble(txtq4.getText());
        //    q5 = Double.parseDouble(txtq5.getText());
        //   q6 = Double.parseDouble(txtq6.getText());
        //    q7 = Double.parseDouble(txtq7.getText());
        //   q8 = Double.parseDouble(txtq8.getText());

        b = q11 + q21 +q31;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact3KeyReleased

    private void txtact4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact4KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        q21 = Double.parseDouble(txtact2.getText());
        q31 = Double.parseDouble(txtact3.getText());
        q41 = Double.parseDouble(txtact4.getText());
        //    q5 = Double.parseDouble(txtq5.getText());
        //   q6 = Double.parseDouble(txtq6.getText());
        //    q7 = Double.parseDouble(txtq7.getText());
        //   q8 = Double.parseDouble(txtq8.getText());

        b = q11 + q21 + q31 + q41;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact4KeyReleased

    private void txtact5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact5KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        q21 = Double.parseDouble(txtact2.getText());
        q31 = Double.parseDouble(txtact3.getText());
        q41 = Double.parseDouble(txtact4.getText());
        q51 = Double.parseDouble(txtact5.getText());
        //   q6 = Double.parseDouble(txtact6.getText());
        //    q7 = Double.parseDouble(txtact7.getText());
        //   q8 = Double.parseDouble(txtact8.getText());

        b = q11 + q21 + q31 + q41 + q51;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact5KeyReleased

    private void txtact6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact6KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        q21 = Double.parseDouble(txtact2.getText());
        q31 = Double.parseDouble(txtact3.getText());
        q41 = Double.parseDouble(txtact4.getText());
        q51 = Double.parseDouble(txtact5.getText());
        q61 = Double.parseDouble(txtact6.getText());
        //    q7 = Double.parseDouble(txtact7.getText());
        //   q8 = Double.parseDouble(txtact8.getText());

        b = q11 + q21 + q31 + q41 + q51 + q61;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact6KeyReleased

    private void txtact7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact7KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        q21 = Double.parseDouble(txtact2.getText());
        q31 = Double.parseDouble(txtact3.getText());
        q41 = Double.parseDouble(txtact4.getText());
        q51 = Double.parseDouble(txtact5.getText());
        q61 = Double.parseDouble(txtact6.getText());
        q71 = Double.parseDouble(txtact7.getText());
        //   q8 = Double.parseDouble(txtact8.getText());

        b = q11 + q21 + q31 + q41 + q51 + q61 + q71;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact7KeyReleased

    private void txtact8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtact8KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtact1.getText());
        q21 = Double.parseDouble(txtact2.getText());
        q31 = Double.parseDouble(txtact3.getText());
        q41 = Double.parseDouble(txtact4.getText());
        q51 = Double.parseDouble(txtact5.getText());
        q61 = Double.parseDouble(txtact6.getText());
        q71 = Double.parseDouble(txtact7.getText());
        q81 = Double.parseDouble(txtact8.getText());

        b = q11 + q21 + q31 + q41 + q51 + q61 + q71 +q81;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtacttotal.setText(total);
    }//GEN-LAST:event_txtact8KeyReleased

    private void act1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act1KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        //   a2 = Double.parseDouble(act12.getText());
        //   a3 = Double.parseDouble(act13.getText());
        //    a4 = Double.parseDouble(act14.getText());
        //   a5 = Double.parseDouble(act15.getText());
        //   a6 = Double.parseDouble(act16.getText());
        //   a7 = Double.parseDouble(act17.getText());
        //   a8 = Double.parseDouble(act18.getText());

        b = a1;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act1KeyReleased

    private void act2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act2KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        a2 = Double.parseDouble(act2.getText());
        //   a3 = Double.parseDouble(act13.getText());
        //    a4 = Double.parseDouble(act14.getText());
        //   a5 = Double.parseDouble(act15.getText());
        //   a6 = Double.parseDouble(act16.getText());
        //   a7 = Double.parseDouble(act17.getText());
        //   a8 = Double.parseDouble(act18.getText());

        b = a1 + a2;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act2KeyReleased

    private void act3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act3KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        a2 = Double.parseDouble(act2.getText());
        a3 = Double.parseDouble(act3.getText());
        //    a4 = Double.parseDouble(act14.getText());
        //   a5 = Double.parseDouble(act15.getText());
        //   a6 = Double.parseDouble(act16.getText());
        //   a7 = Double.parseDouble(act17.getText());
        //   a8 = Double.parseDouble(act18.getText());

        b = a1 + a2 + a3;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act3KeyReleased

    private void act4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act4KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        a2 = Double.parseDouble(act2.getText());
        a3 = Double.parseDouble(act3.getText());
        a4 = Double.parseDouble(act4.getText());
        //   a5 = Double.parseDouble(act15.getText());
        //   a6 = Double.parseDouble(act16.getText());
        //   a7 = Double.parseDouble(act17.getText());
        //   a8 = Double.parseDouble(act18.getText());

        b = a1 + a2 + a3 +a4;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act4KeyReleased

    private void act5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act5KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        a2 = Double.parseDouble(act2.getText());
        a3 = Double.parseDouble(act3.getText());
        a4 = Double.parseDouble(act4.getText());
        a5 = Double.parseDouble(act5.getText());
        //   a6 = Double.parseDouble(act16.getText());
        //   a7 = Double.parseDouble(act17.getText());
        //   a8 = Double.parseDouble(act18.getText());

        b = a1 + a2 + a3 + a4 + a5;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act5KeyReleased

    private void act6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act6KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        a2 = Double.parseDouble(act2.getText());
        a3 = Double.parseDouble(act3.getText());
        a4 = Double.parseDouble(act4.getText());
        a5 = Double.parseDouble(act5.getText());
        a6 = Double.parseDouble(act6.getText());
        //   a7 = Double.parseDouble(act17.getText());
        //   a8 = Double.parseDouble(act18.getText());

        b = a1 + a2 + a3 + a4 + a5 + a6;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act6KeyReleased

    private void act7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act7KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        a2 = Double.parseDouble(act2.getText());
        a3 = Double.parseDouble(act3.getText());
        a4 = Double.parseDouble(act4.getText());
        a5 = Double.parseDouble(act5.getText());
        a6 = Double.parseDouble(act6.getText());
        a7 = Double.parseDouble(act7.getText());
        //   a8 = Double.parseDouble(act8.getText());

        b = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act7KeyReleased

    private void act8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_act8KeyReleased
        // TODO add your handling code here:
        double a1, a2, a3, a4, a5, a6, a7, a8, a,b,c;

        String total,ab,bb;
        a1 = Double.parseDouble(act1.getText());
        a2 = Double.parseDouble(act2.getText());
        a3 = Double.parseDouble(act3.getText());
        a4 = Double.parseDouble(act4.getText());
        a5 = Double.parseDouble(act5.getText());
        a6 = Double.parseDouble(act6.getText());
        a7 = Double.parseDouble(act7.getText());
        a8 = Double.parseDouble(act8.getText());

        b = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtact_over.setText(total);
    }//GEN-LAST:event_act8KeyReleased

    private void txtass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtass1KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtass1.getText());
        //   q2 = Double.parseDouble(txtass2.getText());
        //   q3 = Double.parseDouble(txtass3.getText());
        //   q4 = Double.parseDouble(txtass4.getText());

        b = q11;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtastotal.setText(total);
    }//GEN-LAST:event_txtass1KeyReleased

    private void txtass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtass2KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtass1.getText());
        q21 = Double.parseDouble(txtass2.getText());
        //   q3 = Double.parseDouble(txtass3.getText());
        //   q4 = Double.parseDouble(txtass4.getText());

        b = q11 + q21;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtastotal.setText(total);
    }//GEN-LAST:event_txtass2KeyReleased

    private void txtass3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtass3KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtass1.getText());
        q21 = Double.parseDouble(txtass2.getText());
        q31 = Double.parseDouble(txtass3.getText());
        //   q4 = Double.parseDouble(txtass4.getText());

        b = q11 + q21 + q31;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtastotal.setText(total);
    }//GEN-LAST:event_txtass3KeyReleased

    private void txtass4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtass4KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(txtass1.getText());
        q21 = Double.parseDouble(txtass2.getText());
        q31 = Double.parseDouble(txtass3.getText());
        q41 = Double.parseDouble(txtass4.getText());

        b = q11 + q21 + q31 + q41;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtastotal.setText(total);
    }//GEN-LAST:event_txtass4KeyReleased

    private void txtsum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsum1KeyReleased
        // TODO add your handling code here:
        double qt1, ast, mt1, st, a, b;
        String total;

        qt1 = Double.parseDouble(txtqtotal.getText());
        ast = Double.parseDouble(txtastotal.getText());
        mt1 = Double.parseDouble(txt_mt.getText());
        st = Double.parseDouble(txtsum1.getText());

        a = qt1 + ast + mt1 + st;
        total = String.format("%.0f",a);
        ww_total.setText(total);
    }//GEN-LAST:event_txtsum1KeyReleased

    private void ass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ass1KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(ass1.getText());
        //   q2 = Double.parseDouble(ass2.getText());
        //   q3 = Double.parseDouble(ass3.getText());
        //   q4 = Double.parseDouble(ass4.getText());

        b = q11;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtass_over.setText(total);

    }//GEN-LAST:event_ass1KeyReleased

    private void ass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ass2KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(ass1.getText());
        q21 = Double.parseDouble(ass2.getText());
        //   q3 = Double.parseDouble(ass3.getText());
        //   q4 = Double.parseDouble(ass4.getText());

        b = q11 + q21;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtass_over.setText(total);
    }//GEN-LAST:event_ass2KeyReleased

    private void ass3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ass3KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(ass1.getText());
        q21 = Double.parseDouble(ass2.getText());
        q31 = Double.parseDouble(ass3.getText());
        //   q4 = Double.parseDouble(ass4.getText());

        b = q11 + q21 + q31;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtass_over.setText(total);
    }//GEN-LAST:event_ass3KeyReleased

    private void ass4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ass4KeyReleased
        // TODO add your handling code here:
        double q11, q21, q31, q41, q51, q61, q71, q81, a,b,c;

        String total,ab,bb;
        q11 = Double.parseDouble(ass1.getText());
        q21 = Double.parseDouble(ass2.getText());
        q31 = Double.parseDouble(ass3.getText());
        q41 = Double.parseDouble(ass4.getText());

        b = q11 + q21 + q31 + q41;
        //   c = b /8;
        total = String.format("%.0f", b);
        txtass_over.setText(total);
    }//GEN-LAST:event_ass4KeyReleased

    private void sum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sum1KeyReleased
        // TODO add your handling code here:
        double qo, aso, mto, sto, a, b;
        String total;

        qo = Double.parseDouble(txtquiz_over.getText());
        aso = Double.parseDouble(txtass_over.getText());
        mto = Double.parseDouble(mt.getText());
        sto = Double.parseDouble(sum1.getText());

        a = qo + aso + mto + sto;
        total = String.format("%.0f",a);
        ww_over.setText(total);
    }//GEN-LAST:event_sum1KeyReleased

    private void txt_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpActionPerformed

    private void txt_cpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cpKeyReleased
        // TODO add your handling code here:
        double act, cp1, tt1, a, b;
        String total;

        act = Double.parseDouble(txtacttotal.getText());
        cp1 = Double.parseDouble(txt_cp.getText());
        tt1 = Double.parseDouble(txt_tt.getText());

        a = act + cp1 + tt1;
        total = String.format("%.0f", a);
        pt_total.setText(total);
    }//GEN-LAST:event_txt_cpKeyReleased

    private void txt_ttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ttKeyReleased
        // TODO add your handling code here:
        double act, cp1, tt1, a, b;
        String total;

        act = Double.parseDouble(txtacttotal.getText());
        cp1 = Double.parseDouble(txt_cp.getText());
        tt1 = Double.parseDouble(txt_tt.getText());

        a = act + cp1 + tt1;
        total = String.format("%.0f", a);
        pt_total.setText(total);
    }//GEN-LAST:event_txt_ttKeyReleased

    private void cpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpKeyReleased
        // TODO add your handling code here:
        double aover, cp1, tt1, a;
        String total;

        aover = Double.parseDouble(txtact_over.getText());
        cp1 = Double.parseDouble(cp.getText());
        tt1 = Double.parseDouble(tt.getText());

        a = aover + cp1 + tt1;
        total = String.format("%.0f", a);
        pt_over.setText(total);
    }//GEN-LAST:event_cpKeyReleased

    private void ttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttKeyReleased
        // TODO add your handling code here:
        double aover, cp1, tt1, a;
        String total;

        aover = Double.parseDouble(txtact_over.getText());
        cp1 = Double.parseDouble(cp.getText());
        tt1 = Double.parseDouble(tt.getText());

        a = aover + cp1 + tt1;
        total = String.format("%.0f", a);
        pt_over.setText(total);
    }//GEN-LAST:event_ttKeyReleased

    private void txt_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mtActionPerformed

    private void txt_mtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mtKeyReleased
        // TODO add your handling code here:
        double qt1, ast, mt1, st, a, b;
        String total;

        qt1 = Double.parseDouble(txtqtotal.getText());
        ast = Double.parseDouble(txtastotal.getText());
        mt1 = Double.parseDouble(txt_mt.getText());
        st = Double.parseDouble(txtsum1.getText());

        a = qt1 + ast + mt1 + st;
        total = String.format("%.0f",a);
        ww_total.setText(total);

    }//GEN-LAST:event_txt_mtKeyReleased

    private void txt_qtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtKeyReleased
        // TODO add your handling code here:
        double qte, a, b;
        String total;

        qte = Double.parseDouble(txt_qt.getText());

        qa_total.setText(""+qte);
    }//GEN-LAST:event_txt_qtKeyReleased

    private void mtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mtKeyReleased
        // TODO add your handling code here:
        double qo, aso, mto, sto, a, b;
        String total;

        qo = Double.parseDouble(txtquiz_over.getText());
        aso = Double.parseDouble(txtass_over.getText());
        mto = Double.parseDouble(mt.getText());
        sto = Double.parseDouble(sum1.getText());

        a = qo + aso + mto + sto;
        total = String.format("%.0f",a);
        ww_over.setText(total);
    }//GEN-LAST:event_mtKeyReleased

    private void qtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtKeyReleased
        // TODO add your handling code here:
        double qto, a, b;
        String total;

        qto = Double.parseDouble(qt.getText());

        qa_over.setText(""+qto);
    }//GEN-LAST:event_qtKeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        add();
        save.setVisible(true);
        update.setVisible(false);

    }//GEN-LAST:event_addActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        written_works_tg();
        written_works_percent();

        ptotal_tg();
        ptotal_percent();

        qas_tg();
        qas_percent();

        final_grade();

        String sql = "insert into grade_computation ("
        +"ID,"
        +"Last_Name,"
        +"First_Name,"
        +"Middle_Name,"       
        +"Subject,"
        +"Section,"
        +"Grade_Level,"
        +"Specialization,"
        +"Quiz_1,"
        +"Quiz_2,"
        +"Quiz_3,"
        +"Quiz_4,"
        +"Quiz_5,"
        +"Quiz_6,"
        +"Quiz_7,"
        +"Quiz_8,"
        +"Q1,"
        +"Q2,"
        +"Q3,"
        +"Q4,"
        +"Q5,"
        +"Q6,"
        +"Q7,"
        +"Q8,"


        +"Activity_1,"
        +"Activity_2,"
        +"Activity_3,"
        +"Activity_4,"
        +"Activity_5,"
        +"Activity_6,"
        +"Activity_7,"
        +"Activity_8,"
        +"Act1,"
        +"Act2,"
        +"Act3,"
        +"Act4,"
        +"Act5,"
        +"Act6,"
        +"Act7,"
        +"Act8,"

        +"Assignment_1,"
        +"Assignment_2,"
        +"Assignment_3,"
        +"Assignment_4,"
        +"Ass1,"
        +"Ass2,"
        +"Ass3,"
        +"Ass4,"

        +"Class_Participation,"
        +"Class_part,"

        +"Transfer_Task,"
        +"Trans_task,"

        +"Monthly_Test,"
        +"Monthly,"

        +"Summative_Test,"
        +"Summative,"

        +"Quarterly_Test,"
        +"Quarterly,"
         
        +"Total_Quiz,"

        +"ww_total,"
        +"ww_over,"
        +"tg,"
        +"ww_percent,"

        +"pt_total,"
        +"pt_over,"
        +"pt_tg,"
        +"pt_percent,"

        +"qa_total,"
        +"qa_over,"
        +"qa_tg,"
        +"qa_percent,"
                
        +"Final_Grade,"
         
        +"pt_pt,"
        +"pt_qa,"
        +"pt_ww)"

        +"values ('"+id.getText()+"','"+last.getText() +"','"+first.getText() +"','"+middle.getText() +"','"+subject.getText()+"','"+section.getText() +"','"+grade.getText() +"','"+spec.getText() +"','"+txtq1.getText()+"',"
        + " '"+txtq2.getText()+"', '"+ txtq3.getText()+"', '"+ txtq4.getText()+"', '"+ txtq5.getText() +"',"
        + " '"+ txtq6.getText() +"', '"+ txtq7.getText() +"', '"+ txtq8.getText() +"', '"+q1.getText()+"',"
        + "'"+q2.getText()+"', '"+q3.getText()+"','"+q4.getText()+"','"+q5.getText()+"','"+q6.getText()+"','"+q7.getText()+"','"+q8.getText()+"',"   //quiz

        + " '"+txtact1.getText()+"', '"+txtact2.getText()+"', '"+txtact3.getText()+"', '"+txtact4.getText()+"', '"+txtact5.getText()+"',"
        + " '"+txtact6.getText()+"', '"+txtact7.getText()+"', '"+txtact8.getText()+"', '"+act1.getText()+"', '"+act2.getText()+"', '"+act3.getText()+"',"
        + " '"+act4.getText()+"', '"+act5.getText()+"', '"+act6.getText()+"', '"+act7.getText()+"', '"+act8.getText()+"',"                 //activity

        + " '"+txtass1.getText()+"', '"+txtass2.getText()+"', '"+txtass3.getText()+"', '"+txtass4.getText()+"', '"+ass1.getText()+"',"
        + " '"+ass2.getText()+"', '"+ass3.getText()+"', '"+ass4.getText()+"', "             // assignment

        + " '"+txt_cp.getText()+"', '"+cp.getText()+"', "               // class participation

        + "'"+txt_tt.getText()+"','"+tt.getText()+"',"                  // transfer task

        + " '"+txt_mt.getText()+"', '"+mt.getText()+"',"                // monthly test

        + " '"+txtsum1.getText()+"', '"+sum1.getText()+"',"             // summative test

        + " '"+txt_qt.getText()+"', '"+qt.getText()+"',"                // quarterly test

                + " '"+txtqtotal.getText()+"',"  //totalquiz
        + " '"+ww_total.getText()+"', '"+ww_over.getText()+"', '"+tg.getText()+"', '"+ww_percent.getText()+"',"

        + " '"+pt_total.getText()+"', '"+pt_over.getText()+"', '"+pt_tg.getText()+"', '"+pt_percent.getText()+"', "

        + " '"+qa_total.getText()+"', '"+qa_over.getText()+"', '"+qa_tg.getText()+"', '"+qa_percent.getText()+"'," 
         
        + " '"+txt_fg.getText()+"','"+txtptpercent.getText()+"','"+txtqtpercent.getText()+"','"+txtwwpercent.getText()+"')";

        try
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
            mytable1();
            clear();
            save();//cmd save
            save.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:  
      
        //secrete_code();
          written_works_tg();
            written_works_percent();

            ptotal_tg();
            ptotal_percent();

            qas_tg();
            qas_percent();
            final_grade();
        
        String sql = "update grade_computation set Last_Name = '"+last.getText()+"', First_Name = '"+first.getText()+"'"
        + ", Section = '"+middle.getText()+"',"

        + " Quiz_1 = '"+txtq1.getText()+"', Quiz_2 = '"+txtq2.getText()+"', Quiz_3 = '"+txtq3.getText()+"',"
        + " Quiz_4 = '"+txtq4.getText()+"', Quiz_5 = '"+txtq5.getText()+"', Quiz_6= '"+txtq6.getText()+"', Quiz_7= '"+txtq7.getText()+"',"
        + " Quiz_8 = '"+txtq8.getText()+"',"

        + " q1 = '"+q1.getText()+"', q2= '"+q2.getText()+"', q3= '"+q3.getText()+"', q4= '"+q4.getText()+"', q5= '"+q5.getText()+"',"
        + " q6 = '"+q6.getText()+"', q7= '"+q7.getText()+"', q8= '"+q8.getText()+"',"

        + " Activity_1= '"+txtact1.getText()+"', Activity_2= '"+txtact2.getText()+"', Activity_3= '"+txtact3.getText()+"', "
        + " Activity_4= '"+txtact4.getText()+"', Activity_5= '"+txtact5.getText()+"', Activity_6= '"+txtact6.getText()+"', "
        + " Activity_7= '"+txtact7.getText()+"', Activity_8= '"+txtact8.getText()+"',"

        + " Act1= '"+act1.getText()+"', Act2= '"+act2.getText()+"', Act3= '"+act3.getText()+"',"
        + " Act4= '"+act4.getText()+"', Act5= '"+act5.getText()+"', Act6= '"+act6.getText()+"',"
        + " Act7= '"+act7.getText()+"', Act8= '"+act8.getText()+"',"

        + " Assignment_1= '"+txtass1.getText()+"', Assignment_2 = '"+txtass2.getText()+"', Assignment_3 = '"+txtass3.getText()+"', Assignment_4 = '"+txtass4.getText()+"',"
        + " Ass1 = '"+ass1.getText()+"', Ass2 = '"+ass2.getText()+"', Ass3 = '"+ass3.getText()+"', Ass4 = '"+ass4.getText()+"',"

        + " Class_Participation = '"+txt_cp.getText()+"', Class_part = '"+cp.getText()+"',"

        + " Transfer_Task = '"+txt_tt.getText()+"', Trans_task = '"+tt.getText()+"',"

        + " Monthly_Test = '"+txt_mt.getText()+"', Monthly = '"+mt.getText()+"',"

        + " Summative_Test = '"+txtsum1.getText()+"', Summative = '"+sum1.getText()+"',"
         
        + " pt_pt = '"+txtptpercent.getText()+"', pt_qa = '"+txtqtpercent.getText()+"',"
         
        + "pt_ww = '"+txtwwpercent.getText()+"',"

        + " Quarterly_Test = '"+txt_qt.getText()+"', Quarterly = '"+qt.getText()+"',"
         
        + " Total_Quiz = '"+txtqtotal.getText()+"', ww_total = '"+ww_total.getText()+"', ww_over = '"+ww_over.getText()+"', tg = '"+tg.getText()+"' , ww_percent = '"+ww_percent.getText()+"',"
        
        + " pt_total = '"+pt_total.getText()+"', pt_over = '"+pt_over.getText()+"', pt_tg = '"+pt_tg.getText()+"', pt_percent = '"+pt_percent.getText()+"',"
        + " qa_total = '"+qa_total.getText()+"', qa_over = '"+qa_over.getText()+"', qa_tg = '"+qa_tg.getText()+"', qa_percent = '"+qa_percent.getText()+"',"
        + "Final_Grade = '"+txt_fg.getText()+"'"
        + " where Subject = '"+subject.getText()+"'";
        

        try
        {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();             
            JOptionPane.showMessageDialog(null, "Updated");
            mytable1();
            clear();
            update(); //cmd update
            save.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here
        edit();
    }//GEN-LAST:event_editMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        edit();
        save.setVisible(false);
        update.setVisible(true);
        mystud_table.setEnabled(true);
    }//GEN-LAST:event_editActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String sql = "delete * from grade_computation where ID = '"+id.getText()+"'";

        try
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            mytable1();
            clear();
            update(); // cmd update
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jLabel52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MousePressed
       main.removeAll();
        main.repaint();
        main.revalidate();
        
        main.add(search);
        main.repaint();
        main.revalidate();
        
        students();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel52MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       con = Connect.ConnectDB();
       mytable1();
    }//GEN-LAST:event_formWindowOpened

    private void mystud_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mystud_tableMouseClicked
         int row = mystud_table.getSelectedRow();
        id.setText(mystud_table.getModel().getValueAt(row,0).toString());
        last.setText(mystud_table.getModel().getValueAt(row,3).toString());
        first.setText(mystud_table.getModel().getValueAt(row,1).toString());
        middle.setText(mystud_table.getModel().getValueAt(row,2).toString());
        grade.setText(mystud_table.getModel().getValueAt(row,5).toString());
        section.setText(mystud_table.getModel().getValueAt(row,4).toString());
        spec.setText(mystud_table.getModel().getValueAt(row,6).toString());
        
         main.removeAll();
        main.repaint();
        main.revalidate();
        
        main.add(center);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_mystud_tableMouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
      String temp = jTextField1.getText()+ "%";
        String sql = "select * from MyStudents where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            mystud_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void SEARCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHKeyTyped
        String temp = SEARCH.getText()+ "%";
        String sql = "select * from grade_computation where Subject like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            grade9.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SEARCHKeyTyped

    private void grade9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade9MouseClicked
        // TODO add your handling code here:

        //   int row = grade9.getSelectedRow();

        //   TableModel model = grade9.getModel();
        //    String a = ( grade9.getModel().getValueAt(row,4).toString());
        //    String b = ( grade9.getModel().getValueAt(row, 2).toString());
        //String b1 = ( grade9.getModel().getValueAt(row, 0).toString());
        //   String c = ( grade9.getModel().getValueAt(row,3).toString());
        //    String sub = ( grade9.getModel().getValueAt(row,6).toString());

        /*
        for_table();
        g9search.setVisible(true);
        g9search.pack();
        g9search.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        g9search.txtid.setText(a);
        g9search.txtlname.setText(b);
        g9search.txtgname.setText(b1);
        g9search.txtsection.setText(c);
        g9search.txtsubject.setText(sub);

        */
    }//GEN-LAST:event_grade9MouseClicked

    private void grade9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade9MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_grade9MouseEntered

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        String temp = jTextField2.getText()+ "%";
        String sql = "select * from subjects where Quarter/Semester or Subject_title like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            mysubs.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void mysubsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mysubsMouseClicked
       int row = mysubs.getSelectedRow();
        subject.setText(mysubs.getModel().getValueAt(row,1).toString());
        txtptpercent.setText(mysubs.getModel().getValueAt(row,4).toString());
        txtwwpercent.setText(mysubs.getModel().getValueAt(row,5).toString());
        txtqtpercent.setText(mysubs.getModel().getValueAt(row,6).toString());
        
         main.removeAll();
        main.repaint();
        main.revalidate();
        
        main.add(center);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_mysubsMouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel53MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MousePressed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        main.add(search1);
        main.repaint();
        main.revalidate();
        
        subjects();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel53MousePressed

    private void txtwwpercentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwwpercentKeyReleased
        // TODO add your handling code here:
        double aww1, apt1, aqt1 ;
        secrete_code();
        
    }//GEN-LAST:event_txtwwpercentKeyReleased

    private void txtwwpercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwwpercentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwwpercentActionPerformed

    private void llMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llMouseClicked
        
    }//GEN-LAST:event_llMouseClicked

    private void mytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mytableMouseClicked
        int row = mytable.getSelectedRow();
        id.setText(mytable.getModel().getValueAt(row,0).toString());
        last.setText(mytable.getModel().getValueAt(row,1).toString());
        first.setText(mytable.getModel().getValueAt(row,2).toString());
        middle.setText(mytable.getModel().getValueAt(row,3).toString());
        section.setText(mytable.getModel().getValueAt(row,5).toString());
        grade.setText(mytable.getModel().getValueAt(row,6).toString());
        spec.setText(mytable.getModel().getValueAt(row,7).toString());
        subject.setText(mytable.getModel().getValueAt(row,4).toString());
        
        txtq1.setText(mytable.getModel().getValueAt(row,8).toString());
        txtq2.setText(mytable.getModel().getValueAt(row,9).toString());
        txtq3.setText(mytable.getModel().getValueAt(row,10).toString());
        txtq4.setText(mytable.getModel().getValueAt(row,11).toString());
        txtq5.setText(mytable.getModel().getValueAt(row,12).toString());
        txtq6.setText(mytable.getModel().getValueAt(row,13).toString());
        txtq7.setText(mytable.getModel().getValueAt(row,14).toString());
        txtq8.setText(mytable.getModel().getValueAt(row,15).toString());
        
        txtact1.setText(mytable.getModel().getValueAt(row,16).toString());
        txtact2.setText(mytable.getModel().getValueAt(row,17).toString());
        txtact3.setText(mytable.getModel().getValueAt(row,18).toString());
        txtact4.setText(mytable.getModel().getValueAt(row,19).toString());
        txtact5.setText(mytable.getModel().getValueAt(row,20).toString());
        txtact6.setText(mytable.getModel().getValueAt(row,21).toString());
        txtact7.setText(mytable.getModel().getValueAt(row,22).toString());
        txtact8.setText(mytable.getModel().getValueAt(row,23).toString());
        
        txtass1.setText(mytable.getModel().getValueAt(row,24).toString());
        txtass2.setText(mytable.getModel().getValueAt(row,25).toString());
        txtass3.setText(mytable.getModel().getValueAt(row,26).toString());
        txtass4.setText(mytable.getModel().getValueAt(row,27).toString());        

        txt_cp.setText(mytable.getModel().getValueAt(row,28).toString());
        
        txt_tt.setText(mytable.getModel().getValueAt(row,29).toString());
        
        txt_mt.setText(mytable.getModel().getValueAt(row,30).toString());
        
        txtsum1.setText(mytable.getModel().getValueAt(row,31).toString());
        
        txt_qt.setText(mytable.getModel().getValueAt(row,32).toString());
                
        q1.setText(mytable.getModel().getValueAt(row,33).toString());
        q2.setText(mytable.getModel().getValueAt(row,34).toString());
        q3.setText(mytable.getModel().getValueAt(row,35).toString());
        q4.setText(mytable.getModel().getValueAt(row,36).toString());
        q5.setText(mytable.getModel().getValueAt(row,37).toString());
        q6.setText(mytable.getModel().getValueAt(row,38).toString());
        q7.setText(mytable.getModel().getValueAt(row,39).toString());
        q8.setText(mytable.getModel().getValueAt(row,40).toString()); 
        
        act1.setText(mytable.getModel().getValueAt(row,41).toString());
        act2.setText(mytable.getModel().getValueAt(row,42).toString());
        act3.setText(mytable.getModel().getValueAt(row,43).toString());
        act4.setText(mytable.getModel().getValueAt(row,44).toString());
        act5.setText(mytable.getModel().getValueAt(row,45).toString());
        act6.setText(mytable.getModel().getValueAt(row,46).toString());
        act7.setText(mytable.getModel().getValueAt(row,47).toString());
        act8.setText(mytable.getModel().getValueAt(row,48).toString());
        
        ass1.setText(mytable.getModel().getValueAt(row,49).toString());
        ass2.setText(mytable.getModel().getValueAt(row,50).toString());
        ass3.setText(mytable.getModel().getValueAt(row,51).toString());
        ass4.setText(mytable.getModel().getValueAt(row,52).toString());  
        
        cp.setText(mytable.getModel().getValueAt(row,53).toString());
        
        tt.setText(mytable.getModel().getValueAt(row,54).toString());
        
        mt.setText(mytable.getModel().getValueAt(row,55).toString());
        
        sum1.setText(mytable.getModel().getValueAt(row,56).toString());
        
        qt.setText(mytable.getModel().getValueAt(row,57).toString());
        
        
        txtptpercent.setText(mytable.getModel().getValueAt(row,58).toString());
        txtqtpercent.setText(mytable.getModel().getValueAt(row,59).toString());
        txtwwpercent.setText(mytable.getModel().getValueAt(row,60).toString());
        
        txtqtotal.setText(mytable.getModel().getValueAt(row,61).toString());
        
        ww_total.setText(mytable.getModel().getValueAt(row,62).toString());
        ww_over.setText(mytable.getModel().getValueAt(row,63).toString());
        tg.setText(mytable.getModel().getValueAt(row,64).toString());
        ww_percent.setText(mytable.getModel().getValueAt(row,65).toString());
        
        pt_total.setText(mytable.getModel().getValueAt(row,66).toString());
        pt_over.setText(mytable.getModel().getValueAt(row,67).toString());
        pt_tg.setText(mytable.getModel().getValueAt(row,68).toString());
        pt_percent.setText(mytable.getModel().getValueAt(row,69).toString());
        
        qa_total.setText(mytable.getModel().getValueAt(row,70).toString());
        qa_over.setText(mytable.getModel().getValueAt(row,71).toString());
        qa_tg.setText(mytable.getModel().getValueAt(row,72).toString());
        qa_percent.setText(mytable.getModel().getValueAt(row,73).toString());
        
       txt_fg.setText(mytable.getModel().getValueAt(row,74).toString());
    }//GEN-LAST:event_mytableMouseClicked

    private void mytableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mytableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mytableMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        main.removeAll();
        main.repaint();
        main.revalidate();
        
        main.add(center);
        main.repaint();
        main.revalidate();
        
        mytable1();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void txtptpercentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtptpercentKeyReleased
        // TODO add your handling code here:
        secrete_code();
        
    }//GEN-LAST:event_txtptpercentKeyReleased

    private void txtqtpercentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtpercentKeyReleased
        // TODO add your handling code here:
        secrete_code();
    }//GEN-LAST:event_txtqtpercentKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grade_computation_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade_computation_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade_computation_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade_computation_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade_computation_frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SEARCH;
    private javax.swing.JTextField act1;
    private javax.swing.JTextField act10;
    private javax.swing.JTextField act11;
    private javax.swing.JTextField act12;
    private javax.swing.JTextField act13;
    private javax.swing.JTextField act14;
    private javax.swing.JTextField act15;
    private javax.swing.JTextField act16;
    private javax.swing.JTextField act2;
    private javax.swing.JTextField act3;
    private javax.swing.JTextField act4;
    private javax.swing.JTextField act5;
    private javax.swing.JTextField act6;
    private javax.swing.JTextField act7;
    private javax.swing.JTextField act8;
    private javax.swing.JTextField act9;
    private javax.swing.JButton add;
    private javax.swing.JPanel aq1;
    private javax.swing.JTextField ass1;
    private javax.swing.JTextField ass2;
    private javax.swing.JTextField ass3;
    private javax.swing.JTextField ass4;
    private javax.swing.JPanel center;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cp;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    public javax.swing.JTextField first;
    public javax.swing.JTextField grade;
    private javax.swing.JTable grade9;
    private javax.swing.JPanel hide;
    public javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField last;
    private javax.swing.JScrollPane ll;
    private javax.swing.JPanel main;
    public javax.swing.JTextField middle;
    private javax.swing.JTextField mt;
    private javax.swing.JTable mystud_table;
    private javax.swing.JTable mysubs;
    private javax.swing.JTable mytable;
    private javax.swing.JTextField pt_over;
    private javax.swing.JTextField pt_percent;
    private javax.swing.JTextField pt_tg;
    private javax.swing.JTextField pt_total;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JTextField q7;
    private javax.swing.JTextField q8;
    private javax.swing.JTextField qa_over;
    private javax.swing.JTextField qa_over1;
    private javax.swing.JTextField qa_percent;
    private javax.swing.JTextField qa_percent1;
    private javax.swing.JTextField qa_tg;
    private javax.swing.JTextField qa_tg1;
    private javax.swing.JTextField qa_total;
    private javax.swing.JTextField qt;
    private javax.swing.JButton save;
    private javax.swing.JPanel search;
    private javax.swing.JPanel search1;
    public javax.swing.JTextField section;
    public javax.swing.JTextField spec;
    public javax.swing.JTextField subject;
    private javax.swing.JTextField sum1;
    private javax.swing.JTextField sum2;
    private javax.swing.JTextField tg;
    private javax.swing.JTextField tt;
    private javax.swing.JTextField txt_cp;
    private javax.swing.JTextField txt_fg;
    private javax.swing.JTextField txt_mt;
    private javax.swing.JTextField txt_qt;
    private javax.swing.JTextField txt_tt;
    private javax.swing.JTextField txtact1;
    private javax.swing.JTextField txtact10;
    private javax.swing.JTextField txtact11;
    private javax.swing.JTextField txtact12;
    private javax.swing.JTextField txtact13;
    private javax.swing.JTextField txtact14;
    private javax.swing.JTextField txtact15;
    private javax.swing.JTextField txtact16;
    private javax.swing.JTextField txtact2;
    private javax.swing.JTextField txtact3;
    private javax.swing.JTextField txtact4;
    private javax.swing.JTextField txtact5;
    private javax.swing.JTextField txtact6;
    private javax.swing.JTextField txtact7;
    private javax.swing.JTextField txtact8;
    private javax.swing.JTextField txtact9;
    private javax.swing.JTextField txtact_over;
    private javax.swing.JTextField txtacttotal;
    private javax.swing.JTextField txtacttotal1;
    private javax.swing.JTextField txtass1;
    private javax.swing.JTextField txtass2;
    private javax.swing.JTextField txtass3;
    private javax.swing.JTextField txtass4;
    private javax.swing.JTextField txtass_over;
    private javax.swing.JTextField txtastotal;
    private javax.swing.JTextField txtptpercent;
    public javax.swing.JTextField txtq1;
    public javax.swing.JTextField txtq2;
    public javax.swing.JTextField txtq3;
    public javax.swing.JTextField txtq4;
    public javax.swing.JTextField txtq5;
    public javax.swing.JTextField txtq6;
    public javax.swing.JTextField txtq7;
    public javax.swing.JTextField txtq8;
    public javax.swing.JTextField txtqtotal;
    private javax.swing.JTextField txtqtpercent;
    private javax.swing.JTextField txtquiz_over;
    private javax.swing.JTextField txtsum1;
    private javax.swing.JTextField txtsum2;
    private javax.swing.JTextField txtwwpercent;
    private javax.swing.JButton update;
    private javax.swing.JPanel view;
    private javax.swing.JTextField ww_over;
    private javax.swing.JTextField ww_percent;
    private javax.swing.JTextField ww_total;
    // End of variables declaration//GEN-END:variables
}
