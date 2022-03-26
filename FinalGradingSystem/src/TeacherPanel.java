import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TeacherPanel extends javax.swing.JFrame {
    Connection con = null; 
    ResultSet rs = null;
    PreparedStatement pst = null;
   
    
    public void students()
   {
       String sql = "Select * from MyStudents";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           mystud.setModel(DbUtils.resultSetToTableModel(rs));
           mystud.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    public void subjects()
   {
       String sql = "Select Subject_Code, Subject_Title, Quarter_Semester, Grade_Level from subjects";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           mysub.setModel(DbUtils.resultSetToTableModel(rs));
           mysub.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    public void accounts()
   {
       String sql = "Select * from Account";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           accounts.setModel(DbUtils.resultSetToTableModel(rs));
           accounts.setAutoCreateRowSorter(true);
           accounts.removeColumn(accounts.getColumnModel().getColumn(0));
           accounts.removeColumn(accounts.getColumnModel().getColumn(1));
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }

    public void grade7()
   {
       String sql = "Select * from Grade7";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           grade7.setModel(DbUtils.resultSetToTableModel(rs));
           grade7.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    
    public void grade8()
   {
       String sql = "Select * from Grade8";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           grade8.setModel(DbUtils.resultSetToTableModel(rs));
           grade8.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    
    public void grade9()
   {
       String sql = "Select * from Grade9";
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
    
     
    public void grade10()
   {
       String sql = "Select * from Grade10";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           grade10.setModel(DbUtils.resultSetToTableModel(rs));
           grade10.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    
   
    public void STEM_11()
   {
       String sql = "Select * from STEM11";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           stem.setModel(DbUtils.resultSetToTableModel(rs));
           stem.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
     public void STEM_12()
   {
       String sql = "Select * from STEM12";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           stem1.setModel(DbUtils.resultSetToTableModel(rs));
           stem1.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
     public void ABM_11()
   {
       String sql = "Select * from ABM11";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           abm.setModel(DbUtils.resultSetToTableModel(rs));
           abm.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    public void ABM_12()
   {
       String sql = "Select * from ABM12";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           abm1.setModel(DbUtils.resultSetToTableModel(rs));
           abm1.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
     
     public void GAS_11()
   {
       String sql = "Select * from GAS";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           gas.setModel(DbUtils.resultSetToTableModel(rs));
           gas.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
     
     
     public void HUMSS_11()
   {
       String sql = "Select * from HUMSS11";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
            humss.setModel(DbUtils.resultSetToTableModel(rs));
            humss.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
     
      public void HUMSS_12()
   {
       String sql = "Select * from HUMSS12";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
            humss1.setModel(DbUtils.resultSetToTableModel(rs));
            humss1.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
     
       public void TV_11()
   {
       String sql = "Select * from Tech_Voc11";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
            tv.setModel(DbUtils.resultSetToTableModel(rs));
            tv.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
      public void TV_12()
   {
       String sql = "Select * from Tech_Voc12";
       try
       {
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
            tv1.setModel(DbUtils.resultSetToTableModel(rs));
            tv1.setAutoCreateRowSorter(true);
    
       }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   }
    
    /**
     * Creates new form TeacherPanel
     */
    public TeacherPanel() {
        initComponents();
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        center = new javax.swing.JPanel();
        settingpanel = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        accounts = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        first = new javax.swing.JTextField();
        middle = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        studpanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        mystud = new javax.swing.JTable();
        jLabel71 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        addsubject = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel364 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        subjectcode = new javax.swing.JTextField();
        jLabel363 = new javax.swing.JLabel();
        subtitle = new javax.swing.JTextField();
        jLabel367 = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        jLabel369 = new javax.swing.JLabel();
        level = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel370 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel371 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        written = new javax.swing.JTextField();
        quarterly = new javax.swing.JTextField();
        performance = new javax.swing.JTextField();
        subpanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        mysub = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel361 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        hide_subjects = new javax.swing.JPanel();
        strand_13 = new javax.swing.JInternalFrame();
        jPanel16 = new javax.swing.JPanel();
        abm_15 = new javax.swing.JPanel();
        jLabel373 = new javax.swing.JLabel();
        stem_15 = new javax.swing.JPanel();
        jLabel374 = new javax.swing.JLabel();
        techvoc_15 = new javax.swing.JPanel();
        jLabel375 = new javax.swing.JLabel();
        humss_15 = new javax.swing.JPanel();
        jLabel376 = new javax.swing.JLabel();
        strand_14 = new javax.swing.JInternalFrame();
        jPanel34 = new javax.swing.JPanel();
        gas_13 = new javax.swing.JPanel();
        jLabel377 = new javax.swing.JLabel();
        abm_16 = new javax.swing.JPanel();
        jLabel378 = new javax.swing.JLabel();
        stem_16 = new javax.swing.JPanel();
        jLabel379 = new javax.swing.JLabel();
        techvoc_16 = new javax.swing.JPanel();
        jLabel380 = new javax.swing.JLabel();
        humss_16 = new javax.swing.JPanel();
        jLabel381 = new javax.swing.JLabel();
        gradelevel1 = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        Grade_13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        Grade_14 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        Grade_15 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        Grade_16 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        Grade_17 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        Grade_18 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        quarter = new javax.swing.JTextField();
        grade = new javax.swing.JTextField();
        idnumber = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        section = new javax.swing.JTextField();
        grade_level = new javax.swing.JTextField();
        specialization = new javax.swing.JTextField();
        Grade7 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grade7 = new javax.swing.JTable();
        Grade8 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grade8 = new javax.swing.JTable();
        Grade9 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grade9 = new javax.swing.JTable();
        Grade10 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        grade10 = new javax.swing.JTable();
        GAS_11 = new javax.swing.JPanel();
        jLabel341 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel342 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        gas = new javax.swing.JTable();
        HUMSS_11 = new javax.swing.JPanel();
        jLabel333 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel334 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        humss = new javax.swing.JTable();
        HUMSS_12 = new javax.swing.JPanel();
        jLabel337 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        humss1 = new javax.swing.JTable();
        STEM_11 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        stem = new javax.swing.JTable();
        STEM_12 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        stem1 = new javax.swing.JTable();
        ABM_11 = new javax.swing.JPanel();
        jLabel345 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        abm = new javax.swing.JTable();
        ABM_12 = new javax.swing.JPanel();
        jLabel349 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        abm1 = new javax.swing.JTable();
        TV_11 = new javax.swing.JPanel();
        jLabel353 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel354 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tv = new javax.swing.JTable();
        TV_12 = new javax.swing.JPanel();
        jLabel357 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel358 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tv1 = new javax.swing.JTable();
        dpanel = new javax.swing.JPanel();
        strand_12 = new javax.swing.JInternalFrame();
        jPanel14 = new javax.swing.JPanel();
        abm_14 = new javax.swing.JPanel();
        jLabel329 = new javax.swing.JLabel();
        stem_14 = new javax.swing.JPanel();
        jLabel330 = new javax.swing.JLabel();
        techvoc_14 = new javax.swing.JPanel();
        jLabel331 = new javax.swing.JLabel();
        humss_14 = new javax.swing.JPanel();
        jLabel332 = new javax.swing.JLabel();
        strand_11 = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        gas_12 = new javax.swing.JPanel();
        jLabel324 = new javax.swing.JLabel();
        abm_13 = new javax.swing.JPanel();
        jLabel325 = new javax.swing.JLabel();
        stem_13 = new javax.swing.JPanel();
        jLabel326 = new javax.swing.JLabel();
        techvoc_13 = new javax.swing.JPanel();
        jLabel327 = new javax.swing.JLabel();
        humss_13 = new javax.swing.JPanel();
        jLabel328 = new javax.swing.JLabel();
        gradelevel = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        Grade_10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Grade_9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Grade_7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Grade_11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Grade_12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        Grade_8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studcount = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        stud = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        subjects = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1253, 699));
        setPreferredSize(new java.awt.Dimension(1253, 699));
        setResizable(false);
        getContentPane().setLayout(null);

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setLayout(new java.awt.CardLayout());

        settingpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 153, 0));
        jLabel74.setText("SETTINGS");

        jPanel25.setBackground(new java.awt.Color(153, 153, 153));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_List_15px.png"))); // NOI18N

        jLabel76.setBackground(new java.awt.Color(102, 102, 102));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 102, 102));
        jLabel76.setText("SETTINGS");
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel76MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76))
                .addContainerGap())
        );

        accounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        accounts.getTableHeader().setReorderingAllowed(false);
        accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(accounts);

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        jLabel26.setText("ID Number");

        jLabel27.setText("Username");

        jLabel28.setText("First Name");

        jLabel30.setText("Middle Name");

        jLabel31.setText("Last Name");

        jLabel32.setText("Password");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Restart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel33.setText("Search (Last Name)");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingpanelLayout = new javax.swing.GroupLayout(settingpanel);
        settingpanel.setLayout(settingpanelLayout);
        settingpanelLayout.setHorizontalGroup(
            settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(settingpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingpanelLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(settingpanelLayout.createSequentialGroup()
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(settingpanelLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingpanelLayout.createSequentialGroup()
                                .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingpanelLayout.createSequentialGroup()
                                            .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel26))
                                            .addGap(31, 31, 31)
                                            .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingpanelLayout.createSequentialGroup()
                                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel32))
                                        .addGap(18, 18, 18)
                                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(middle)
                                            .addComponent(last)
                                            .addComponent(pass)))
                                    .addGroup(settingpanelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3)))
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        settingpanelLayout.setVerticalGroup(
            settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingpanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingpanelLayout.createSequentialGroup()
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27))
                            .addGroup(settingpanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(settingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        center.add(settingpanel, "card2");

        studpanel.setBackground(new java.awt.Color(255, 255, 255));
        studpanel.setLayout(null);

        mystud.setModel(new javax.swing.table.DefaultTableModel(
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
        mystud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mystudMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(mystud);

        studpanel.add(jScrollPane8);
        jScrollPane8.setBounds(12, 173, 950, 308);

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 153, 0));
        jLabel71.setText("MY STUDENTS");
        studpanel.add(jLabel71);
        jLabel71.setBounds(12, 49, 174, 29);

        jPanel24.setBackground(new java.awt.Color(153, 153, 153));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Students_15px.png"))); // NOI18N

        jLabel73.setBackground(new java.awt.Color(102, 102, 102));
        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("MY STUDENTS");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel73MousePressed(evt);
            }
        });

        jLabel372.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_20px.png"))); // NOI18N
        jLabel372.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel372MousePressed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel29.setText("Section");

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Delete_20px.png"))); // NOI18N
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel42MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addComponent(jLabel372)
                .addGap(23, 23, 23))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(jLabel372)
                    .addComponent(jLabel42)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73)
                        .addComponent(jTextField1)
                        .addComponent(jLabel29)))
                .addContainerGap())
        );

        studpanel.add(jPanel24);
        jPanel24.setBounds(0, 96, 990, 48);

        center.add(studpanel, "card2");

        addsubject.setBackground(new java.awt.Color(255, 255, 255));
        addsubject.setDoubleBuffered(false);

        jPanel33.setBackground(new java.awt.Color(153, 153, 153));

        jLabel364.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Book_15px.png"))); // NOI18N

        jLabel365.setBackground(new java.awt.Color(102, 102, 102));
        jLabel365.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel365.setForeground(new java.awt.Color(204, 255, 204));
        jLabel365.setText("MY SUBJECTS");
        jLabel365.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel365MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel364)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel365)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel366)
                .addGap(26, 26, 26))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel364)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel365)
                        .addComponent(jLabel366)))
                .addContainerGap())
        );

        jLabel368.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel368.setForeground(new java.awt.Color(51, 153, 0));
        jLabel368.setText("Subject Code");

        subjectcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel363.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel363.setForeground(new java.awt.Color(51, 153, 0));
        jLabel363.setText("Subject Title");

        subtitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel367.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel367.setForeground(new java.awt.Color(51, 153, 0));
        jLabel367.setText("Quarter/Semester");

        semester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel369.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel369.setForeground(new java.awt.Color(51, 153, 0));
        jLabel369.setText("Grade Level");

        level.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });

        jLabel370.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel370.setText("Save");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel370)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel370)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel15MousePressed(evt);
            }
        });

        jLabel371.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel371.setText("Reset");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel371)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel371)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 153, 0));
        jLabel78.setText("Percentage in Written Work");
        jLabel78.setToolTipText("");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 153, 0));
        jLabel79.setText("Percentage in Quarterly Assessment ");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 153, 0));
        jLabel80.setText("Percentage in Performance Task");

        written.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        quarterly.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        performance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout addsubjectLayout = new javax.swing.GroupLayout(addsubject);
        addsubject.setLayout(addsubjectLayout);
        addsubjectLayout.setHorizontalGroup(
            addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addsubjectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(addsubjectLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addsubjectLayout.createSequentialGroup()
                        .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel368)
                            .addComponent(jLabel363))
                        .addGap(61, 61, 61)
                        .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectcode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addsubjectLayout.createSequentialGroup()
                        .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel367)
                            .addComponent(jLabel369))
                        .addGap(27, 27, 27)
                        .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addsubjectLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(performance, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addsubjectLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(quarterly, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addsubjectLayout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(written, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        addsubjectLayout.setVerticalGroup(
            addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addsubjectLayout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel368)
                    .addComponent(subjectcode, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78)
                    .addComponent(written, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel363)
                    .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)
                    .addComponent(quarterly, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel367)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(performance, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel369)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        center.add(addsubject, "card2");

        subpanel.setBackground(new java.awt.Color(255, 255, 255));

        mysub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        mysub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mysubMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(mysub);

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 153, 0));
        jLabel68.setText("MY SUBJECTS");

        jPanel23.setBackground(new java.awt.Color(153, 153, 153));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Book_15px.png"))); // NOI18N

        jLabel70.setBackground(new java.awt.Color(102, 102, 102));
        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 102, 102));
        jLabel70.setText("MY SUBJECTS");
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel70MousePressed(evt);
            }
        });

        jLabel362.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_20px.png"))); // NOI18N
        jLabel362.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel362MousePressed(evt);
            }
        });

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Delete_20px.png"))); // NOI18N
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel362)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel361)
                .addGap(26, 26, 26))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addComponent(jLabel77)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70)
                        .addComponent(jLabel361)
                        .addComponent(jLabel362)))
                .addContainerGap())
        );

        javax.swing.GroupLayout subpanelLayout = new javax.swing.GroupLayout(subpanel);
        subpanel.setLayout(subpanelLayout);
        subpanelLayout.setHorizontalGroup(
            subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(subpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subpanelLayout.setVerticalGroup(
            subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel68)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        center.add(subpanel, "card2");

        hide_subjects.setBackground(new java.awt.Color(255, 255, 255));
        hide_subjects.setLayout(null);

        strand_13.setMinimumSize(new java.awt.Dimension(551, 401));
        strand_13.setPreferredSize(new java.awt.Dimension(551, 401));
        strand_13.setVisible(false);

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));

        abm_15.setBackground(new java.awt.Color(255, 255, 255));
        abm_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abm_15MousePressed(evt);
            }
        });

        jLabel373.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel373.setText("ABM");

        javax.swing.GroupLayout abm_15Layout = new javax.swing.GroupLayout(abm_15);
        abm_15.setLayout(abm_15Layout);
        abm_15Layout.setHorizontalGroup(
            abm_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_15Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel373)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        abm_15Layout.setVerticalGroup(
            abm_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel373)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        stem_15.setBackground(new java.awt.Color(255, 255, 255));
        stem_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stem_15MousePressed(evt);
            }
        });

        jLabel374.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel374.setText("STEM");

        javax.swing.GroupLayout stem_15Layout = new javax.swing.GroupLayout(stem_15);
        stem_15.setLayout(stem_15Layout);
        stem_15Layout.setHorizontalGroup(
            stem_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem_15Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel374)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        stem_15Layout.setVerticalGroup(
            stem_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem_15Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel374)
                .addGap(21, 21, 21))
        );

        techvoc_15.setBackground(new java.awt.Color(255, 255, 255));
        techvoc_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                techvoc_15MousePressed(evt);
            }
        });

        jLabel375.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel375.setText("TECH-VOC");

        javax.swing.GroupLayout techvoc_15Layout = new javax.swing.GroupLayout(techvoc_15);
        techvoc_15.setLayout(techvoc_15Layout);
        techvoc_15Layout.setHorizontalGroup(
            techvoc_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc_15Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel375)
                .addGap(25, 25, 25))
        );
        techvoc_15Layout.setVerticalGroup(
            techvoc_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc_15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel375)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        humss_15.setBackground(new java.awt.Color(255, 255, 255));
        humss_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                humss_15MousePressed(evt);
            }
        });

        jLabel376.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel376.setText("HUMSS");

        javax.swing.GroupLayout humss_15Layout = new javax.swing.GroupLayout(humss_15);
        humss_15.setLayout(humss_15Layout);
        humss_15Layout.setHorizontalGroup(
            humss_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_15Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel376)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        humss_15Layout.setVerticalGroup(
            humss_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel376)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abm_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stem_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humss_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(techvoc_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stem_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humss_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(techvoc_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abm_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout strand_13Layout = new javax.swing.GroupLayout(strand_13.getContentPane());
        strand_13.getContentPane().setLayout(strand_13Layout);
        strand_13Layout.setHorizontalGroup(
            strand_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        strand_13Layout.setVerticalGroup(
            strand_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        hide_subjects.add(strand_13);
        strand_13.setBounds(190, 50, 550, 400);

        strand_14.setMinimumSize(new java.awt.Dimension(551, 401));
        strand_14.setPreferredSize(new java.awt.Dimension(551, 401));
        strand_14.setVisible(false);

        jPanel34.setBackground(new java.awt.Color(153, 153, 153));

        gas_13.setBackground(new java.awt.Color(255, 255, 255));
        gas_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gas_13MousePressed(evt);
            }
        });

        jLabel377.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel377.setText("GAS");

        javax.swing.GroupLayout gas_13Layout = new javax.swing.GroupLayout(gas_13);
        gas_13.setLayout(gas_13Layout);
        gas_13Layout.setHorizontalGroup(
            gas_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gas_13Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel377)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gas_13Layout.setVerticalGroup(
            gas_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gas_13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel377)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        abm_16.setBackground(new java.awt.Color(255, 255, 255));
        abm_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abm_16MousePressed(evt);
            }
        });

        jLabel378.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel378.setText("ABM");

        javax.swing.GroupLayout abm_16Layout = new javax.swing.GroupLayout(abm_16);
        abm_16.setLayout(abm_16Layout);
        abm_16Layout.setHorizontalGroup(
            abm_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_16Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel378)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abm_16Layout.setVerticalGroup(
            abm_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_16Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel378)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        stem_16.setBackground(new java.awt.Color(255, 255, 255));
        stem_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stem_16MousePressed(evt);
            }
        });

        jLabel379.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel379.setText("STEM");

        javax.swing.GroupLayout stem_16Layout = new javax.swing.GroupLayout(stem_16);
        stem_16.setLayout(stem_16Layout);
        stem_16Layout.setHorizontalGroup(
            stem_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem_16Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel379)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stem_16Layout.setVerticalGroup(
            stem_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem_16Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel379)
                .addGap(21, 21, 21))
        );

        techvoc_16.setBackground(new java.awt.Color(255, 255, 255));
        techvoc_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                techvoc_16MousePressed(evt);
            }
        });

        jLabel380.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel380.setText("TECH-VOC");

        javax.swing.GroupLayout techvoc_16Layout = new javax.swing.GroupLayout(techvoc_16);
        techvoc_16.setLayout(techvoc_16Layout);
        techvoc_16Layout.setHorizontalGroup(
            techvoc_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc_16Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel380)
                .addGap(23, 23, 23))
        );
        techvoc_16Layout.setVerticalGroup(
            techvoc_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc_16Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel380)
                .addGap(21, 21, 21))
        );

        humss_16.setBackground(new java.awt.Color(255, 255, 255));
        humss_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                humss_16MousePressed(evt);
            }
        });

        jLabel381.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel381.setText("HUMSS");

        javax.swing.GroupLayout humss_16Layout = new javax.swing.GroupLayout(humss_16);
        humss_16.setLayout(humss_16Layout);
        humss_16Layout.setHorizontalGroup(
            humss_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_16Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel381)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        humss_16Layout.setVerticalGroup(
            humss_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel381)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(techvoc_16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abm_16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stem_16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(gas_13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(humss_16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stem_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humss_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gas_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abm_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(techvoc_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout strand_14Layout = new javax.swing.GroupLayout(strand_14.getContentPane());
        strand_14.getContentPane().setLayout(strand_14Layout);
        strand_14Layout.setHorizontalGroup(
            strand_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        strand_14Layout.setVerticalGroup(
            strand_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        hide_subjects.add(strand_14);
        strand_14.setBounds(190, 50, 550, 400);

        gradelevel1.setVisible(false);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        Grade_13.setBackground(new java.awt.Color(255, 255, 255));
        Grade_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_13MousePressed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel36.setText("Grade 10");

        javax.swing.GroupLayout Grade_13Layout = new javax.swing.GroupLayout(Grade_13);
        Grade_13.setLayout(Grade_13Layout);
        Grade_13Layout.setHorizontalGroup(
            Grade_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_13Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel36)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        Grade_13Layout.setVerticalGroup(
            Grade_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_13Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(22, 22, 22))
        );

        Grade_14.setBackground(new java.awt.Color(255, 255, 255));
        Grade_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_14MousePressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel37.setText("Grade 9");

        javax.swing.GroupLayout Grade_14Layout = new javax.swing.GroupLayout(Grade_14);
        Grade_14.setLayout(Grade_14Layout);
        Grade_14Layout.setHorizontalGroup(
            Grade_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Grade_14Layout.setVerticalGroup(
            Grade_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel37)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Grade_15.setBackground(new java.awt.Color(255, 255, 255));
        Grade_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_15MousePressed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel38.setText("Grade 7");

        javax.swing.GroupLayout Grade_15Layout = new javax.swing.GroupLayout(Grade_15);
        Grade_15.setLayout(Grade_15Layout);
        Grade_15Layout.setHorizontalGroup(
            Grade_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(36, 36, 36))
        );
        Grade_15Layout.setVerticalGroup(
            Grade_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel38)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Grade_16.setBackground(new java.awt.Color(255, 255, 255));
        Grade_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_16MousePressed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel39.setText("Grade 11");

        javax.swing.GroupLayout Grade_16Layout = new javax.swing.GroupLayout(Grade_16);
        Grade_16.setLayout(Grade_16Layout);
        Grade_16Layout.setHorizontalGroup(
            Grade_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_16Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(23, 23, 23))
        );
        Grade_16Layout.setVerticalGroup(
            Grade_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_16Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(21, 21, 21))
        );

        Grade_17.setBackground(new java.awt.Color(255, 255, 255));
        Grade_17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_17MousePressed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel40.setText("Grade 12");

        javax.swing.GroupLayout Grade_17Layout = new javax.swing.GroupLayout(Grade_17);
        Grade_17.setLayout(Grade_17Layout);
        Grade_17Layout.setHorizontalGroup(
            Grade_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_17Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel40)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        Grade_17Layout.setVerticalGroup(
            Grade_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_17Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel40)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Grade_18.setBackground(new java.awt.Color(255, 255, 255));
        Grade_18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_18MousePressed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel41.setText("Grade 8");

        javax.swing.GroupLayout Grade_18Layout = new javax.swing.GroupLayout(Grade_18);
        Grade_18.setLayout(Grade_18Layout);
        Grade_18Layout.setHorizontalGroup(
            Grade_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_18Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel41)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        Grade_18Layout.setVerticalGroup(
            Grade_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_18Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel41)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Grade_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Grade_14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Grade_16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Grade_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Grade_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Grade_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Grade_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gradelevel1Layout = new javax.swing.GroupLayout(gradelevel1.getContentPane());
        gradelevel1.getContentPane().setLayout(gradelevel1Layout);
        gradelevel1Layout.setHorizontalGroup(
            gradelevel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradelevel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gradelevel1Layout.setVerticalGroup(
            gradelevel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        hide_subjects.add(gradelevel1);
        gradelevel1.setBounds(240, 30, 540, 380);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 153, 0));
        hide_subjects.add(jLabel43);
        jLabel43.setBounds(171, 49, 0, 0);
        hide_subjects.add(code);
        code.setBounds(70, 40, 200, 50);
        hide_subjects.add(title);
        title.setBounds(70, 110, 200, 60);
        hide_subjects.add(quarter);
        quarter.setBounds(340, 40, 140, 50);
        hide_subjects.add(grade);
        grade.setBounds(340, 110, 150, 60);
        hide_subjects.add(idnumber);
        idnumber.setBounds(60, 210, 6, 22);
        hide_subjects.add(firstname);
        firstname.setBounds(60, 250, 6, 22);
        hide_subjects.add(middlename);
        middlename.setBounds(60, 290, 6, 22);
        hide_subjects.add(lastname);
        lastname.setBounds(60, 330, 6, 22);
        hide_subjects.add(section);
        section.setBounds(60, 370, 6, 22);
        hide_subjects.add(grade_level);
        grade_level.setBounds(170, 210, 6, 22);
        hide_subjects.add(specialization);
        specialization.setBounds(180, 250, 6, 22);

        center.add(hide_subjects, "card2");

        Grade7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 153, 0));
        jLabel44.setText("Grade 7 Students List");

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel46.setBackground(new java.awt.Color(102, 102, 102));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 255, 204));
        jLabel46.setText("DASHBOARD");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel46MousePressed(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(102, 102, 102));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("/ Grade 7 ");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(jLabel47)))
                .addContainerGap())
        );

        grade7.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(grade7);
        if (grade7.getColumnModel().getColumnCount() > 0) {
            grade7.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            grade7.getColumnModel().getColumn(1).setResizable(false);
            grade7.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            grade7.getColumnModel().getColumn(2).setResizable(false);
            grade7.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            grade7.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        javax.swing.GroupLayout Grade7Layout = new javax.swing.GroupLayout(Grade7);
        Grade7.setLayout(Grade7Layout);
        Grade7Layout.setHorizontalGroup(
            Grade7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Grade7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Grade7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Grade7Layout.setVerticalGroup(
            Grade7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(Grade7, "card2");

        Grade8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 153, 0));
        jLabel48.setText("Grade 8 Students List");

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel50.setBackground(new java.awt.Color(102, 102, 102));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 255, 204));
        jLabel50.setText("DASHBOARD");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel50MousePressed(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(102, 102, 102));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("/ Grade 8 ");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(jLabel51)))
                .addContainerGap())
        );

        grade8.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(grade8);

        javax.swing.GroupLayout Grade8Layout = new javax.swing.GroupLayout(Grade8);
        Grade8.setLayout(Grade8Layout);
        Grade8Layout.setHorizontalGroup(
            Grade8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Grade8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Grade8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Grade8Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        Grade8Layout.setVerticalGroup(
            Grade8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(Grade8, "card2");

        Grade9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 153, 0));
        jLabel52.setText("Grade 9 Students List");

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel54.setBackground(new java.awt.Color(102, 102, 102));
        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 255, 204));
        jLabel54.setText("DASHBOARD");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel54MousePressed(evt);
            }
        });

        jLabel55.setBackground(new java.awt.Color(102, 102, 102));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("/ Grade 9 ");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54)
                        .addComponent(jLabel55)))
                .addContainerGap())
        );

        grade9.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(grade9);

        javax.swing.GroupLayout Grade9Layout = new javax.swing.GroupLayout(Grade9);
        Grade9.setLayout(Grade9Layout);
        Grade9Layout.setHorizontalGroup(
            Grade9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Grade9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Grade9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Grade9Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        Grade9Layout.setVerticalGroup(
            Grade9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel52)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(Grade9, "card2");

        Grade10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 153, 0));
        jLabel56.setText("Grade 10 Students List");

        jPanel20.setBackground(new java.awt.Color(153, 153, 153));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel58.setBackground(new java.awt.Color(102, 102, 102));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 255, 204));
        jLabel58.setText("DASHBOARD");
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel58MousePressed(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(102, 102, 102));
        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("/ Grade 10 ");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58)
                        .addComponent(jLabel59)))
                .addContainerGap())
        );

        grade10.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(grade10);

        javax.swing.GroupLayout Grade10Layout = new javax.swing.GroupLayout(Grade10);
        Grade10.setLayout(Grade10Layout);
        Grade10Layout.setHorizontalGroup(
            Grade10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Grade10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Grade10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Grade10Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        Grade10Layout.setVerticalGroup(
            Grade10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade10Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(Grade10, "card2");

        GAS_11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel341.setBackground(new java.awt.Color(255, 255, 255));
        jLabel341.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel341.setForeground(new java.awt.Color(51, 153, 0));
        jLabel341.setText("GAS 11 Students List");

        jPanel28.setBackground(new java.awt.Color(153, 153, 153));

        jLabel342.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel343.setBackground(new java.awt.Color(102, 102, 102));
        jLabel343.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel343.setForeground(new java.awt.Color(204, 255, 204));
        jLabel343.setText("DASHBOARD");
        jLabel343.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel343MousePressed(evt);
            }
        });

        jLabel344.setBackground(new java.awt.Color(102, 102, 102));
        jLabel344.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel344.setForeground(new java.awt.Color(102, 102, 102));
        jLabel344.setText("/ Grade 11");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel342)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel343)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel344)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel342)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel343)
                        .addComponent(jLabel344)))
                .addContainerGap())
        );

        gas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane24.setViewportView(gas);

        javax.swing.GroupLayout GAS_11Layout = new javax.swing.GroupLayout(GAS_11);
        GAS_11.setLayout(GAS_11Layout);
        GAS_11Layout.setHorizontalGroup(
            GAS_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GAS_11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GAS_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GAS_11Layout.createSequentialGroup()
                        .addComponent(jLabel341)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        GAS_11Layout.setVerticalGroup(
            GAS_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAS_11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel341)
                .addGap(18, 18, 18)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(GAS_11, "card2");

        HUMSS_11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel333.setBackground(new java.awt.Color(255, 255, 255));
        jLabel333.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel333.setForeground(new java.awt.Color(51, 153, 0));
        jLabel333.setText("HUMSS 11 Students List");

        jPanel26.setBackground(new java.awt.Color(153, 153, 153));

        jLabel334.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel335.setBackground(new java.awt.Color(102, 102, 102));
        jLabel335.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel335.setForeground(new java.awt.Color(204, 255, 204));
        jLabel335.setText("DASHBOARD");
        jLabel335.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel335MousePressed(evt);
            }
        });

        jLabel336.setBackground(new java.awt.Color(102, 102, 102));
        jLabel336.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel336.setForeground(new java.awt.Color(102, 102, 102));
        jLabel336.setText("/ Grade 11 ");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel334)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel335)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel336)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel334)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel335)
                        .addComponent(jLabel336)))
                .addContainerGap())
        );

        humss.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane22.setViewportView(humss);

        javax.swing.GroupLayout HUMSS_11Layout = new javax.swing.GroupLayout(HUMSS_11);
        HUMSS_11.setLayout(HUMSS_11Layout);
        HUMSS_11Layout.setHorizontalGroup(
            HUMSS_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HUMSS_11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HUMSS_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HUMSS_11Layout.createSequentialGroup()
                        .addComponent(jLabel333)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        HUMSS_11Layout.setVerticalGroup(
            HUMSS_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HUMSS_11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel333)
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(HUMSS_11, "card2");

        HUMSS_12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel337.setBackground(new java.awt.Color(255, 255, 255));
        jLabel337.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel337.setForeground(new java.awt.Color(51, 153, 0));
        jLabel337.setText("HUMSS 12 Students List");

        jPanel27.setBackground(new java.awt.Color(153, 153, 153));

        jLabel338.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel339.setBackground(new java.awt.Color(102, 102, 102));
        jLabel339.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel339.setForeground(new java.awt.Color(204, 255, 204));
        jLabel339.setText("DASHBOARD");
        jLabel339.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel339MousePressed(evt);
            }
        });

        jLabel340.setBackground(new java.awt.Color(102, 102, 102));
        jLabel340.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel340.setForeground(new java.awt.Color(102, 102, 102));
        jLabel340.setText("/ Grade 12 ");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel338)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel339)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel340)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel338)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel339)
                        .addComponent(jLabel340)))
                .addContainerGap())
        );

        humss1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane23.setViewportView(humss1);

        javax.swing.GroupLayout HUMSS_12Layout = new javax.swing.GroupLayout(HUMSS_12);
        HUMSS_12.setLayout(HUMSS_12Layout);
        HUMSS_12Layout.setHorizontalGroup(
            HUMSS_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HUMSS_12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HUMSS_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HUMSS_12Layout.createSequentialGroup()
                        .addComponent(jLabel337)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        HUMSS_12Layout.setVerticalGroup(
            HUMSS_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HUMSS_12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel337)
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(HUMSS_12, "card2");

        STEM_11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 153, 0));
        jLabel60.setText("STEM 11 Students List");

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel62.setBackground(new java.awt.Color(102, 102, 102));
        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 255, 204));
        jLabel62.setText("DASHBOARD");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel62MousePressed(evt);
            }
        });

        jLabel63.setBackground(new java.awt.Color(102, 102, 102));
        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("/ Grade 11 ");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62)
                        .addComponent(jLabel63)))
                .addContainerGap())
        );

        stem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(stem);

        javax.swing.GroupLayout STEM_11Layout = new javax.swing.GroupLayout(STEM_11);
        STEM_11.setLayout(STEM_11Layout);
        STEM_11Layout.setHorizontalGroup(
            STEM_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(STEM_11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(STEM_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(STEM_11Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        STEM_11Layout.setVerticalGroup(
            STEM_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STEM_11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel60)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(STEM_11, "card2");

        STEM_12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 153, 0));
        jLabel64.setText("STEM 12 Students List");

        jPanel22.setBackground(new java.awt.Color(153, 153, 153));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel66.setBackground(new java.awt.Color(102, 102, 102));
        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(204, 255, 204));
        jLabel66.setText("DASHBOARD");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel66MousePressed(evt);
            }
        });

        jLabel67.setBackground(new java.awt.Color(102, 102, 102));
        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 102));
        jLabel67.setText("/ Grade 12 ");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(jLabel67)))
                .addContainerGap())
        );

        stem1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(stem1);

        javax.swing.GroupLayout STEM_12Layout = new javax.swing.GroupLayout(STEM_12);
        STEM_12.setLayout(STEM_12Layout);
        STEM_12Layout.setHorizontalGroup(
            STEM_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(STEM_12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(STEM_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(STEM_12Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        STEM_12Layout.setVerticalGroup(
            STEM_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STEM_12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel64)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(STEM_12, "card2");

        ABM_11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel345.setBackground(new java.awt.Color(255, 255, 255));
        jLabel345.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel345.setForeground(new java.awt.Color(51, 153, 0));
        jLabel345.setText("ABM 11 Students List");

        jPanel29.setBackground(new java.awt.Color(153, 153, 153));

        jLabel346.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel347.setBackground(new java.awt.Color(102, 102, 102));
        jLabel347.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel347.setForeground(new java.awt.Color(204, 255, 204));
        jLabel347.setText("DASHBOARD");
        jLabel347.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel347MousePressed(evt);
            }
        });

        jLabel348.setBackground(new java.awt.Color(102, 102, 102));
        jLabel348.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel348.setForeground(new java.awt.Color(102, 102, 102));
        jLabel348.setText("/ Grade 11 ");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel346)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel347)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel348)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel346)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel347)
                        .addComponent(jLabel348)))
                .addContainerGap())
        );

        abm.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane25.setViewportView(abm);

        javax.swing.GroupLayout ABM_11Layout = new javax.swing.GroupLayout(ABM_11);
        ABM_11.setLayout(ABM_11Layout);
        ABM_11Layout.setHorizontalGroup(
            ABM_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ABM_11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ABM_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABM_11Layout.createSequentialGroup()
                        .addComponent(jLabel345)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        ABM_11Layout.setVerticalGroup(
            ABM_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABM_11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel345)
                .addGap(18, 18, 18)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(ABM_11, "card2");

        ABM_12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel349.setBackground(new java.awt.Color(255, 255, 255));
        jLabel349.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel349.setForeground(new java.awt.Color(51, 153, 0));
        jLabel349.setText("Grade 12 Students List");

        jPanel30.setBackground(new java.awt.Color(153, 153, 153));

        jLabel350.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel351.setBackground(new java.awt.Color(102, 102, 102));
        jLabel351.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel351.setForeground(new java.awt.Color(204, 255, 204));
        jLabel351.setText("DASHBOARD");
        jLabel351.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel351MousePressed(evt);
            }
        });

        jLabel352.setBackground(new java.awt.Color(102, 102, 102));
        jLabel352.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel352.setForeground(new java.awt.Color(102, 102, 102));
        jLabel352.setText("/ Grade 12 ");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel350)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel351)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel352)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel350)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel351)
                        .addComponent(jLabel352)))
                .addContainerGap())
        );

        abm1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane26.setViewportView(abm1);

        javax.swing.GroupLayout ABM_12Layout = new javax.swing.GroupLayout(ABM_12);
        ABM_12.setLayout(ABM_12Layout);
        ABM_12Layout.setHorizontalGroup(
            ABM_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ABM_12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ABM_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABM_12Layout.createSequentialGroup()
                        .addComponent(jLabel349)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        ABM_12Layout.setVerticalGroup(
            ABM_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABM_12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel349)
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(ABM_12, "card2");

        TV_11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel353.setBackground(new java.awt.Color(255, 255, 255));
        jLabel353.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel353.setForeground(new java.awt.Color(51, 153, 0));
        jLabel353.setText("Technical Vocational 11 Students List");

        jPanel31.setBackground(new java.awt.Color(153, 153, 153));

        jLabel354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel355.setBackground(new java.awt.Color(102, 102, 102));
        jLabel355.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel355.setForeground(new java.awt.Color(204, 255, 204));
        jLabel355.setText("DASHBOARD");
        jLabel355.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel355MousePressed(evt);
            }
        });

        jLabel356.setBackground(new java.awt.Color(102, 102, 102));
        jLabel356.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel356.setForeground(new java.awt.Color(102, 102, 102));
        jLabel356.setText("/ Grade 11 ");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel354)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel355)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel356)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel354)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel355)
                        .addComponent(jLabel356)))
                .addContainerGap())
        );

        tv.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane27.setViewportView(tv);

        javax.swing.GroupLayout TV_11Layout = new javax.swing.GroupLayout(TV_11);
        TV_11.setLayout(TV_11Layout);
        TV_11Layout.setHorizontalGroup(
            TV_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TV_11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TV_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TV_11Layout.createSequentialGroup()
                        .addComponent(jLabel353)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        TV_11Layout.setVerticalGroup(
            TV_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TV_11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel353)
                .addGap(18, 18, 18)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(TV_11, "card2");

        TV_12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel357.setBackground(new java.awt.Color(255, 255, 255));
        jLabel357.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel357.setForeground(new java.awt.Color(51, 153, 0));
        jLabel357.setText("Technical Vocational 12 Students List");

        jPanel32.setBackground(new java.awt.Color(153, 153, 153));

        jLabel358.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel359.setBackground(new java.awt.Color(102, 102, 102));
        jLabel359.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel359.setForeground(new java.awt.Color(204, 255, 204));
        jLabel359.setText("DASHBOARD");
        jLabel359.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel359MousePressed(evt);
            }
        });

        jLabel360.setBackground(new java.awt.Color(102, 102, 102));
        jLabel360.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel360.setForeground(new java.awt.Color(102, 102, 102));
        jLabel360.setText("/ Grade 12 ");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel358)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel359)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel360)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel358)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel359)
                        .addComponent(jLabel360)))
                .addContainerGap())
        );

        tv1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane28.setViewportView(tv1);

        javax.swing.GroupLayout TV_12Layout = new javax.swing.GroupLayout(TV_12);
        TV_12.setLayout(TV_12Layout);
        TV_12Layout.setHorizontalGroup(
            TV_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TV_12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TV_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TV_12Layout.createSequentialGroup()
                        .addComponent(jLabel357)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        TV_12Layout.setVerticalGroup(
            TV_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TV_12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel357)
                .addGap(18, 18, 18)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        center.add(TV_12, "card2");

        dpanel.setBackground(new java.awt.Color(255, 255, 255));
        dpanel.setLayout(null);

        strand_12.setMinimumSize(new java.awt.Dimension(551, 401));
        strand_12.setPreferredSize(new java.awt.Dimension(551, 401));
        strand_12.setVisible(false);

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));

        abm_14.setBackground(new java.awt.Color(255, 255, 255));
        abm_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abm_14MousePressed(evt);
            }
        });

        jLabel329.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel329.setText("ABM");

        javax.swing.GroupLayout abm_14Layout = new javax.swing.GroupLayout(abm_14);
        abm_14.setLayout(abm_14Layout);
        abm_14Layout.setHorizontalGroup(
            abm_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_14Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel329)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        abm_14Layout.setVerticalGroup(
            abm_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel329)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        stem_14.setBackground(new java.awt.Color(255, 255, 255));
        stem_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stem_14MousePressed(evt);
            }
        });

        jLabel330.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel330.setText("STEM");

        javax.swing.GroupLayout stem_14Layout = new javax.swing.GroupLayout(stem_14);
        stem_14.setLayout(stem_14Layout);
        stem_14Layout.setHorizontalGroup(
            stem_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem_14Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel330)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        stem_14Layout.setVerticalGroup(
            stem_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem_14Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel330)
                .addGap(21, 21, 21))
        );

        techvoc_14.setBackground(new java.awt.Color(255, 255, 255));
        techvoc_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                techvoc_14MousePressed(evt);
            }
        });

        jLabel331.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel331.setText("TECH-VOC");

        javax.swing.GroupLayout techvoc_14Layout = new javax.swing.GroupLayout(techvoc_14);
        techvoc_14.setLayout(techvoc_14Layout);
        techvoc_14Layout.setHorizontalGroup(
            techvoc_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc_14Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel331)
                .addGap(25, 25, 25))
        );
        techvoc_14Layout.setVerticalGroup(
            techvoc_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(techvoc_14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel331)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        humss_14.setBackground(new java.awt.Color(255, 255, 255));
        humss_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                humss_14MousePressed(evt);
            }
        });

        jLabel332.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel332.setText("HUMSS");

        javax.swing.GroupLayout humss_14Layout = new javax.swing.GroupLayout(humss_14);
        humss_14.setLayout(humss_14Layout);
        humss_14Layout.setHorizontalGroup(
            humss_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_14Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel332)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        humss_14Layout.setVerticalGroup(
            humss_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel332)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abm_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stem_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humss_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(techvoc_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stem_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humss_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(techvoc_14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abm_14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout strand_12Layout = new javax.swing.GroupLayout(strand_12.getContentPane());
        strand_12.getContentPane().setLayout(strand_12Layout);
        strand_12Layout.setHorizontalGroup(
            strand_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        strand_12Layout.setVerticalGroup(
            strand_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dpanel.add(strand_12);
        strand_12.setBounds(190, 50, 550, 400);

        strand_11.setMinimumSize(new java.awt.Dimension(551, 401));
        strand_11.setPreferredSize(new java.awt.Dimension(551, 401));
        strand_11.setVisible(false);

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));

        gas_12.setBackground(new java.awt.Color(255, 255, 255));
        gas_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gas_12MousePressed(evt);
            }
        });

        jLabel324.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel324.setText("GAS");

        javax.swing.GroupLayout gas_12Layout = new javax.swing.GroupLayout(gas_12);
        gas_12.setLayout(gas_12Layout);
        gas_12Layout.setHorizontalGroup(
            gas_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gas_12Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gas_12Layout.setVerticalGroup(
            gas_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gas_12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel324)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        abm_13.setBackground(new java.awt.Color(255, 255, 255));
        abm_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abm_13MousePressed(evt);
            }
        });

        jLabel325.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel325.setText("ABM");

        javax.swing.GroupLayout abm_13Layout = new javax.swing.GroupLayout(abm_13);
        abm_13.setLayout(abm_13Layout);
        abm_13Layout.setHorizontalGroup(
            abm_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_13Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel325)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abm_13Layout.setVerticalGroup(
            abm_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abm_13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel325)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        stem_13.setBackground(new java.awt.Color(255, 255, 255));
        stem_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stem_13MousePressed(evt);
            }
        });

        jLabel326.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel326.setText("STEM");

        javax.swing.GroupLayout stem_13Layout = new javax.swing.GroupLayout(stem_13);
        stem_13.setLayout(stem_13Layout);
        stem_13Layout.setHorizontalGroup(
            stem_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stem_13Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel326)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stem_13Layout.setVerticalGroup(
            stem_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stem_13Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel326)
                .addGap(21, 21, 21))
        );

        techvoc_13.setBackground(new java.awt.Color(255, 255, 255));
        techvoc_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                techvoc_13MousePressed(evt);
            }
        });

        jLabel327.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel327.setText("TECH-VOC");

        javax.swing.GroupLayout techvoc_13Layout = new javax.swing.GroupLayout(techvoc_13);
        techvoc_13.setLayout(techvoc_13Layout);
        techvoc_13Layout.setHorizontalGroup(
            techvoc_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc_13Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel327)
                .addGap(23, 23, 23))
        );
        techvoc_13Layout.setVerticalGroup(
            techvoc_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, techvoc_13Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel327)
                .addGap(21, 21, 21))
        );

        humss_13.setBackground(new java.awt.Color(255, 255, 255));
        humss_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                humss_13MousePressed(evt);
            }
        });

        jLabel328.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel328.setText("HUMSS");

        javax.swing.GroupLayout humss_13Layout = new javax.swing.GroupLayout(humss_13);
        humss_13.setLayout(humss_13Layout);
        humss_13Layout.setHorizontalGroup(
            humss_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_13Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel328)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        humss_13Layout.setVerticalGroup(
            humss_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humss_13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel328)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(techvoc_13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abm_13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stem_13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(gas_12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(humss_13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stem_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humss_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gas_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abm_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(techvoc_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout strand_11Layout = new javax.swing.GroupLayout(strand_11.getContentPane());
        strand_11.getContentPane().setLayout(strand_11Layout);
        strand_11Layout.setHorizontalGroup(
            strand_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        strand_11Layout.setVerticalGroup(
            strand_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dpanel.add(strand_11);
        strand_11.setBounds(190, 50, 550, 400);

        gradelevel.setVisible(false);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        Grade_10.setBackground(new java.awt.Color(255, 255, 255));
        Grade_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_10MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("Grade 10");

        javax.swing.GroupLayout Grade_10Layout = new javax.swing.GroupLayout(Grade_10);
        Grade_10.setLayout(Grade_10Layout);
        Grade_10Layout.setHorizontalGroup(
            Grade_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        Grade_10Layout.setVerticalGroup(
            Grade_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_10Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(22, 22, 22))
        );

        Grade_9.setBackground(new java.awt.Color(255, 255, 255));
        Grade_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_9MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Grade 9");

        javax.swing.GroupLayout Grade_9Layout = new javax.swing.GroupLayout(Grade_9);
        Grade_9.setLayout(Grade_9Layout);
        Grade_9Layout.setHorizontalGroup(
            Grade_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Grade_9Layout.setVerticalGroup(
            Grade_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Grade_7.setBackground(new java.awt.Color(255, 255, 255));
        Grade_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_7MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("Grade 7");

        javax.swing.GroupLayout Grade_7Layout = new javax.swing.GroupLayout(Grade_7);
        Grade_7.setLayout(Grade_7Layout);
        Grade_7Layout.setHorizontalGroup(
            Grade_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(36, 36, 36))
        );
        Grade_7Layout.setVerticalGroup(
            Grade_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Grade_11.setBackground(new java.awt.Color(255, 255, 255));
        Grade_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_11MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("Grade 11");

        javax.swing.GroupLayout Grade_11Layout = new javax.swing.GroupLayout(Grade_11);
        Grade_11.setLayout(Grade_11Layout);
        Grade_11Layout.setHorizontalGroup(
            Grade_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_11Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(23, 23, 23))
        );
        Grade_11Layout.setVerticalGroup(
            Grade_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grade_11Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(21, 21, 21))
        );

        Grade_12.setBackground(new java.awt.Color(255, 255, 255));
        Grade_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_12MousePressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel24.setText("Grade 12");

        javax.swing.GroupLayout Grade_12Layout = new javax.swing.GroupLayout(Grade_12);
        Grade_12.setLayout(Grade_12Layout);
        Grade_12Layout.setHorizontalGroup(
            Grade_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_12Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel24)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        Grade_12Layout.setVerticalGroup(
            Grade_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel24)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Grade_8.setBackground(new java.awt.Color(255, 255, 255));
        Grade_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Grade_8MousePressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel25.setText("Grade 8");

        javax.swing.GroupLayout Grade_8Layout = new javax.swing.GroupLayout(Grade_8);
        Grade_8.setLayout(Grade_8Layout);
        Grade_8Layout.setHorizontalGroup(
            Grade_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_8Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel25)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        Grade_8Layout.setVerticalGroup(
            Grade_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grade_8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel25)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Grade_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Grade_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Grade_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Grade_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Grade_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Grade_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Grade_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gradelevelLayout = new javax.swing.GroupLayout(gradelevel.getContentPane());
        gradelevel.getContentPane().setLayout(gradelevelLayout);
        gradelevelLayout.setHorizontalGroup(
            gradelevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradelevelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gradelevelLayout.setVerticalGroup(
            gradelevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dpanel.add(gradelevel);
        gradelevel.setBounds(240, 30, 540, 380);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("DASHBOARD");
        dpanel.add(jLabel5);
        jLabel5.setBounds(12, 49, 152, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        dpanel.add(jLabel6);
        jLabel6.setBounds(171, 49, 0, 0);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_15px.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(861, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        dpanel.add(jPanel4);
        jPanel4.setBounds(0, 96, 990, 41);

        jPanel7.setMinimumSize(new java.awt.Dimension(400, 123));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 123));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Students_48px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Grade Level");

        studcount.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        studcount.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                studcountPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(studcount)
                .addGap(58, 58, 58))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(studcount))
                        .addGap(7, 7, 7)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        dpanel.add(jPanel7);
        jPanel7.setBounds(60, 170, 400, 120);

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Keyboard_48px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Enter Grade (Per Subject)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        dpanel.add(jPanel5);
        jPanel5.setBounds(530, 170, 400, 120);

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Grading Sheet");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Report_Card_48px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(50, 50, 50))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel34))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel35)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        dpanel.add(jPanel8);
        jPanel8.setBounds(60, 330, 400, 120);

        center.add(dpanel, "card2");

        getContentPane().add(center);
        center.setBounds(260, 100, 990, 500);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(253, 600, 1000, 100);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        settings.setBackground(new java.awt.Color(153, 153, 153));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settingsMousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Settings");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_List_30px.png"))); // NOI18N

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        stud.setBackground(new java.awt.Color(153, 153, 153));
        stud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studMousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("My Students");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Students_30px.png"))); // NOI18N

        javax.swing.GroupLayout studLayout = new javax.swing.GroupLayout(stud);
        stud.setLayout(studLayout);
        studLayout.setHorizontalGroup(
            studLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        studLayout.setVerticalGroup(
            studLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        subjects.setBackground(new java.awt.Color(153, 153, 153));
        subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subjectsMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("My Subjects");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Book_30px.png"))); // NOI18N

        javax.swing.GroupLayout subjectsLayout = new javax.swing.GroupLayout(subjects);
        subjects.setLayout(subjectsLayout);
        subjectsLayout.setHorizontalGroup(
            subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subjectsLayout.setVerticalGroup(
            subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        dashboard.setBackground(new java.awt.Color(153, 153, 153));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashboardMousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Class_30px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Dashboard");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subjects, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 314, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 260, 600);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TEACHER'S PANEL - Grading System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome, Teacher!");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Shutdown_30px.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 670, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1253, 100);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int xy,xx;
    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure?", "Logout", JOptionPane.YES_NO_OPTION);
        if (p == 0)
        {
            new Login2().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel17MousePressed

    private void settingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMousePressed
        setColor(settings);
        resetColor(subjects);
        resetColor(stud);
        resetColor(dashboard);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(settingpanel);
        center.repaint();
        center.revalidate();
         
        con = Connect.ConnectDB();
        accounts();
    }//GEN-LAST:event_settingsMousePressed

    private void studMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMousePressed
        setColor(stud);
        resetColor(subjects);
        resetColor(dashboard);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(studpanel);
        center.repaint();
        center.revalidate();
        
        con = Connect.ConnectDB();
        students();
    }//GEN-LAST:event_studMousePressed

    private void subjectsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsMousePressed
        setColor(subjects);
        resetColor(dashboard);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(subpanel);
        center.repaint();
        center.revalidate();
        
        con = Connect.ConnectDB();
        subjects();
    }//GEN-LAST:event_subjectsMousePressed

    private void dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();

    
    }//GEN-LAST:event_dashboardMousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
     xx = evt.getX();
     xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel46MousePressed

    private void jLabel50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel50MousePressed

    private void jLabel54MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel54MousePressed

    private void jLabel58MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel58MousePressed

    private void jLabel62MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel62MousePressed

    private void jLabel66MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel66MousePressed

    private void Grade_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_7MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(Grade7);
        center.repaint();
        center.revalidate();
       gradelevel.setVisible(false);
       
       con = Connect.ConnectDB();
        grade7();
    }//GEN-LAST:event_Grade_7MousePressed

    private void Grade_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_8MousePressed
      setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(Grade8);
        center.repaint();
        center.revalidate();
       gradelevel.setVisible(false);
       con = Connect.ConnectDB();
        grade8();
    }//GEN-LAST:event_Grade_8MousePressed

    private void Grade_9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_9MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(Grade9);
        center.repaint();
        center.revalidate();
       gradelevel.setVisible(false);
       con = Connect.ConnectDB();
        grade9();
    }//GEN-LAST:event_Grade_9MousePressed

    private void Grade_10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_10MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(Grade10);
        center.repaint();
        center.revalidate();
       gradelevel.setVisible(false);
       con = Connect.ConnectDB();
        grade10();
    }//GEN-LAST:event_Grade_10MousePressed

    private void Grade_11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_11MousePressed
       strand_11.setVisible(true);
        gradelevel.setVisible(false);
    }//GEN-LAST:event_Grade_11MousePressed

    private void Grade_12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_12MousePressed
      strand_12.setVisible(true);
        gradelevel.setVisible(false);
    }//GEN-LAST:event_Grade_12MousePressed

    private void jLabel70MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel70MousePressed

    private void jLabel73MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel73MousePressed

    private void jLabel76MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel76MousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        new entergrade().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        gradelevel.setVisible(true);
    }//GEN-LAST:event_jPanel7MousePressed

    private void studcountPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_studcountPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_studcountPropertyChange

    private void gas_12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gas_12MousePressed
         setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(GAS_11);
        center.repaint();
        center.revalidate();
       strand_11.setVisible(false);
       
       con = Connect.ConnectDB();
        GAS_11();
    }//GEN-LAST:event_gas_12MousePressed

    private void abm_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abm_13MousePressed
         setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(ABM_11);
        center.repaint();
        center.revalidate();
       strand_11.setVisible(false);
       
       con = Connect.ConnectDB();
        ABM_11();
    }//GEN-LAST:event_abm_13MousePressed

    private void stem_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stem_13MousePressed
         setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(STEM_11);
        center.repaint();
        center.revalidate();
       strand_11.setVisible(false);
       
       con = Connect.ConnectDB();
       STEM_11();
    }//GEN-LAST:event_stem_13MousePressed

    private void techvoc_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techvoc_13MousePressed
         setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(TV_11);
        center.repaint();
        center.revalidate();
      strand_11.setVisible(false);
       
       con = Connect.ConnectDB();
        TV_11();
    }//GEN-LAST:event_techvoc_13MousePressed

    private void humss_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humss_13MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(HUMSS_11);
        center.repaint();
        center.revalidate();
       strand_11.setVisible(false);
       
       con = Connect.ConnectDB();
        HUMSS_11();
    }//GEN-LAST:event_humss_13MousePressed

    private void abm_14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abm_14MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(ABM_12);
        center.repaint();
        center.revalidate();
       strand_12.setVisible(false);
       
       con = Connect.ConnectDB();
       ABM_12();
    }//GEN-LAST:event_abm_14MousePressed

    private void stem_14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stem_14MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(STEM_12);
        center.repaint();
        center.revalidate();
       strand_12.setVisible(false);
       
       con = Connect.ConnectDB();
       STEM_12();
    }//GEN-LAST:event_stem_14MousePressed

    private void techvoc_14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techvoc_14MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(TV_12);
        center.repaint();
        center.revalidate();
       strand_12.setVisible(false);
       
       con = Connect.ConnectDB();
        TV_12();
    }//GEN-LAST:event_techvoc_14MousePressed

    private void humss_14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humss_14MousePressed
         setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(HUMSS_12);
        center.repaint();
        center.revalidate();
       strand_12.setVisible(false);
       
       con = Connect.ConnectDB();
        HUMSS_12();
    }//GEN-LAST:event_humss_14MousePressed

    private void jLabel335MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel335MousePressed
    setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel335MousePressed

    private void jLabel339MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel339MousePressed
      setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel339MousePressed

    private void jLabel343MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel343MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel343MousePressed

    private void jLabel347MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel347MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel347MousePressed

    private void jLabel351MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel351MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel351MousePressed

    private void jLabel355MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel355MousePressed
        setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel355MousePressed

    private void jLabel359MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel359MousePressed
       setColor(dashboard);
        resetColor(subjects);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(dpanel);
        center.repaint();
        center.revalidate();
    }//GEN-LAST:event_jLabel359MousePressed

    private void jLabel365MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel365MousePressed
        setColor(subjects);
        resetColor(dashboard);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(subpanel);
        center.repaint();
        center.revalidate();
        
        con = Connect.ConnectDB();
        subjects();
    }//GEN-LAST:event_jLabel365MousePressed

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
      String sql = "insert into subjects ("
                +"Subject_Code,"
                +"Subject_Title,"
                +"Quarter_Semester,"
                +"Grade_Level,"
                +"Performance_Task,"
              +"Written_Work,"
                +"Quarterly_Assessment)"
                +"values ('"+subjectcode.getText()+"','"+subtitle.getText()+"','"+semester.getText()+"','"+level.getText()+"','"+performance.getText()+"','"+written.getText()+"','"+quarterly.getText()+"' )";
        try
        {
           pst = con.prepareStatement(sql);
           pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        subjectcode.setText(null);
       subtitle.setText(null);
       semester.setText(null);
       level.setText(null);
        quarterly.setText(null);
       written.setText(null);
       performance.setText(null);
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MousePressed
       subjectcode.setText(null);
       subtitle.setText(null);
       semester.setText(null);
       level.setText(null);
    }//GEN-LAST:event_jPanel15MousePressed

    private void jLabel362MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel362MousePressed
        setColor(subjects);
        resetColor(dashboard);
        resetColor(stud);
        resetColor(settings);

        
        center.removeAll();
        center.repaint();
        center.revalidate();
        
        center.add(addsubject);
        center.repaint();
        center.revalidate();
        
    }//GEN-LAST:event_jLabel362MousePressed

    private void jLabel372MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel372MousePressed
        new addstudents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel372MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
         String temp = jTextField1.getText()+ "%";
        String sql = "select * from MyStudents where Section like '"+temp+"'";
        try
        {
            pst = con.prepareStatement (sql);
            rs = pst.executeQuery();
            mystud.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseClicked
       int row = accounts.getSelectedRow();
        id.setText(accounts.getModel().getValueAt(row,0).toString());
        username.setText(accounts.getModel().getValueAt(row,1).toString());
        first.setText(accounts.getModel().getValueAt(row,4).toString());
        middle.setText(accounts.getModel().getValueAt(row,5).toString());
        last.setText(accounts.getModel().getValueAt(row,3).toString());
        pass.setText(accounts.getModel().getValueAt(row,2).toString());
    }//GEN-LAST:event_accountsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String sql = "update Account set First_Name = '"+first.getText()+"', Middle_name = '"+middle.getText()+"', Last_name = '"+last.getText() +"', Username = '"+username.getText() +"', Password = '"+pass.getText() +"' where ID_Number = '"+id.getText()+"'";
        
        try
        {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
            accounts();
        }
        catch (Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
        
        id.setText(null);
        last.setText(null);
        middle.setText(null);
        first.setText(null);
        username.setText(null);
        pass.setText(null);
        search.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
         String temp = search.getText()+ "%";
        String sql = "select * from Account where Last_name like '"+temp+"'";
        try
        {
	pst = con.prepareStatement (sql);
	rs = pst.executeQuery();
	accounts.setModel(DbUtils.resultSetToTableModel(rs));
        accounts.removeColumn(accounts.getColumnModel().getColumn(0));
        accounts.removeColumn(accounts.getColumnModel().getColumn(1));
        }
        catch (Exception e)
             {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_searchKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       id.setText(null);
        last.setText(null);
        middle.setText(null);
        first.setText(null);
        username.setText(null);
        pass.setText(null);
        search.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

    }//GEN-LAST:event_searchKeyReleased

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        new Grade_computation_frm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel8MousePressed

    private void abm_15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abm_15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_abm_15MousePressed

    private void stem_15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stem_15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stem_15MousePressed

    private void techvoc_15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techvoc_15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_techvoc_15MousePressed

    private void humss_15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humss_15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_humss_15MousePressed

    private void gas_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gas_13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gas_13MousePressed

    private void abm_16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abm_16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_abm_16MousePressed

    private void stem_16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stem_16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stem_16MousePressed

    private void techvoc_16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techvoc_16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_techvoc_16MousePressed

    private void humss_16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humss_16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_humss_16MousePressed

    private void Grade_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade_13MousePressed

    private void Grade_14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade_14MousePressed

    private void Grade_15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade_15MousePressed

    private void Grade_16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade_16MousePressed

    private void Grade_17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade_17MousePressed

    private void Grade_18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Grade_18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade_18MousePressed

    private void mysubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mysubMouseClicked
    int row = mysub.getSelectedRow();
        code.setText(mysub.getModel().getValueAt(row,0).toString());
        title.setText(mysub.getModel().getValueAt(row,1).toString());
        quarter.setText(mysub.getModel().getValueAt(row,2).toString());
        grade.setText(mysub.getModel().getValueAt(row,3).toString());        
    }//GEN-LAST:event_mysubMouseClicked

    private void mystudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mystudMouseClicked
         int row = mystud.getSelectedRow();
        idnumber.setText(mystud.getModel().getValueAt(row,0).toString());
        firstname.setText(mystud.getModel().getValueAt(row,1).toString());
        middlename.setText(mystud.getModel().getValueAt(row,2).toString());
        lastname.setText(mystud.getModel().getValueAt(row,3).toString());   
        section.setText(mystud.getModel().getValueAt(row,4).toString());
        grade_level.setText(mystud.getModel().getValueAt(row,5).toString());
        specialization.setText(mystud.getModel().getValueAt(row,6).toString());
    }//GEN-LAST:event_mystudMouseClicked

    private void jLabel42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MousePressed
       String sql = "delete * from MyStudents where ID = '"+idnumber.getText()+"'";

        try
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            students();
            idnumber.setText(null);
            firstname.setText(null);
            middlename.setText(null);
            lastname.setText(null);
            section.setText(null);
            grade_level.setText(null);
            specialization.setText(null);
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel42MousePressed

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        String sql = "delete * from subjects where Subject_Code = '"+code.getText()+"'";

        try
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            subjects();
            code.setText(null);
            title.setText(null);
            quarter.setText(null);
            grade.setText(null);
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String sql = "delete * from Account where ID_Number = '"+id.getText()+"'";

        try
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            accounts();
            id.setText(null);
            last.setText(null);
             middle.setText(null);
            first.setText(null);
            username.setText(null);
            pass.setText(null);
            search.setText(null);
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(102,102,102));
    }
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(153,153,153));
    }
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
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABM_11;
    private javax.swing.JPanel ABM_12;
    private javax.swing.JPanel GAS_11;
    private javax.swing.JPanel Grade10;
    private javax.swing.JPanel Grade7;
    private javax.swing.JPanel Grade8;
    private javax.swing.JPanel Grade9;
    private javax.swing.JPanel Grade_10;
    private javax.swing.JPanel Grade_11;
    private javax.swing.JPanel Grade_12;
    private javax.swing.JPanel Grade_13;
    private javax.swing.JPanel Grade_14;
    private javax.swing.JPanel Grade_15;
    private javax.swing.JPanel Grade_16;
    private javax.swing.JPanel Grade_17;
    private javax.swing.JPanel Grade_18;
    private javax.swing.JPanel Grade_7;
    private javax.swing.JPanel Grade_8;
    private javax.swing.JPanel Grade_9;
    private javax.swing.JPanel HUMSS_11;
    private javax.swing.JPanel HUMSS_12;
    private javax.swing.JPanel STEM_11;
    private javax.swing.JPanel STEM_12;
    private javax.swing.JPanel TV_11;
    private javax.swing.JPanel TV_12;
    private javax.swing.JTable abm;
    private javax.swing.JTable abm1;
    private javax.swing.JPanel abm_13;
    private javax.swing.JPanel abm_14;
    private javax.swing.JPanel abm_15;
    private javax.swing.JPanel abm_16;
    private javax.swing.JTable accounts;
    private javax.swing.JPanel addsubject;
    private javax.swing.JPanel center;
    private javax.swing.JTextField code;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel dpanel;
    private javax.swing.JTextField first;
    private javax.swing.JTextField firstname;
    private javax.swing.JTable gas;
    private javax.swing.JPanel gas_12;
    private javax.swing.JPanel gas_13;
    private javax.swing.JTextField grade;
    private javax.swing.JTable grade10;
    private javax.swing.JTable grade7;
    private javax.swing.JTable grade8;
    private javax.swing.JTable grade9;
    private javax.swing.JTextField grade_level;
    private javax.swing.JInternalFrame gradelevel;
    private javax.swing.JInternalFrame gradelevel1;
    private javax.swing.JPanel hide_subjects;
    private javax.swing.JTable humss;
    private javax.swing.JTable humss1;
    private javax.swing.JPanel humss_13;
    private javax.swing.JPanel humss_14;
    private javax.swing.JPanel humss_15;
    private javax.swing.JPanel humss_16;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idnumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField last;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField level;
    private javax.swing.JTextField middle;
    private javax.swing.JTextField middlename;
    private javax.swing.JTable mystud;
    private javax.swing.JTable mysub;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField performance;
    private javax.swing.JTextField quarter;
    private javax.swing.JTextField quarterly;
    private javax.swing.JTextField search;
    private javax.swing.JTextField section;
    private javax.swing.JTextField semester;
    private javax.swing.JPanel settingpanel;
    private javax.swing.JPanel settings;
    private javax.swing.JTextField specialization;
    private javax.swing.JTable stem;
    private javax.swing.JTable stem1;
    private javax.swing.JPanel stem_13;
    private javax.swing.JPanel stem_14;
    private javax.swing.JPanel stem_15;
    private javax.swing.JPanel stem_16;
    private javax.swing.JInternalFrame strand_11;
    private javax.swing.JInternalFrame strand_12;
    private javax.swing.JInternalFrame strand_13;
    private javax.swing.JInternalFrame strand_14;
    private javax.swing.JPanel stud;
    private javax.swing.JLabel studcount;
    private javax.swing.JPanel studpanel;
    private javax.swing.JTextField subjectcode;
    private javax.swing.JPanel subjects;
    private javax.swing.JPanel subpanel;
    private javax.swing.JTextField subtitle;
    private javax.swing.JPanel techvoc_13;
    private javax.swing.JPanel techvoc_14;
    private javax.swing.JPanel techvoc_15;
    private javax.swing.JPanel techvoc_16;
    private javax.swing.JTextField title;
    private javax.swing.JTable tv;
    private javax.swing.JTable tv1;
    private javax.swing.JTextField username;
    private javax.swing.JTextField written;
    // End of variables declaration//GEN-END:variables
}
