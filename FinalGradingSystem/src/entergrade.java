import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class entergrade extends javax.swing.JFrame {
    Connection con = null; 
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    double a, b, c;
    
    public void seven_table()
    {
          String sql = "Select * from Grade7";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            seven_table.setModel(DbUtils.resultSetToTableModel(rs));
            seven_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void eight_table()
    {
          String sql = "Select * from Grade8";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            eight_table.setModel(DbUtils.resultSetToTableModel(rs));
            eight_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void nine_table()
    {
          String sql = "Select * from Grade9";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            nine_table.setModel(DbUtils.resultSetToTableModel(rs));
            nine_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void ten_table()
    {
          String sql = "Select * from Grade10";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            ten_table.setModel(DbUtils.resultSetToTableModel(rs));
            ten_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void abm11_table()
    {
          String sql = "Select * from ABM11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            abm11_table.setModel(DbUtils.resultSetToTableModel(rs));
            abm11_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void gas11_table()
    {
          String sql = "Select * from GAS";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            gas11_table.setModel(DbUtils.resultSetToTableModel(rs));
            gas11_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void stem11_table()
    {
          String sql = "Select * from STEM11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            stem11_table.setModel(DbUtils.resultSetToTableModel(rs));
            stem11_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void humss11_table()
    {
          String sql = "Select * from HUMSS11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            humss11_table.setModel(DbUtils.resultSetToTableModel(rs));
            humss11_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void techvoc11_table()
    {
          String sql = "Select * from Tech_Voc11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            techvoc11_table.setModel(DbUtils.resultSetToTableModel(rs));
            techvoc11_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void abm12_table()
    {
          String sql = "Select * from ABM12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            abm12_table.setModel(DbUtils.resultSetToTableModel(rs));
            abm12_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void techvoc12_table()
    {
          String sql = "Select * from Tech_Voc12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            techvoc12_table.setModel(DbUtils.resultSetToTableModel(rs));
            techvoc12_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void stem12_table()
    {
          String sql = "Select * from STEM12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            stem12_table.setModel(DbUtils.resultSetToTableModel(rs));
            stem12_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void humss12_table()
    {
          String sql = "Select * from HUMSS12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            humss12_table.setModel(DbUtils.resultSetToTableModel(rs));
            humss12_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade7_table()
    {
          String sql = "Select * from subjects_grade7";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade7_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade7_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade8_table()
    {
          String sql = "Select * from subjects_grade8";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade8_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade8_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade9_table()
    {
          String sql = "Select * from subjects_grade9";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade9_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade9_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade10_table()
    {
          String sql = "Select * from subjects_grade10";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade10_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade10_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade11abm_table()
    {
          String sql = "Select * from subjects_abm11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade11abm_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade11abm_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade11gas_table()
    {
          String sql = "Select * from subjects_gas";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade11gas_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade11gas_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade11stem_table()
    {
          String sql = "Select * from subjects_stem11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade11stem_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade11stem_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void grade11humss_table()
    {
          String sql = "Select * from subjects_humss11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade11humss_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade11humss_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void grade11techvoc_table()
    {
          String sql = "Select * from subjects_techvoc11";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade11techvoc_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade11techvoc_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void grade12abm_table()
    {
          String sql = "Select * from subjects_abm12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade12abm_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade12abm_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void grade12techvoc_table()
    {
          String sql = "Select * from subjects_techvoc12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade12techvoc_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade12techvoc_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void grade12stem_table()
    {
          String sql = "Select * from subjects_stem12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade12stem_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade12stem_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void grade12humss_table()
    {
          String sql = "Select * from subjects_humss12";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade12humss_table.setModel(DbUtils.resultSetToTableModel(rs));
            grade12humss_table.setAutoCreateRowSorter(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void clear()
    {
        id.setText(null);
        id1.setText(null);
        id2.setText(null);
        id3.setText(null);
        id4.setText(null);
        id5.setText(null);
        id6.setText(null);
        id7.setText(null);
        id8.setText(null);
        id10.setText(null);
        id11.setText(null);
        id12.setText(null);
        id13.setText(null);
        lastname.setText(null);
        lastname1.setText(null);
        lastname2.setText(null);
        lastname3.setText(null);
        lastname4.setText(null);
        lastname5.setText(null);
        lastname6.setText(null);
        lastname7.setText(null);
        lastname8.setText(null);
        lastname10.setText(null);
        lastname11.setText(null);
        lastname12.setText(null);
        lastname13.setText(null);
        firstname.setText(null);
        firstname1.setText(null);
        firstname2.setText(null);
        firstname3.setText(null);
        firstname4.setText(null);
        firstname5.setText(null);
        firstname6.setText(null);
        firstname7.setText(null);
        firstname8.setText(null);
        firstname10.setText(null);
        firstname11.setText(null);
        firstname12.setText(null);
        firstname13.setText(null);
        middlename.setText(null);
        middlename1.setText(null);
        middlename2.setText(null);
        middlename3.setText(null);
        middlename4.setText(null);
        middlename5.setText(null);
        middlename6.setText(null);
        middlename7.setText(null);
        middlename8.setText(null);
        middlename10.setText(null); 
        middlename11.setText(null); 
        middlename12.setText(null); 
        middlename13.setText(null); 
        grade_level.setText(null);
        grade_level1.setText(null);
        grade_level2.setText(null);
        grade_level3.setText(null);
        grade_level4.setText(null);
        grade_level5.setText(null);
        grade_level6.setText(null);
        grade_level7.setText(null);
        grade_level8.setText(null);
        grade_level10.setText(null);
        grade_level11.setText(null);
        grade_level12.setText(null);
        grade_level13.setText(null);
        section.setText(null);
        section1.setText(null);
        section2.setText(null);
        section3.setText(null);
        section4.setText(null);
        section5.setText(null);
        section6.setText(null);
        section7.setText(null);
        section8.setText(null);
        section10.setText(null);
        section11.setText(null);
        section12.setText(null);
        section13.setText(null);
        eng.setText(null);
        eng1.setText(null);
        eng2.setText(null);
        eng3.setText(null);
        lan.setText(null);
        lan1.setText(null);
        lan2.setText(null);
        lan3.setText(null);
        lan4.setText(null);
        lan5.setText(null);
        lan6.setText(null);
        lan7.setText(null);
        lan8.setText(null);
        lan9.setText(null);
        math.setText(null);
        math1.setText(null);
        math2.setText(null);
        math3.setText(null);
        mat.setText(null);
        mat1.setText(null);
        mat2.setText(null);
        mat3.setText(null);
        mat4.setText(null);
        fil.setText(null);
        fil1.setText(null);
        fil2.setText(null);
        fil3.setText(null);
        scie.setText(null);
        scie1.setText(null);
        scie2.setText(null);
        scie3.setText(null);
        scie4.setText(null);
        peh.setText(null);
        peh1.setText(null);
        peh2.setText(null);
        peh3.setText(null);
        peh4.setText(null);
        tle.setText(null);
        tle1.setText(null);
        ap.setText(null);
        ap1.setText(null);
        ap2.setText(null);
        ap3.setText(null);
        sci.setText(null);
        sci1.setText(null);
        sci2.setText(null);
        sci3.setText(null);
        mapeh.setText(null);
        mapeh1.setText(null);
        mapeh2.setText(null);
        mapeh3.setText(null);
        ict.setText(null);
        ict1.setText(null);
        rve.setText(null);
        rve1.setText(null);
        rve2.setText(null);
        rve3.setText(null);
        rve0.setText(null);
        rve4.setText(null);
        rve5.setText(null);
        rve6.setText(null);
        rve7.setText(null);
        spec2.setText(null);
        spec3.setText(null);
        specialization2.setText(null);
        specialization3.setText(null);
        special.setText(null);
        special1.setText(null);
        special2.setText(null);
        special3.setText(null);
        special4.setText(null);
        special5.setText(null);
        special6.setText(null);
        special7.setText(null);
        special8.setText(null);
        special9.setText(null);
        language.setText(null);
        language1.setText(null);
        language2.setText(null);
        language3.setText(null);
        hum.setText(null);
        hum1.setText(null);
        hum2.setText(null);
        hum3.setText(null);
        research.setText(null);
        research1.setText(null);
        research2.setText(null);
        research3.setText(null);
        philo.setText(null);
        philo1.setText(null);
        philo2.setText(null);
        philo3.setText(null);
        pe.setText(null);
        pe1.setText(null);
        pe2.setText(null);
        pe3.setText(null);
        ssc.setText(null);
        ssc1.setText(null);
        ssc2.setText(null);
        ssc3.setText(null);
        spe.setText(null);
        spe1.setText(null);
        spe2.setText(null);
        spe3.setText(null);
        spe4.setText(null);
        spe5.setText(null);
        spe6.setText(null);
        spe7.setText(null);
    }

 
    public entergrade() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        center = new javax.swing.JPanel();
        select = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        seven = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        grade7_table = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        middlename = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        grade_level = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        mapeh = new javax.swing.JTextField();
        sci = new javax.swing.JTextField();
        math = new javax.swing.JTextField();
        eng = new javax.swing.JTextField();
        fil = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        rve = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        ap = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        tle = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        ict = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        finalgrade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        seventable = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        seven_table = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        eight = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        grade8_table = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        section1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        lastname1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        middlename1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        grade_level1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        firstname1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        mapeh1 = new javax.swing.JTextField();
        sci1 = new javax.swing.JTextField();
        math1 = new javax.swing.JTextField();
        eng1 = new javax.swing.JTextField();
        fil1 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        rve1 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        ap1 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        tle1 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        ict1 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        finalgrade1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        eighttable = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        eight_table = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        nine = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        grade9_table = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        section2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        lastname2 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        middlename2 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        grade_level2 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        firstname2 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        mapeh2 = new javax.swing.JTextField();
        rve2 = new javax.swing.JTextField();
        math2 = new javax.swing.JTextField();
        eng2 = new javax.swing.JTextField();
        fil2 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        ap2 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        sci2 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        spec2 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        finalgrade2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        specialization2 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        ninetable = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        nine_table = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        ten = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        grade10_table = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        id3 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        section3 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        lastname3 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        middlename3 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        grade_level3 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        firstname3 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        mapeh3 = new javax.swing.JTextField();
        rve3 = new javax.swing.JTextField();
        math3 = new javax.swing.JTextField();
        eng3 = new javax.swing.JTextField();
        fil3 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        ap3 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        sci3 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        spec3 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        finalgrade3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        specialization3 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        tentable = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        ten_table = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        grade11 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        abm11 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        grade11abm_table = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        id4 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        section4 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        lastname4 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        middlename4 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        grade_level4 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        firstname4 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        special = new javax.swing.JTextField();
        rve0 = new javax.swing.JTextField();
        lan2 = new javax.swing.JTextField();
        lan = new javax.swing.JTextField();
        mat = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        peh = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        scie = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        special2 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        finalgrade4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        specialization4 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        abm11table = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        abm11_table = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        gas = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        grade11gas_table = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        id5 = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        section5 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        lastname5 = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        middlename5 = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        grade_level5 = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        firstname5 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        special1 = new javax.swing.JTextField();
        rve4 = new javax.swing.JTextField();
        lan3 = new javax.swing.JTextField();
        lan1 = new javax.swing.JTextField();
        mat1 = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        peh1 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        scie1 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        special3 = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        finalgrade5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        specialization5 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        gastable = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        gas11_table = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jLabel153 = new javax.swing.JLabel();
        stem11 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        grade11stem_table = new javax.swing.JTable();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        id6 = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        section6 = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        lastname6 = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        middlename6 = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        grade_level6 = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        firstname6 = new javax.swing.JTextField();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        special4 = new javax.swing.JTextField();
        rve5 = new javax.swing.JTextField();
        lan4 = new javax.swing.JTextField();
        lan5 = new javax.swing.JTextField();
        mat2 = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        peh2 = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        scie2 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        special5 = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        finalgrade6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        specialization6 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        stem11table = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        stem11_table = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        humss11 = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        grade11humss_table = new javax.swing.JTable();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        id7 = new javax.swing.JTextField();
        jLabel177 = new javax.swing.JLabel();
        section7 = new javax.swing.JTextField();
        jLabel178 = new javax.swing.JLabel();
        lastname7 = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        middlename7 = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        grade_level7 = new javax.swing.JTextField();
        jLabel181 = new javax.swing.JLabel();
        firstname7 = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        special6 = new javax.swing.JTextField();
        rve6 = new javax.swing.JTextField();
        lan6 = new javax.swing.JTextField();
        lan7 = new javax.swing.JTextField();
        mat3 = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        peh3 = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        scie3 = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        special7 = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
        finalgrade7 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        specialization7 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        humss11table = new javax.swing.JPanel();
        jLabel192 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        humss11_table = new javax.swing.JTable();
        jTextField9 = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        techvoc11 = new javax.swing.JPanel();
        jLabel194 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        grade11techvoc_table = new javax.swing.JTable();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        id8 = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        section8 = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        lastname8 = new javax.swing.JTextField();
        jLabel199 = new javax.swing.JLabel();
        middlename8 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        grade_level8 = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        firstname8 = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        special8 = new javax.swing.JTextField();
        rve7 = new javax.swing.JTextField();
        lan8 = new javax.swing.JTextField();
        lan9 = new javax.swing.JTextField();
        mat4 = new javax.swing.JTextField();
        jLabel208 = new javax.swing.JLabel();
        peh4 = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        scie4 = new javax.swing.JTextField();
        jLabel210 = new javax.swing.JLabel();
        special9 = new javax.swing.JTextField();
        jLabel211 = new javax.swing.JLabel();
        finalgrade8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        specialization8 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        techvoc11table = new javax.swing.JPanel();
        jLabel212 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        techvoc11_table = new javax.swing.JTable();
        jTextField10 = new javax.swing.JTextField();
        jLabel213 = new javax.swing.JLabel();
        grade12 = new javax.swing.JPanel();
        jLabel214 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        abm12 = new javax.swing.JPanel();
        jLabel233 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        grade12abm_table = new javax.swing.JTable();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        id10 = new javax.swing.JTextField();
        jLabel236 = new javax.swing.JLabel();
        section10 = new javax.swing.JTextField();
        jLabel237 = new javax.swing.JLabel();
        lastname10 = new javax.swing.JTextField();
        jLabel238 = new javax.swing.JLabel();
        middlename10 = new javax.swing.JTextField();
        jLabel239 = new javax.swing.JLabel();
        grade_level10 = new javax.swing.JTextField();
        jLabel240 = new javax.swing.JLabel();
        firstname10 = new javax.swing.JTextField();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        spe = new javax.swing.JTextField();
        ssc = new javax.swing.JTextField();
        hum = new javax.swing.JTextField();
        language = new javax.swing.JTextField();
        research = new javax.swing.JTextField();
        jLabel247 = new javax.swing.JLabel();
        pe = new javax.swing.JTextField();
        jLabel248 = new javax.swing.JLabel();
        philo = new javax.swing.JTextField();
        jLabel249 = new javax.swing.JLabel();
        spe1 = new javax.swing.JTextField();
        jLabel250 = new javax.swing.JLabel();
        finalgrade10 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        specialization10 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        abm12table = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        abm12_table = new javax.swing.JTable();
        jTextField11 = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        techvoc12 = new javax.swing.JPanel();
        jLabel251 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        grade12techvoc_table = new javax.swing.JTable();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        id11 = new javax.swing.JTextField();
        jLabel254 = new javax.swing.JLabel();
        section11 = new javax.swing.JTextField();
        jLabel255 = new javax.swing.JLabel();
        lastname11 = new javax.swing.JTextField();
        jLabel256 = new javax.swing.JLabel();
        middlename11 = new javax.swing.JTextField();
        jLabel257 = new javax.swing.JLabel();
        grade_level11 = new javax.swing.JTextField();
        jLabel258 = new javax.swing.JLabel();
        firstname11 = new javax.swing.JTextField();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        spe2 = new javax.swing.JTextField();
        ssc1 = new javax.swing.JTextField();
        hum1 = new javax.swing.JTextField();
        language1 = new javax.swing.JTextField();
        research1 = new javax.swing.JTextField();
        jLabel265 = new javax.swing.JLabel();
        pe1 = new javax.swing.JTextField();
        jLabel266 = new javax.swing.JLabel();
        philo1 = new javax.swing.JTextField();
        jLabel267 = new javax.swing.JLabel();
        spe3 = new javax.swing.JTextField();
        jLabel268 = new javax.swing.JLabel();
        finalgrade11 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        specialization11 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        techvoc12table = new javax.swing.JPanel();
        jLabel217 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        techvoc12_table = new javax.swing.JTable();
        jTextField12 = new javax.swing.JTextField();
        jLabel218 = new javax.swing.JLabel();
        stem12 = new javax.swing.JPanel();
        jLabel269 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        grade12stem_table = new javax.swing.JTable();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        id12 = new javax.swing.JTextField();
        jLabel272 = new javax.swing.JLabel();
        section12 = new javax.swing.JTextField();
        jLabel273 = new javax.swing.JLabel();
        lastname12 = new javax.swing.JTextField();
        jLabel274 = new javax.swing.JLabel();
        middlename12 = new javax.swing.JTextField();
        jLabel275 = new javax.swing.JLabel();
        grade_level12 = new javax.swing.JTextField();
        jLabel276 = new javax.swing.JLabel();
        firstname12 = new javax.swing.JTextField();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        spe4 = new javax.swing.JTextField();
        ssc2 = new javax.swing.JTextField();
        hum2 = new javax.swing.JTextField();
        language2 = new javax.swing.JTextField();
        research2 = new javax.swing.JTextField();
        jLabel283 = new javax.swing.JLabel();
        pe2 = new javax.swing.JTextField();
        jLabel284 = new javax.swing.JLabel();
        philo2 = new javax.swing.JTextField();
        jLabel285 = new javax.swing.JLabel();
        spe5 = new javax.swing.JTextField();
        jLabel286 = new javax.swing.JLabel();
        finalgrade12 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        specialization12 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        stem12table = new javax.swing.JPanel();
        jLabel219 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        stem12_table = new javax.swing.JTable();
        jTextField13 = new javax.swing.JTextField();
        jLabel220 = new javax.swing.JLabel();
        humss12 = new javax.swing.JPanel();
        jLabel287 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        grade12humss_table = new javax.swing.JTable();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        id13 = new javax.swing.JTextField();
        jLabel290 = new javax.swing.JLabel();
        section13 = new javax.swing.JTextField();
        jLabel291 = new javax.swing.JLabel();
        lastname13 = new javax.swing.JTextField();
        jLabel292 = new javax.swing.JLabel();
        middlename13 = new javax.swing.JTextField();
        jLabel293 = new javax.swing.JLabel();
        grade_level13 = new javax.swing.JTextField();
        jLabel294 = new javax.swing.JLabel();
        firstname13 = new javax.swing.JTextField();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        spe6 = new javax.swing.JTextField();
        ssc3 = new javax.swing.JTextField();
        hum3 = new javax.swing.JTextField();
        language3 = new javax.swing.JTextField();
        research3 = new javax.swing.JTextField();
        jLabel301 = new javax.swing.JLabel();
        pe3 = new javax.swing.JTextField();
        jLabel302 = new javax.swing.JLabel();
        philo3 = new javax.swing.JTextField();
        jLabel303 = new javax.swing.JLabel();
        spe7 = new javax.swing.JTextField();
        jLabel304 = new javax.swing.JLabel();
        finalgrade13 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        specialization13 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        humss12table = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        humss12_table = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        jLabel222 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1242, 697));
        setResizable(false);
        setSize(new java.awt.Dimension(1242, 697));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setLayout(new java.awt.CardLayout());

        select.setBackground(new java.awt.Color(255, 255, 255));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel97MousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(414, 119));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Grade 7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(414, 119));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Grade 8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Grade 9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Grade 10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Grade 11");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel5)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Grade 12");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel6)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout selectLayout = new javax.swing.GroupLayout(select);
        select.setLayout(selectLayout);
        selectLayout.setHorizontalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectLayout.createSequentialGroup()
                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel97))
                    .addGroup(selectLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(selectLayout.createSequentialGroup()
                                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(selectLayout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        selectLayout.setVerticalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );

        center.add(select, "card2");

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(51, 153, 0));
        jLabel77.setText("Surname");

        grade7_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade7_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade7_tableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(grade7_table);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel30MousePressed(evt);
            }
        });

        jLabel36.setText("ID NO.");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel37.setText("Last Name");

        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionActionPerformed(evt);
            }
        });

        jLabel38.setText("First Name");

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });

        jLabel39.setText("Middle Name");

        middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenameActionPerformed(evt);
            }
        });

        jLabel40.setText("Grade Level");

        grade_level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_levelActionPerformed(evt);
            }
        });

        jLabel41.setText("Section");

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 153, 0));
        jLabel42.setText("Subjects");

        jLabel43.setText("English");

        jLabel78.setText("Math");

        jLabel79.setText("Science");

        jLabel80.setText("Filipino");

        jLabel81.setText("Araling Panlipunan");

        mapeh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mapehKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mapehKeyTyped(evt);
            }
        });

        sci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sciKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sciKeyTyped(evt);
            }
        });

        math.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mathKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mathKeyTyped(evt);
            }
        });

        eng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engActionPerformed(evt);
            }
        });
        eng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                engKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                engKeyTyped(evt);
            }
        });

        fil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filKeyTyped(evt);
            }
        });

        jLabel82.setText("RVE");

        rve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rveKeyTyped(evt);
            }
        });

        jLabel83.setText("MAPEH");

        ap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apKeyTyped(evt);
            }
        });

        jLabel84.setText("TLE");

        tle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tleKeyTyped(evt);
            }
        });

        jLabel85.setText("ICT");

        ict.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ictKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ictKeyTyped(evt);
            }
        });

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel86MousePressed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sevenLayout = new javax.swing.GroupLayout(seven);
        seven.setLayout(sevenLayout);
        sevenLayout.setHorizontalGroup(
            sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sevenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sevenLayout.createSequentialGroup()
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sevenLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sevenLayout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(19, 19, 19)
                                        .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sevenLayout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sevenLayout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(sevenLayout.createSequentialGroup()
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37))
                                .addGap(29, 29, 29)
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40)
                                .addGap(26, 26, 26)
                                .addComponent(grade_level, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sevenLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel42)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sevenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel80)
                                    .addComponent(jLabel84))
                                .addGap(18, 18, 18)
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eng, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fil, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel79)
                            .addComponent(jLabel83)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sci, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mapeh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ict, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sevenLayout.createSequentialGroup()
                                .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel82)
                                .addGap(35, 35, 35)
                                .addComponent(rve, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(sevenLayout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addGap(22, 22, 22))))
            .addGroup(sevenLayout.createSequentialGroup()
                .addComponent(finalgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sevenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addGap(223, 223, 223))
        );
        sevenLayout.setVerticalGroup(
            sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sevenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addComponent(jLabel42)
                    .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77)))
                .addGap(2, 2, 2)
                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sevenLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sevenLayout.createSequentialGroup()
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(sevenLayout.createSequentialGroup()
                                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel40)
                                            .addComponent(grade_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sevenLayout.createSequentialGroup()
                                        .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(sevenLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41)))))
                    .addGroup(sevenLayout.createSequentialGroup()
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(eng, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel78)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel80)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85)))
                    .addGroup(sevenLayout.createSequentialGroup()
                        .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81)
                            .addComponent(jLabel82)
                            .addComponent(rve, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sci, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mapeh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ict, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sevenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(seven, "card2");

        seventable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(51, 153, 0));
        jLabel87.setText("Surname");

        seven_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        seven_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seven_tableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(seven_table);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 153, 0));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel96MousePressed(evt);
            }
        });

        javax.swing.GroupLayout seventableLayout = new javax.swing.GroupLayout(seventable);
        seventable.setLayout(seventableLayout);
        seventableLayout.setHorizontalGroup(
            seventableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seventableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seventableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seventableLayout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(seventableLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        seventableLayout.setVerticalGroup(
            seventableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seventableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seventableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seventableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel87)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel96))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(seventable, "card2");

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 153, 0));
        jLabel88.setText("Surname");

        grade8_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade8_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade8_tableMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(grade8_table);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel31MousePressed(evt);
            }
        });

        jLabel44.setText("ID NO.");

        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });

        jLabel45.setText("Last Name");

        section1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section1ActionPerformed(evt);
            }
        });

        jLabel46.setText("First Name");

        lastname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname1ActionPerformed(evt);
            }
        });

        jLabel47.setText("Middle Name");

        middlename1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename1ActionPerformed(evt);
            }
        });

        jLabel48.setText("Grade Level");

        grade_level1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level1ActionPerformed(evt);
            }
        });

        jLabel49.setText("Section");

        firstname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname1ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 153, 0));
        jLabel50.setText("Subjects");

        jLabel51.setText("English");

        jLabel89.setText("Math");

        jLabel90.setText("Science");

        jLabel91.setText("Filipino");

        jLabel92.setText("Araling Panlipunan");

        mapeh1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mapeh1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mapeh1KeyTyped(evt);
            }
        });

        sci1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sci1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sci1KeyTyped(evt);
            }
        });

        math1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                math1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                math1KeyTyped(evt);
            }
        });

        eng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eng1ActionPerformed(evt);
            }
        });
        eng1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eng1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eng1KeyTyped(evt);
            }
        });

        fil1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fil1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fil1KeyTyped(evt);
            }
        });

        jLabel93.setText("RVE");

        rve1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve1KeyTyped(evt);
            }
        });

        jLabel94.setText("MAPEH");

        ap1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ap1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap1KeyTyped(evt);
            }
        });

        jLabel95.setText("TLE");

        tle1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tle1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tle1KeyTyped(evt);
            }
        });

        jLabel98.setText("ICT");

        ict1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ict1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ict1KeyTyped(evt);
            }
        });

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel99MousePressed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton15.setText("Back");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eightLayout = new javax.swing.GroupLayout(eight);
        eight.setLayout(eightLayout);
        eightLayout.setHorizontalGroup(
            eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eightLayout.createSequentialGroup()
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, eightLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eightLayout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addGap(19, 19, 19)
                                        .addComponent(middlename1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eightLayout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(section1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, eightLayout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(eightLayout.createSequentialGroup()
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel45))
                                .addGap(29, 29, 29)
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastname1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstname1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48)
                                .addGap(26, 26, 26)
                                .addComponent(grade_level1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(eightLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel50)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eightLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel95))
                                .addGap(18, 18, 18)
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eng1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(math1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fil1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tle1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92)
                            .addComponent(jLabel90)
                            .addComponent(jLabel94)
                            .addComponent(jLabel98))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sci1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mapeh1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ict1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(eightLayout.createSequentialGroup()
                                .addComponent(ap1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel93)
                                .addGap(35, 35, 35)
                                .addComponent(rve1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(eightLayout.createSequentialGroup()
                        .addComponent(jScrollPane11)
                        .addGap(22, 22, 22))))
            .addGroup(eightLayout.createSequentialGroup()
                .addComponent(finalgrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addGap(228, 228, 228))
        );
        eightLayout.setVerticalGroup(
            eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99)
                    .addComponent(jLabel50)
                    .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel88)))
                .addGap(2, 2, 2)
                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eightLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(eightLayout.createSequentialGroup()
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(eightLayout.createSequentialGroup()
                                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel48)
                                            .addComponent(grade_level1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eightLayout.createSequentialGroup()
                                        .addComponent(section1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(eightLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(lastname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49)))))
                    .addGroup(eightLayout.createSequentialGroup()
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(eng1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(math1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel89)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fil1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel91)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tle1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95)
                            .addComponent(jLabel98)))
                    .addGroup(eightLayout.createSequentialGroup()
                        .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ap1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92)
                            .addComponent(jLabel93)
                            .addComponent(rve1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sci1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mapeh1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ict1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(eightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalgrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(eight, "card2");

        eighttable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 153, 0));
        jLabel100.setText("Surname");

        eight_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        eight_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eight_tableMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(eight_table);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 153, 0));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel101MousePressed(evt);
            }
        });

        javax.swing.GroupLayout eighttableLayout = new javax.swing.GroupLayout(eighttable);
        eighttable.setLayout(eighttableLayout);
        eighttableLayout.setHorizontalGroup(
            eighttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eighttableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eighttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eighttableLayout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(eighttableLayout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        eighttableLayout.setVerticalGroup(
            eighttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eighttableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eighttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eighttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel100)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel101))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(eighttable, "card2");

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel102.setBackground(new java.awt.Color(255, 255, 255));
        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 153, 0));
        jLabel102.setText("Surname");

        grade9_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade9_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade9_tableMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(grade9_table);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel32MousePressed(evt);
            }
        });

        jLabel52.setText("ID NO.");

        id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id2ActionPerformed(evt);
            }
        });

        jLabel53.setText("Last Name");

        section2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section2ActionPerformed(evt);
            }
        });

        jLabel54.setText("First Name");

        lastname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname2ActionPerformed(evt);
            }
        });

        jLabel55.setText("Middle Name");

        middlename2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename2ActionPerformed(evt);
            }
        });

        jLabel56.setText("Grade Level");

        grade_level2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level2ActionPerformed(evt);
            }
        });

        jLabel57.setText("Section");

        firstname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname2ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 153, 0));
        jLabel58.setText("Subjects");

        jLabel59.setText("English");

        jLabel103.setText("Math");

        jLabel104.setText("RVE");

        jLabel105.setText("Filipino");

        jLabel106.setText("Araling Panlipunan");

        mapeh2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mapeh2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mapeh2KeyTyped(evt);
            }
        });

        rve2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve2KeyTyped(evt);
            }
        });

        math2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                math2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                math2KeyTyped(evt);
            }
        });

        eng2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eng2ActionPerformed(evt);
            }
        });
        eng2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eng2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eng2KeyTyped(evt);
            }
        });

        fil2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fil2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fil2KeyTyped(evt);
            }
        });

        jLabel108.setText("MAPEH");

        ap2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ap2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap2KeyTyped(evt);
            }
        });

        jLabel109.setText("Sciene");

        sci2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sci2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sci2KeyTyped(evt);
            }
        });

        jLabel110.setText("Specialization");

        spec2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spec2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spec2KeyTyped(evt);
            }
        });

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel111MousePressed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Specialization");

        jButton16.setText("Back");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nineLayout = new javax.swing.GroupLayout(nine);
        nine.setLayout(nineLayout);
        nineLayout.setHorizontalGroup(
            nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nineLayout.createSequentialGroup()
                .addComponent(finalgrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16)
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13)
                    .addGroup(nineLayout.createSequentialGroup()
                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nineLayout.createSequentialGroup()
                                .addComponent(jLabel111)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(nineLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, nineLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nineLayout.createSequentialGroup()
                                                .addComponent(jLabel55)
                                                .addGap(19, 19, 19)
                                                .addComponent(middlename2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nineLayout.createSequentialGroup()
                                                .addComponent(jLabel57)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(section2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(nineLayout.createSequentialGroup()
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel54)
                                            .addComponent(jLabel53))
                                        .addGap(29, 29, 29)
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastname2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(firstname2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel56)
                                        .addGap(26, 26, 26)
                                        .addComponent(grade_level2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(specialization2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nineLayout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nineLayout.createSequentialGroup()
                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel109))
                                .addGap(18, 18, 18)
                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eng2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(math2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fil2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sci2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel106)
                            .addComponent(jLabel104)
                            .addComponent(jLabel108)
                            .addComponent(jLabel110))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rve2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mapeh2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spec2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ap2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(107, 107, 107))
        );
        nineLayout.setVerticalGroup(
            nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111)
                    .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel102))
                    .addGroup(nineLayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(2, 2, 2)
                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nineLayout.createSequentialGroup()
                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel59)
                                    .addComponent(eng2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(nineLayout.createSequentialGroup()
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(math2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel103)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(fil2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel105)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sci2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel109)))
                                    .addGroup(nineLayout.createSequentialGroup()
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(middlename2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel55)
                                            .addComponent(jLabel7)
                                            .addComponent(specialization2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(nineLayout.createSequentialGroup()
                                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel56)
                                                    .addComponent(grade_level2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel54))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nineLayout.createSequentialGroup()
                                                .addComponent(section2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))))
                                    .addGroup(nineLayout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addGap(18, 18, 18)
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel53)
                                            .addComponent(lastname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(firstname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel57)))))
                            .addGroup(nineLayout.createSequentialGroup()
                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ap2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel106))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rve2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mapeh2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spec2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel110))))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(finalgrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(nine, "card2");

        ninetable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel112.setBackground(new java.awt.Color(255, 255, 255));
        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 153, 0));
        jLabel112.setText("Surname");

        nine_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        nine_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nine_tableMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(nine_table);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 153, 0));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel113MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ninetableLayout = new javax.swing.GroupLayout(ninetable);
        ninetable.setLayout(ninetableLayout);
        ninetableLayout.setHorizontalGroup(
            ninetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ninetableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ninetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ninetableLayout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ninetableLayout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        ninetableLayout.setVerticalGroup(
            ninetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ninetableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ninetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ninetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel112)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel113))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(ninetable, "card2");

        ten.setBackground(new java.awt.Color(255, 255, 255));
        ten.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(51, 153, 0));
        jLabel107.setText("Surname");

        grade10_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade10_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade10_tableMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(grade10_table);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel33MousePressed(evt);
            }
        });

        jLabel60.setText("ID NO.");

        id3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id3ActionPerformed(evt);
            }
        });

        jLabel61.setText("Last Name");

        section3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section3ActionPerformed(evt);
            }
        });

        jLabel62.setText("First Name");

        lastname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname3ActionPerformed(evt);
            }
        });

        jLabel63.setText("Middle Name");

        middlename3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename3ActionPerformed(evt);
            }
        });

        jLabel64.setText("Grade Level");

        grade_level3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level3ActionPerformed(evt);
            }
        });

        jLabel65.setText("Section");

        firstname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname3ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 153, 0));
        jLabel66.setText("Subjects");

        jLabel67.setText("English");

        jLabel114.setText("Math");

        jLabel115.setText("RVE");

        jLabel116.setText("Filipino");

        jLabel117.setText("Araling Panlipunan");

        mapeh3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mapeh3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mapeh3KeyTyped(evt);
            }
        });

        rve3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve3KeyTyped(evt);
            }
        });

        math3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                math3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                math3KeyTyped(evt);
            }
        });

        eng3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eng3ActionPerformed(evt);
            }
        });
        eng3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eng3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eng3KeyTyped(evt);
            }
        });

        fil3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fil3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fil3KeyTyped(evt);
            }
        });

        jLabel118.setText("MAPEH");

        ap3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ap3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap3KeyTyped(evt);
            }
        });

        jLabel119.setText("Sciene");

        sci3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sci3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sci3KeyTyped(evt);
            }
        });

        jLabel120.setText("Specialization");

        spec3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spec3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spec3KeyTyped(evt);
            }
        });

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel121MousePressed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Specialization");

        jButton17.setText("Back");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tenLayout = new javax.swing.GroupLayout(ten);
        ten.setLayout(tenLayout);
        tenLayout.setHorizontalGroup(
            tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tenLayout.createSequentialGroup()
                .addComponent(finalgrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17)
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane15)
                    .addGroup(tenLayout.createSequentialGroup()
                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tenLayout.createSequentialGroup()
                                .addComponent(jLabel121)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel107)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(tenLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tenLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tenLayout.createSequentialGroup()
                                                .addComponent(jLabel63)
                                                .addGap(19, 19, 19)
                                                .addComponent(middlename3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tenLayout.createSequentialGroup()
                                                .addComponent(jLabel65)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(section3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(tenLayout.createSequentialGroup()
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel62)
                                            .addComponent(jLabel61))
                                        .addGap(29, 29, 29)
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastname3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(firstname3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel64)
                                        .addGap(26, 26, 26)
                                        .addComponent(grade_level3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(specialization3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tenLayout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tenLayout.createSequentialGroup()
                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel114)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel116)
                                    .addComponent(jLabel119))
                                .addGap(18, 18, 18)
                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eng3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(math3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fil3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sci3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117)
                            .addComponent(jLabel115)
                            .addComponent(jLabel118)
                            .addComponent(jLabel120))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rve3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mapeh3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spec3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ap3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(107, 107, 107))
        );
        tenLayout.setVerticalGroup(
            tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121)
                    .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel107))
                    .addGroup(tenLayout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addGap(2, 2, 2)
                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tenLayout.createSequentialGroup()
                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel67)
                                    .addComponent(eng3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tenLayout.createSequentialGroup()
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(math3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel114)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(fil3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel116)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sci3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel119)))
                                    .addGroup(tenLayout.createSequentialGroup()
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(middlename3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel63)
                                            .addComponent(jLabel8)
                                            .addComponent(specialization3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tenLayout.createSequentialGroup()
                                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel64)
                                                    .addComponent(grade_level3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel62))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tenLayout.createSequentialGroup()
                                                .addComponent(section3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))))
                                    .addGroup(tenLayout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addGap(18, 18, 18)
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel61)
                                            .addComponent(lastname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(firstname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel65)))))
                            .addGroup(tenLayout.createSequentialGroup()
                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ap3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel117))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rve3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mapeh3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spec3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel120))))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(finalgrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(ten, "card2");

        tentable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel122.setBackground(new java.awt.Color(255, 255, 255));
        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(51, 153, 0));
        jLabel122.setText("Surname");

        ten_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ten_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ten_tableMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(ten_table);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 153, 0));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel123MousePressed(evt);
            }
        });

        javax.swing.GroupLayout tentableLayout = new javax.swing.GroupLayout(tentable);
        tentable.setLayout(tentableLayout);
        tentableLayout.setHorizontalGroup(
            tentableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tentableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tentableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tentableLayout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tentableLayout.createSequentialGroup()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        tentableLayout.setVerticalGroup(
            tentableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tentableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tentableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tentableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel122)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel123))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(tentable, "card2");

        grade11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel124MousePressed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(414, 119));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setText("ABM");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(30, 30, 30))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(414, 119));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setText("GAS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setText("Tech-Voc");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel11)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setText("STEM");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(29, 29, 29))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setText("HUMSS");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel13)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout grade11Layout = new javax.swing.GroupLayout(grade11);
        grade11.setLayout(grade11Layout);
        grade11Layout.setHorizontalGroup(
            grade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grade11Layout.createSequentialGroup()
                .addGroup(grade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grade11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel124))
                    .addGroup(grade11Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(grade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(163, 163, 163)
                        .addGroup(grade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        grade11Layout.setVerticalGroup(
            grade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grade11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(grade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(grade11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        center.add(grade11, "card2");

        abm11.setBackground(new java.awt.Color(255, 255, 255));
        abm11.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel125.setBackground(new java.awt.Color(255, 255, 255));
        jLabel125.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(51, 153, 0));
        jLabel125.setText("Surname");

        grade11abm_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade11abm_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade11abm_tableMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(grade11abm_table);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel34MousePressed(evt);
            }
        });

        jLabel68.setText("ID NO.");

        id4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id4ActionPerformed(evt);
            }
        });

        jLabel69.setText("Last Name");

        section4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section4ActionPerformed(evt);
            }
        });

        jLabel70.setText("First Name");

        lastname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname4ActionPerformed(evt);
            }
        });

        jLabel71.setText("Middle Name");

        middlename4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename4ActionPerformed(evt);
            }
        });

        jLabel72.setText("Grade Level");

        grade_level4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level4ActionPerformed(evt);
            }
        });

        jLabel73.setText("Section");

        firstname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname4ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 153, 0));
        jLabel74.setText("Subjects");

        jLabel75.setText("Language 101");

        jLabel126.setText("Language 102");

        jLabel127.setText("RVE 101");

        jLabel128.setText("Mat 101");

        jLabel129.setText("PEH 101");

        special.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                specialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                specialKeyTyped(evt);
            }
        });

        rve0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve0KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve0KeyTyped(evt);
            }
        });

        lan2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan2KeyTyped(evt);
            }
        });

        lan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanActionPerformed(evt);
            }
        });
        lan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lanKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lanKeyTyped(evt);
            }
        });

        mat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                matKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                matKeyTyped(evt);
            }
        });

        jLabel130.setText("ABM 101");

        peh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pehKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pehKeyTyped(evt);
            }
        });

        jLabel131.setText("Sci 101");

        scie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scieKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scieKeyTyped(evt);
            }
        });

        jLabel132.setText("ABM 102");

        special2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special2KeyTyped(evt);
            }
        });

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel133.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel133MousePressed(evt);
            }
        });

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel15.setText("Strand");

        jButton18.setText("Back");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abm11Layout = new javax.swing.GroupLayout(abm11);
        abm11.setLayout(abm11Layout);
        abm11Layout.setHorizontalGroup(
            abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm11Layout.createSequentialGroup()
                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abm11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(abm11Layout.createSequentialGroup()
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abm11Layout.createSequentialGroup()
                                        .addComponent(jLabel133)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel125)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel34))
                                    .addGroup(abm11Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm11Layout.createSequentialGroup()
                                                .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm11Layout.createSequentialGroup()
                                                        .addComponent(jLabel71)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm11Layout.createSequentialGroup()
                                                        .addComponent(jLabel73)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm11Layout.createSequentialGroup()
                                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel70)
                                                    .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel68)
                                                        .addComponent(jLabel69)))
                                                .addGap(29, 29, 29)
                                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel72)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abm11Layout.createSequentialGroup()
                                        .addComponent(jLabel74)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm11Layout.createSequentialGroup()
                                        .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel126)
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel128)
                                            .addComponent(jLabel131))
                                        .addGap(18, 18, 18)
                                        .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lan2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scie, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel129)
                                    .addComponent(jLabel127)
                                    .addComponent(jLabel130)
                                    .addComponent(jLabel132))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rve0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addGap(129, 129, 129))
        );
        abm11Layout.setVerticalGroup(
            abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133)
                    .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel125))
                    .addGroup(abm11Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abm11Layout.createSequentialGroup()
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel15)
                                    .addComponent(specialization4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abm11Layout.createSequentialGroup()
                                        .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel72)
                                            .addComponent(grade_level4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm11Layout.createSequentialGroup()
                                        .addComponent(section4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(abm11Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(18, 18, 18)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel69)
                                    .addComponent(lastname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel73)))))
                    .addGroup(abm11Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(2, 2, 2)
                        .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abm11Layout.createSequentialGroup()
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel75)
                                    .addComponent(lan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lan2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel126)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel128)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel131)
                                    .addComponent(scie, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(abm11Layout.createSequentialGroup()
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(peh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel129))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rve0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(special, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(special2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel132))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(abm11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(abm11, "card2");

        abm11table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel134.setBackground(new java.awt.Color(255, 255, 255));
        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(51, 153, 0));
        jLabel134.setText("Surname");

        abm11_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        abm11_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abm11_tableMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(abm11_table);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 153, 0));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel135.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel135MousePressed(evt);
            }
        });

        javax.swing.GroupLayout abm11tableLayout = new javax.swing.GroupLayout(abm11table);
        abm11table.setLayout(abm11tableLayout);
        abm11tableLayout.setHorizontalGroup(
            abm11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abm11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abm11tableLayout.createSequentialGroup()
                        .addComponent(jLabel135)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(abm11tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        abm11tableLayout.setVerticalGroup(
            abm11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abm11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abm11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel134)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel135))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(abm11table, "card2");

        gas.setBackground(new java.awt.Color(255, 255, 255));
        gas.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel136.setBackground(new java.awt.Color(255, 255, 255));
        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(51, 153, 0));
        jLabel136.setText("Surname");

        grade11gas_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade11gas_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade11gas_tableMouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(grade11gas_table);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel35MousePressed(evt);
            }
        });

        jLabel76.setText("ID NO.");

        id5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id5ActionPerformed(evt);
            }
        });

        jLabel137.setText("Last Name");

        section5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section5ActionPerformed(evt);
            }
        });

        jLabel138.setText("First Name");

        lastname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname5ActionPerformed(evt);
            }
        });

        jLabel139.setText("Middle Name");

        middlename5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename5ActionPerformed(evt);
            }
        });

        jLabel140.setText("Grade Level");

        grade_level5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level5ActionPerformed(evt);
            }
        });

        jLabel141.setText("Section");

        firstname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname5ActionPerformed(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(51, 153, 0));
        jLabel142.setText("Subjects");

        jLabel143.setText("Language 101");

        jLabel144.setText("Language 102");

        jLabel145.setText("RVE 101");

        jLabel146.setText("Mat 101");

        jLabel147.setText("PEH 101");

        special1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special1KeyTyped(evt);
            }
        });

        rve4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve4KeyTyped(evt);
            }
        });

        lan3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan3KeyTyped(evt);
            }
        });

        lan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lan1ActionPerformed(evt);
            }
        });
        lan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan1KeyTyped(evt);
            }
        });

        mat1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat1KeyTyped(evt);
            }
        });

        jLabel148.setText("GAS 101");

        peh1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                peh1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peh1KeyTyped(evt);
            }
        });

        jLabel149.setText("Sci 101");

        scie1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scie1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scie1KeyTyped(evt);
            }
        });

        jLabel150.setText("GAS 102");

        special3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special3KeyTyped(evt);
            }
        });

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel151.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel151MousePressed(evt);
            }
        });

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel16.setText("Strand");

        jButton19.setText("Back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gasLayout = new javax.swing.GroupLayout(gas);
        gas.setLayout(gasLayout);
        gasLayout.setHorizontalGroup(
            gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gasLayout.createSequentialGroup()
                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(gasLayout.createSequentialGroup()
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gasLayout.createSequentialGroup()
                                        .addComponent(jLabel151)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel136)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel35))
                                    .addGroup(gasLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasLayout.createSequentialGroup()
                                                .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasLayout.createSequentialGroup()
                                                        .addComponent(jLabel139)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasLayout.createSequentialGroup()
                                                        .addComponent(jLabel141)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasLayout.createSequentialGroup()
                                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel138)
                                                    .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel76)
                                                        .addComponent(jLabel137)))
                                                .addGap(29, 29, 29)
                                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel140)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gasLayout.createSequentialGroup()
                                        .addComponent(jLabel142)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasLayout.createSequentialGroup()
                                        .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel144)
                                            .addComponent(jLabel143)
                                            .addComponent(jLabel146)
                                            .addComponent(jLabel149))
                                        .addGap(18, 18, 18)
                                        .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lan1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lan3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mat1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scie1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel147)
                                    .addComponent(jLabel145)
                                    .addComponent(jLabel148)
                                    .addComponent(jLabel150))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rve4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peh1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19)
                .addGap(134, 134, 134))
        );
        gasLayout.setVerticalGroup(
            gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel151)
                    .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel136))
                    .addGroup(gasLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gasLayout.createSequentialGroup()
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel139)
                                    .addComponent(jLabel16)
                                    .addComponent(specialization5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gasLayout.createSequentialGroup()
                                        .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel140)
                                            .addComponent(grade_level5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel138))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasLayout.createSequentialGroup()
                                        .addComponent(section5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(gasLayout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addGap(18, 18, 18)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel137)
                                    .addComponent(lastname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel141)))))
                    .addGroup(gasLayout.createSequentialGroup()
                        .addComponent(jLabel142)
                        .addGap(2, 2, 2)
                        .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gasLayout.createSequentialGroup()
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel143)
                                    .addComponent(lan1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel145, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lan3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel144)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel148, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mat1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel146)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel149)
                                    .addComponent(scie1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(gasLayout.createSequentialGroup()
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(peh1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel147))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rve4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(special1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(special3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel150))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(gasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(gas, "card2");

        gastable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel152.setBackground(new java.awt.Color(255, 255, 255));
        jLabel152.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(51, 153, 0));
        jLabel152.setText("Surname");

        gas11_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        gas11_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gas11_tableMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(gas11_table);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 153, 0));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel153.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel153MousePressed(evt);
            }
        });

        javax.swing.GroupLayout gastableLayout = new javax.swing.GroupLayout(gastable);
        gastable.setLayout(gastableLayout);
        gastableLayout.setHorizontalGroup(
            gastableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gastableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gastableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gastableLayout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(gastableLayout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        gastableLayout.setVerticalGroup(
            gastableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gastableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gastableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gastableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel152)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel153))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(gastable, "card2");

        stem11.setBackground(new java.awt.Color(255, 255, 255));
        stem11.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel154.setBackground(new java.awt.Color(255, 255, 255));
        jLabel154.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(51, 153, 0));
        jLabel154.setText("Surname");

        grade11stem_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade11stem_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade11stem_tableMouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(grade11stem_table);

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel155MousePressed(evt);
            }
        });

        jLabel156.setText("ID NO.");

        id6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id6ActionPerformed(evt);
            }
        });

        jLabel157.setText("Last Name");

        section6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section6ActionPerformed(evt);
            }
        });

        jLabel158.setText("First Name");

        lastname6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname6ActionPerformed(evt);
            }
        });

        jLabel159.setText("Middle Name");

        middlename6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename6ActionPerformed(evt);
            }
        });

        jLabel160.setText("Grade Level");

        grade_level6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level6ActionPerformed(evt);
            }
        });

        jLabel161.setText("Section");

        firstname6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname6ActionPerformed(evt);
            }
        });

        jLabel162.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(51, 153, 0));
        jLabel162.setText("Subjects");

        jLabel163.setText("Language 101");

        jLabel164.setText("Language 102");

        jLabel165.setText("RVE 101");

        jLabel166.setText("Mat 101");

        jLabel167.setText("PEH 101");

        special4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special4KeyTyped(evt);
            }
        });

        rve5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve5KeyTyped(evt);
            }
        });

        lan4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan4KeyTyped(evt);
            }
        });

        lan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lan5ActionPerformed(evt);
            }
        });
        lan5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan5KeyTyped(evt);
            }
        });

        mat2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat2KeyTyped(evt);
            }
        });

        jLabel168.setText("STEM 101");

        peh2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                peh2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peh2KeyTyped(evt);
            }
        });

        jLabel169.setText("Sci 101");

        scie2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scie2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scie2KeyTyped(evt);
            }
        });

        jLabel170.setText("STEM 102");

        special5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special5KeyTyped(evt);
            }
        });

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel171.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel171MousePressed(evt);
            }
        });

        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel17.setText("Strand");

        jButton20.setText("Back");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stem11Layout = new javax.swing.GroupLayout(stem11);
        stem11.setLayout(stem11Layout);
        stem11Layout.setHorizontalGroup(
            stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem11Layout.createSequentialGroup()
                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(stem11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(stem11Layout.createSequentialGroup()
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(stem11Layout.createSequentialGroup()
                                        .addComponent(jLabel171)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel154)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel155))
                                    .addGroup(stem11Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem11Layout.createSequentialGroup()
                                                .addComponent(id6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem11Layout.createSequentialGroup()
                                                        .addComponent(jLabel159)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem11Layout.createSequentialGroup()
                                                        .addComponent(jLabel161)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem11Layout.createSequentialGroup()
                                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel158)
                                                    .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel156)
                                                        .addComponent(jLabel157)))
                                                .addGap(29, 29, 29)
                                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel160)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(stem11Layout.createSequentialGroup()
                                        .addComponent(jLabel162)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem11Layout.createSequentialGroup()
                                        .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel164)
                                            .addComponent(jLabel163)
                                            .addComponent(jLabel166)
                                            .addComponent(jLabel169))
                                        .addGap(18, 18, 18)
                                        .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lan5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lan4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mat2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scie2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel167)
                                    .addComponent(jLabel165)
                                    .addComponent(jLabel168)
                                    .addComponent(jLabel170))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rve5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peh2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addGap(134, 134, 134))
        );
        stem11Layout.setVerticalGroup(
            stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel171)
                    .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel154))
                    .addGroup(stem11Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stem11Layout.createSequentialGroup()
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel159)
                                    .addComponent(jLabel17)
                                    .addComponent(specialization6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(stem11Layout.createSequentialGroup()
                                        .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel160)
                                            .addComponent(grade_level6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel158))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem11Layout.createSequentialGroup()
                                        .addComponent(section6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(stem11Layout.createSequentialGroup()
                                .addComponent(jLabel156)
                                .addGap(18, 18, 18)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel157)
                                    .addComponent(lastname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel161)))))
                    .addGroup(stem11Layout.createSequentialGroup()
                        .addComponent(jLabel162)
                        .addGap(2, 2, 2)
                        .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stem11Layout.createSequentialGroup()
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel163)
                                    .addComponent(lan5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel165, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lan4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel164)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel168, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mat2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel166)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel169)
                                    .addComponent(scie2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(stem11Layout.createSequentialGroup()
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(peh2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel167))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rve5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(special4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(special5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel170))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(stem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(stem11, "card2");

        stem11table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel172.setBackground(new java.awt.Color(255, 255, 255));
        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(51, 153, 0));
        jLabel172.setText("Surname");

        stem11_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        stem11_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stem11_tableMouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(stem11_table);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 153, 0));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel173.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel173MousePressed(evt);
            }
        });

        javax.swing.GroupLayout stem11tableLayout = new javax.swing.GroupLayout(stem11table);
        stem11table.setLayout(stem11tableLayout);
        stem11tableLayout.setHorizontalGroup(
            stem11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stem11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stem11tableLayout.createSequentialGroup()
                        .addComponent(jLabel173)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(stem11tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        stem11tableLayout.setVerticalGroup(
            stem11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stem11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stem11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel172)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel173))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(stem11table, "card2");

        humss11.setBackground(new java.awt.Color(255, 255, 255));
        humss11.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel174.setBackground(new java.awt.Color(255, 255, 255));
        jLabel174.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(51, 153, 0));
        jLabel174.setText("Surname");

        grade11humss_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade11humss_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade11humss_tableMouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(grade11humss_table);

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel175.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel175MousePressed(evt);
            }
        });

        jLabel176.setText("ID NO.");

        id7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id7ActionPerformed(evt);
            }
        });

        jLabel177.setText("Last Name");

        section7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section7ActionPerformed(evt);
            }
        });

        jLabel178.setText("First Name");

        lastname7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname7ActionPerformed(evt);
            }
        });

        jLabel179.setText("Middle Name");

        middlename7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename7ActionPerformed(evt);
            }
        });

        jLabel180.setText("Grade Level");

        grade_level7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level7ActionPerformed(evt);
            }
        });

        jLabel181.setText("Section");

        firstname7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname7ActionPerformed(evt);
            }
        });

        jLabel182.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(51, 153, 0));
        jLabel182.setText("Subjects");

        jLabel183.setText("Language 101");

        jLabel184.setText("Language 102");

        jLabel185.setText("RVE 101");

        jLabel186.setText("Mat 101");

        jLabel187.setText("PEH 101");

        special6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special6KeyTyped(evt);
            }
        });

        rve6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve6KeyTyped(evt);
            }
        });

        lan6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan6KeyTyped(evt);
            }
        });

        lan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lan7ActionPerformed(evt);
            }
        });
        lan7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan7KeyTyped(evt);
            }
        });

        mat3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat3KeyTyped(evt);
            }
        });

        jLabel188.setText("HSS 101");

        peh3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                peh3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peh3KeyTyped(evt);
            }
        });

        jLabel189.setText("Sci 101");

        scie3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scie3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scie3KeyTyped(evt);
            }
        });

        jLabel190.setText("HSS 102");

        special7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special7KeyTyped(evt);
            }
        });

        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel191.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel191MousePressed(evt);
            }
        });

        jButton8.setText("Save");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel18.setText("Strand");

        jButton21.setText("Back");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout humss11Layout = new javax.swing.GroupLayout(humss11);
        humss11.setLayout(humss11Layout);
        humss11Layout.setHorizontalGroup(
            humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss11Layout.createSequentialGroup()
                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(humss11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(humss11Layout.createSequentialGroup()
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(humss11Layout.createSequentialGroup()
                                        .addComponent(jLabel191)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel174)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel175))
                                    .addGroup(humss11Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss11Layout.createSequentialGroup()
                                                .addComponent(id7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss11Layout.createSequentialGroup()
                                                        .addComponent(jLabel179)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss11Layout.createSequentialGroup()
                                                        .addComponent(jLabel181)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss11Layout.createSequentialGroup()
                                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel178)
                                                    .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel176)
                                                        .addComponent(jLabel177)))
                                                .addGap(29, 29, 29)
                                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel180)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(humss11Layout.createSequentialGroup()
                                        .addComponent(jLabel182)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss11Layout.createSequentialGroup()
                                        .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel184)
                                            .addComponent(jLabel183)
                                            .addComponent(jLabel186)
                                            .addComponent(jLabel189))
                                        .addGap(18, 18, 18)
                                        .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lan7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lan6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mat3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scie3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel187)
                                    .addComponent(jLabel185)
                                    .addComponent(jLabel188)
                                    .addComponent(jLabel190))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rve6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peh3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton21)
                .addGap(129, 129, 129))
        );
        humss11Layout.setVerticalGroup(
            humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel191)
                    .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel174))
                    .addGroup(humss11Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(humss11Layout.createSequentialGroup()
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel179)
                                    .addComponent(jLabel18)
                                    .addComponent(specialization7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(humss11Layout.createSequentialGroup()
                                        .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel180)
                                            .addComponent(grade_level7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel178))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss11Layout.createSequentialGroup()
                                        .addComponent(section7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(humss11Layout.createSequentialGroup()
                                .addComponent(jLabel176)
                                .addGap(18, 18, 18)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel177)
                                    .addComponent(lastname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel181)))))
                    .addGroup(humss11Layout.createSequentialGroup()
                        .addComponent(jLabel182)
                        .addGap(2, 2, 2)
                        .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(humss11Layout.createSequentialGroup()
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel183)
                                    .addComponent(lan7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel185, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lan6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel184)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel188, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mat3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel186)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel189)
                                    .addComponent(scie3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(humss11Layout.createSequentialGroup()
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(peh3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel187))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rve6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(special6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(special7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel190))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(humss11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(humss11, "card2");

        humss11table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel192.setBackground(new java.awt.Color(255, 255, 255));
        jLabel192.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(51, 153, 0));
        jLabel192.setText("Surname");

        humss11_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        humss11_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                humss11_tableMouseClicked(evt);
            }
        });
        jScrollPane24.setViewportView(humss11_table);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(51, 153, 0));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jLabel193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel193.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel193MousePressed(evt);
            }
        });

        javax.swing.GroupLayout humss11tableLayout = new javax.swing.GroupLayout(humss11table);
        humss11table.setLayout(humss11tableLayout);
        humss11tableLayout.setHorizontalGroup(
            humss11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(humss11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(humss11tableLayout.createSequentialGroup()
                        .addComponent(jLabel193)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel192)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(humss11tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        humss11tableLayout.setVerticalGroup(
            humss11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(humss11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(humss11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel192)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel193))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(humss11table, "card2");

        techvoc11.setBackground(new java.awt.Color(255, 255, 255));
        techvoc11.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel194.setBackground(new java.awt.Color(255, 255, 255));
        jLabel194.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(51, 153, 0));
        jLabel194.setText("Surname");

        grade11techvoc_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade11techvoc_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade11techvoc_tableMouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(grade11techvoc_table);

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel195.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel195MousePressed(evt);
            }
        });

        jLabel196.setText("ID NO.");

        id8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id8ActionPerformed(evt);
            }
        });

        jLabel197.setText("Last Name");

        section8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section8ActionPerformed(evt);
            }
        });

        jLabel198.setText("First Name");

        lastname8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname8ActionPerformed(evt);
            }
        });

        jLabel199.setText("Middle Name");

        middlename8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename8ActionPerformed(evt);
            }
        });

        jLabel200.setText("Grade Level");

        grade_level8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level8ActionPerformed(evt);
            }
        });

        jLabel201.setText("Section");

        firstname8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname8ActionPerformed(evt);
            }
        });

        jLabel202.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(51, 153, 0));
        jLabel202.setText("Subjects");

        jLabel203.setText("Language 101");

        jLabel204.setText("Language 102");

        jLabel205.setText("RVE 101");

        jLabel206.setText("Mat 101");

        jLabel207.setText("PEH 101");

        special8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special8KeyTyped(evt);
            }
        });

        rve7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rve7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rve7KeyTyped(evt);
            }
        });

        lan8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan8KeyTyped(evt);
            }
        });

        lan9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lan9ActionPerformed(evt);
            }
        });
        lan9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lan9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lan9KeyTyped(evt);
            }
        });

        mat4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mat4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mat4KeyTyped(evt);
            }
        });

        jLabel208.setText("SPEC 101");

        peh4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                peh4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peh4KeyTyped(evt);
            }
        });

        jLabel209.setText("Sci 101");

        scie4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scie4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scie4KeyTyped(evt);
            }
        });

        jLabel210.setText("SPEC 102");

        special9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                special9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                special9KeyTyped(evt);
            }
        });

        jLabel211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel211.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel211MousePressed(evt);
            }
        });

        jButton9.setText("Save");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel19.setText("Strand");

        jButton22.setText("Back");
        jButton22.setToolTipText("");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout techvoc11Layout = new javax.swing.GroupLayout(techvoc11);
        techvoc11.setLayout(techvoc11Layout);
        techvoc11Layout.setHorizontalGroup(
            techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc11Layout.createSequentialGroup()
                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(techvoc11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(techvoc11Layout.createSequentialGroup()
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(techvoc11Layout.createSequentialGroup()
                                        .addComponent(jLabel211)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel194)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel195))
                                    .addGroup(techvoc11Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc11Layout.createSequentialGroup()
                                                .addComponent(id8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc11Layout.createSequentialGroup()
                                                        .addComponent(jLabel199)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc11Layout.createSequentialGroup()
                                                        .addComponent(jLabel201)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc11Layout.createSequentialGroup()
                                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel198)
                                                    .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel196)
                                                        .addComponent(jLabel197)))
                                                .addGap(29, 29, 29)
                                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel200)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(techvoc11Layout.createSequentialGroup()
                                        .addComponent(jLabel202)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc11Layout.createSequentialGroup()
                                        .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel204)
                                            .addComponent(jLabel203)
                                            .addComponent(jLabel206)
                                            .addComponent(jLabel209))
                                        .addGap(18, 18, 18)
                                        .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lan9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lan8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mat4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scie4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel207)
                                    .addComponent(jLabel205)
                                    .addComponent(jLabel208)
                                    .addComponent(jLabel210))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rve7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(special9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peh4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addGap(129, 129, 129))
        );
        techvoc11Layout.setVerticalGroup(
            techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel211)
                    .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel194))
                    .addGroup(techvoc11Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(techvoc11Layout.createSequentialGroup()
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel199)
                                    .addComponent(jLabel19)
                                    .addComponent(specialization8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(techvoc11Layout.createSequentialGroup()
                                        .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel200)
                                            .addComponent(grade_level8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel198))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc11Layout.createSequentialGroup()
                                        .addComponent(section8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(techvoc11Layout.createSequentialGroup()
                                .addComponent(jLabel196)
                                .addGap(18, 18, 18)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel197)
                                    .addComponent(lastname8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel201)))))
                    .addGroup(techvoc11Layout.createSequentialGroup()
                        .addComponent(jLabel202)
                        .addGap(2, 2, 2)
                        .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(techvoc11Layout.createSequentialGroup()
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel203)
                                    .addComponent(lan9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel205, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lan8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel204)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel208, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mat4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel206)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel209)
                                    .addComponent(scie4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(techvoc11Layout.createSequentialGroup()
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(peh4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel207))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rve7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(special8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(special9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel210))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(techvoc11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(techvoc11, "card2");

        techvoc11table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel212.setBackground(new java.awt.Color(255, 255, 255));
        jLabel212.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(51, 153, 0));
        jLabel212.setText("Surname");

        techvoc11_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        techvoc11_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                techvoc11_tableMouseClicked(evt);
            }
        });
        jScrollPane26.setViewportView(techvoc11_table);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(51, 153, 0));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jLabel213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel213.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel213MousePressed(evt);
            }
        });

        javax.swing.GroupLayout techvoc11tableLayout = new javax.swing.GroupLayout(techvoc11table);
        techvoc11table.setLayout(techvoc11tableLayout);
        techvoc11tableLayout.setHorizontalGroup(
            techvoc11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(techvoc11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(techvoc11tableLayout.createSequentialGroup()
                        .addComponent(jLabel213)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel212)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(techvoc11tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        techvoc11tableLayout.setVerticalGroup(
            techvoc11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc11tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(techvoc11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(techvoc11tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel212)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel213))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(techvoc11table, "card2");

        grade12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel214.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel214MousePressed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setPreferredSize(new java.awt.Dimension(414, 119));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel12MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel14.setText("ABM");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(30, 30, 30))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setPreferredSize(new java.awt.Dimension(414, 119));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel13MousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel20.setText("Tech-Voc");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(107, 107, 107))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel20)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel15MousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel22.setText("STEM");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(29, 29, 29))
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel16MousePressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel23.setText("HUMSS");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel23)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel23)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout grade12Layout = new javax.swing.GroupLayout(grade12);
        grade12.setLayout(grade12Layout);
        grade12Layout.setHorizontalGroup(
            grade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grade12Layout.createSequentialGroup()
                .addGroup(grade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grade12Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel214))
                    .addGroup(grade12Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(grade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(163, 163, 163)
                        .addGroup(grade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        grade12Layout.setVerticalGroup(
            grade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grade12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel214)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(grade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(grade12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(286, 286, 286))
        );

        center.add(grade12, "card2");

        abm12.setBackground(new java.awt.Color(255, 255, 255));
        abm12.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel233.setBackground(new java.awt.Color(255, 255, 255));
        jLabel233.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel233.setForeground(new java.awt.Color(51, 153, 0));
        jLabel233.setText("Surname");

        grade12abm_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade12abm_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade12abm_tableMouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(grade12abm_table);

        jLabel234.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel234.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel234MousePressed(evt);
            }
        });

        jLabel235.setText("ID NO.");

        id10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id10ActionPerformed(evt);
            }
        });

        jLabel236.setText("Last Name");

        section10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section10ActionPerformed(evt);
            }
        });

        jLabel237.setText("First Name");

        lastname10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname10ActionPerformed(evt);
            }
        });

        jLabel238.setText("Middle Name");

        middlename10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename10ActionPerformed(evt);
            }
        });

        jLabel239.setText("Grade Level");

        grade_level10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level10ActionPerformed(evt);
            }
        });

        jLabel240.setText("Section");

        firstname10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname10ActionPerformed(evt);
            }
        });

        jLabel241.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(51, 153, 0));
        jLabel241.setText("Subjects");

        jLabel242.setText("Language 105");

        jLabel243.setText("HUM 101");

        jLabel244.setText("SSC 101");

        jLabel245.setText("Research 102");

        jLabel246.setText("PEH 101");

        spe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                speKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                speKeyTyped(evt);
            }
        });

        ssc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sscKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sscKeyTyped(evt);
            }
        });

        hum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                humKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                humKeyTyped(evt);
            }
        });

        language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });
        language.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                languageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                languageKeyTyped(evt);
            }
        });

        research.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                researchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                researchKeyTyped(evt);
            }
        });

        jLabel247.setText("ABM 105");

        pe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                peKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                peKeyTyped(evt);
            }
        });

        jLabel248.setText("Philosophy 101");

        philo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                philoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                philoKeyTyped(evt);
            }
        });

        jLabel249.setText("ABM 106");

        spe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spe1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spe1KeyTyped(evt);
            }
        });

        jLabel250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel250.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel250MousePressed(evt);
            }
        });

        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel24.setText("Strand");

        jButton23.setText("Back");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abm12Layout = new javax.swing.GroupLayout(abm12);
        abm12.setLayout(abm12Layout);
        abm12Layout.setHorizontalGroup(
            abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm12Layout.createSequentialGroup()
                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abm12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(abm12Layout.createSequentialGroup()
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abm12Layout.createSequentialGroup()
                                        .addComponent(jLabel250)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel233)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel234))
                                    .addGroup(abm12Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm12Layout.createSequentialGroup()
                                                .addComponent(id10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm12Layout.createSequentialGroup()
                                                        .addComponent(jLabel238)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm12Layout.createSequentialGroup()
                                                        .addComponent(jLabel240)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm12Layout.createSequentialGroup()
                                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel237)
                                                    .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel235)
                                                        .addComponent(jLabel236)))
                                                .addGap(29, 29, 29)
                                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel239)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel24)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abm12Layout.createSequentialGroup()
                                        .addComponent(jLabel241)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm12Layout.createSequentialGroup()
                                        .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(abm12Layout.createSequentialGroup()
                                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel243)
                                                    .addComponent(jLabel242)
                                                    .addComponent(jLabel245))
                                                .addGap(23, 23, 23))
                                            .addGroup(abm12Layout.createSequentialGroup()
                                                .addComponent(jLabel248)
                                                .addGap(18, 18, 18)))
                                        .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(research, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(philo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel246)
                                    .addComponent(jLabel244)
                                    .addComponent(jLabel247)
                                    .addComponent(jLabel249))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addGap(134, 134, 134))
        );
        abm12Layout.setVerticalGroup(
            abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel250)
                    .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel233))
                    .addGroup(abm12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abm12Layout.createSequentialGroup()
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel238)
                                    .addComponent(jLabel24)
                                    .addComponent(specialization10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abm12Layout.createSequentialGroup()
                                        .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel239)
                                            .addComponent(grade_level10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel237))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abm12Layout.createSequentialGroup()
                                        .addComponent(section10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(abm12Layout.createSequentialGroup()
                                .addComponent(jLabel235)
                                .addGap(18, 18, 18)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel236)
                                    .addComponent(lastname10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel240)))))
                    .addGroup(abm12Layout.createSequentialGroup()
                        .addComponent(jLabel241)
                        .addGap(2, 2, 2)
                        .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abm12Layout.createSequentialGroup()
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel242)
                                    .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel244, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel243)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel247, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(research, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel245)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(philo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel248)))
                            .addGroup(abm12Layout.createSequentialGroup()
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel246))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spe1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel249))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(abm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton11)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(abm12, "card2");

        abm12table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel215.setBackground(new java.awt.Color(255, 255, 255));
        jLabel215.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(51, 153, 0));
        jLabel215.setText("Surname");

        abm12_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        abm12_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abm12_tableMouseClicked(evt);
            }
        });
        jScrollPane27.setViewportView(abm12_table);

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(51, 153, 0));
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jLabel216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel216.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel216MousePressed(evt);
            }
        });

        javax.swing.GroupLayout abm12tableLayout = new javax.swing.GroupLayout(abm12table);
        abm12table.setLayout(abm12tableLayout);
        abm12tableLayout.setHorizontalGroup(
            abm12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abm12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abm12tableLayout.createSequentialGroup()
                        .addComponent(jLabel216)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel215)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(abm12tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        abm12tableLayout.setVerticalGroup(
            abm12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abm12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abm12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel215)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel216))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(abm12table, "card2");

        techvoc12.setBackground(new java.awt.Color(255, 255, 255));
        techvoc12.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel251.setBackground(new java.awt.Color(255, 255, 255));
        jLabel251.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel251.setForeground(new java.awt.Color(51, 153, 0));
        jLabel251.setText("Surname");

        grade12techvoc_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade12techvoc_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade12techvoc_tableMouseClicked(evt);
            }
        });
        jScrollPane29.setViewportView(grade12techvoc_table);

        jLabel252.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel252.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel252MousePressed(evt);
            }
        });

        jLabel253.setText("ID NO.");

        id11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id11ActionPerformed(evt);
            }
        });

        jLabel254.setText("Last Name");

        section11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section11ActionPerformed(evt);
            }
        });

        jLabel255.setText("First Name");

        lastname11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname11ActionPerformed(evt);
            }
        });

        jLabel256.setText("Middle Name");

        middlename11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename11ActionPerformed(evt);
            }
        });

        jLabel257.setText("Grade Level");

        grade_level11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level11ActionPerformed(evt);
            }
        });

        jLabel258.setText("Section");

        firstname11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname11ActionPerformed(evt);
            }
        });

        jLabel259.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(51, 153, 0));
        jLabel259.setText("Subjects");

        jLabel260.setText("Language 105");

        jLabel261.setText("HUM 101");

        jLabel262.setText("SSC 101");

        jLabel263.setText("Research 102");

        jLabel264.setText("PEH 101");

        spe2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spe2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spe2KeyTyped(evt);
            }
        });

        ssc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ssc1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ssc1KeyTyped(evt);
            }
        });

        hum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hum1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hum1KeyTyped(evt);
            }
        });

        language1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                language1ActionPerformed(evt);
            }
        });
        language1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                language1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                language1KeyTyped(evt);
            }
        });

        research1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                research1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                research1KeyTyped(evt);
            }
        });

        jLabel265.setText("SPEC 105");

        pe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pe1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pe1KeyTyped(evt);
            }
        });

        jLabel266.setText("Philosophy 101");

        philo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                philo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                philo1KeyTyped(evt);
            }
        });

        jLabel267.setText("SPEC 106");

        spe3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spe3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spe3KeyTyped(evt);
            }
        });

        jLabel268.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel268.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel268MousePressed(evt);
            }
        });

        jButton12.setText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel25.setText("Strand");

        jButton24.setText("Back");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout techvoc12Layout = new javax.swing.GroupLayout(techvoc12);
        techvoc12.setLayout(techvoc12Layout);
        techvoc12Layout.setHorizontalGroup(
            techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc12Layout.createSequentialGroup()
                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(techvoc12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(techvoc12Layout.createSequentialGroup()
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(techvoc12Layout.createSequentialGroup()
                                        .addComponent(jLabel268)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel251)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel252))
                                    .addGroup(techvoc12Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc12Layout.createSequentialGroup()
                                                .addComponent(id11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc12Layout.createSequentialGroup()
                                                        .addComponent(jLabel256)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc12Layout.createSequentialGroup()
                                                        .addComponent(jLabel258)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc12Layout.createSequentialGroup()
                                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel255)
                                                    .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel253)
                                                        .addComponent(jLabel254)))
                                                .addGap(29, 29, 29)
                                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel257)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(techvoc12Layout.createSequentialGroup()
                                        .addComponent(jLabel259)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc12Layout.createSequentialGroup()
                                        .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(techvoc12Layout.createSequentialGroup()
                                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel261)
                                                    .addComponent(jLabel260)
                                                    .addComponent(jLabel263))
                                                .addGap(23, 23, 23))
                                            .addGroup(techvoc12Layout.createSequentialGroup()
                                                .addComponent(jLabel266)
                                                .addGap(18, 18, 18)))
                                        .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(language1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hum1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(research1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(philo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel264)
                                    .addComponent(jLabel262)
                                    .addComponent(jLabel265)
                                    .addComponent(jLabel267))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssc1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pe1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24)
                .addGap(129, 129, 129))
        );
        techvoc12Layout.setVerticalGroup(
            techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel268)
                    .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel251))
                    .addGroup(techvoc12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(techvoc12Layout.createSequentialGroup()
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel256)
                                    .addComponent(jLabel25)
                                    .addComponent(specialization11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(techvoc12Layout.createSequentialGroup()
                                        .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel257)
                                            .addComponent(grade_level11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel255))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc12Layout.createSequentialGroup()
                                        .addComponent(section11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(techvoc12Layout.createSequentialGroup()
                                .addComponent(jLabel253)
                                .addGap(18, 18, 18)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel254)
                                    .addComponent(lastname11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel258)))))
                    .addGroup(techvoc12Layout.createSequentialGroup()
                        .addComponent(jLabel259)
                        .addGap(2, 2, 2)
                        .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(techvoc12Layout.createSequentialGroup()
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel260)
                                    .addComponent(language1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel262, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hum1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel261)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel265, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(research1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel263)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(philo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel266)))
                            .addGroup(techvoc12Layout.createSequentialGroup()
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pe1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel264))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spe2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spe3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel267))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(techvoc12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(techvoc12, "card2");

        techvoc12table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel217.setBackground(new java.awt.Color(255, 255, 255));
        jLabel217.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(51, 153, 0));
        jLabel217.setText("Surname");

        techvoc12_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        techvoc12_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                techvoc12_tableMouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(techvoc12_table);

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(51, 153, 0));
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jLabel218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel218.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel218MousePressed(evt);
            }
        });

        javax.swing.GroupLayout techvoc12tableLayout = new javax.swing.GroupLayout(techvoc12table);
        techvoc12table.setLayout(techvoc12tableLayout);
        techvoc12tableLayout.setHorizontalGroup(
            techvoc12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(techvoc12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(techvoc12tableLayout.createSequentialGroup()
                        .addComponent(jLabel218)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel217)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(techvoc12tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        techvoc12tableLayout.setVerticalGroup(
            techvoc12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(techvoc12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(techvoc12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel217)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel218))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(techvoc12table, "card2");

        stem12.setBackground(new java.awt.Color(255, 255, 255));
        stem12.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel269.setBackground(new java.awt.Color(255, 255, 255));
        jLabel269.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel269.setForeground(new java.awt.Color(51, 153, 0));
        jLabel269.setText("Surname");

        grade12stem_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade12stem_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade12stem_tableMouseClicked(evt);
            }
        });
        jScrollPane31.setViewportView(grade12stem_table);

        jLabel270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel270.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel270MousePressed(evt);
            }
        });

        jLabel271.setText("ID NO.");

        id12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id12ActionPerformed(evt);
            }
        });

        jLabel272.setText("Last Name");

        section12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section12ActionPerformed(evt);
            }
        });

        jLabel273.setText("First Name");

        lastname12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname12ActionPerformed(evt);
            }
        });

        jLabel274.setText("Middle Name");

        middlename12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename12ActionPerformed(evt);
            }
        });

        jLabel275.setText("Grade Level");

        grade_level12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level12ActionPerformed(evt);
            }
        });

        jLabel276.setText("Section");

        firstname12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname12ActionPerformed(evt);
            }
        });

        jLabel277.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel277.setForeground(new java.awt.Color(51, 153, 0));
        jLabel277.setText("Subjects");

        jLabel278.setText("Language 105");

        jLabel279.setText("HUM 101");

        jLabel280.setText("SSC 101");

        jLabel281.setText("Research 102");

        jLabel282.setText("PEH 101");

        spe4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spe4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spe4KeyTyped(evt);
            }
        });

        ssc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ssc2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ssc2KeyTyped(evt);
            }
        });

        hum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hum2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hum2KeyTyped(evt);
            }
        });

        language2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                language2ActionPerformed(evt);
            }
        });
        language2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                language2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                language2KeyTyped(evt);
            }
        });

        research2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                research2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                research2KeyTyped(evt);
            }
        });

        jLabel283.setText("STEM 105");

        pe2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pe2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pe2KeyTyped(evt);
            }
        });

        jLabel284.setText("Philosophy 101");

        philo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                philo2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                philo2KeyTyped(evt);
            }
        });

        jLabel285.setText("STEM 106");

        spe5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spe5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spe5KeyTyped(evt);
            }
        });

        jLabel286.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel286.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel286MousePressed(evt);
            }
        });

        jButton13.setText("Save");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel26.setText("Strand");

        jButton25.setText("Back");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stem12Layout = new javax.swing.GroupLayout(stem12);
        stem12.setLayout(stem12Layout);
        stem12Layout.setHorizontalGroup(
            stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem12Layout.createSequentialGroup()
                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(stem12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(stem12Layout.createSequentialGroup()
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(stem12Layout.createSequentialGroup()
                                        .addComponent(jLabel286)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel269)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel270))
                                    .addGroup(stem12Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem12Layout.createSequentialGroup()
                                                .addComponent(id12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem12Layout.createSequentialGroup()
                                                        .addComponent(jLabel274)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem12Layout.createSequentialGroup()
                                                        .addComponent(jLabel276)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem12Layout.createSequentialGroup()
                                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel273)
                                                    .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel271)
                                                        .addComponent(jLabel272)))
                                                .addGap(29, 29, 29)
                                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel275)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(stem12Layout.createSequentialGroup()
                                        .addComponent(jLabel277)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem12Layout.createSequentialGroup()
                                        .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(stem12Layout.createSequentialGroup()
                                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel279)
                                                    .addComponent(jLabel278)
                                                    .addComponent(jLabel281))
                                                .addGap(23, 23, 23))
                                            .addGroup(stem12Layout.createSequentialGroup()
                                                .addComponent(jLabel284)
                                                .addGap(18, 18, 18)))
                                        .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(language2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hum2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(research2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(philo2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel282)
                                    .addComponent(jLabel280)
                                    .addComponent(jLabel283)
                                    .addComponent(jLabel285))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssc2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pe2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton25)
                .addGap(129, 129, 129))
        );
        stem12Layout.setVerticalGroup(
            stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel286)
                    .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel270, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel269))
                    .addGroup(stem12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stem12Layout.createSequentialGroup()
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel274)
                                    .addComponent(jLabel26)
                                    .addComponent(specialization12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(stem12Layout.createSequentialGroup()
                                        .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel275)
                                            .addComponent(grade_level12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel273))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem12Layout.createSequentialGroup()
                                        .addComponent(section12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(stem12Layout.createSequentialGroup()
                                .addComponent(jLabel271)
                                .addGap(18, 18, 18)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel272)
                                    .addComponent(lastname12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel276)))))
                    .addGroup(stem12Layout.createSequentialGroup()
                        .addComponent(jLabel277)
                        .addGap(2, 2, 2)
                        .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stem12Layout.createSequentialGroup()
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel278)
                                    .addComponent(language2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel280, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hum2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel279)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel283, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(research2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel281)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(philo2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel284)))
                            .addGroup(stem12Layout.createSequentialGroup()
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pe2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel282))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssc2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spe4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spe5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel285))))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(stem12, "card2");

        stem12table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel219.setBackground(new java.awt.Color(255, 255, 255));
        jLabel219.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(51, 153, 0));
        jLabel219.setText("Surname");

        stem12_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        stem12_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stem12_tableMouseClicked(evt);
            }
        });
        jScrollPane32.setViewportView(stem12_table);

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(51, 153, 0));
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jLabel220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel220.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel220MousePressed(evt);
            }
        });

        javax.swing.GroupLayout stem12tableLayout = new javax.swing.GroupLayout(stem12table);
        stem12table.setLayout(stem12tableLayout);
        stem12tableLayout.setHorizontalGroup(
            stem12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stem12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stem12tableLayout.createSequentialGroup()
                        .addComponent(jLabel220)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel219)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(stem12tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        stem12tableLayout.setVerticalGroup(
            stem12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stem12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stem12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel219)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel220))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(stem12table, "card2");

        humss12.setBackground(new java.awt.Color(255, 255, 255));
        humss12.setMinimumSize(new java.awt.Dimension(1242, 697));

        jLabel287.setBackground(new java.awt.Color(255, 255, 255));
        jLabel287.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel287.setForeground(new java.awt.Color(51, 153, 0));
        jLabel287.setText("Surname");

        grade12humss_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grade12humss_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grade12humss_tableMouseClicked(evt);
            }
        });
        jScrollPane33.setViewportView(grade12humss_table);

        jLabel288.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_20px.png"))); // NOI18N
        jLabel288.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel288MousePressed(evt);
            }
        });

        jLabel289.setText("ID NO.");

        id13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id13ActionPerformed(evt);
            }
        });

        jLabel290.setText("Last Name");

        section13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section13ActionPerformed(evt);
            }
        });

        jLabel291.setText("First Name");

        lastname13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname13ActionPerformed(evt);
            }
        });

        jLabel292.setText("Middle Name");

        middlename13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlename13ActionPerformed(evt);
            }
        });

        jLabel293.setText("Grade Level");

        grade_level13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_level13ActionPerformed(evt);
            }
        });

        jLabel294.setText("Section");

        firstname13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname13ActionPerformed(evt);
            }
        });

        jLabel295.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel295.setForeground(new java.awt.Color(51, 153, 0));
        jLabel295.setText("Subjects");

        jLabel296.setText("Language 105");

        jLabel297.setText("HUM 101");

        jLabel298.setText("SSC 101");

        jLabel299.setText("Research 102");

        jLabel300.setText("PEH 101");

        spe6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spe6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spe6KeyTyped(evt);
            }
        });

        ssc3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ssc3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ssc3KeyTyped(evt);
            }
        });

        hum3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hum3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hum3KeyTyped(evt);
            }
        });

        language3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                language3ActionPerformed(evt);
            }
        });
        language3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                language3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                language3KeyTyped(evt);
            }
        });

        research3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                research3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                research3KeyTyped(evt);
            }
        });

        jLabel301.setText("HSS 105");

        pe3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pe3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pe3KeyTyped(evt);
            }
        });

        jLabel302.setText("Philosophy 101");

        philo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                philo3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                philo3KeyTyped(evt);
            }
        });

        jLabel303.setText("HSS 106");

        spe7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spe7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spe7KeyTyped(evt);
            }
        });

        jLabel304.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel304.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel304MousePressed(evt);
            }
        });

        jButton14.setText("Save");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel27.setText("Strand");

        jButton26.setText("Back");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout humss12Layout = new javax.swing.GroupLayout(humss12);
        humss12.setLayout(humss12Layout);
        humss12Layout.setHorizontalGroup(
            humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss12Layout.createSequentialGroup()
                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalgrade13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(humss12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                            .addGroup(humss12Layout.createSequentialGroup()
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(humss12Layout.createSequentialGroup()
                                        .addComponent(jLabel304)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel287)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel288))
                                    .addGroup(humss12Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss12Layout.createSequentialGroup()
                                                .addComponent(id13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss12Layout.createSequentialGroup()
                                                        .addComponent(jLabel292)
                                                        .addGap(19, 19, 19)
                                                        .addComponent(middlename13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss12Layout.createSequentialGroup()
                                                        .addComponent(jLabel294)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(section13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss12Layout.createSequentialGroup()
                                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel291)
                                                    .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel289)
                                                        .addComponent(jLabel290)))
                                                .addGap(29, 29, 29)
                                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lastname13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstname13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel293)
                                                .addGap(26, 26, 26)
                                                .addComponent(grade_level13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel27)
                                        .addGap(18, 18, 18)
                                        .addComponent(specialization13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(humss12Layout.createSequentialGroup()
                                        .addComponent(jLabel295)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss12Layout.createSequentialGroup()
                                        .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(humss12Layout.createSequentialGroup()
                                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel297)
                                                    .addComponent(jLabel296)
                                                    .addComponent(jLabel299))
                                                .addGap(23, 23, 23))
                                            .addGroup(humss12Layout.createSequentialGroup()
                                                .addComponent(jLabel302)
                                                .addGap(18, 18, 18)))
                                        .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(language3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hum3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(research3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(philo3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel300)
                                    .addComponent(jLabel298)
                                    .addComponent(jLabel301)
                                    .addComponent(jLabel303))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssc3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spe7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pe3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26)
                .addGap(134, 134, 134))
        );
        humss12Layout.setVerticalGroup(
            humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel304)
                    .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel288, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel287))
                    .addGroup(humss12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(humss12Layout.createSequentialGroup()
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel292)
                                    .addComponent(jLabel27)
                                    .addComponent(specialization13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(humss12Layout.createSequentialGroup()
                                        .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel293)
                                            .addComponent(grade_level13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel291))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, humss12Layout.createSequentialGroup()
                                        .addComponent(section13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(humss12Layout.createSequentialGroup()
                                .addComponent(jLabel289)
                                .addGap(18, 18, 18)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel290)
                                    .addComponent(lastname13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel294)))))
                    .addGroup(humss12Layout.createSequentialGroup()
                        .addComponent(jLabel295)
                        .addGap(2, 2, 2)
                        .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(humss12Layout.createSequentialGroup()
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel296)
                                    .addComponent(language3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel298, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hum3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel297)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel301, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(research3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel299)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(philo3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel302)))
                            .addGroup(humss12Layout.createSequentialGroup()
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pe3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel300))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssc3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spe6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spe7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel303))))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(humss12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(finalgrade13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        center.add(humss12, "card2");

        humss12table.setBackground(new java.awt.Color(255, 255, 255));

        jLabel221.setBackground(new java.awt.Color(255, 255, 255));
        jLabel221.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(51, 153, 0));
        jLabel221.setText("Surname");

        humss12_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        humss12_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                humss12_tableMouseClicked(evt);
            }
        });
        jScrollPane34.setViewportView(humss12_table);

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(51, 153, 0));
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jLabel222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N
        jLabel222.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel222MousePressed(evt);
            }
        });

        javax.swing.GroupLayout humss12tableLayout = new javax.swing.GroupLayout(humss12table);
        humss12table.setLayout(humss12tableLayout);
        humss12tableLayout.setHorizontalGroup(
            humss12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(humss12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(humss12tableLayout.createSequentialGroup()
                        .addComponent(jLabel222)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel221)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(humss12tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        humss12tableLayout.setVerticalGroup(
            humss12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss12tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(humss12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(humss12tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel221)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel222))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        center.add(humss12table, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void grade7_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade7_tableMouseClicked
        int row = grade7_table.getSelectedRow();
        id.setText(grade7_table.getModel().getValueAt(row,4).toString());
        lastname.setText(grade7_table.getModel().getValueAt(row,2).toString());
        section.setText(grade7_table.getModel().getValueAt(row,0).toString());
        middlename.setText(grade7_table.getModel().getValueAt(row,1).toString());
        grade_level.setText(grade7_table.getModel().getValueAt(row,5).toString());
        firstname.setText(grade7_table.getModel().getValueAt(row,3).toString());

    }//GEN-LAST:event_grade7_tableMouseClicked

    private void jLabel30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(seventable);
        center.repaint();
        center.revalidate();
        
        seven_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel30MousePressed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        id.setEnabled(false);
    }//GEN-LAST:event_idActionPerformed

    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        section.setEnabled(false);
    }//GEN-LAST:event_sectionActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        lastname.setEnabled(false);
    }//GEN-LAST:event_lastnameActionPerformed

    private void middlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenameActionPerformed
        middlename.setEnabled(false);
    }//GEN-LAST:event_middlenameActionPerformed

    private void grade_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_levelActionPerformed
        grade_level.setEnabled(false);
    }//GEN-LAST:event_grade_levelActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        firstname.setEnabled(false);
    }//GEN-LAST:event_firstnameActionPerformed

    private void jLabel86MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MousePressed
 new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel86MousePressed

    private void seven_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seven_tableMouseClicked
           center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(seven);
        center.repaint();
        center.revalidate();
        
        int row = seven_table.getSelectedRow();
        id.setText(seven_table.getModel().getValueAt(row,0).toString());
        lastname.setText(seven_table.getModel().getValueAt(row,3).toString());
        firstname.setText(seven_table.getModel().getValueAt(row,1).toString());
        middlename.setText(seven_table.getModel().getValueAt(row,2).toString());
        grade_level.setText(seven_table.getModel().getValueAt(row,5).toString());
        section.setText(seven_table.getModel().getValueAt(row,4).toString());
    
    }//GEN-LAST:event_seven_tableMouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        String temp = jTextField2.getText()+ "%";
        String sql = "select * from Grade7 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            seven_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jLabel96MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel96MousePressed

    private void jLabel97MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel97MousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        String sql = "Select * from subjects_grade7";
        try
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            grade7_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(seven);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
      center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(eight);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(nine);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(ten);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel4MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       con = Connect.ConnectDB();
    }//GEN-LAST:event_formWindowOpened

    private void engKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engKeyTyped
                
    }//GEN-LAST:event_engKeyTyped

    private void mathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mathKeyTyped
       
    }//GEN-LAST:event_mathKeyTyped

    private void filKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filKeyTyped
      
    }//GEN-LAST:event_filKeyTyped

    private void tleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tleKeyTyped
       
    }//GEN-LAST:event_tleKeyTyped

    private void apKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apKeyTyped
       
    }//GEN-LAST:event_apKeyTyped

    private void sciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sciKeyTyped
        
    }//GEN-LAST:event_sciKeyTyped

    private void mapehKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapehKeyTyped
      
    }//GEN-LAST:event_mapehKeyTyped

    private void ictKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ictKeyTyped
    
    }//GEN-LAST:event_ictKeyTyped

    private void rveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rveKeyTyped
      
    }//GEN-LAST:event_rveKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "insert into subjects_grade7 ("
	+"ID,"
	+"English,"
        +"Filipino,"
	+"Math,"
	+"Science,"
	+"Araling_Panlipunan,"
	+"RVE,"
        +"MAPEH,"                          
        +"TLE,"
        +"ICT,"
        +"Final_Grade)"
	+"values ('"+id.getText()+"','"+eng.getText() +"','"+fil.getText()+"',"
                          + " '"+math.getText()+"', '"+ sci.getText()+"', '"+ ap.getText()+"', '"+ rve.getText() +"',"
                          + " '"+mapeh.getText() +"', '"+tle.getText() +"','"+ict.getText()+"', '"+finalgrade.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade7_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void engKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engKeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_engKeyReleased

    private void mathKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mathKeyReleased
      String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_mathKeyReleased

    private void filKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filKeyReleased
        String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_filKeyReleased

    private void tleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tleKeyReleased
        String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_tleKeyReleased

    private void apKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apKeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_apKeyReleased

    private void sciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sciKeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_sciKeyReleased

    private void mapehKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapehKeyReleased
      String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_mapehKeyReleased

    private void ictKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ictKeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_ictKeyReleased

    private void rveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rveKeyReleased
      String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng.getText());
    panlipunan = Double.parseDouble(ap.getText());
    science = Double.parseDouble(sci.getText());
    it = Double.parseDouble(ict.getText()); 
    filipino = Double.parseDouble(fil.getText());
    religion = Double.parseDouble(rve.getText());
    mathematics = Double.parseDouble(math.getText());
    MAPEH = Double.parseDouble(mapeh.getText()); 
    TLE = Double.parseDouble(tle.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade.setText(total);
    }//GEN-LAST:event_rveKeyReleased

    private void engActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engActionPerformed

    private void grade8_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade8_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade8_tableMouseClicked

    private void jLabel31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MousePressed
      center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(eighttable);
        center.repaint();
        center.revalidate();
        
        eight_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel31MousePressed

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void section1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section1ActionPerformed

    private void lastname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname1ActionPerformed

    private void middlename1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename1ActionPerformed

    private void grade_level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level1ActionPerformed

    private void firstname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname1ActionPerformed

    private void mapeh1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapeh1KeyReleased
        String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_mapeh1KeyReleased

    private void mapeh1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapeh1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_mapeh1KeyTyped

    private void sci1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sci1KeyReleased
        String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_sci1KeyReleased

    private void sci1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sci1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sci1KeyTyped

    private void math1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math1KeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_math1KeyReleased

    private void math1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_math1KeyTyped

    private void eng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eng1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eng1ActionPerformed

    private void eng1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eng1KeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_eng1KeyReleased

    private void eng1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eng1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_eng1KeyTyped

    private void fil1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fil1KeyReleased
    String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_fil1KeyReleased

    private void fil1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fil1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fil1KeyTyped

    private void rve1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve1KeyReleased
        String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_rve1KeyReleased

    private void rve1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve1KeyTyped

    private void ap1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap1KeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_ap1KeyReleased

    private void ap1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ap1KeyTyped

    private void tle1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tle1KeyReleased
        String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_tle1KeyReleased

    private void tle1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tle1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tle1KeyTyped

    private void ict1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ict1KeyReleased
       String total;
                Double b, c, english, panlipunan, science, it, filipino, religion, mathematics, MAPEH, TLE;   
                
    english = Double.parseDouble(eng1.getText());
    panlipunan = Double.parseDouble(ap1.getText());
    science = Double.parseDouble(sci1.getText());
    it = Double.parseDouble(ict1.getText()); 
    filipino = Double.parseDouble(fil1.getText());
    religion = Double.parseDouble(rve1.getText());
    mathematics = Double.parseDouble(math1.getText());
    MAPEH = Double.parseDouble(mapeh1.getText()); 
    TLE = Double.parseDouble(tle1.getText()); 
    
        b = english + panlipunan + science + it + filipino + religion + mathematics + MAPEH + TLE;
        c = b /9;
        total = String.format("%.0f", c);
        finalgrade1.setText(total);
    }//GEN-LAST:event_ict1KeyReleased

    private void ict1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ict1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ict1KeyTyped

    private void jLabel99MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel99MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String sql = "insert into subjects_grade8 ("
	+"ID,"
	+"English,"
        +"Filipino,"
	+"Math,"
	+"Science,"
	+"Araling_Panlipunan,"
	+"RVE,"
        +"MAPEH,"                          
        +"TLE,"
        +"ICT,"
        +"Final_Grade)"
	+"values ('"+id1.getText()+"','"+eng1.getText() +"','"+fil1.getText()+"',"
                          + " '"+math1.getText()+"', '"+ sci1.getText()+"', '"+ ap1.getText()+"', '"+ rve1.getText() +"',"
                          + " '"+mapeh1.getText() +"', '"+tle1.getText() +"','"+ict1.getText()+"', '"+finalgrade1.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade8_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eight_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eight_tableMouseClicked
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(eight);
        center.repaint();
        center.revalidate();
        
        int row = eight_table.getSelectedRow();
        id1.setText(eight_table.getModel().getValueAt(row,0).toString());
        lastname1.setText(eight_table.getModel().getValueAt(row,3).toString());
        firstname1.setText(eight_table.getModel().getValueAt(row,1).toString());
        middlename1.setText(eight_table.getModel().getValueAt(row,2).toString());
        grade_level1.setText(eight_table.getModel().getValueAt(row,5).toString());
        section1.setText(eight_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_eight_tableMouseClicked

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
       String temp = jTextField3.getText()+ "%";
        String sql = "select * from Grade8 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            eight_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jLabel101MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel101MousePressed

    private void grade9_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade9_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade9_tableMouseClicked

    private void jLabel32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(ninetable);
        center.repaint();
        center.revalidate();
        
        nine_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel32MousePressed

    private void id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id2ActionPerformed

    private void section2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section2ActionPerformed

    private void lastname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname2ActionPerformed

    private void middlename2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename2ActionPerformed

    private void grade_level2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level2ActionPerformed

    private void firstname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname2ActionPerformed

    private void mapeh2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapeh2KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_mapeh2KeyReleased

    private void mapeh2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapeh2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_mapeh2KeyTyped

    private void rve2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve2KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_rve2KeyReleased

    private void rve2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve2KeyTyped

    private void math2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math2KeyReleased
       String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_math2KeyReleased

    private void math2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_math2KeyTyped

    private void eng2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eng2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eng2ActionPerformed

    private void eng2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eng2KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_eng2KeyReleased

    private void eng2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eng2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_eng2KeyTyped

    private void fil2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fil2KeyReleased
      String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_fil2KeyReleased

    private void fil2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fil2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fil2KeyTyped

    private void ap2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap2KeyReleased
       String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_ap2KeyReleased

    private void ap2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ap2KeyTyped

    private void sci2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sci2KeyReleased
       String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_sci2KeyReleased

    private void sci2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sci2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sci2KeyTyped

    private void spec2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spec2KeyReleased
       String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng2.getText());
    panlipunan = Double.parseDouble(ap2.getText());
    science = Double.parseDouble(sci2.getText());
    specialization = Double.parseDouble(spec2.getText()); 
    filipino = Double.parseDouble(fil2.getText());
    religion = Double.parseDouble(rve2.getText());
    mathematics = Double.parseDouble(math2.getText());
    MAPEH = Double.parseDouble(mapeh2.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade2.setText(total);
    }//GEN-LAST:event_spec2KeyReleased

    private void spec2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spec2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spec2KeyTyped

    private void jLabel111MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel111MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String sql = "insert into subjects_grade9 ("
	+"ID,"
	+"English,"
        +"Filipino,"
	+"Math,"
	+"Science,"
	+"Araling_Panlipunan,"
	+"RVE,"
        +"MAPEH,"                          
        +"Specialization,"
        +"Final_Grade)"
	+"values ('"+id2.getText()+"','"+eng2.getText() +"','"+fil2.getText()+"',"
                          + " '"+math2.getText()+"', '"+ sci2.getText()+"', '"+ ap2.getText()+"', '"+ rve2.getText() +"',"
                          + " '"+mapeh2.getText() +"','"+spec2.getText()+"', '"+finalgrade2.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade9_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nine_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nine_tableMouseClicked
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(nine);
        center.repaint();
        center.revalidate();
        
        int row = nine_table.getSelectedRow();
        id2.setText(nine_table.getModel().getValueAt(row,0).toString());
        lastname2.setText(nine_table.getModel().getValueAt(row,3).toString());
        firstname2.setText(nine_table.getModel().getValueAt(row,1).toString());
        middlename2.setText(nine_table.getModel().getValueAt(row,2).toString());
        grade_level2.setText(nine_table.getModel().getValueAt(row,5).toString());
        section2.setText(nine_table.getModel().getValueAt(row,4).toString());
        specialization2.setText(nine_table.getModel().getValueAt(row,6).toString());
    }//GEN-LAST:event_nine_tableMouseClicked

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
       String temp = jTextField4.getText()+ "%";
        String sql = "select * from Grade9 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            nine_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jLabel113MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel113MousePressed

    private void grade10_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade10_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade10_tableMouseClicked

    private void jLabel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MousePressed
      center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(tentable);
        center.repaint();
        center.revalidate();
        
        ten_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel33MousePressed

    private void id3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id3ActionPerformed

    private void section3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section3ActionPerformed

    private void lastname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname3ActionPerformed

    private void middlename3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename3ActionPerformed

    private void grade_level3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level3ActionPerformed

    private void firstname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname3ActionPerformed

    private void mapeh3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapeh3KeyReleased
       String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_mapeh3KeyReleased

    private void mapeh3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mapeh3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_mapeh3KeyTyped

    private void rve3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve3KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_rve3KeyReleased

    private void rve3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve3KeyTyped

    private void math3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math3KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_math3KeyReleased

    private void math3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_math3KeyTyped

    private void eng3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eng3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eng3ActionPerformed

    private void eng3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eng3KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_eng3KeyReleased

    private void eng3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eng3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_eng3KeyTyped

    private void fil3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fil3KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_fil3KeyReleased

    private void fil3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fil3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fil3KeyTyped

    private void ap3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap3KeyReleased
     String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_ap3KeyReleased

    private void ap3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ap3KeyTyped

    private void sci3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sci3KeyReleased
        String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_sci3KeyReleased

    private void sci3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sci3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sci3KeyTyped

    private void spec3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spec3KeyReleased
       String total;
                Double b, c, english, panlipunan, science, specialization, filipino, religion, mathematics, MAPEH;   
                
    english = Double.parseDouble(eng3.getText());
    panlipunan = Double.parseDouble(ap3.getText());
    science = Double.parseDouble(sci3.getText());
    specialization = Double.parseDouble(spec3.getText()); 
    filipino = Double.parseDouble(fil3.getText());
    religion = Double.parseDouble(rve3.getText());
    mathematics = Double.parseDouble(math3.getText());
    MAPEH = Double.parseDouble(mapeh3.getText()); 
    
        b = english + panlipunan + science + specialization + filipino + religion + mathematics + MAPEH;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade3.setText(total);
    }//GEN-LAST:event_spec3KeyReleased

    private void spec3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spec3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spec3KeyTyped

    private void jLabel121MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel121MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String sql = "insert into subjects_grade10 ("
	+"ID,"
	+"English,"
        +"Filipino,"
	+"Math,"
	+"Science,"
	+"Araling_Panlipunan,"
	+"RVE,"
        +"MAPEH,"                          
        +"Specialization,"
        +"Final_Grade)"
	+"values ('"+id3.getText()+"','"+eng3.getText() +"','"+fil3.getText()+"',"
                          + " '"+math3.getText()+"', '"+ sci3.getText()+"', '"+ ap3.getText()+"', '"+ rve3.getText() +"',"
                          + " '"+mapeh3.getText() +"','"+spec3.getText()+"', '"+finalgrade3.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade10_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ten_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ten_tableMouseClicked
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(ten);
        center.repaint();
        center.revalidate();
        
        int row = ten_table.getSelectedRow();
        id3.setText(ten_table.getModel().getValueAt(row,0).toString());
        lastname3.setText(ten_table.getModel().getValueAt(row,3).toString());
        firstname3.setText(ten_table.getModel().getValueAt(row,1).toString());
        middlename3.setText(ten_table.getModel().getValueAt(row,2).toString());
        grade_level3.setText(ten_table.getModel().getValueAt(row,5).toString());
        section3.setText(ten_table.getModel().getValueAt(row,4).toString());
        specialization3.setText(ten_table.getModel().getValueAt(row,6).toString());
    }//GEN-LAST:event_ten_tableMouseClicked

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
       String temp = jTextField5.getText()+ "%";
        String sql = "select * from Grade10 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            ten_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jLabel123MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel123MousePressed

    private void jLabel124MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel124MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(abm11);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(gas);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel8MousePressed

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(techvoc11);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(stem11);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel10MousePressed

    private void grade11abm_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade11abm_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade11abm_tableMouseClicked

    private void jLabel34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(abm11table);
        center.repaint();
        center.revalidate();
        
        abm11_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel34MousePressed

    private void id4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id4ActionPerformed

    private void section4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section4ActionPerformed

    private void lastname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname4ActionPerformed

    private void middlename4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename4ActionPerformed

    private void grade_level4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level4ActionPerformed

    private void firstname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname4ActionPerformed

    private void specialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_specialKeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_specialKeyReleased

    private void specialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_specialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_specialKeyTyped

    private void rve0KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve0KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_rve0KeyReleased

    private void rve0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve0KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve0KeyTyped

    private void lan2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan2KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_lan2KeyReleased

    private void lan2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan2KeyTyped

    private void lanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanActionPerformed

    private void lanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lanKeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_lanKeyReleased

    private void lanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lanKeyTyped

    private void matKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matKeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_matKeyReleased

    private void matKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_matKeyTyped

    private void pehKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pehKeyReleased
    String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_pehKeyReleased

    private void pehKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pehKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pehKeyTyped

    private void scieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scieKeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_scieKeyReleased

    private void scieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scieKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_scieKeyTyped

    private void special2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special2KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan.getText());
    lan102 = Double.parseDouble(lan2.getText());
    mat101 = Double.parseDouble(mat.getText());
    sci101 = Double.parseDouble(scie.getText()); 
    peh101 = Double.parseDouble(peh.getText());
    rve101 = Double.parseDouble(rve0.getText());
    specialization = Double.parseDouble(special.getText());
    specialization2 = Double.parseDouble(special2.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade4.setText(total);
    }//GEN-LAST:event_special2KeyReleased

    private void special2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special2KeyTyped

    private void jLabel133MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel133MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String sql = "insert into subjects_abm11 ("
	+"ID,"
	+"Language101,"
        +"Language102,"
	+"Mat101,"
	+"Science101,"
	+"PEH101,"
	+"RVE101,"
        +"ABM101,"                          
        +"ABM102,"
        +"Final_Grade)"
	+"values ('"+id4.getText()+"','"+lan.getText() +"','"+lan2.getText()+"',"
                          + " '"+mat.getText()+"', '"+ scie.getText()+"', '"+ peh.getText()+"', '"+ rve0.getText() +"',"
                          + " '"+special.getText() +"','"+special2.getText()+"', '"+finalgrade4.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade11abm_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void abm11_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abm11_tableMouseClicked
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(abm11);
        center.repaint();
        center.revalidate();
        
        int row = abm11_table.getSelectedRow();
        id4.setText(abm11_table.getModel().getValueAt(row,0).toString());
        lastname4.setText(abm11_table.getModel().getValueAt(row,3).toString());
        firstname4.setText(abm11_table.getModel().getValueAt(row,1).toString());
        middlename4.setText(abm11_table.getModel().getValueAt(row,2).toString());
        grade_level4.setText(abm11_table.getModel().getValueAt(row,6).toString());
        section4.setText(abm11_table.getModel().getValueAt(row,5).toString());
        specialization4.setText(abm11_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_abm11_tableMouseClicked

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        String temp = jTextField6.getText()+ "%";
        String sql = "select * from ABM11 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            abm11_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jLabel135MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel135MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel135MousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(grade11);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(grade12);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel6MousePressed

    private void grade11gas_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade11gas_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade11gas_tableMouseClicked

    private void jLabel35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(gastable);
        center.repaint();
        center.revalidate();
        
        gas11_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel35MousePressed

    private void id5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id5ActionPerformed

    private void section5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section5ActionPerformed

    private void lastname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname5ActionPerformed

    private void middlename5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename5ActionPerformed

    private void grade_level5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level5ActionPerformed

    private void firstname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname5ActionPerformed

    private void special1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special1KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_special1KeyReleased

    private void special1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special1KeyTyped

    private void rve4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve4KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_rve4KeyReleased

    private void rve4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve4KeyTyped

    private void lan3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan3KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_lan3KeyReleased

    private void lan3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan3KeyTyped

    private void lan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lan1ActionPerformed

    private void lan1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan1KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_lan1KeyReleased

    private void lan1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan1KeyTyped

    private void mat1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat1KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_mat1KeyReleased

    private void mat1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_mat1KeyTyped

    private void peh1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh1KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_peh1KeyReleased

    private void peh1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_peh1KeyTyped

    private void scie1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie1KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_scie1KeyReleased

    private void scie1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_scie1KeyTyped

    private void special3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special3KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan1.getText());
    lan102 = Double.parseDouble(lan3.getText());
    mat101 = Double.parseDouble(mat1.getText());
    sci101 = Double.parseDouble(scie1.getText()); 
    peh101 = Double.parseDouble(peh1.getText());
    rve101 = Double.parseDouble(rve4.getText());
    specialization = Double.parseDouble(special1.getText());
    specialization2 = Double.parseDouble(special3.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade5.setText(total);
    }//GEN-LAST:event_special3KeyReleased

    private void special3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special3KeyTyped

    private void jLabel151MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel151MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel151MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String sql = "insert into subjects_gas ("
	+"ID,"
	+"Language101,"
        +"Language102,"
	+"Mat101,"
	+"Science101,"
	+"PEH101,"
	+"RVE101,"
        +"GAS101,"                          
        +"GAS102,"
        +"Final_Grade)"
	+"values ('"+id5.getText()+"','"+lan1.getText() +"','"+lan3.getText()+"',"
                          + " '"+mat1.getText()+"', '"+ scie1.getText()+"', '"+ peh1.getText()+"', '"+ rve4.getText() +"',"
                          + " '"+special1.getText() +"','"+special3.getText()+"', '"+finalgrade5.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade11gas_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void gas11_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gas11_tableMouseClicked
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(gas);
        center.repaint();
        center.revalidate();
        
        int row = gas11_table.getSelectedRow();
        id5.setText(gas11_table.getModel().getValueAt(row,0).toString());
        lastname5.setText(gas11_table.getModel().getValueAt(row,3).toString());
        firstname5.setText(gas11_table.getModel().getValueAt(row,1).toString());
        middlename5.setText(gas11_table.getModel().getValueAt(row,2).toString());
        grade_level5.setText(gas11_table.getModel().getValueAt(row,6).toString());
        section5.setText(gas11_table.getModel().getValueAt(row,5).toString());
        specialization5.setText(gas11_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_gas11_tableMouseClicked

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
       String temp = jTextField7.getText()+ "%";
        String sql = "select * from GAS where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            gas11_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jLabel153MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel153MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel153MousePressed

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(humss11);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel11MousePressed

    private void grade11stem_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade11stem_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade11stem_tableMouseClicked

    private void jLabel155MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel155MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(stem11table);
        center.repaint();
        center.revalidate();
        
        stem11_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel155MousePressed

    private void id6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id6ActionPerformed

    private void section6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section6ActionPerformed

    private void lastname6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname6ActionPerformed

    private void middlename6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename6ActionPerformed

    private void grade_level6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level6ActionPerformed

    private void firstname6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname6ActionPerformed

    private void special4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special4KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_special4KeyReleased

    private void special4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special4KeyTyped

    private void rve5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve5KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_rve5KeyReleased

    private void rve5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve5KeyTyped

    private void lan4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan4KeyReleased
         String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_lan4KeyReleased

    private void lan4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan4KeyTyped

    private void lan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lan5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lan5ActionPerformed

    private void lan5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan5KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_lan5KeyReleased

    private void lan5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan5KeyTyped

    private void mat2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat2KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_mat2KeyReleased

    private void mat2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_mat2KeyTyped

    private void peh2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh2KeyReleased
         String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_peh2KeyReleased

    private void peh2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_peh2KeyTyped

    private void scie2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie2KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_scie2KeyReleased

    private void scie2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_scie2KeyTyped

    private void special5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special5KeyReleased
         String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan5.getText());
    lan102 = Double.parseDouble(lan4.getText());
    mat101 = Double.parseDouble(mat2.getText());
    sci101 = Double.parseDouble(scie2.getText()); 
    peh101 = Double.parseDouble(peh2.getText());
    rve101 = Double.parseDouble(rve5.getText());
    specialization = Double.parseDouble(special4.getText());
    specialization2 = Double.parseDouble(special5.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade6.setText(total);
    }//GEN-LAST:event_special5KeyReleased

    private void special5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special5KeyTyped

    private void jLabel171MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel171MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel171MousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      String sql = "insert into subjects_stem11 ("
	+"ID,"
	+"Language101,"
        +"Language102,"
	+"Mat101,"
	+"Science101,"
	+"PEH101,"
	+"RVE101,"
        +"STEM101,"                          
        +"STEM102,"
        +"Final_Grade)"
	+"values ('"+id6.getText()+"','"+lan5.getText() +"','"+lan4.getText()+"',"
                          + " '"+mat2.getText()+"', '"+ scie2.getText()+"', '"+ peh2.getText()+"', '"+ rve5.getText() +"',"
                          + " '"+special4.getText() +"','"+special5.getText()+"', '"+finalgrade6.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade11stem_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void stem11_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stem11_tableMouseClicked
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(stem11);
        center.repaint();
        center.revalidate();
        
        int row = stem11_table.getSelectedRow();
        id6.setText(stem11_table.getModel().getValueAt(row,0).toString());
        lastname6.setText(stem11_table.getModel().getValueAt(row,3).toString());
        firstname6.setText(stem11_table.getModel().getValueAt(row,1).toString());
        middlename6.setText(stem11_table.getModel().getValueAt(row,2).toString());
        grade_level6.setText(stem11_table.getModel().getValueAt(row,6).toString());
        section6.setText(stem11_table.getModel().getValueAt(row,5).toString());
        specialization6.setText(stem11_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_stem11_tableMouseClicked

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
      String temp = jTextField8.getText()+ "%";
        String sql = "select * from STEM11 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            stem11_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jLabel173MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel173MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel173MousePressed

    private void grade11humss_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade11humss_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade11humss_tableMouseClicked

    private void jLabel175MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel175MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(humss11table);
        center.repaint();
        center.revalidate();
        
        humss11_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel175MousePressed

    private void id7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id7ActionPerformed

    private void section7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section7ActionPerformed

    private void lastname7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname7ActionPerformed

    private void middlename7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename7ActionPerformed

    private void grade_level7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level7ActionPerformed

    private void firstname7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname7ActionPerformed

    private void special6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special6KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_special6KeyReleased

    private void special6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special6KeyTyped

    private void rve6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve6KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_rve6KeyReleased

    private void rve6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve6KeyTyped

    private void lan6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan6KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_lan6KeyReleased

    private void lan6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan6KeyTyped

    private void lan7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lan7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lan7ActionPerformed

    private void lan7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan7KeyReleased
      String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_lan7KeyReleased

    private void lan7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan7KeyTyped

    private void mat3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat3KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_mat3KeyReleased

    private void mat3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_mat3KeyTyped

    private void peh3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh3KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_peh3KeyReleased

    private void peh3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_peh3KeyTyped

    private void scie3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie3KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_scie3KeyReleased

    private void scie3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_scie3KeyTyped

    private void special7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special7KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan7.getText());
    lan102 = Double.parseDouble(lan6.getText());
    mat101 = Double.parseDouble(mat3.getText());
    sci101 = Double.parseDouble(scie3.getText()); 
    peh101 = Double.parseDouble(peh3.getText());
    rve101 = Double.parseDouble(rve6.getText());
    specialization = Double.parseDouble(special6.getText());
    specialization2 = Double.parseDouble(special7.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade7.setText(total);
    }//GEN-LAST:event_special7KeyReleased

    private void special7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special7KeyTyped

    private void jLabel191MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel191MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel191MousePressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String sql = "insert into subjects_humss11 ("
	+"ID,"
	+"Language101,"
        +"Language102,"
	+"Mat101,"
	+"Science101,"
	+"PEH101,"
	+"RVE101,"
        +"HSS101,"                          
        +"HSS102,"
        +"Final_Grade)"
	+"values ('"+id7.getText()+"','"+lan6.getText() +"','"+lan5.getText()+"',"
                          + " '"+mat3.getText()+"', '"+ scie3.getText()+"', '"+ peh3.getText()+"', '"+ rve6.getText() +"',"
                          + " '"+special6.getText() +"','"+special7.getText()+"', '"+finalgrade7.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade11humss_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void humss11_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humss11_tableMouseClicked
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(humss11);
        center.repaint();
        center.revalidate();
        
        int row = humss11_table.getSelectedRow();
        id7.setText(humss11_table.getModel().getValueAt(row,0).toString());
        lastname7.setText(humss11_table.getModel().getValueAt(row,3).toString());
        firstname7.setText(humss11_table.getModel().getValueAt(row,1).toString());
        middlename7.setText(humss11_table.getModel().getValueAt(row,2).toString());
        grade_level7.setText(humss11_table.getModel().getValueAt(row,6).toString());
        section7.setText(humss11_table.getModel().getValueAt(row,5).toString());
        specialization7.setText(humss11_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_humss11_tableMouseClicked

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
         String temp = jTextField9.getText()+ "%";
        String sql = "select * from HUMSS11 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            humss11_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jLabel193MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel193MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel193MousePressed

    private void grade11techvoc_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade11techvoc_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade11techvoc_tableMouseClicked

    private void jLabel195MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel195MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(techvoc11table);
        center.repaint();
        center.revalidate();
        
        techvoc11_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel195MousePressed

    private void id8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id8ActionPerformed

    private void section8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section8ActionPerformed

    private void lastname8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname8ActionPerformed

    private void middlename8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename8ActionPerformed

    private void grade_level8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level8ActionPerformed

    private void firstname8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname8ActionPerformed

    private void special8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special8KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_special8KeyReleased

    private void special8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special8KeyTyped

    private void rve7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve7KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_rve7KeyReleased

    private void rve7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rve7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rve7KeyTyped

    private void lan8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan8KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_lan8KeyReleased

    private void lan8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan8KeyTyped

    private void lan9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lan9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lan9ActionPerformed

    private void lan9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan9KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_lan9KeyReleased

    private void lan9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lan9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lan9KeyTyped

    private void mat4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat4KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_mat4KeyReleased

    private void mat4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mat4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_mat4KeyTyped

    private void peh4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh4KeyReleased
       String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_peh4KeyReleased

    private void peh4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peh4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_peh4KeyTyped

    private void scie4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie4KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_scie4KeyReleased

    private void scie4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scie4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_scie4KeyTyped

    private void special9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special9KeyReleased
        String total;
                Double b, c, lan101, lan102, mat101, sci101, peh101, rve101, specialization ,specialization2;   
                
    lan101 = Double.parseDouble(lan9.getText());
    lan102 = Double.parseDouble(lan8.getText());
    mat101 = Double.parseDouble(mat4.getText());
    sci101 = Double.parseDouble(scie4.getText()); 
    peh101 = Double.parseDouble(peh4.getText());
    rve101 = Double.parseDouble(rve7.getText());
    specialization = Double.parseDouble(special8.getText());
    specialization2 = Double.parseDouble(special9.getText()); 
    
        b = lan101 + lan102 + mat101 + sci101 + peh101 + rve101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade8.setText(total);
    }//GEN-LAST:event_special9KeyReleased

    private void special9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_special9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_special9KeyTyped

    private void jLabel211MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel211MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel211MousePressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       String sql = "insert into subjects_techvoc11 ("
	+"ID,"
	+"Language101,"
        +"Language102,"
	+"Mat101,"
	+"Science101,"
	+"PEH101,"
	+"RVE101,"
        +"SPEC101,"                          
        +"SPEC102,"
        +"Final_Grade)"
	+"values ('"+id8.getText()+"','"+lan9.getText() +"','"+lan8.getText()+"',"
                          + " '"+mat4.getText()+"', '"+ scie4.getText()+"', '"+ peh4.getText()+"', '"+ rve7.getText() +"',"
                          + " '"+special8.getText() +"','"+special9.getText()+"', '"+finalgrade8.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade11techvoc_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void techvoc11_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techvoc11_tableMouseClicked
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(techvoc11);
        center.repaint();
        center.revalidate();
        
        int row = techvoc11_table.getSelectedRow();
        id8.setText(techvoc11_table.getModel().getValueAt(row,0).toString());
        lastname8.setText(techvoc11_table.getModel().getValueAt(row,3).toString());
        firstname8.setText(techvoc11_table.getModel().getValueAt(row,1).toString());
        middlename8.setText(techvoc11_table.getModel().getValueAt(row,2).toString());
        grade_level8.setText(techvoc11_table.getModel().getValueAt(row,6).toString());
        section8.setText(techvoc11_table.getModel().getValueAt(row,5).toString());
        specialization8.setText(techvoc11_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_techvoc11_tableMouseClicked

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        String temp = jTextField10.getText()+ "%";
        String sql = "select * from Tech_Voc11 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            techvoc11_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jLabel213MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel213MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel213MousePressed

    private void jLabel214MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel214MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel214MousePressed

    private void jPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(abm12);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel12MousePressed

    private void jPanel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(techvoc12);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel13MousePressed

    private void jPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(stem12);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel15MousePressed

    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(abm12);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jPanel16MousePressed

    private void grade12abm_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade12abm_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade12abm_tableMouseClicked

    private void jLabel234MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel234MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(abm12table);
        center.repaint();
        center.revalidate();
        
        abm12_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel234MousePressed

    private void id10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id10ActionPerformed

    private void section10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section10ActionPerformed

    private void lastname10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname10ActionPerformed

    private void middlename10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename10ActionPerformed

    private void grade_level10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level10ActionPerformed

    private void firstname10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname10ActionPerformed

    private void speKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_speKeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_speKeyReleased

    private void speKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_speKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_speKeyTyped

    private void sscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sscKeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_sscKeyReleased

    private void sscKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sscKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sscKeyTyped

    private void humKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_humKeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_humKeyReleased

    private void humKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_humKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_humKeyTyped

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageActionPerformed

    private void languageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_languageKeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_languageKeyReleased

    private void languageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_languageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_languageKeyTyped

    private void researchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_researchKeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_researchKeyReleased

    private void researchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_researchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_researchKeyTyped

    private void peKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peKeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_peKeyReleased

    private void peKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_peKeyTyped

    private void philoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philoKeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_philoKeyReleased

    private void philoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_philoKeyTyped

    private void spe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe1KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language.getText());
    hum101 = Double.parseDouble(hum.getText());
    res102 = Double.parseDouble(research.getText());
    philo101 = Double.parseDouble(philo.getText()); 
    pe101 = Double.parseDouble(pe.getText());
    ssc101 = Double.parseDouble(ssc.getText());
    specialization = Double.parseDouble(spe.getText());
    specialization2 = Double.parseDouble(spe1.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade10.setText(total);
    }//GEN-LAST:event_spe1KeyReleased

    private void spe1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spe1KeyTyped

    private void jLabel250MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel250MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel250MousePressed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String sql = "insert into subjects_abm12 ("
	+"ID,"
	+"Language105,"
        +"Hum101,"
	+"Research102,"
	+"PEH102,"
	+"Philo101,"
	+"Ssc101,"
        +"ABM105,"                          
        +"ABM103,"
        +"Final_Grade)"
	+"values ('"+id10.getText()+"','"+language.getText() +"','"+hum.getText()+"',"
                          + " '"+research.getText()+"', '"+ pe.getText()+"', '"+ philo.getText()+"', '"+ ssc.getText() +"',"
                          + " '"+spe.getText() +"','"+spe1.getText()+"', '"+finalgrade10.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade12abm_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void abm12_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abm12_tableMouseClicked
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(abm12);
        center.repaint();
        center.revalidate();
        
        int row = abm12_table.getSelectedRow();
        id10.setText(abm12_table.getModel().getValueAt(row,0).toString());
        lastname10.setText(abm12_table.getModel().getValueAt(row,3).toString());
        firstname10.setText(abm12_table.getModel().getValueAt(row,1).toString());
        middlename10.setText(abm12_table.getModel().getValueAt(row,2).toString());
        grade_level10.setText(abm12_table.getModel().getValueAt(row,6).toString());
        section10.setText(abm12_table.getModel().getValueAt(row,5).toString());
        specialization10.setText(abm12_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_abm12_tableMouseClicked

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        String temp = jTextField11.getText()+ "%";
        String sql = "select * from ABM12 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            abm12_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jLabel216MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel216MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel216MousePressed

    private void grade12techvoc_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade12techvoc_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade12techvoc_tableMouseClicked

    private void jLabel252MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel252MousePressed
      center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(techvoc12table);
        center.repaint();
        center.revalidate();
        
       techvoc12_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel252MousePressed

    private void id11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id11ActionPerformed

    private void section11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section11ActionPerformed

    private void lastname11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname11ActionPerformed

    private void middlename11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename11ActionPerformed

    private void grade_level11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level11ActionPerformed

    private void firstname11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname11ActionPerformed

    private void spe2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe2KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_spe2KeyReleased

    private void spe2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spe2KeyTyped

    private void ssc1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssc1KeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_ssc1KeyReleased

    private void ssc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssc1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ssc1KeyTyped

    private void hum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hum1KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_hum1KeyReleased

    private void hum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hum1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_hum1KeyTyped

    private void language1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_language1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_language1ActionPerformed

    private void language1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_language1KeyReleased
      String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_language1KeyReleased

    private void language1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_language1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_language1KeyTyped

    private void research1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_research1KeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_research1KeyReleased

    private void research1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_research1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_research1KeyTyped

    private void pe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pe1KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_pe1KeyReleased

    private void pe1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pe1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pe1KeyTyped

    private void philo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philo1KeyReleased
      String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_philo1KeyReleased

    private void philo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_philo1KeyTyped

    private void spe3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe3KeyReleased
      String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language1.getText());
    hum101 = Double.parseDouble(hum1.getText());
    res102 = Double.parseDouble(research1.getText());
    philo101 = Double.parseDouble(philo1.getText()); 
    pe101 = Double.parseDouble(pe1.getText());
    ssc101 = Double.parseDouble(ssc1.getText());
    specialization = Double.parseDouble(spe2.getText());
    specialization2 = Double.parseDouble(spe3.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade11.setText(total);
    }//GEN-LAST:event_spe3KeyReleased

    private void spe3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spe3KeyTyped

    private void jLabel268MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel268MousePressed
         new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel268MousePressed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String sql = "insert into subjects_techvoc12 ("
	+"ID,"
	+"Language105,"
        +"Hum101,"
	+"Research102,"
	+"PEH102,"
	+"Philo101,"
	+"Ssc101,"
        +"SPEC105,"                          
        +"SPEC106,"
        +"Final_Grade)"
	+"values ('"+id11.getText()+"','"+language1.getText() +"','"+hum1.getText()+"',"
                          + " '"+research1.getText()+"', '"+ pe1.getText()+"', '"+ philo1.getText()+"', '"+ ssc1.getText() +"',"
                          + " '"+spe2.getText() +"','"+spe3.getText()+"', '"+finalgrade11.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade12techvoc_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton12ActionPerformed

    private void techvoc12_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techvoc12_tableMouseClicked
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(techvoc12);
        center.repaint();
        center.revalidate();
        
        int row = techvoc12_table.getSelectedRow();
        id11.setText(techvoc12_table.getModel().getValueAt(row,0).toString());
        lastname11.setText(techvoc12_table.getModel().getValueAt(row,3).toString());
        firstname11.setText(techvoc12_table.getModel().getValueAt(row,1).toString());
        middlename11.setText(techvoc12_table.getModel().getValueAt(row,2).toString());
        grade_level11.setText(techvoc12_table.getModel().getValueAt(row,6).toString());
        section11.setText(techvoc12_table.getModel().getValueAt(row,5).toString());
        specialization11.setText(techvoc12_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_techvoc12_tableMouseClicked

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        String temp = jTextField12.getText()+ "%";
        String sql = "select * from Tech_Voc12 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            techvoc12_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jLabel218MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel218MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel218MousePressed

    private void grade12stem_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade12stem_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade12stem_tableMouseClicked

    private void jLabel270MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel270MousePressed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(stem12table);
        center.repaint();
        center.revalidate();
        
       stem12_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel270MousePressed

    private void id12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id12ActionPerformed

    private void section12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section12ActionPerformed

    private void lastname12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname12ActionPerformed

    private void middlename12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename12ActionPerformed

    private void grade_level12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level12ActionPerformed

    private void firstname12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname12ActionPerformed

    private void spe4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe4KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_spe4KeyReleased

    private void spe4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spe4KeyTyped

    private void ssc2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssc2KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_ssc2KeyReleased

    private void ssc2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssc2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ssc2KeyTyped

    private void hum2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hum2KeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_hum2KeyReleased

    private void hum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hum2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_hum2KeyTyped

    private void language2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_language2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_language2ActionPerformed

    private void language2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_language2KeyReleased
      String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_language2KeyReleased

    private void language2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_language2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_language2KeyTyped

    private void research2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_research2KeyReleased
      String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_research2KeyReleased

    private void research2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_research2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_research2KeyTyped

    private void pe2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pe2KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_pe2KeyReleased

    private void pe2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pe2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pe2KeyTyped

    private void philo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philo2KeyReleased
     String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_philo2KeyReleased

    private void philo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philo2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_philo2KeyTyped

    private void spe5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe5KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language2.getText());
    hum101 = Double.parseDouble(hum2.getText());
    res102 = Double.parseDouble(research2.getText());
    philo101 = Double.parseDouble(philo2.getText()); 
    pe101 = Double.parseDouble(pe2.getText());
    ssc101 = Double.parseDouble(ssc2.getText());
    specialization = Double.parseDouble(spe4.getText());
    specialization2 = Double.parseDouble(spe5.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade12.setText(total);
    }//GEN-LAST:event_spe5KeyReleased

    private void spe5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spe5KeyTyped

    private void jLabel286MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel286MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel286MousePressed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String sql = "insert into subjects_stem12 ("
	+"ID,"
	+"Language105,"
        +"Hum101,"
	+"Research102,"
	+"PEH102,"
	+"Philo101,"
	+"Ssc101,"
        +"STEM105,"                          
        +"STEM106,"
        +"Final_Grade)"
	+"values ('"+id12.getText()+"','"+language2.getText() +"','"+hum2.getText()+"',"
                          + " '"+research2.getText()+"', '"+ pe2.getText()+"', '"+ philo2.getText()+"', '"+ ssc2.getText() +"',"
                          + " '"+spe4.getText() +"','"+spe5.getText()+"', '"+finalgrade12.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade12stem_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}
    }//GEN-LAST:event_jButton13ActionPerformed

    private void stem12_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stem12_tableMouseClicked
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(stem12);
        center.repaint();
        center.revalidate();
        
        int row = stem12_table.getSelectedRow();
        id12.setText(stem12_table.getModel().getValueAt(row,0).toString());
        lastname12.setText(stem12_table.getModel().getValueAt(row,3).toString());
        firstname12.setText(stem12_table.getModel().getValueAt(row,1).toString());
        middlename12.setText(stem12_table.getModel().getValueAt(row,2).toString());
        grade_level12.setText(stem12_table.getModel().getValueAt(row,6).toString());
        section12.setText(stem12_table.getModel().getValueAt(row,5).toString());
        specialization12.setText(stem12_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_stem12_tableMouseClicked

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        String temp = jTextField13.getText()+ "%";
        String sql = "select * from STEM12 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            stem12_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jLabel220MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel220MousePressed
       new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel220MousePressed

    private void grade12humss_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade12humss_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grade12humss_tableMouseClicked

    private void jLabel288MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel288MousePressed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(humss12table);
        center.repaint();
        center.revalidate();
        
       humss12_table();
        con = Connect.ConnectDB();
    }//GEN-LAST:event_jLabel288MousePressed

    private void id13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id13ActionPerformed

    private void section13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section13ActionPerformed

    private void lastname13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname13ActionPerformed

    private void middlename13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlename13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlename13ActionPerformed

    private void grade_level13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_level13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_level13ActionPerformed

    private void firstname13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname13ActionPerformed

    private void spe6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_spe6KeyReleased

    private void spe6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spe6KeyTyped

    private void ssc3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssc3KeyReleased
         String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language3.getText());
    hum101 = Double.parseDouble(hum3.getText());
    res102 = Double.parseDouble(research3.getText());
    philo101 = Double.parseDouble(philo3.getText()); 
    pe101 = Double.parseDouble(pe3.getText());
    ssc101 = Double.parseDouble(ssc3.getText());
    specialization = Double.parseDouble(spe6.getText());
    specialization2 = Double.parseDouble(spe7.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade13.setText(total);
    }//GEN-LAST:event_ssc3KeyReleased

    private void ssc3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssc3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ssc3KeyTyped

    private void hum3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hum3KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language3.getText());
    hum101 = Double.parseDouble(hum3.getText());
    res102 = Double.parseDouble(research3.getText());
    philo101 = Double.parseDouble(philo3.getText()); 
    pe101 = Double.parseDouble(pe3.getText());
    ssc101 = Double.parseDouble(ssc3.getText());
    specialization = Double.parseDouble(spe6.getText());
    specialization2 = Double.parseDouble(spe7.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade13.setText(total);
    }//GEN-LAST:event_hum3KeyReleased

    private void hum3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hum3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_hum3KeyTyped

    private void language3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_language3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_language3ActionPerformed

    private void language3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_language3KeyReleased
      String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language3.getText());
    hum101 = Double.parseDouble(hum3.getText());
    res102 = Double.parseDouble(research3.getText());
    philo101 = Double.parseDouble(philo3.getText()); 
    pe101 = Double.parseDouble(pe3.getText());
    ssc101 = Double.parseDouble(ssc3.getText());
    specialization = Double.parseDouble(spe6.getText());
    specialization2 = Double.parseDouble(spe7.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade13.setText(total);
    }//GEN-LAST:event_language3KeyReleased

    private void language3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_language3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_language3KeyTyped

    private void research3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_research3KeyReleased
       String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language3.getText());
    hum101 = Double.parseDouble(hum3.getText());
    res102 = Double.parseDouble(research3.getText());
    philo101 = Double.parseDouble(philo3.getText()); 
    pe101 = Double.parseDouble(pe3.getText());
    ssc101 = Double.parseDouble(ssc3.getText());
    specialization = Double.parseDouble(spe6.getText());
    specialization2 = Double.parseDouble(spe7.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade13.setText(total);
    }//GEN-LAST:event_research3KeyReleased

    private void research3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_research3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_research3KeyTyped

    private void pe3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pe3KeyReleased
         String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language3.getText());
    hum101 = Double.parseDouble(hum3.getText());
    res102 = Double.parseDouble(research3.getText());
    philo101 = Double.parseDouble(philo3.getText()); 
    pe101 = Double.parseDouble(pe3.getText());
    ssc101 = Double.parseDouble(ssc3.getText());
    specialization = Double.parseDouble(spe6.getText());
    specialization2 = Double.parseDouble(spe7.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade13.setText(total);
    }//GEN-LAST:event_pe3KeyReleased

    private void pe3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pe3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pe3KeyTyped

    private void philo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philo3KeyReleased
        String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language3.getText());
    hum101 = Double.parseDouble(hum3.getText());
    res102 = Double.parseDouble(research3.getText());
    philo101 = Double.parseDouble(philo3.getText()); 
    pe101 = Double.parseDouble(pe3.getText());
    ssc101 = Double.parseDouble(ssc3.getText());
    specialization = Double.parseDouble(spe6.getText());
    specialization2 = Double.parseDouble(spe7.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade13.setText(total);
    }//GEN-LAST:event_philo3KeyReleased

    private void philo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_philo3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_philo3KeyTyped

    private void spe7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe7KeyReleased
         String total;
                Double b, c, lan105, hum101, res102, philo101, pe101, ssc101, specialization ,specialization2;   
                
    lan105 = Double.parseDouble(language3.getText());
    hum101 = Double.parseDouble(hum3.getText());
    res102 = Double.parseDouble(research3.getText());
    philo101 = Double.parseDouble(philo3.getText()); 
    pe101 = Double.parseDouble(pe3.getText());
    ssc101 = Double.parseDouble(ssc3.getText());
    specialization = Double.parseDouble(spe6.getText());
    specialization2 = Double.parseDouble(spe7.getText()); 
    
        b = lan105 + hum101 + res102 + philo101 + pe101 + ssc101 + specialization + specialization2;
        c = b /8;
        total = String.format("%.0f", c);
        finalgrade13.setText(total);
    }//GEN-LAST:event_spe7KeyReleased

    private void spe7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spe7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_spe7KeyTyped

    private void jLabel304MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel304MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel304MousePressed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       String sql = "insert into subjects_humss12 ("
	+"ID,"
	+"Language105,"
        +"Hum101,"
	+"Research102,"
	+"PEH102,"
	+"Philo101,"
	+"Ssc101,"
        +"HSS105,"                          
        +"HSS106,"
        +"Final_Grade)"
	+"values ('"+id13.getText()+"','"+language3.getText() +"','"+hum3.getText()+"',"
                          + " '"+research3.getText()+"', '"+ pe3.getText()+"', '"+ philo3.getText()+"', '"+ ssc3.getText() +"',"
                          + " '"+spe6.getText() +"','"+spe7.getText()+"', '"+finalgrade13.getText() +"')";
	try
	{
                pst = con.prepareStatement(sql);
		pst.execute();
                 JOptionPane.showMessageDialog(null, "Saved");     
                 grade12humss_table();
                 clear();
	}  
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
	}                                       
    }//GEN-LAST:event_jButton14ActionPerformed

    private void humss12_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humss12_tableMouseClicked
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(humss12);
        center.repaint();
        center.revalidate();
        
        int row = humss12_table.getSelectedRow();
        id13.setText(humss12_table.getModel().getValueAt(row,0).toString());
        lastname13.setText(humss12_table.getModel().getValueAt(row,3).toString());
        firstname13.setText(humss12_table.getModel().getValueAt(row,1).toString());
        middlename13.setText(humss12_table.getModel().getValueAt(row,2).toString());
        grade_level13.setText(humss12_table.getModel().getValueAt(row,6).toString());
        section13.setText(humss12_table.getModel().getValueAt(row,5).toString());
        specialization13.setText(humss12_table.getModel().getValueAt(row,4).toString());
    }//GEN-LAST:event_humss12_tableMouseClicked

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
       String temp = jTextField14.getText()+ "%";
        String sql = "select * from HUMSS12 where Last_name like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            humss12_table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jLabel222MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel222MousePressed
        new TeacherPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel222MousePressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
           center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
         center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(select);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jButton26ActionPerformed

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
            java.util.logging.Logger.getLogger(entergrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entergrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entergrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entergrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entergrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abm11;
    private javax.swing.JTable abm11_table;
    private javax.swing.JPanel abm11table;
    private javax.swing.JPanel abm12;
    private javax.swing.JTable abm12_table;
    private javax.swing.JPanel abm12table;
    private javax.swing.JTextField ap;
    private javax.swing.JTextField ap1;
    private javax.swing.JTextField ap2;
    private javax.swing.JTextField ap3;
    private javax.swing.JPanel center;
    private javax.swing.JPanel eight;
    private javax.swing.JTable eight_table;
    private javax.swing.JPanel eighttable;
    private javax.swing.JTextField eng;
    private javax.swing.JTextField eng1;
    private javax.swing.JTextField eng2;
    private javax.swing.JTextField eng3;
    private javax.swing.JTextField fil;
    private javax.swing.JTextField fil1;
    private javax.swing.JTextField fil2;
    private javax.swing.JTextField fil3;
    private javax.swing.JTextField finalgrade;
    private javax.swing.JTextField finalgrade1;
    private javax.swing.JTextField finalgrade10;
    private javax.swing.JTextField finalgrade11;
    private javax.swing.JTextField finalgrade12;
    private javax.swing.JTextField finalgrade13;
    private javax.swing.JTextField finalgrade2;
    private javax.swing.JTextField finalgrade3;
    private javax.swing.JTextField finalgrade4;
    private javax.swing.JTextField finalgrade5;
    private javax.swing.JTextField finalgrade6;
    private javax.swing.JTextField finalgrade7;
    private javax.swing.JTextField finalgrade8;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField firstname1;
    private javax.swing.JTextField firstname10;
    private javax.swing.JTextField firstname11;
    private javax.swing.JTextField firstname12;
    private javax.swing.JTextField firstname13;
    private javax.swing.JTextField firstname2;
    private javax.swing.JTextField firstname3;
    private javax.swing.JTextField firstname4;
    private javax.swing.JTextField firstname5;
    private javax.swing.JTextField firstname6;
    private javax.swing.JTextField firstname7;
    private javax.swing.JTextField firstname8;
    private javax.swing.JPanel gas;
    private javax.swing.JTable gas11_table;
    private javax.swing.JPanel gastable;
    private javax.swing.JTable grade10_table;
    private javax.swing.JPanel grade11;
    private javax.swing.JTable grade11abm_table;
    private javax.swing.JTable grade11gas_table;
    private javax.swing.JTable grade11humss_table;
    private javax.swing.JTable grade11stem_table;
    private javax.swing.JTable grade11techvoc_table;
    private javax.swing.JPanel grade12;
    private javax.swing.JTable grade12abm_table;
    private javax.swing.JTable grade12humss_table;
    private javax.swing.JTable grade12stem_table;
    private javax.swing.JTable grade12techvoc_table;
    private javax.swing.JTable grade7_table;
    private javax.swing.JTable grade8_table;
    private javax.swing.JTable grade9_table;
    private javax.swing.JTextField grade_level;
    private javax.swing.JTextField grade_level1;
    private javax.swing.JTextField grade_level10;
    private javax.swing.JTextField grade_level11;
    private javax.swing.JTextField grade_level12;
    private javax.swing.JTextField grade_level13;
    private javax.swing.JTextField grade_level2;
    private javax.swing.JTextField grade_level3;
    private javax.swing.JTextField grade_level4;
    private javax.swing.JTextField grade_level5;
    private javax.swing.JTextField grade_level6;
    private javax.swing.JTextField grade_level7;
    private javax.swing.JTextField grade_level8;
    private javax.swing.JTextField hum;
    private javax.swing.JTextField hum1;
    private javax.swing.JTextField hum2;
    private javax.swing.JTextField hum3;
    private javax.swing.JPanel humss11;
    private javax.swing.JTable humss11_table;
    private javax.swing.JPanel humss11table;
    private javax.swing.JPanel humss12;
    private javax.swing.JTable humss12_table;
    private javax.swing.JPanel humss12table;
    private javax.swing.JTextField ict;
    private javax.swing.JTextField ict1;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JTextField id10;
    private javax.swing.JTextField id11;
    private javax.swing.JTextField id12;
    private javax.swing.JTextField id13;
    private javax.swing.JTextField id2;
    private javax.swing.JTextField id3;
    private javax.swing.JTextField id4;
    private javax.swing.JTextField id5;
    private javax.swing.JTextField id6;
    private javax.swing.JTextField id7;
    private javax.swing.JTextField id8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
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
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lan;
    private javax.swing.JTextField lan1;
    private javax.swing.JTextField lan2;
    private javax.swing.JTextField lan3;
    private javax.swing.JTextField lan4;
    private javax.swing.JTextField lan5;
    private javax.swing.JTextField lan6;
    private javax.swing.JTextField lan7;
    private javax.swing.JTextField lan8;
    private javax.swing.JTextField lan9;
    private javax.swing.JTextField language;
    private javax.swing.JTextField language1;
    private javax.swing.JTextField language2;
    private javax.swing.JTextField language3;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField lastname1;
    private javax.swing.JTextField lastname10;
    private javax.swing.JTextField lastname11;
    private javax.swing.JTextField lastname12;
    private javax.swing.JTextField lastname13;
    private javax.swing.JTextField lastname2;
    private javax.swing.JTextField lastname3;
    private javax.swing.JTextField lastname4;
    private javax.swing.JTextField lastname5;
    private javax.swing.JTextField lastname6;
    private javax.swing.JTextField lastname7;
    private javax.swing.JTextField lastname8;
    private javax.swing.JTextField mapeh;
    private javax.swing.JTextField mapeh1;
    private javax.swing.JTextField mapeh2;
    private javax.swing.JTextField mapeh3;
    private javax.swing.JTextField mat;
    private javax.swing.JTextField mat1;
    private javax.swing.JTextField mat2;
    private javax.swing.JTextField mat3;
    private javax.swing.JTextField mat4;
    private javax.swing.JTextField math;
    private javax.swing.JTextField math1;
    private javax.swing.JTextField math2;
    private javax.swing.JTextField math3;
    private javax.swing.JTextField middlename;
    private javax.swing.JTextField middlename1;
    private javax.swing.JTextField middlename10;
    private javax.swing.JTextField middlename11;
    private javax.swing.JTextField middlename12;
    private javax.swing.JTextField middlename13;
    private javax.swing.JTextField middlename2;
    private javax.swing.JTextField middlename3;
    private javax.swing.JTextField middlename4;
    private javax.swing.JTextField middlename5;
    private javax.swing.JTextField middlename6;
    private javax.swing.JTextField middlename7;
    private javax.swing.JTextField middlename8;
    private javax.swing.JPanel nine;
    private javax.swing.JTable nine_table;
    private javax.swing.JPanel ninetable;
    private javax.swing.JTextField pe;
    private javax.swing.JTextField pe1;
    private javax.swing.JTextField pe2;
    private javax.swing.JTextField pe3;
    private javax.swing.JTextField peh;
    private javax.swing.JTextField peh1;
    private javax.swing.JTextField peh2;
    private javax.swing.JTextField peh3;
    private javax.swing.JTextField peh4;
    private javax.swing.JTextField philo;
    private javax.swing.JTextField philo1;
    private javax.swing.JTextField philo2;
    private javax.swing.JTextField philo3;
    private javax.swing.JTextField research;
    private javax.swing.JTextField research1;
    private javax.swing.JTextField research2;
    private javax.swing.JTextField research3;
    private javax.swing.JTextField rve;
    private javax.swing.JTextField rve0;
    private javax.swing.JTextField rve1;
    private javax.swing.JTextField rve2;
    private javax.swing.JTextField rve3;
    private javax.swing.JTextField rve4;
    private javax.swing.JTextField rve5;
    private javax.swing.JTextField rve6;
    private javax.swing.JTextField rve7;
    private javax.swing.JTextField sci;
    private javax.swing.JTextField sci1;
    private javax.swing.JTextField sci2;
    private javax.swing.JTextField sci3;
    private javax.swing.JTextField scie;
    private javax.swing.JTextField scie1;
    private javax.swing.JTextField scie2;
    private javax.swing.JTextField scie3;
    private javax.swing.JTextField scie4;
    private javax.swing.JTextField section;
    private javax.swing.JTextField section1;
    private javax.swing.JTextField section10;
    private javax.swing.JTextField section11;
    private javax.swing.JTextField section12;
    private javax.swing.JTextField section13;
    private javax.swing.JTextField section2;
    private javax.swing.JTextField section3;
    private javax.swing.JTextField section4;
    private javax.swing.JTextField section5;
    private javax.swing.JTextField section6;
    private javax.swing.JTextField section7;
    private javax.swing.JTextField section8;
    private javax.swing.JPanel select;
    private javax.swing.JPanel seven;
    private javax.swing.JTable seven_table;
    private javax.swing.JPanel seventable;
    private javax.swing.JTextField spe;
    private javax.swing.JTextField spe1;
    private javax.swing.JTextField spe2;
    private javax.swing.JTextField spe3;
    private javax.swing.JTextField spe4;
    private javax.swing.JTextField spe5;
    private javax.swing.JTextField spe6;
    private javax.swing.JTextField spe7;
    private javax.swing.JTextField spec2;
    private javax.swing.JTextField spec3;
    private javax.swing.JTextField special;
    private javax.swing.JTextField special1;
    private javax.swing.JTextField special2;
    private javax.swing.JTextField special3;
    private javax.swing.JTextField special4;
    private javax.swing.JTextField special5;
    private javax.swing.JTextField special6;
    private javax.swing.JTextField special7;
    private javax.swing.JTextField special8;
    private javax.swing.JTextField special9;
    private javax.swing.JTextField specialization10;
    private javax.swing.JTextField specialization11;
    private javax.swing.JTextField specialization12;
    private javax.swing.JTextField specialization13;
    private javax.swing.JTextField specialization2;
    private javax.swing.JTextField specialization3;
    private javax.swing.JTextField specialization4;
    private javax.swing.JTextField specialization5;
    private javax.swing.JTextField specialization6;
    private javax.swing.JTextField specialization7;
    private javax.swing.JTextField specialization8;
    private javax.swing.JTextField ssc;
    private javax.swing.JTextField ssc1;
    private javax.swing.JTextField ssc2;
    private javax.swing.JTextField ssc3;
    private javax.swing.JPanel stem11;
    private javax.swing.JTable stem11_table;
    private javax.swing.JPanel stem11table;
    private javax.swing.JPanel stem12;
    private javax.swing.JTable stem12_table;
    private javax.swing.JPanel stem12table;
    private javax.swing.JPanel techvoc11;
    private javax.swing.JTable techvoc11_table;
    private javax.swing.JPanel techvoc11table;
    private javax.swing.JPanel techvoc12;
    private javax.swing.JTable techvoc12_table;
    private javax.swing.JPanel techvoc12table;
    private javax.swing.JPanel ten;
    private javax.swing.JTable ten_table;
    private javax.swing.JPanel tentable;
    private javax.swing.JTextField tle;
    private javax.swing.JTextField tle1;
    // End of variables declaration//GEN-END:variables
}
