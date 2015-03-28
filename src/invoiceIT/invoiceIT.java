/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceIT;

import de.abas.ceks.jedp.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;
import microsoft.exchange.webservices.data.Appointment;
import microsoft.exchange.webservices.data.CalendarFolder;
import microsoft.exchange.webservices.data.CalendarView;
import microsoft.exchange.webservices.data.ConflictResolutionMode;
import microsoft.exchange.webservices.data.ExchangeService;
import microsoft.exchange.webservices.data.ExchangeVersion;
import microsoft.exchange.webservices.data.FindItemsResults;
import microsoft.exchange.webservices.data.ItemId;
import microsoft.exchange.webservices.data.MessageBody;
import microsoft.exchange.webservices.data.SendInvitationsOrCancellationsMode;
import microsoft.exchange.webservices.data.WebCredentials;
import microsoft.exchange.webservices.data.WellKnownFolderName;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.lang3.StringEscapeUtils;

/**
 *
 * @author günter
 */

public class invoiceIT extends javax.swing.JFrame {

    /**
     * Creates new form invoiceIT
     */
    private DefaultMutableTreeNode rootnode;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode nkunde;
    private DefaultMutableTreeNode nauftrag;
    private DefaultMutableTreeNode npos;
    private DefaultMutableTreeNode auNode;
    private DefaultMutableTreeNode tnNode;
    private DefaultMutableTreeNode aTnNode;
    private DefaultMutableTreeNode nDatum;
    private DefaultMutableTreeNode nJahr;
    private DefaultMutableTreeNode nMonat;
    //public String edpPasswort;
   /* String edpMandant;
    public String edpHost;
    int edpPort;
    public String mitarbeiter;
    public String exchange;
    public String exchuser;
    public String exchpass;
    public String internFirma;
    public boolean openTreeKunde;
    public boolean exchangeCalSuche;
    public boolean filosofie;
    public Date caldatum = new Date();
    public Object nodeInfoalt;*/
   



    public invoiceIT()  {
        GlobalVars globalVars = new GlobalVars();

        URL myIconUrl = this.getClass().getResource("Time-Machine-Disk-icon.png");
        this.setIconImage(new ImageIcon(myIconUrl, "InvoiceIT").getImage());
        // this.setIconImage( new ImageIcon(myIconUrl).getImage());
        GlobalVars.gruen = this.getClass().getResource("traffic-lights-green-icon.png");
        GlobalVars.rot = this.getClass().getResource("traffic-lights-red-icon.png");

        
       
        initComponents();
        DBInit();
        InitValues_READ();
        Orders_READ();
        if (!GlobalVars.internFirma.equals("GmbH & Co. KG.")){
                         jTabbedPane2.removeTabAt(2);
                         jTabbedPane2.removeTabAt(2);
                         jTabbedPane2.removeTabAt(2);
                         jTabbedPane2.removeTabAt(2);
                         //jTabbedPane1.removeTabAt(2);
                     }
        else 
        {
          Kennzahlen_READ();  
        }   
        jLabelSearchSatz.setText("");
        jLabelTreffer.setText("");
        jLabelVersion.setText("V"+GlobalVars.version) ;
        
 Releasetext();
    }
      
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jOffeneTNWert = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jStundenMonWert = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jEuroMonWert = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jStundenJahrWert = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jEuroJahrWert = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane7 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jAuftrag = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jKunde = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jAudatum = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jpnum = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jBetreff = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jArtname = new javax.swing.JTextField();
        jposid = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLimge = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jMge = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jBetrStaette = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPText = new javax.swing.JTextArea();
        jHe = new javax.swing.JLabel();
        KalenderPanel = new javax.swing.JPanel();
        jCalPanel6 = new CalPanel();
        jCalPanel7 = new CalPanel();
        jCalpanel5 = new CalPanel();
        jCalPanel4 = new CalPanel();
        jCalPanel3 = new CalPanel();
        jCalPanel2 = new CalPanel();
        jCalPanel1 = new CalPanel();
        kalenderrange = new javax.swing.JLabel();
        jButtonleft = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTyaukufr = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTyaukuho = new javax.swing.JTextField();
        jTyaukuka = new javax.swing.JTextField();
        jTyaukula = new javax.swing.JTextField();
        jTyaukulue = new javax.swing.JTextField();
        jTyaukuvs = new javax.swing.JTextField();
        jTyaukumue = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTyauneufr = new javax.swing.JTextField();
        jTyauneuho = new javax.swing.JTextField();
        jTyauneuka = new javax.swing.JTextField();
        jTyauneula = new javax.swing.JTextField();
        jTyauneulue = new javax.swing.JTextField();
        jTyauneumue = new javax.swing.JTextField();
        jTyauneuvs = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTyplanakt = new javax.swing.JTextField();
        jTyistakt = new javax.swing.JTextField();
        jTyerfuellakt = new javax.swing.JTextField();
        jTyplanvormo = new javax.swing.JTextField();
        jTyistvormo = new javax.swing.JTextField();
        jTyplanjanvormo = new javax.swing.JTextField();
        jTyistjanvormo = new javax.swing.JTextField();
        jTyerfuelljanvormo = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTyerpplanakt = new javax.swing.JTextField();
        jTyerpistakt = new javax.swing.JTextField();
        jTyerperfuellakt = new javax.swing.JTextField();
        jTyerpplanvormo = new javax.swing.JTextField();
        jTyerpistvormo = new javax.swing.JTextField();
        jTyerpplanjanvormo = new javax.swing.JTextField();
        jTyerpistjanvormo = new javax.swing.JTextField();
        jTyerperfuelljanvorm = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jTyhotstdakt = new javax.swing.JTextField();
        jTyhotstdvormo = new javax.swing.JTextField();
        jTyhotstdjanvormo = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTyhoterlakt = new javax.swing.JTextField();
        jTyhoterlvormo = new javax.swing.JTextField();
        jTyhoterljanvormo = new javax.swing.JTextField();
        jTyhotoffenakt = new javax.swing.JTextField();
        jTyhotaltakt = new javax.swing.JTextField();
        jTyhotaltvormo = new javax.swing.JTextField();
        jTyhotaltjanvormo = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jSearchKunde = new javax.swing.JTextField();
        jSearchAuftrag = new javax.swing.JTextField();
        jTextSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        jLabelSearchSatz = new javax.swing.JLabel();
        jLabelTreffer = new javax.swing.JLabel();
        jButtonSearchRueck = new javax.swing.JButton();
        jButtonSearchVorw = new javax.swing.JButton();
        jTNPanel = new javax.swing.JPanel();
        tnFahrtkosten = new javax.swing.JCheckBox();
        jUebernachtung = new javax.swing.JCheckBox();
        jFreigabe = new javax.swing.JCheckBox();
        labelVon = new javax.swing.JLabel();
        jTNVonH = new javax.swing.JComboBox();
        jTNBisH = new javax.swing.JComboBox();
        jTNVonM = new javax.swing.JComboBox();
        jTNBisM = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        labelBis = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNPauseH = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTNPauseM = new javax.swing.JComboBox();
        labelPause = new javax.swing.JLabel();
        labelNettoZeit = new javax.swing.JLabel();
        jKuBudget = new javax.swing.JTextField();
        jArbPaket = new javax.swing.JTextField();
        jBudgetLabel = new javax.swing.JLabel();
        jArbPaketLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTnText = new javax.swing.JTextArea();
        jverwaltungsText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labeldatum = new javax.swing.JLabel();
        jXDatePickerTN = new org.jdesktop.swingx.JXDatePicker();
        jSaveButton = new javax.swing.JButton();
        jPrintButton = new javax.swing.JButton();
        jDelButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jAmpel = new javax.swing.JLabel();
        jlabeldbid = new javax.swing.JLabel();
        dbID = new javax.swing.JTextField();
        jLabelVersion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuEinstellungen = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuExchange = new javax.swing.JMenuItem();
        jMenuWartung = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("invoiceIT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jLabel26.setText("zu übertragende TN's:");

        jOffeneTNWert.setText("jOffenTNWert");

        jLabel27.setText("Fakt. Zeit des Monats:");

        jStundenMonWert.setText("jStundenMonWert");

        jLabel28.setText("Fakt. Zeit des Jahres:");

        jEuroMonWert.setText("jEuroMonWert");

        jLabel29.setText("Umsatz des Monats:");

        jStundenJahrWert.setText("jStundenJahrWert");

        jLabel30.setText("Umsatz des Jahres:");

        jEuroJahrWert.setText("jEuroJahrWert");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Nicht synchronisiert");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setCellRenderer(renderer);
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jLabel12.setText("Nummer");

        jLabel13.setText("Kunde");

        jLabel14.setText("Vom");

        jAudatum.setText(" ");

        jLabel15.setText("Pnum");

        jBetreff.setColumns(20);
        jBetreff.setRows(5);
        jScrollPane3.setViewportView(jBetreff);

        jLabel16.setText("Betreff");

        jLabel17.setText("Artikel");

        jLabel18.setText("Offene Menge");

        jLabel19.setText("Text");

        jArtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArtnameActionPerformed(evt);
            }
        });

        jLabel20.setText("Positions ID");

        jLabel21.setText("Auftragsmenge");

        jLabel22.setText("Betriebsstätte");

        jPText.setColumns(20);
        jPText.setRows(5);
        jScrollPane4.setViewportView(jPText);

        jHe.setText("Std");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLimge, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMge, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jHe)
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jposid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBetrStaette))))
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel16))
                            .addComponent(jLabel17))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jAuftrag, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jKunde, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAudatum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jArtname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jAuftrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jKunde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jAudatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jpnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jposid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jArtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLimge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jMge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jBetrStaette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(22, 22, 22))
        );

        jTabbedPane2.addTab("Auftragsdaten", jPanel1);

        KalenderPanel.setPreferredSize(new java.awt.Dimension(95, 200));
        KalenderPanel.setRequestFocusEnabled(false);

        jCalPanel6.setName("jCalPanel6"); // NOI18N

        javax.swing.GroupLayout jCalPanel6Layout = new javax.swing.GroupLayout(jCalPanel6);
        jCalPanel6.setLayout(jCalPanel6Layout);
        jCalPanel6Layout.setHorizontalGroup(
            jCalPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jCalPanel6Layout.setVerticalGroup(
            jCalPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        jCalPanel7.setName("jCalPanel7"); // NOI18N

        javax.swing.GroupLayout jCalPanel7Layout = new javax.swing.GroupLayout(jCalPanel7);
        jCalPanel7.setLayout(jCalPanel7Layout);
        jCalPanel7Layout.setHorizontalGroup(
            jCalPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jCalPanel7Layout.setVerticalGroup(
            jCalPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCalpanel5.setName("jCalPanel5"); // NOI18N

        javax.swing.GroupLayout jCalpanel5Layout = new javax.swing.GroupLayout(jCalpanel5);
        jCalpanel5.setLayout(jCalpanel5Layout);
        jCalpanel5Layout.setHorizontalGroup(
            jCalpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );
        jCalpanel5Layout.setVerticalGroup(
            jCalpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCalPanel4.setName("jCalPanel4"); // NOI18N

        javax.swing.GroupLayout jCalPanel4Layout = new javax.swing.GroupLayout(jCalPanel4);
        jCalPanel4.setLayout(jCalPanel4Layout);
        jCalPanel4Layout.setHorizontalGroup(
            jCalPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jCalPanel4Layout.setVerticalGroup(
            jCalPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCalPanel3.setName("jCalPanel3"); // NOI18N

        javax.swing.GroupLayout jCalPanel3Layout = new javax.swing.GroupLayout(jCalPanel3);
        jCalPanel3.setLayout(jCalPanel3Layout);
        jCalPanel3Layout.setHorizontalGroup(
            jCalPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jCalPanel3Layout.setVerticalGroup(
            jCalPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCalPanel2.setName("jCalPanel2"); // NOI18N

        javax.swing.GroupLayout jCalPanel2Layout = new javax.swing.GroupLayout(jCalPanel2);
        jCalPanel2.setLayout(jCalPanel2Layout);
        jCalPanel2Layout.setHorizontalGroup(
            jCalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jCalPanel2Layout.setVerticalGroup(
            jCalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCalPanel1.setName("jCalPanel1"); // NOI18N

        javax.swing.GroupLayout jCalPanel1Layout = new javax.swing.GroupLayout(jCalPanel1);
        jCalPanel1.setLayout(jCalPanel1Layout);
        jCalPanel1Layout.setHorizontalGroup(
            jCalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jCalPanel1Layout.setVerticalGroup(
            jCalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        kalenderrange.setText("kalenderrange");

        jButtonleft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoiceIT/Actions-arrow-left-icon.png"))); // NOI18N
        jButtonleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonleftActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoiceIT/Actions-arrow-right-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KalenderPanelLayout = new javax.swing.GroupLayout(KalenderPanel);
        KalenderPanel.setLayout(KalenderPanelLayout);
        KalenderPanelLayout.setHorizontalGroup(
            KalenderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KalenderPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCalPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalpanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(KalenderPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButtonleft, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(kalenderrange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        KalenderPanelLayout.setVerticalGroup(
            KalenderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KalenderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KalenderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalenderrange)
                    .addComponent(jButtonleft)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(KalenderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCalPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCalpanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCalPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCalPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCalPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCalPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCalPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Kalender", KalenderPanel);

        jLabel25.setText("Hockenheim");

        jLabel24.setText("Freiburg");

        jTyaukufr.setEditable(false);

        jLabel23.setText("Auftragsbestand Kunden");

        jTyaukuho.setEditable(false);

        jTyaukuka.setEditable(false);

        jTyaukula.setEditable(false);

        jTyaukulue.setEditable(false);

        jTyaukuvs.setEditable(false);

        jTyaukumue.setEditable(false);

        jLabel31.setText("€");

        jLabel32.setText("€");

        jLabel33.setText("€");

        jLabel34.setText("€");

        jLabel35.setText("€");

        jLabel36.setText("€");

        jLabel37.setText("€");

        jLabel38.setText("Karlsruhe");

        jLabel39.setText("Langen");

        jLabel40.setText("Lüdenscheidt");

        jLabel41.setText("München");

        jLabel42.setText("VS");

        jLabel43.setText("Auftragsbestand Einführung");

        jTyauneufr.setEditable(false);

        jTyauneuho.setEditable(false);

        jTyauneuka.setEditable(false);

        jTyauneula.setEditable(false);

        jTyauneulue.setEditable(false);

        jTyauneumue.setEditable(false);

        jTyauneuvs.setEditable(false);

        jLabel44.setText("€");

        jLabel45.setText("€");

        jLabel46.setText("€");

        jLabel47.setText("€");

        jLabel48.setText("€");

        jLabel49.setText("€");

        jLabel50.setText("€");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTyaukufr, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTyaukuho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTyaukuka, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTyaukula, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTyaukumue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTyaukulue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTyaukuvs, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)))
                .addGap(111, 111, 111)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTyauneuvs, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50))
                    .addComponent(jLabel43)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTyauneumue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTyauneulue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTyauneula, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTyauneuka, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTyauneuho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTyauneufr, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel49)
                            .addComponent(jLabel48))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel43))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTyaukufr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jTyauneufr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTyaukuho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jTyauneuho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyaukuka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyaukula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel39)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyauneuka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyauneula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyaukulue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyaukumue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel41)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyauneulue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTyauneumue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTyaukuvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33)
                        .addComponent(jLabel42))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTyauneuvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Auftragsbestand", jPanel5);

        jLabel51.setText("Dienstleistungen");

        jLabel52.setText("Plan akt. Monat");

        jLabel53.setText("Ist akt. Monat");

        jLabel54.setText("Erfüllung akt. Monat");

        jLabel55.setText("Lizenzen");

        jLabel56.setText("Plan Vormonat");

        jLabel57.setText("Ist Vormonat");

        jLabel58.setText("Plan Jan-Vormonat");

        jLabel59.setText("Ist Jan-Vormonat");

        jLabel60.setText("Erfüllung Jan-Vormonat");

        jTyplanakt.setEditable(false);

        jTyistakt.setEditable(false);

        jTyerfuellakt.setEditable(false);

        jTyplanvormo.setEditable(false);

        jTyistvormo.setEditable(false);

        jTyplanjanvormo.setEditable(false);

        jTyistjanvormo.setEditable(false);

        jTyerfuelljanvormo.setEditable(false);

        jLabel61.setText("€");

        jLabel62.setText("€");

        jLabel63.setText("€");

        jLabel64.setText("€");

        jLabel65.setText("€");

        jLabel66.setText("€");

        jLabel67.setText("%");

        jLabel68.setText("%");

        jLabel69.setText("ERP Plan akt. Monat");

        jLabel70.setText("ERP Ist akt. Monat");

        jLabel71.setText("ERP Plan Vormonat");

        jLabel72.setText("ERP Ist Vormonat");

        jLabel73.setText("ERP Plan Jan-Vormonat");

        jLabel74.setText("ERP Ist Jan-Vormonat");

        jLabel75.setText("ERp Erfüllung Jan-Vormonat");

        jLabel76.setText("ERP Erfüllung akt. Monat");

        jTyerpplanakt.setEditable(false);

        jTyerpistakt.setEditable(false);

        jTyerperfuellakt.setEditable(false);
        jTyerperfuellakt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTyerperfuellaktActionPerformed(evt);
            }
        });

        jTyerpplanvormo.setEditable(false);
        jTyerpplanvormo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTyerpplanvormoActionPerformed(evt);
            }
        });

        jTyerpistvormo.setEditable(false);

        jTyerpplanjanvormo.setEditable(false);

        jTyerpistjanvormo.setEditable(false);

        jTyerperfuelljanvorm.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTyistjanvormo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTyplanjanvormo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTyistvormo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTyplanvormo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTyplanakt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTyistakt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTyerfuellakt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTyerfuelljanvormo))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel55))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel67)
                            .addComponent(jLabel64)
                            .addComponent(jLabel63)
                            .addComponent(jLabel66)
                            .addComponent(jLabel65)
                            .addComponent(jLabel68))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74)
                            .addComponent(jLabel73)
                            .addComponent(jLabel72)
                            .addComponent(jLabel71)
                            .addComponent(jLabel76)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTyerpplanakt, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jTyerpistakt)
                            .addComponent(jTyerperfuellakt)
                            .addComponent(jTyerpplanvormo)
                            .addComponent(jTyerpistvormo)
                            .addComponent(jTyerpplanjanvormo)
                            .addComponent(jTyerpistjanvormo)
                            .addComponent(jTyerperfuelljanvorm))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTyplanakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel69)
                    .addComponent(jTyerpplanakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTyistakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel70)
                    .addComponent(jTyerpistakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTyerfuellakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel76)
                    .addComponent(jTyerperfuellakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTyplanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel71)
                    .addComponent(jTyerpplanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTyistvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel72)
                    .addComponent(jTyerpistvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTyplanjanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel73)
                    .addComponent(jTyerpplanjanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTyistjanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel74)
                    .addComponent(jTyerpistjanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTyerfuelljanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel75)
                    .addComponent(jTyerperfuelljanvorm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Umsätze", jPanel6);

        jLabel77.setText("erfasste Hotline Stunden");

        jLabel78.setText("erledigte Hotline Vorgänge");

        jLabel79.setText("erfasste Hotline Stunden akt. Monat");

        jLabel80.setText("erfasste Hotline Stunden Vormonat");

        jLabel81.setText("erfasste Hotline Stunden Jan-Vormonat");

        jTyhotstdakt.setEditable(false);

        jTyhotstdvormo.setEditable(false);

        jTyhotstdjanvormo.setEditable(false);
        jTyhotstdjanvormo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTyhotstdjanvormoActionPerformed(evt);
            }
        });

        jLabel82.setText("offene Hotline Vorgänge");

        jLabel83.setText("offene Hotline Vorgänge aktuell");

        jLabel84.setText("offene Hotline Vorgänge akt. Monat");

        jLabel85.setText("offene Hotline Vorgänge Vormonat");

        jLabel86.setText("erfasst vor Vormonat");

        jLabel87.setText("erledigte Hotline Vorgänge akt. Monat");

        jLabel88.setText("erledigte Hotline Vorgänge Vormonat");

        jLabel89.setText("erledigte Hotline Vorgänge Jan-Vormonat");

        jTyhoterlakt.setEditable(false);

        jTyhoterlvormo.setEditable(false);

        jTyhoterljanvormo.setEditable(false);

        jTyhotoffenakt.setEditable(false);

        jTyhotaltakt.setEditable(false);

        jTyhotaltvormo.setEditable(false);

        jTyhotaltjanvormo.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel77)
                            .addGap(200, 200, 200)
                            .addComponent(jLabel78))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel83)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel79)
                                        .addComponent(jLabel81)
                                        .addComponent(jLabel80))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTyhotstdakt, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(jTyhotstdvormo)
                                        .addComponent(jTyhotstdjanvormo))))
                            .addGap(105, 105, 105)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel87)
                                .addComponent(jLabel88)
                                .addComponent(jLabel89))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTyhoterljanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTyhoterlvormo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTyhoterlakt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel82))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel86))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTyhotoffenakt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel85))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTyhotaltvormo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTyhotaltakt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTyhotaltjanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jTyhotstdakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(jTyhoterlakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTyhotstdvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel88)
                    .addComponent(jTyhoterlvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTyhotstdjanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel89)
                    .addComponent(jTyhoterljanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jTyhotoffenakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jTyhotaltakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTyhotaltvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTyhotaltjanvormo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jTabbedPane2.addTab("Hotline", jPanel7);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Betriebsstätte", "Kunde", "Status", "Vertreter", "Projektleiter", "PL-Fibu", "offener Auftragswert", "Lizenzen", "Einführungsstatus", "nächste Stufe", "Echtstart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        jTabbedPane2.addTab("Projekte", jPanel8);

        jLabel90.setText("Kunde");

        jLabel91.setText("Auftrag");

        jLabel92.setText("Suche nach");

        jSearchKunde.setEditable(false);

        jSearchAuftrag.setEditable(false);

        jButtonSearch.setText("Suchen");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel93.setText("Treffer");

        jLabelSearchSatz.setText("jLabelSearch");

        jLabelTreffer.setText("jLabelTreffer");

        jButtonSearchRueck.setText("Rückwärts");
        jButtonSearchRueck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchRueckActionPerformed(evt);
            }
        });

        jButtonSearchVorw.setText("Vorwärts");
        jButtonSearchVorw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchVorwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel91)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSearchAuftrag, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel90)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSearchKunde, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel93)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelSearchSatz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTreffer))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSearch))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jButtonSearchRueck)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSearchVorw)))))
                        .addGap(0, 215, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jLabelSearchSatz)
                    .addComponent(jLabelTreffer))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchRueck)
                    .addComponent(jButtonSearchVorw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jSearchKunde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jSearchAuftrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jTabbedPane2.addTab("Volltextsuche", jPanel9);

        jTNPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("TN"));
        jTNPanel.setName("jTNPanel"); // NOI18N

        tnFahrtkosten.setText("Fahrtkosten");
        tnFahrtkosten.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tnFahrtkosten.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tnFahrtkosten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnFahrtkostenActionPerformed(evt);
            }
        });

        jUebernachtung.setText("Übernachtung");
        jUebernachtung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jUebernachtung.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jUebernachtung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUebernachtungActionPerformed(evt);
            }
        });

        jFreigabe.setText("Freigegeben");
        jFreigabe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jFreigabe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jFreigabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFreigabeActionPerformed(evt);
            }
        });

        labelVon.setText("Zeit von");

        jTNVonH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jTNVonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNVonHActionPerformed(evt);
            }
        });

        jTNBisH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jTNBisH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNBisHActionPerformed(evt);
            }
        });

        jTNVonM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
        jTNVonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNVonMActionPerformed(evt);
            }
        });

        jTNBisM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
        jTNBisM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNBisMActionPerformed(evt);
            }
        });

        jLabel2.setText(":");

        labelBis.setText("-");

        jLabel4.setText(":");

        jTNPauseH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jTNPauseH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNPauseHActionPerformed(evt);
            }
        });

        jLabel5.setText(":");

        jTNPauseM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
        jTNPauseM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNPauseMActionPerformed(evt);
            }
        });

        labelPause.setText("Pause");

        labelNettoZeit.setText("Nettoarbeitszeit");
        labelNettoZeit.setToolTipText("");

        jKuBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKuBudgetActionPerformed(evt);
            }
        });
        jKuBudget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jKuBudgetKeyPressed(evt);
            }
        });

        jArbPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArbPaketActionPerformed(evt);
            }
        });
        jArbPaket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jArbPaketKeyPressed(evt);
            }
        });

        jBudgetLabel.setText("Budgetpos.");

        jArbPaketLabel.setText("Arb. Paket");

        jTnText.setColumns(20);
        jTnText.setRows(5);
        jTnText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTnTextKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTnText);

        jLabel10.setText("Verwaltungsinfo");

        labeldatum.setText("Datum");

        jXDatePickerTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePickerTNActionPerformed(evt);
            }
        });

        jSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoiceIT/1322325112_disk.png"))); // NOI18N
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });

        jPrintButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoiceIT/1322324936_print.png"))); // NOI18N
        jPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintButtonActionPerformed(evt);
            }
        });

        jDelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoiceIT/Trash-icon.png"))); // NOI18N
        jDelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDelButtonActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoiceIT/Clipboard-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jAmpel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoiceIT/traffic-lights-green-icon.png"))); // NOI18N

        jlabeldbid.setText("ID");

        dbID.setEditable(false);

        javax.swing.GroupLayout jTNPanelLayout = new javax.swing.GroupLayout(jTNPanel);
        jTNPanel.setLayout(jTNPanelLayout);
        jTNPanelLayout.setHorizontalGroup(
            jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTNPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jTNPanelLayout.createSequentialGroup()
                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jverwaltungsText)
                    .addGroup(jTNPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jTNPanelLayout.createSequentialGroup()
                        .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTNPanelLayout.createSequentialGroup()
                                .addComponent(labeldatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDatePickerTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jTNPanelLayout.createSequentialGroup()
                                        .addComponent(tnFahrtkosten)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jUebernachtung))
                                    .addGroup(jTNPanelLayout.createSequentialGroup()
                                        .addComponent(jTNBisH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTNBisM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFreigabe)
                                .addGap(25, 25, 25)
                                .addComponent(jSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jTNPanelLayout.createSequentialGroup()
                                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNettoZeit)
                                    .addGroup(jTNPanelLayout.createSequentialGroup()
                                        .addComponent(labelVon)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTNVonH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTNVonM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(labelBis)))
                                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jTNPanelLayout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(labelPause)
                                        .addGap(25, 25, 25)
                                        .addComponent(jTNPauseH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTNPauseM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTNPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBudgetLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jKuBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jArbPaketLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jArbPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))))
                        .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTNPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jDelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTNPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTNPanelLayout.createSequentialGroup()
                                        .addComponent(jAmpel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlabeldbid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dbID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jTNPanelLayout.setVerticalGroup(
            jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTNPanelLayout.createSequentialGroup()
                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jTNPanelLayout.createSequentialGroup()
                        .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTNPanelLayout.createSequentialGroup()
                                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tnFahrtkosten)
                                        .addComponent(jUebernachtung)
                                        .addComponent(jFreigabe)
                                        .addComponent(labeldatum)
                                        .addComponent(jXDatePickerTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTNVonM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jTNPauseH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTNPauseM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelBis)
                                        .addComponent(labelVon)
                                        .addComponent(jTNBisH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTNBisM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPause)
                                        .addComponent(dbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlabeldbid)
                                        .addComponent(jTNVonH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jAmpel)))
                            .addComponent(jDelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jTNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNettoZeit)
                            .addComponent(jKuBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jArbPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBudgetLabel)
                            .addComponent(jArbPaketLabel)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jverwaltungsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jScrollPane7.setViewportView(mainPanel);

        jLabelVersion.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabelVersion.setText("jLabel1");

        jMenu1.setText("Datei");

        jMenuItem1.setText("Sync");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSyncActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuEinstellungen.setText("Einstellungen");
        jMenuEinstellungen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEinstellungenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEinstellungen);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Hilfe");

        aboutMenuItem.setText("Über InvoiceIT");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(aboutMenuItem);
        jMenu2.add(jSeparator3);

        jMenuExchange.setText("Exchange Kalenderanalyse");
        jMenuExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExchangeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuExchange);

        jMenuWartung.setText("Wartungspasswort");
        jMenuWartung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuWartungActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuWartung);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jOffeneTNWert)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jStundenMonWert))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEuroMonWert)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jEuroJahrWert)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jStundenJahrWert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVersion)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addComponent(jScrollPane7)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane7)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(jOffeneTNWert)
                                .addComponent(jLabel27)
                                .addComponent(jStundenMonWert)
                                .addComponent(jLabel28)
                                .addComponent(jStundenJahrWert))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jEuroMonWert)
                            .addComponent(jLabel30)
                            .addComponent(jEuroJahrWert))
                        .addGap(1, 1, 1)
                        .addComponent(jLabelVersion))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEinstellungenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEinstellungenActionPerformed
        //Einstellungen Fenster aufrufen
        JFrame mainFrame = this;
        Einstellungen XE = new Einstellungen(mainFrame, true, GlobalVars.edpHost, Integer.toString(GlobalVars.edpPort), GlobalVars.edpMandant, GlobalVars.edpPasswort, GlobalVars.mitarbeiter, GlobalVars.exchange, GlobalVars.exchuser, GlobalVars.exchpass, GlobalVars.internFirma, GlobalVars.openTreeKunde, GlobalVars.exchangeCalSuche, GlobalVars.updateLocation,GlobalVars.filosofie);
        String sedpPort = (Integer.toString(GlobalVars.edpPort));
        XE.setVisible(true);
        GlobalVars.edpHost = XE.getHost();
        GlobalVars.edpPort = XE.getPort();
        GlobalVars.edpMandant = XE.getMandant();
        GlobalVars.edpPasswort = XE.getPasswort();
        GlobalVars.mitarbeiter = XE.getMitarbeiter();
        GlobalVars.exchange = XE.getExchange();
        GlobalVars.exchuser = XE.getExchuser();
        GlobalVars.exchpass = XE.getExchpass();
        GlobalVars.internFirma = XE.getFirma();
        GlobalVars.openTreeKunde = XE.getTreeOpenKunde();
        GlobalVars.exchangeCalSuche = XE.getExchangeCalSuche();
        GlobalVars.updateLocation = XE.getUpdateLocation();
        GlobalVars.filosofie = XE.getFilosofie();
        InitValues_WRITE();
    }//GEN-LAST:event_jMenuEinstellungenActionPerformed

    private void jMenuSyncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSyncActionPerformed
        boolean termingefunden;
        String audatum1;
        String audatum2;
        String ftext;
        String tntext;
        String tnkunde;
        Calendar cal = new GregorianCalendar();
        int timezoneOffset = (cal.get(Calendar.ZONE_OFFSET) + cal.get(Calendar.DST_OFFSET));
        int i = 0;
        float prozent;
        int iprozent;
        boolean exchangeconnect = false;
        ExchangeService service = null;


        // Prüfen ob Exchange konfiguriert wurde
        if ((!GlobalVars.exchange.equals("")) && (!GlobalVars.exchuser.equals("")) && (!GlobalVars.exchpass.equals(""))) {
            exchangeconnect = true;
        } else {
            exchangeconnect = false;
        }
//Exchange Server - Verbindung aufbauen 
        if (exchangeconnect) {
            try {
                service = new ExchangeService(ExchangeVersion.Exchange2010_SP1);
                //service.setUrl(new URI("https://topas/ews/Exchange.asmx"));
                service.setUrl(new URI(GlobalVars.exchange));
                service.setCredentials(new WebCredentials(GlobalVars.exchuser, GlobalVars.exchpass));

            } catch (URISyntaxException ex) {
                exchangeconnect = false;
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                MyException(ex.toString());
            }

        }


        if (GlobalVars.edpHost == null) {
            //Einstellungen aufrufen
            jMenuEinstellungenActionPerformed(evt);
        }
        JFrame mainFrame = this;


        jProgressBar1.paint(jProgressBar1.getGraphics());
        //      statusPanel.paint(statusPanel.getGraphics());

        String abasTnId;
        EDPEditor edpE1 = null;
        //Cursor Wait setzen
        jProgressBar1.setStringPainted(true);
        jProgressBar1.paint(jProgressBar1.getGraphics());

        mainFrame.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        // Edp Verbindung aufbauen

        jProgressBar1.setString("EDP Session aufbauen");
        jProgressBar1.paint(jProgressBar1.getGraphics());




        EDPSession session = SessionAufbauen();








        if (session != null) {
            try {
                // Neues Objekt zum Ändern der FTextMode-Einstellung
                EDPFTextMode ftm = new EDPFTextMode(EDPFTextMode.FTMODE_TEXT);

                session.setFTMode(ftm);

                EDPQuery edpQ1 = session.createQuery();
                // Selektion durchführen  

                // Freitext-Mode





                String selektion = "kunde=;kotyp=Auftrag;ygwueber=ja;kopf^vsperre=nein;status=`;@ablage=lebendig;@sort=artikel;@ordnung=kunde^such,kopf^nummer";
                edpQ1.startQuery("3:2", "", selektion, "id");
                edpQ1.getLastRecord();
                Integer maxrecords = edpQ1.getRecordCount();


                edpQ1.startQuery("3:2", "", selektion, "id, kopf^nummer, kunde^such, art^such,limge,mge,ysupptext,pnum,kovom,kopf^betreff,ptext,"
                        + "kopf^ybetrstaette^yfirmenart,kopf^ybetrstaette^ystr,kopf^ybetrstaette^yplz,kopf^ybetrstaette^ynort,"
                        + "kopf^ybetrstaette^ytele,kopf^ybetrstaette^yfax,kopf^ybetrstaette^yemail,"
                        + "kopf^ans,kopf^plz,kopf^str,kopf^nort,kopf^ybetrstaette^such,he,pftext");



                //Integer maxrecords = edpQ1.getRecordCount();
                //System.out.println(maxrecords.toString());
                //edpQ1.getFirstRecord();
                // System.out.println("Maximale Datensätze "+maxrecords);
                //DB Connect

                Connection connection = DB_CONNECT();
                java.sql.Statement xstatement = connection.createStatement();
                // DB Löschen  
                Integer iresult = xstatement.executeUpdate("DELETE  FROM ORDERS");
                // Alles in DB Orders schreiben
                edpE1 = session.createEditor();
                while (edpQ1.getNextRecord()) {

                    System.out.println("--------------------------------------------");
                    System.out.println(edpQ1.getField(1));
                    System.out.println(edpQ1.getField(2));
                    System.out.println(edpQ1.getField(3));
                    System.out.println(edpQ1.getField(4));
                    System.out.println(edpQ1.getField(5));
                    System.out.println(edpQ1.getField(6));
                    System.out.println(edpQ1.getField(7));
                    System.out.println(edpQ1.getField(8));
                    
                    System.out.println(edpQ1.getField(9));
                    System.out.println(edpQ1.getField(10));
                    System.out.println(edpQ1.getField(11));

                    System.out.println(edpQ1.getField(12));
                    System.out.println(edpQ1.getField(13));
                    System.out.println(edpQ1.getField(14));
                    System.out.println(edpQ1.getField(15));
                    System.out.println(edpQ1.getField(16));
                    System.out.println(edpQ1.getField(17));
                    System.out.println(edpQ1.getField(18));
                    System.out.println(edpQ1.getField(19));
                    System.out.println(edpQ1.getField(20));
                    System.out.println(edpQ1.getField(21));
                    System.out.println(edpQ1.getField(22));
                    System.out.println(edpQ1.getField(23));
                    System.out.println(edpQ1.getField(24));
                    System.out.println(edpQ1.getField(25));
                    //   
                    //edpE1.beginView(edpQ1.getField(1));
                    //ftext=edpE1.getFText(1,"pftext"); 
                    //edpE1.endEditCancel();

                    i = i + 1;
                    prozent = 100 * i / maxrecords;
                    iprozent = (int) Math.rint(prozent);
                    jProgressBar1.setValue((int) Math.rint(prozent));
                    jProgressBar1.setString("Auftragsdaten abholen - " + iprozent + "%");
                    jProgressBar1.paint(jProgressBar1.getGraphics());

                    //     System.out.println(edpQ1.getField(1) + " " + edpQ1.getField(2) + " " + edpQ1.getField(11));


                    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ORDERS VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    preparedStatement.setString(1, edpQ1.getField(1)); // id
                    preparedStatement.setString(2, edpQ1.getField(2)); // nummer
                    preparedStatement.setString(3, edpQ1.getField(3)); // kunde^such
                    preparedStatement.setString(4, edpQ1.getField(4)); // art^name
                    preparedStatement.setFloat(5, Float.parseFloat(edpQ1.getField(5).replaceAll(" ", ""))); // limge
                    preparedStatement.setFloat(6, Float.parseFloat(edpQ1.getField(6).replaceAll(" ", ""))); // mge
                    ftext = (edpQ1.getField(7) + "\n" + edpQ1.getField(11) + "\n" + edpQ1.getField(25));
                    if (ftext.length() > 999) {
                        ftext = ftext.substring(0, 999);
                    }
                    preparedStatement.setString(7, (ftext)); //ysupptext+ptext+pftext
                    //pftext klemmt noch !!!
                    //    preparedStatement.setString(7, edpQ1.getField(7)); //ptext
                    preparedStatement.setString(8, edpQ1.getField(8));//pnum
                    audatum1=edpQ1.getField(9).substring(0,6);
                    audatum2=edpQ1.getField(9).substring(6);
                    preparedStatement.setString(9, audatum1+"20"+audatum2);//audatum
                    preparedStatement.setString(10, edpQ1.getField(10));//betreff

                    preparedStatement.setString(11, edpQ1.getField(12));//Firmenart
                    preparedStatement.setString(12, edpQ1.getField(13));//Strasse
                    preparedStatement.setString(13, edpQ1.getField(14));//PLZ
                    preparedStatement.setString(14, edpQ1.getField(15));//Ort
                    preparedStatement.setString(15, edpQ1.getField(16));//Telefon
                    preparedStatement.setString(16, edpQ1.getField(17));//Fax

                    preparedStatement.setString(17, edpQ1.getField(18));//Email
                    preparedStatement.setString(18, edpQ1.getField(19));//Kans
                    preparedStatement.setString(19, edpQ1.getField(20));//Kplz
                    preparedStatement.setString(20, edpQ1.getField(21));//KStr
                    preparedStatement.setString(21, edpQ1.getField(22));//Kort
                    preparedStatement.setString(22, edpQ1.getField(23));
                    preparedStatement.setString(23, edpQ1.getField(24));
                    preparedStatement.execute();
                    preparedStatement.close();
                }

                // TN's übertragen
                //1. Nachschauen ob in ZD ein Datensatz für heute vorhanden ist
                jProgressBar1.setValue(0);
                jProgressBar1.setString("TN's übertragen");
                jProgressBar1.paint(jProgressBar1.getGraphics());

                Date heute = new Date();
                SimpleDateFormat myDate = new SimpleDateFormat("dd.MM.yy");
                selektion = "erfdat=" + myDate.format(heute);
                edpE1 = session.createEditor();
                edpQ1.startQuery("47:2", "", selektion, "id");
                if (edpQ1.getFirstRecord()) {//Datensatz vorhanden
                    abasTnId = edpQ1.getField(1);
                    //System.out.println(abasTnId);
                } else {//Datensatz neu anlegen

                    //edpE1.beginEdit(EDPEditAction.NEW, "47:1", heute, EDPEditRefType.EMPTY, heute);
                    edpE1.beginEditNew("47", "2");
                    edpE1.setFieldVal("such", "TN" + myDate.format(heute));

                    edpE1.endEditSave();
                    abasTnId = edpE1.getEditID();

                }
                // TN SYNC
                xstatement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

                //Selekt auf alles in Orders
                ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM TN where freigabe=1");
                dbresultSet.last();
                maxrecords = dbresultSet.getRow();
                i = 0;
                dbresultSet.beforeFirst();
                //dbresultSet.first();
                //dbresultSet = xstatement.executeQuery("SELECT * FROM TN where freigabe=1");
                while (dbresultSet.next()) {

                    //Abas TN Datensatz editieren 
                    i = i + 1;
                    prozent = 100 * i / maxrecords;
                    iprozent = (int) Math.rint(prozent);
                    jProgressBar1.setValue((int) Math.rint(prozent));
                    jProgressBar1.setString("TN's übertragen - " + iprozent + "%");
                    jProgressBar1.paint(jProgressBar1.getGraphics());

                    edpE1.beginEdit(EDPEditor.EDIT_UPDATE, "47", "2", EDPEditor.REFTYPE_REF, abasTnId);
                    edpE1.insertRow(1);

                    //ID,AuposId,datum,von,bis,pause,fahrtkosten,text
                    edpE1.setFieldVal(1, "ytnaupos", dbresultSet.getString(2));
                    Date tndatum = dbresultSet.getDate(3);
                    myDate = new SimpleDateFormat("dd.MM.yy");
                    edpE1.setFieldVal(1, "ytndatum", myDate.format(tndatum).toString());
                    Date tnvon = dbresultSet.getTime(4);
                    myDate = new SimpleDateFormat("HH:mm");
                    edpE1.setFieldVal(1, "ytnvon", myDate.format(tnvon).toString());
                    Date tnbis = dbresultSet.getTime(5);
                    edpE1.setFieldVal(1, "ytnbis", myDate.format(tnbis).toString());
                    //System.out.println(myDate.format(tnbis).toString());
                    Date tnpause = dbresultSet.getTime(6);
                    edpE1.setFieldVal(1, "ytnpause", myDate.format(tnpause).toString());
                    edpE1.setFieldVal(1, "ytnfahrtkosten", "" + dbresultSet.getInt(7));
                    edpE1.setFText(1, "ytntext", dbresultSet.getString(8));
                    tntext = dbresultSet.getString(8);
                    //edpE1.setFieldVal(1, "ytnmitarb", edpMitarbeiter);
                    // In abas setzen per efop!
                    edpE1.setFieldVal(1, "ytnkunde", dbresultSet.getString(9));
                    tnkunde = dbresultSet.getString(9);
                    edpE1.setFieldVal(1, "ytnauftrag", dbresultSet.getString(10));

                    edpE1.setFieldVal(1, "ytnschlag", dbresultSet.getString(12));

                    edpE1.setFieldVal(1, "ytnneu", "ja");
                    // edpE1.setFieldVal(1,"ytnschlag",dbresultSet.getString(12));
                    // Netto TN Zeit noch errechnen, damits in abas keiner machen muss
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                    Date pzero = dateFormat.parse("01.01.1970 00:00");
                    float ptime = (tnpause.getTime() - pzero.getTime());
                    ptime = ptime / 3600000;
                    float nettotime = (tnbis.getTime() - tnvon.getTime());
                    nettotime = (nettotime / 3600000) - ptime;
                    nettotime = ((nettotime * 100) / 100);
                    //
                    edpE1.setFieldVal(1, "ytnmge", new Float(nettotime).toString());
                    edpE1.setFieldVal(1, "ybudgetku", dbresultSet.getString(33));
                    edpE1.setFieldVal(1, "yarbpaket", dbresultSet.getString(34));
                    edpE1.setFieldVal(1, "yuebernachtung", "" + dbresultSet.getInt(35));
                    //....
                    edpE1.endEditSave();
                    //TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
                    //

                    
                    java.sql.Statement xstatement2 = connection.createStatement();
                    PreparedStatement preparedStatement = connection.prepareStatement("INSERT  INTO TNARCHIV (AUPOSID,DATUm,VON,BIS,PAUSE,FAHRTKOSTEN,TEXT,Kunde,Auftrag,verwaltung,"
                            + "pnum,audatum,betreff,ffirmenart,fstrasse,fplz,fort,ftele,ffax,femail,kans,kplz,kstr,kort,artname,limge,mge,ptext, Betrstaette,he, "
                            + "kubudget,arbpaket,uebernachtung)"
                            + "SELECT AUPOSID,DATUM,Von,BIS,PAUSE,FAHRTKOSTEN,TEXT,Kunde,Auftrag,verwaltung,"
                            + "pnum,audatum,betreff,ffirmenart,fstrasse,fplz,fort,ftele,ffax,femail,kans,kplz,kstr,kort,artname,limge,mge,ptext,betrstaette,he,"
                            + "kubudget,arbpaket,uebernachtung"
                            + " FROM TN WHERE ID = " + dbresultSet.getInt(1));
                    preparedStatement.execute();
                    preparedStatement.close();
                    //Datensatz in TN löschen
                    preparedStatement = connection.prepareStatement("DELETE FROM TN WHERE ID = " + dbresultSet.getInt(1));
                    preparedStatement.execute();
                    preparedStatement.close();




                    //Termin in Exchange eintragen
                    if (exchangeconnect) {
                        Exchange_Set_Appointment(tndatum, tnkunde, tntext, tnvon, tnbis, timezoneOffset, service, dbresultSet);
                    }
                }

                //Nur für die gmbh & CO.KG
                if (GlobalVars.internFirma.equals("GmbH & Co. KG.")) {
                    // Kennzahlen abholen
                    Kennzahlen_LOAD(edpQ1, connection);
                    //Kenndaten aus DB in Maske darstellen
                Kennzahlen_READ();
                }
                
                //Exchange Kalender abholen
                if (exchangeconnect) {
                    Kalender_Abgleich(connection, service, timezoneOffset);
                }

                connection.close();
                session.endSession();
                Orders_READ();

                /// Update Check
                jProgressBar1.setString("Update Check");
                jProgressBar1.paint(jProgressBar1.getGraphics());
                checkupdate();
                jProgressBar1.setValue(0);
                jProgressBar1.setString("");
                jProgressBar1.paint(jProgressBar1.getGraphics());
                GetJoke();
                  
                  
                    jProgressBar1.setValue(100);
                    jProgressBar1.setString("Sync beendet");
                    jProgressBar1.paint(jProgressBar1.getGraphics());
            } catch (ParseException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidRowOperationException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            } catch (CantSaveException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            } catch (CantChangeFieldValException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            } catch (CantBeginEditException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidQueryException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            } // Cursor zurücksetzen
            catch (InvalidSettingValueException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            }


        }
        // Cursor zurücksetzen



        mainFrame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));



    }//GEN-LAST:event_jMenuSyncActionPerformed

    private void jArtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jArtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jArtnameActionPerformed

    private void jTyerpplanvormoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTyerpplanvormoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTyerpplanvormoActionPerformed

    private void jTyerperfuellaktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTyerperfuellaktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTyerperfuellaktActionPerformed

    private void jTyhotstdjanvormoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTyhotstdjanvormoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTyhotstdjanvormoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StringSelection selection = new StringSelection(jTnText.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed
        try {
            String DB_COMMAND;
            PreparedStatement pstmt;
            jSaveButton.setEnabled(false);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            Date pzero = dateFormat.parse("01.01.1970 00:00");

            Date von = Combo2Date(jTNVonH, jTNVonM);
            Date bis = Combo2Date(jTNBisH, jTNBisM);
            Date pause = Combo2Date(jTNPauseH, jTNPauseM);
            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");

            String s = formatter.format(von);
            //System.out.println("von " + s);

            float ptime = (pause.getTime() - pzero.getTime());
            ptime = ptime / 3600000;
            float nettotime = (bis.getTime() - von.getTime());
            nettotime = (nettotime / 3600000) - ptime;
            labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");

            // TN Speichern


            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();

            Date tndatum = (Date) jXDatePickerTN.getDate();

            java.sql.Date sqldatum = new java.sql.Date(tndatum.getTime());
            java.sql.Time sqlvon = new java.sql.Time(von.getTime());
            java.sql.Time sqlbis = new java.sql.Time(bis.getTime());
            java.sql.Time sqlpause = new java.sql.Time(pause.getTime());
            //System.out.println(dbID.getText());
            //CR und LF entfernen
            jverwaltungsText.setText(jverwaltungsText.getText().replaceAll("(\\r|\\n)", ""));

            if (dbID.getText().equals("0")) {
                ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM ORDERS WHERE id ='" + jposid.getText() + "'");
                if (dbresultSet.next()) {

                    DB_COMMAND = "INSERT INTO TN (AuposId,datum,von,bis,pause,fahrtkosten,text,kunde,auftrag,freigabe,verwaltung,pnum,audatum,betreff"
                            + ",ffirmenart,fstrasse,fplz,fort,ftele,ffax,femail,kans,kplz,kstr,kort,artname,limge,mge,ptext,BetrStaette,he,kubudget,arbpaket,uebernachtung) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    pstmt = connection.prepareStatement(DB_COMMAND, Statement.RETURN_GENERATED_KEYS);
                    pstmt.clearParameters();
                    pstmt.setString(1, jposid.getText());
                    pstmt.setDate(2, sqldatum);
                    pstmt.setTime(3, sqlvon);
                    pstmt.setTime(4, sqlbis);
                    pstmt.setTime(5, sqlpause);
                    pstmt.setBoolean(6, tnFahrtkosten.isSelected());
                    pstmt.setString(7, jTnText.getText());

                    pstmt.setString(8, jKunde.getText());
                    pstmt.setString(9, jAuftrag.getText());
                    pstmt.setBoolean(10, jFreigabe.isSelected());
                    pstmt.setString(11, jverwaltungsText.getText());
                    pstmt.setString(12, jpnum.getText());
                    pstmt.setString(13, jAudatum.getText());
                    pstmt.setString(14, jBetreff.getText());
                    pstmt.setString(15, dbresultSet.getString(11)); //FFirmenart
                    pstmt.setString(16, dbresultSet.getString(12)); //FStrasse
                    pstmt.setString(17, dbresultSet.getString(13)); //FPLZ
                    pstmt.setString(18, dbresultSet.getString(14)); //FOrt
                    pstmt.setString(19, dbresultSet.getString(15)); //FTele
                    pstmt.setString(20, dbresultSet.getString(16)); //FFax
                    pstmt.setString(21, dbresultSet.getString(17)); //Femail
                    pstmt.setString(22, dbresultSet.getString(18)); //Kans
                    pstmt.setString(23, dbresultSet.getString(19)); //KPLZ
                    pstmt.setString(24, dbresultSet.getString(20)); //KStr
                    pstmt.setString(25, dbresultSet.getString(21)); //KOrt
                    pstmt.setString(26, dbresultSet.getString(4)); //artname
                    pstmt.setFloat(27, dbresultSet.getFloat(5)); //Limge
                    pstmt.setFloat(28, dbresultSet.getFloat(6)); //Mge
                    pstmt.setString(29, dbresultSet.getString(7)); //Ptext
                    pstmt.setString(30, jBetrStaette.getText());
                    pstmt.setString(31, jHe.getText());
                    pstmt.setString(32, jKuBudget.getText());
                    pstmt.setString(33, jArbPaket.getText());
                    pstmt.setBoolean(34, jUebernachtung.isSelected());


                    pstmt.execute();
                    ResultSet result = pstmt.getGeneratedKeys();
                    if ((result != null) && (result.next())) {
                        Long id = result.getLong(1);
                        dbID.setText(id.toString());
                        connection.close();
                        //In TN Node einfügen
                        float dummy = 0;
                        // private String DB;

                        nDatum = new DefaultMutableTreeNode(new Positionen("TNPOS",
                                "",
                                "",
                                dummy,
                                id.intValue(),
                                "",
                                sqldatum,
                                sqlvon,
                                sqlbis,
                                jKunde.getText(),
                                tnFahrtkosten.isSelected(),
                                jFreigabe.isSelected()));


                        tnNode.add(nDatum);
                        // Update des Trees
                        jTree1.updateUI();
                        // Und den neuen Eintrag selektieren und markieren
                        TreePath treepath = new TreePath(nDatum.getPath());
                        jTree1.setSelectionPath(treepath);











                        // Orders_READ();
                    }
                }

            } else {
                //Update der Positionsklasse

                //      DefaultMutableTreeNode currentTreeNode = (DefaultMutableTreeNode)  jTree1.getLastSelectedPathComponent();
                //       Object nodeInfo = currentTreeNode.getUserObject();

                Positionen positionen = (Positionen) GlobalVars.nodeInfoalt;
                positionen.fahrtkosten = tnFahrtkosten.isSelected();
                positionen.freigabe = jFreigabe.isSelected();
                positionen.datum = sqldatum;
                positionen.bis = sqlbis;
                positionen.von = sqlvon;





                //        ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM ORDERS WHERE id ='"+jTextField1.getText()+"'");
                //        if (dbresultSet.next())
                //            {
                DB_COMMAND = "UPDATE TN Set  datum=? ,von=?,bis=?,pause=?,fahrtkosten=?,text=?,freigabe=?,verwaltung=?,kubudget=?,arbpaket=?  WHERE ID=?";

                pstmt = connection.prepareStatement(DB_COMMAND);
                pstmt.clearParameters();
                pstmt.setDate(1, sqldatum);
                pstmt.setTime(2, sqlvon);
                pstmt.setTime(3, sqlbis);
                pstmt.setTime(4, sqlpause);
                pstmt.setBoolean(5, tnFahrtkosten.isSelected());
                pstmt.setString(6, jTnText.getText());
                pstmt.setBoolean(7, jFreigabe.isSelected());
                pstmt.setString(8, jverwaltungsText.getText());
                pstmt.setString(9, jKuBudget.getText());
                pstmt.setString(10, jArbPaket.getText());
                pstmt.setString(11, dbID.getText());
                pstmt.executeUpdate();
                connection.close();
                //           }
            }



            jAmpel.setIcon(new ImageIcon(GlobalVars.gruen));
            jPrintButton.setEnabled(true);

            jSaveButton.setEnabled(false);
            jTree1.repaint();
            KalenderPanel.repaint();
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        } catch (SQLException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());

        }



    }//GEN-LAST:event_jSaveButtonActionPerformed

    private void jDelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDelButtonActionPerformed
        try {

            //  Datensatz Löschen



            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();
            int erg = xstatement.executeUpdate("DELETE FROM TN WHERE id=" + dbID.getText());
            DefaultTreeModel model = (DefaultTreeModel) (jTree1.getModel());

            DefaultMutableTreeNode currentTreeNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

            model.removeNodeFromParent(currentTreeNode);

            Object nodeInfo = currentTreeNode.getUserObject();

            Positionen positionen = (Positionen) nodeInfo;



        } catch (SQLException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jDelButtonActionPerformed

    private void jXDatePickerTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePickerTNActionPerformed

        try {
            // TODO add your handling code here:

            jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
            jSaveButton.setEnabled(true);
            Date tndatum = (Date) jXDatePickerTN.getDate();
            Date heute = new Date(System.currentTimeMillis());
            if (tndatum.getTime() > heute.getTime()) {
                JOptionPane.showMessageDialog(this, "Wer hat an der Uhr gedreht... ist es wirklich schon so spät?", "Datum stimmt nicht", JOptionPane.ERROR_MESSAGE);
                jXDatePickerTN.setDate(heute);
            }
            //  System.out.println(tndatum.toString());
            java.sql.Date sqldatum = new java.sql.Date(tndatum.getTime());
            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();
            tnFahrtkosten.setEnabled(true);
            ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM TN WHERE kunde='" + jKunde.getText() + "' AND datum='" + sqldatum + "' AND Fahrtkosten=1");
            while (dbresultSet.next()) {
                //System.out.println(dbresultSet.getString(1)+" - "+positionen.dbid.toString());
                if (dbresultSet.getString(1).equals(dbID.getText())) {
                    tnFahrtkosten.setEnabled(true);
                } else {
                    tnFahrtkosten.setEnabled(false);
                    tnFahrtkosten.setSelected(false);
                }
            }
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }

    }//GEN-LAST:event_jXDatePickerTNActionPerformed

    private void tnFahrtkostenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnFahrtkostenActionPerformed

        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
        jSaveButton.setEnabled(true);

    }//GEN-LAST:event_tnFahrtkostenActionPerformed

    private void jTNBisHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNBisHActionPerformed
        float ptime = 0;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            Date pzero = dateFormat.parse("01.01.1970 00:00");

            Date von = Combo2Date(jTNVonH, jTNVonM);
            Date bis = Combo2Date(jTNBisH, jTNBisM);
            Date pause = Combo2Date(jTNPauseH, jTNPauseM);

            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
            String s = formatter.format(von);

            if (pause != null) {
                ptime = (pause.getTime() - pzero.getTime());
            }


            ptime = ptime / 3600000;
            float nettotime = (bis.getTime() - von.getTime());
            nettotime = (nettotime / 3600000) - ptime;
            //  nettotime = (java.lang.Math.round(nettotime * 100) / 100);  
            labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
            jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
            jSaveButton.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jTNBisHActionPerformed

    private void jTNVonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNVonMActionPerformed
        float ptime = 0;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            Date pzero = dateFormat.parse("01.01.1970 00:00");

            Date von = Combo2Date(jTNVonH, jTNVonM);
            Date bis = Combo2Date(jTNBisH, jTNBisM);
            Date pause = Combo2Date(jTNPauseH, jTNPauseM);

            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
            String s = formatter.format(von);

            if (pause != null) {
                ptime = (pause.getTime() - pzero.getTime());
            }


            ptime = ptime / 3600000;
            float nettotime = (bis.getTime() - von.getTime());
            nettotime = (nettotime / 3600000) - ptime;
            //  nettotime = (java.lang.Math.round(nettotime * 100) / 100);  
            labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
            jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
            jSaveButton.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jTNVonMActionPerformed

    private void jTNVonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNVonHActionPerformed
        float ptime = 0;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            Date pzero = dateFormat.parse("01.01.1970 00:00");

            Date von = Combo2Date(jTNVonH, jTNVonM);
            Date bis = Combo2Date(jTNBisH, jTNBisM);
            Date pause = Combo2Date(jTNPauseH, jTNPauseM);

            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
            String s = formatter.format(von);

            if (pause != null) {
                ptime = (pause.getTime() - pzero.getTime());
            }


            ptime = ptime / 3600000;
            float nettotime = (bis.getTime() - von.getTime());
            nettotime = (nettotime / 3600000) - ptime;
            //  nettotime = (java.lang.Math.round(nettotime * 100) / 100);  
            labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
            jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
            jSaveButton.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jTNVonHActionPerformed

    private void jTNBisMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNBisMActionPerformed
        float ptime = 0;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            Date pzero = dateFormat.parse("01.01.1970 00:00");

            Date von = Combo2Date(jTNVonH, jTNVonM);
            Date bis = Combo2Date(jTNBisH, jTNBisM);
            Date pause = Combo2Date(jTNPauseH, jTNPauseM);

            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
            String s = formatter.format(von);

            if (pause != null) {
                ptime = (pause.getTime() - pzero.getTime());
            }


            ptime = ptime / 3600000;
            float nettotime = (bis.getTime() - von.getTime());
            nettotime = (nettotime / 3600000) - ptime;
            //   nettotime = (java.lang.Math.round(nettotime * 100) / 100); 

            labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
            jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
            jSaveButton.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jTNBisMActionPerformed

    private void jTNPauseHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNPauseHActionPerformed
        float ptime = 0;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            Date pzero = dateFormat.parse("01.01.1970 00:00");

            Date von = Combo2Date(jTNVonH, jTNVonM);
            Date bis = Combo2Date(jTNBisH, jTNBisM);
            Date pause = Combo2Date(jTNPauseH, jTNPauseM);

            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
            String s = formatter.format(von);

            if (pause != null) {
                ptime = (pause.getTime() - pzero.getTime());
            }


            ptime = ptime / 3600000;
            float nettotime = (bis.getTime() - von.getTime());
            nettotime = (nettotime / 3600000) - ptime;
            //  nettotime = (java.lang.Math.round(nettotime * 100) / 100);  
            labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");

            jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
            jSaveButton.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jTNPauseHActionPerformed

    private void jTNPauseMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNPauseMActionPerformed
        float ptime = 0;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            Date pzero = dateFormat.parse("01.01.1970 00:00");

            Date von = Combo2Date(jTNVonH, jTNVonM);
            Date bis = Combo2Date(jTNBisH, jTNBisM);
            Date pause = Combo2Date(jTNPauseH, jTNPauseM);

            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
            String s = formatter.format(von);

            if (pause != null) {
                ptime = (pause.getTime() - pzero.getTime());
            }


            ptime = ptime / 3600000;
            float nettotime = (bis.getTime() - von.getTime());
            nettotime = (nettotime / 3600000) - ptime;
            // nettotime = (java.lang.Math.round(nettotime * 10) / 10);  
            labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
            jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
            jSaveButton.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jTNPauseMActionPerformed

    private void jUebernachtungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUebernachtungActionPerformed
        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));

        jSaveButton.setEnabled(true);
    }//GEN-LAST:event_jUebernachtungActionPerformed

    private void jKuBudgetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jKuBudgetKeyPressed
        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
        jSaveButton.setEnabled(true);
    }//GEN-LAST:event_jKuBudgetKeyPressed

    private void jArbPaketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jArbPaketKeyPressed
        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));

        jSaveButton.setEnabled(true);

    }//GEN-LAST:event_jArbPaketKeyPressed

    private void jPrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrintButtonActionPerformed
        try {

            JasperPrint jasperPrint;
            Connection con = DB_CONNECT();
            Statement statement = con.createStatement();
            String reportSource = "reports/TN.jasper";
            if (GlobalVars.internFirma.equals("GmbH & Co. Kg.")) {
                reportSource = "reports/TN.jasper";
            }
            if (GlobalVars.internFirma.equals("eSolutions")) {
                reportSource = "reports/TNesolutions.jasper";
            }
            if (GlobalVars.internFirma.equals("Nürnberg")) {
                reportSource = "reports/TNNuernberg.jasper";
            }
            String firma = "";
            String firmaline = "";
            String kans = "";
            String vom = "";
            String fahrtkosten = "";
            Date pause;
            long glpause = 0;

            //Tn Datum  umbauen
            SimpleDateFormat myDate = new SimpleDateFormat("dd.MM.yy");
            Date tndatum = (Date) jXDatePickerTN.getDate();

            vom = myDate.format(tndatum).toString();
            java.sql.Date xvom = new java.sql.Date(tndatum.getTime());

            //uhrzeiten vorbelegen
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            Date dmax = dateFormat.parse("01.01.1970 23:59");
            java.sql.Time von = new java.sql.Time(dmax.getTime());
            dmax = dateFormat.parse("01.01.1970 00:01");
            java.sql.Time bis = new java.sql.Time(dmax.getTime());
            dmax = dateFormat.parse("01.01.1970 00:00");
            pause = dateFormat.parse("01.01.1970 00:00");



            //  Map parameters=new HashMap();
            // Aufruf bringt Warnungen , so ist es sauberer:
            Map<String, Object> parameters = new HashMap<String, Object>();


            if (jFreigabe.isEnabled()) {
                ResultSet resultSet = statement.executeQuery("select     * from TN WHERE Auftrag='" + jAuftrag.getText() + "' AND DATUM ='" + xvom.toString() + "'");
                while (resultSet.next()) {
                    if (resultSet.getString(17).equals("")) {
                        firmaline = "abas GmbH & Co. KG.* Kleinsteinbacher Str. 77 * 76228 Karlsruhe";
                        firma = "";
                        if (GlobalVars.internFirma.equals("Nürnberg")) {
                            firmaline = "abas GmbH * Nordostpark 100A * 90411 Nürnberg";
                        }
                        if (GlobalVars.internFirma.equals("eSolutions")) {
                            firmaline = "abas e-Solutions * Kleinsteinbacher Str. 77 * 76228 Karlsruhe";
                        }
                    } else {
                        firmaline = "abas GmbH & Co. KG.* " + resultSet.getString(17) + " * " + resultSet.getString(18) + " " + resultSet.getString(19);
                        if (GlobalVars.internFirma.equals("Nürnberg")) {
                            firmaline = "abas  GmbH * " + resultSet.getString(17) + " * " + resultSet.getString(18) + " " + resultSet.getString(19);
                        }
                        if (GlobalVars.internFirma.equals("eSolutions")) {
                            firmaline = "abas e-Solutions * " + resultSet.getString(17) + " * " + resultSet.getString(18) + " " + resultSet.getString(19);
                        }
                        firma = resultSet.getString(16) + "\n" + resultSet.getString(17) + "\n" + resultSet.getString(18) + " " + resultSet.getString(19) + "\n" + resultSet.getString(20) + "\n" + resultSet.getString(21);
                    }
                    kans = resultSet.getString(23) + "\n" + resultSet.getString(25) + "\n" + resultSet.getString(24) + " " + resultSet.getString(26);
                    // Kleinste von und größte bis ermitteln

                    if (resultSet.getTime(4).getTime() < von.getTime()) {
                        von = resultSet.getTime(4);
                    }
                    if (resultSet.getTime(5).getTime() > bis.getTime()) {
                        bis = resultSet.getTime(5);
                    }

                    Date dmax2 = new Date(resultSet.getTime(6).getTime());
                    long ptime = (dmax2.getTime() - pause.getTime());
                    glpause = glpause + (ptime);




                    if (resultSet.getInt(7) == 1) {
                        fahrtkosten = "1 mal";
                    }
                }
// Fixe Parameter übergeben
                Date gpause = new Date(glpause - 3600000);
                dateFormat = new SimpleDateFormat("HH:mm");

                parameters.put("firmaline", firmaline);
                parameters.put("firma", firma);
                parameters.put("kans", kans);
                parameters.put("vom", vom);
                parameters.put("durch", GlobalVars.mitarbeiter);
                parameters.put("Auftrag", jAuftrag.getText());
                parameters.put("guhrzeit", dateFormat.format(von.getTime()).toString() + " - " + dateFormat.format(bis.getTime()).toString());
                parameters.put("gpause", dateFormat.format(gpause.getTime()));
                parameters.put("gfahrtkosten", fahrtkosten);
                parameters.put("nummer",GlobalVars. mitarbeiter + "/" + vom.toString());
//edpPasswort.hashCode()
                //System.out.println((int)test.charAt(1));
                resultSet = statement.executeQuery("select     * from TN WHERE Auftrag='" + jAuftrag.getText().toString() + "' AND DATUM='" + xvom.toString() + "'");
                JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(resultSet);
                jasperPrint = JasperFillManager.fillReport(reportSource, parameters, resultSetDataSource);
            } else {
                ResultSet resultSet = statement.executeQuery("select* from TNARCHIV WHERE AUFTRAG='" + jAuftrag.getText() + "' AND DATUM='" + xvom.toString() + "'");
                while (resultSet.next()) {
                    if (resultSet.getString(17).equals("")) {
                        firmaline = "abas GmbH & Co. KG.* Kleinsteinbacher Str. 77 * 76228 Karlsruhe";
                        firma = "";
                        if (GlobalVars.internFirma.equals("Nürnberg")) {
                            firmaline = "abas GmbH * Nordostpark 100A * 90411 Nürnberg";
                        }
                        if (GlobalVars.internFirma.equals("eSolutions")) {
                            firmaline = "abas e-Solutions * Kleinsteinbacher Str. 77 * 76228 Karlsruhe";
                        }
                    } else {
                        firmaline = "abas GmbH & Co. KG.* " + resultSet.getString(17) + " * " + resultSet.getString(18) + " " + resultSet.getString(19);
                        if (GlobalVars.internFirma.equals("Nürnberg")) {
                            firmaline = "abas GmbH * " + resultSet.getString(17) + " * " + resultSet.getString(18) + " " + resultSet.getString(19);
                        }
                        if (GlobalVars.internFirma.equals("eSolutions")) {
                            firmaline = "abas e-Solutions * " + resultSet.getString(17) + " * " + resultSet.getString(18) + " " + resultSet.getString(19);
                        }
                        firma = resultSet.getString(16) + "\n" + resultSet.getString(17) + "\n" + resultSet.getString(18) + " " + resultSet.getString(19) + "\n" + resultSet.getString(20) + "\n" + resultSet.getString(21);
                    }
                    kans = resultSet.getString(23) + "\n" + resultSet.getString(25) + "\n" + resultSet.getString(24) + " " + resultSet.getString(26);
                    // Kleinste von und größte bis ermitteln

                    if (resultSet.getTime(4).getTime() < von.getTime()) {
                        von = resultSet.getTime(4);
                    }
                    if (resultSet.getTime(5).getTime() > bis.getTime()) {
                        bis = resultSet.getTime(5);
                    }

                    Date dmax2 = new Date(resultSet.getTime(6).getTime());
                    long ptime = (dmax2.getTime() - pause.getTime());
                    glpause = glpause + (ptime);




                    if (resultSet.getInt(7) == 1) {
                        fahrtkosten = "1 mal";
                    }
                }
                Date gpause = new Date(glpause - 3600000);
                dateFormat = new SimpleDateFormat("HH:mm");

                parameters.put("firmaline", firmaline);
                parameters.put("firma", firma);
                parameters.put("kans", kans);
                parameters.put("vom", vom);
                parameters.put("durch", GlobalVars.mitarbeiter);
                parameters.put("Auftrag", jAuftrag.getText());
                parameters.put("guhrzeit", dateFormat.format(von.getTime()).toString() + " - " + dateFormat.format(bis.getTime()).toString());
                parameters.put("gpause", dateFormat.format(gpause.getTime()));
                parameters.put("gfahrtkosten", fahrtkosten);
                parameters.put("nummer", GlobalVars.mitarbeiter + "/" + vom.toString());
                resultSet = statement.executeQuery("select     * from TNARCHIV WHERE Auftrag='" + jAuftrag.getText().toString() + "' AND DATUM='" + xvom.toString() + "'");
                JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(resultSet);
                jasperPrint = JasperFillManager.fillReport(reportSource, parameters, resultSetDataSource);
            }





            JasperViewer.viewReport(jasperPrint, false);
            con.close();
        } catch (JRException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        } catch (SQLException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }//GEN-LAST:event_jPrintButtonActionPerformed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        if (jSaveButton.isEnabled()) {
            JFrame mainFrame = this;

            if ((!dbID.getText().equals("")) && (!jAuftrag.getText().equals(""))) {
                int save = JOptionPane.showConfirmDialog(mainFrame, "TN speichern?", "TN noch nicht gespeichert!", JOptionPane.YES_NO_OPTION);
                if (save == 0) {
                    jSaveButton.setEnabled(false);
                    jSaveButtonActionPerformed(null);
                    jPrintButton.setEnabled(false);

                }
                jSaveButton.setEnabled(false);


                //JOptionPane.sh
                //  
            }
            jSaveButton.setEnabled(false);
        }

        if (!jSaveButton.isEnabled()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
            if (node == null) {
                //NOthing selected
                return;
            } else {
                Object nodeInfo = node.getUserObject();
                if (node.isLeaf()) {
                    try {
                        Connection connection = DB_CONNECT();
                        java.sql.Statement xstatement = connection.createStatement();

                        //Childnode angeklickt- wir benötigen die ID
                        //"id, kopf^nummer, kunde^such, art^name,limge,mge,ptext"
                        if (nodeInfo instanceof Positionen) {
                            Positionen positionen = (Positionen) nodeInfo;
                            if (positionen.DB.equals("AUPOS")) {
                                ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM ORDERS WHERE id ='" + positionen.id + "'");
                                if (dbresultSet.next()) {
                                    jposid.setText(dbresultSet.getString(1));
                                    jAuftrag.setText(dbresultSet.getString(2));
                                    jKunde.setText(dbresultSet.getString(3));
                                    jArtname.setText(dbresultSet.getString(4));
                                    jLimge.setText(dbresultSet.getString(5));
                                    jMge.setText(dbresultSet.getString(6));
                                    jPText.setText(dbresultSet.getString(7));
                                    jpnum.setText(dbresultSet.getString(8));
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                                    jAudatum.setText(sdf.format(dbresultSet.getDate(9)));
                                    jBetreff.setText(dbresultSet.getString(10));
                                    jverwaltungsText.setText("");
                                    jAmpel.setIcon(new ImageIcon(GlobalVars.rot));
                                    // SaveButton erst enablen wenn auch was geändert wurde!
                                    //jSaveButton.setEnabled(true); 
                                    jTnText.setText("");
                                    dbID.setText("0");
                                    jFreigabe.setSelected(false);
                                    tnFahrtkosten.setSelected(false);
                                    jBetrStaette.setText(dbresultSet.getString(22));
                                    jHe.setText(dbresultSet.getString(23));
                                    jDelButton.setEnabled(false);
                                    jPrintButton.setEnabled(false);
                                    jKuBudget.setText("");
                                    jArbPaket.setText("");
                                    TNAKTIV(true);
                                    jPrintButton.setEnabled(false);
                                    jUebernachtung.setSelected(false);
                                    //Tn Säubern
                                    //Fahrtkosten prüfen
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                                    Date date = dateFormat.parse("01.01.1970 08:00");
                                    Date2Combo(date, jTNVonH, jTNVonM);
                                    date = dateFormat.parse("01.01.1970 17:00");
                                    Date2Combo(date, jTNBisH, jTNBisM);
                                    date = dateFormat.parse("01.01.1970 00:00");
                                    Date2Combo(date, jTNPauseH, jTNPauseM);



                                    tnFahrtkosten.setEnabled(true);
                                    jXDatePickerTN.setDate(new Date());

                                    Date tndatum = (Date) jXDatePickerTN.getDate();




                                    java.sql.Date sqldatum = new java.sql.Date(tndatum.getTime());
                                    dbresultSet = xstatement.executeQuery("SELECT * FROM TN WHERE kunde='" + jKunde.getText() + "' AND datum='" + sqldatum + "' AND Fahrtkosten=1");
                                    while (dbresultSet.next()) {
                                        //System.out.println(dbresultSet.getString(1)+" - "+positionen.dbid.toString());
                                        if (dbresultSet.getString(1).equals(dbID.getText())) {
                                            tnFahrtkosten.setEnabled(true);
                                        } else {
                                            tnFahrtkosten.setEnabled(false);
                                            tnFahrtkosten.setSelected(false);
                                        }
                                    }
                                    connection.close();


                                    // SaveButton erst enablen wenn auch was geändert wurde!
                                    jSaveButton.setEnabled(false);



                                    //

                                }
                            }
                            if (positionen.DB.equals("TNPOS")) {

                                ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM TN WHERE id =" + positionen.dbid);
                                if (dbresultSet.next()) {
                                    dbID.setText(dbresultSet.getString(1));
                                    jposid.setText(dbresultSet.getString(2));
                                    if (dbresultSet.getDate(3) != null) {
                                        jXDatePickerTN.setDate(dbresultSet.getDate(3));

                                    }
                                    if (dbresultSet.getTime(4) != null) {
                                        Date2Combo(dbresultSet.getTime(4), jTNVonH, jTNVonM);
                                       
                                       
                                    }
                                    
                                    if (dbresultSet.getTime(5) != null) {

                                        Date2Combo(dbresultSet.getTime(5), jTNBisH, jTNBisM);
                                         //jTNBisH.setSelectedIndex(jTNBisH.getSelectedIndex());
                                        //jTNBisM.setSelectedIndex(jTNBisM.getSelectedIndex());
                                    }
                                    if (dbresultSet.getTime(6) != null) {

                                        Date2Combo(dbresultSet.getTime(6), jTNPauseH, jTNPauseM);
                                    }
                                    tnFahrtkosten.setSelected(dbresultSet.getBoolean(7));
                                    jTnText.setText(dbresultSet.getString(8));
                                    jKunde.setText(dbresultSet.getString(9));
                                    jAuftrag.setText(dbresultSet.getString(10));
                                    jFreigabe.setSelected(dbresultSet.getBoolean(11));
                                    jverwaltungsText.setText(dbresultSet.getString(12));
                                    jpnum.setText(dbresultSet.getString(13));
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                                    jAudatum.setText(sdf.format(dbresultSet.getDate(14)));
                                    jBetreff.setText(dbresultSet.getString(15));
                                    jLimge.setText(dbresultSet.getString(28));
                                    jMge.setText(dbresultSet.getString(29));
                                    jPText.setText(dbresultSet.getString(30));
                                    jArtname.setText(dbresultSet.getString(27));
                                    jBetrStaette.setText(dbresultSet.getString(31));
                                    jHe.setText(dbresultSet.getString(32));
                                    jAmpel.setIcon(new ImageIcon(GlobalVars.gruen));
                                    //jSaveButton.setEnabled(true);
                                    jDelButton.setEnabled(true);
                                    jKuBudget.setText(dbresultSet.getString(33));
                                    jArbPaket.setText(dbresultSet.getString(34));
                                    jUebernachtung.setSelected(dbresultSet.getBoolean(35));
                                    TNAKTIV(true);
                                    // SaveButton erst enablen wenn auch was geändert wurde!
                                    jSaveButton.setEnabled(false);
                                    jPrintButton.setEnabled(true);

                                    //Fahrtkosten prüfen, ob zulässig oder nicht
                                    java.sql.Date sqldatum;
                                    if (positionen.datum == null) {
                                        java.util.Date heute = new Date();
                                        sqldatum = new java.sql.Date(heute.getTime());
                                    } else {
                                        sqldatum = positionen.datum;
                                    }
                                    dbresultSet = xstatement.executeQuery("SELECT * FROM TN WHERE kunde='" + jKunde.getText() + "' AND datum='" + sqldatum + "' AND Fahrtkosten=1");
                                    while (dbresultSet.next()) {
                                        //  System.out.println(dbresultSet.getString(1)+" - "+positionen.dbid.toString());
                                        if (dbresultSet.getString(1).equals(positionen.dbid.toString())) {
                                            tnFahrtkosten.setEnabled(true);
                                        } else {
                                            tnFahrtkosten.setEnabled(false);
                                            tnFahrtkosten.setSelected(false);
                                        }
                                    }
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                                    Date von = Combo2Date(jTNVonH, jTNVonM);
                                    Date bis = Combo2Date(jTNBisH, jTNBisM);
                                    //Date pause = (Date) tnPause.getValue();
                                    Date pause = Combo2Date(jTNPauseH, jTNPauseM);
                                    Date pzero = dateFormat.parse("01.01.1970 00:00");
                                    float ptime = (pause.getTime() - pzero.getTime());
                                    ptime = ptime / 3600000;
                                    float nettotime = (bis.getTime() - von.getTime());
                                    nettotime = (nettotime / 3600000) - ptime;
                                    // nettotime = (java.lang.Math.round(nettotime * 10) / 10);  
                                    labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
                                }
                            }

                            if (positionen.DB.equals("ARCHIV")) {
                                ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM TNARCHIV WHERE id =" + positionen.dbid);
                                if (dbresultSet.next()) {
                                    dbID.setText(dbresultSet.getString(1));
                                    jposid.setText(dbresultSet.getString(2));
                                    if (dbresultSet.getDate(3) != null) {

                                        jXDatePickerTN.setDate(dbresultSet.getDate(3));
                                    }
                                    if (dbresultSet.getTime(4) != null) {

                                        Date2Combo(dbresultSet.getTime(4), jTNVonH, jTNVonM);
                                    }
                                    if (dbresultSet.getTime(5) != null) {

                                        Date2Combo(dbresultSet.getTime(5), jTNBisH, jTNBisM);
                                    }
                                    if (dbresultSet.getTime(6) != null) {

                                        Date2Combo(dbresultSet.getTime(6), jTNPauseH, jTNPauseM);
                                    }
                                    tnFahrtkosten.setSelected(dbresultSet.getBoolean(7));
                                    jTnText.setText(dbresultSet.getString(8));
                                    jKunde.setText(dbresultSet.getString(9));
                                    jAuftrag.setText(dbresultSet.getString(10));
                                    jFreigabe.setSelected(true);
                                    jverwaltungsText.setText(dbresultSet.getString(12));
                                    jpnum.setText(dbresultSet.getString(13));
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                                    jAudatum.setText(sdf.format(dbresultSet.getDate(14)));
                                    jBetreff.setText(dbresultSet.getString(15));
                                    jLimge.setText(dbresultSet.getString(28));
                                    jMge.setText(dbresultSet.getString(29));
                                    jPText.setText(dbresultSet.getString(30));
                                    jArtname.setText(dbresultSet.getString(27));
                                    jBetrStaette.setText(dbresultSet.getString(31));
                                    jHe.setText(dbresultSet.getString(32));
                                    jKuBudget.setText(dbresultSet.getString(33));
                                    jArbPaket.setText(dbresultSet.getString(34));
                                    jUebernachtung.setSelected(dbresultSet.getBoolean(35));
                                    TNAKTIV(false);
                                    jAmpel.setIcon(new ImageIcon(GlobalVars.gruen));
                                    jSaveButton.setEnabled(false);
                                    jPrintButton.setEnabled(true);
                                    jDelButton.setEnabled(true);

                                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                                    Date von = Combo2Date(jTNVonH, jTNVonM);
                                    Date bis = Combo2Date(jTNBisH, jTNBisM);
                                    //Date pause = (Date) tnPause.getValue();
                                    Date pause = Combo2Date(jTNPauseH, jTNPauseM);
                                    Date pzero = dateFormat.parse("01.01.1970 00:00");
                                    float ptime = (pause.getTime() - pzero.getTime());
                                    ptime = ptime / 3600000;
                                    float nettotime = (bis.getTime() - von.getTime());
                                    nettotime = (nettotime / 3600000) - ptime;
                                    // nettotime = (java.lang.Math.round(nettotime * 10) / 10);  
                                    labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");


                                }
                            }
                            connection.close();
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                        MyException(ex.toString());
                    } catch (SQLException ex) {
                        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                        MyException(ex.toString());
                    }


                } else {

                    //ParentNode angeklickt, alles säubern
                    jposid.setText("");
                    jAuftrag.setText("");
                    jKunde.setText("");
                    jArtname.setText("");
                    jLimge.setText("");
                    jMge.setText("");
                    jPText.setText("");
                    jTnText.setText("");
                    jverwaltungsText.setText("");
                    jFreigabe.setSelected(false);
                    jpnum.setText("");
                    jAudatum.setText("");
                    jBetreff.setText("");
                    jBetrStaette.setText("");
                    jKuBudget.setText("");
                    jArbPaket.setText("");
                    TNAKTIV(false);
                    jAmpel.setIcon(new ImageIcon(GlobalVars.gruen));

                    jSaveButton.setEnabled(false);
                    jDelButton.setEnabled(false);
                    jPrintButton.setEnabled(false);





                }
            }
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                Date pzero = dateFormat.parse("01.01.1970 00:00");

                Date von = Combo2Date(jTNVonH, jTNVonM);
                Date bis = Combo2Date(jTNBisH, jTNBisM);


                Date pause = Combo2Date(jTNPauseH, jTNPauseM);
                // Prüfen ob Uhrzeiten negatives Ergebnis bringen
                if (von.compareTo(bis) > 0) {

                    Date2Combo(Combo2Date(jTNBisH, jTNBisM), jTNVonH, jTNVonM);
                    von = bis;
                }
                DateFormat formatter;
                formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");

                String s = formatter.format(von);
                //System.out.println("von " + s);

                float ptime = (pause.getTime() - pzero.getTime());
                ptime = ptime / 3600000;
                float nettotime = (bis.getTime() - von.getTime());
                nettotime = (nettotime / 3600000) - ptime;
                labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
                //       jAmpel.setIcon(new ImageIcon(rot));
                // jSaveButton.setEnabled(true);
            } catch (Exception ex) {
            }

            try {

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                Date pzero = dateFormat.parse("01.01.1970 00:00");
                Date von = Combo2Date(jTNVonH, jTNVonM);
                Date bis = Combo2Date(jTNBisH, jTNBisM);
                // Prüfen ob Uhrzeiten negatives Ergebnis bringen
                if (von.compareTo(bis) > 0) {
                    Date2Combo((Combo2Date(jTNVonH, jTNVonM)), jTNBisH, jTNBisM);


                    bis = von;
                }
                Date pause = Combo2Date(jTNPauseH, jTNPauseM);

                DateFormat formatter;
                formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");

                String s = formatter.format(von);
                //System.out.println("von " + s);

                float ptime = (pause.getTime() - pzero.getTime());
                ptime = ptime / 3600000;
                float nettotime = (bis.getTime() - von.getTime());
                nettotime = (nettotime / 3600000) - ptime;
                // nettotime=( java.lang.Math.round( nettotime * 100 )/100);
                labelNettoZeit.setText("Netto Arbeitzeit: " + strPre(nettotime) + " Stunden");
                //      jAmpel.setIcon(new ImageIcon(rot));

                //    jSaveButton.setEnabled(true);
            } catch (Exception ex) {
            }
        }
        DefaultMutableTreeNode currentTreeNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        GlobalVars.nodeInfoalt = currentTreeNode.getUserObject();
    }//GEN-LAST:event_jTree1ValueChanged

    private void jFreigabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFreigabeActionPerformed
        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));

        jSaveButton.setEnabled(true);
    }//GEN-LAST:event_jFreigabeActionPerformed

    private void jTnTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnTextKeyPressed
        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));

        jSaveButton.setEnabled(true);
    }//GEN-LAST:event_jTnTextKeyPressed

    private void jKuBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKuBudgetActionPerformed
        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));

        jSaveButton.setEnabled(true);
    }//GEN-LAST:event_jKuBudgetActionPerformed

    private void jArbPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jArbPaketActionPerformed
        jAmpel.setIcon(new ImageIcon(GlobalVars.rot));

        jSaveButton.setEnabled(true);
    }//GEN-LAST:event_jArbPaketActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed

        DB_SEARCH(1);


    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonSearchRueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchRueckActionPerformed
        int datensatz = Integer.parseInt(jLabelSearchSatz.getText());
        datensatz = datensatz - 1;
        DB_SEARCH(datensatz);
    }//GEN-LAST:event_jButtonSearchRueckActionPerformed

    private void jButtonSearchVorwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchVorwActionPerformed
        int datensatz = Integer.parseInt(jLabelSearchSatz.getText());

        if (datensatz < GlobalVars.treffer) {
            datensatz = datensatz + 1;
            DB_SEARCH(datensatz);
        }

    }//GEN-LAST:event_jButtonSearchVorwActionPerformed

    private void jMenuExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExchangeActionPerformed
        // Exchange Fehleranalyse

        try {
            boolean exchangeconnect = false;
            ExchangeService service = null;
            // Prüfen ob Exchange konfiguriert wurde
            if ((!GlobalVars.exchange.equals("")) && (!GlobalVars.exchuser.equals("")) && (!GlobalVars.exchpass.equals(""))) {
                exchangeconnect = true;
            } else {
                exchangeconnect = false;
            }
            //Exchange Server - Verbindung aufbauen 
            if (exchangeconnect) {
                try {
                    service = new ExchangeService(ExchangeVersion.Exchange2010_SP1);
                    //service.setUrl(new URI("https://topas/ews/Exchange.asmx"));
                    service.setUrl(new URI(GlobalVars.exchange));
                    service.setCredentials(new WebCredentials(GlobalVars.exchuser, GlobalVars.exchpass));
                } catch (URISyntaxException ex) {

                    exchangeconnect = false;
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                    MyException(ex.toString());
                }

            }
            jProgressBar1.setString("Kalender Analyse");
            jProgressBar1.paint(jProgressBar1.getGraphics());

            // create Calendar instance with actual date
            Date now = new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(now);
            calendar.add(Calendar.DAY_OF_MONTH, -51);
            // get the date instance
            Date startDate = calendar.getTime();
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            Date endDate = calendar.getTime();
            int Tage = 1;
            CalendarFolder cf;
            cf = CalendarFolder.bind(service, WellKnownFolderName.Calendar);

            while (Tage < 100) {
                Tage = Tage + 1;
                System.out.println(startDate);
                System.out.println(endDate);

                startDate = endDate;
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                endDate = calendar.getTime();
                FindItemsResults<Appointment> findResults = cf.findAppointments(new CalendarView(startDate, endDate));
                for (Appointment appt : findResults.getItems()) {
                    jProgressBar1.setString("Kalender Analyse" + startDate);
                    jProgressBar1.paint(jProgressBar1.getGraphics());
                    System.out.println(appt.getStart().toString() + " - " + appt.getSubject());
                }
            }

            //System.out.println(now);

            // System.out.println(endDate);
            //Date xendDate = xformatter.parse("2012-12-31 23:59:59");                  




        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            MyException("Kalendersync mit folgendem Fehler abgebrochen:\n" + ex.toString());
        }




    }//GEN-LAST:event_jMenuExchangeActionPerformed

    private void jMenuWartungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuWartungActionPerformed
        JFrame mainFrame = this;

        Wartungspass WE = new Wartungspass(mainFrame, true);
        WE.setVisible(true);

    }//GEN-LAST:event_jMenuWartungActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JFrame mainFrame = this;
        aboutbox about = new aboutbox(mainFrame, true);
        about.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jButtonleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonleftActionPerformed
        GlobalVars.caldatum = new Date(GlobalVars.caldatum.getTime() - 86400000 * 7);
        KalenderPanel.repaint();
    }//GEN-LAST:event_jButtonleftActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GlobalVars.caldatum = new Date(GlobalVars.caldatum.getTime() + 86400000 * 7);
        KalenderPanel.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
            //for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            //   if ("Nimbus".equals(info.getName())) {
            //       javax.swing.UIManager.setLookAndFeel(info.getClassName());
            //       break;
            //   }
            // }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoiceIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new invoiceIT().setVisible(true);
            }
        });
    }

    private Connection DB_CONNECT() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Properties properties = new Properties();
            Connection connection;
            //connection = DriverManager.getConnection("jdbc:derby:C:/Users/Guenter/invoiceit/invoiceIT;create=true", properties);
            connection = DriverManager.getConnection("jdbc:derby:database;create=true", properties);
            return connection;

        } catch (SQLException ex) {

            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Datenbank konnte nicht gestartet werden !\n Datenbank ist belegt", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Datenbanktreiber wurde nicht gefunden! ", "ERROR", JOptionPane.ERROR_MESSAGE);


        }
        return null;

    }

    private void InitValues_WRITE() {

        PreparedStatement pstmt;
        String DB_COMMAND;

        try {

            // Einstellungen in DB schreiben

            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();

            ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM INITVALUES");
            if (dbresultSet.next()) {



                DB_COMMAND = "UPDATE INITVALUES Set  Host=?, PORT=?, MANDANT=?,PASSWORT=?,MITARBEITER=?,EXCHANGE=?,EXCHANGEUSER=?,EXCHANGEPASS=?,INTERNFIRMA=?,OPENTREEKUNDE=?,ExchangeCalSuche=?"
                        + ",UPDATELOCATION=?, FILOSOFIE=?";

                pstmt = connection.prepareStatement(DB_COMMAND);
                pstmt.clearParameters();
                pstmt.setString(1, GlobalVars.edpHost);
                pstmt.setInt(2, GlobalVars.edpPort);
                pstmt.setString(3, GlobalVars.edpMandant);
                pstmt.setString(4, GlobalVars.edpPasswort);
                pstmt.setString(5, GlobalVars.mitarbeiter);
                pstmt.setString(6, GlobalVars.exchange);
                pstmt.setString(7, GlobalVars.exchuser);
                pstmt.setString(8, GlobalVars.exchpass);
                pstmt.setString(9, GlobalVars.internFirma);
                pstmt.setBoolean(10, GlobalVars.openTreeKunde);
                pstmt.setBoolean(11, GlobalVars.exchangeCalSuche);
                pstmt.setString(12, GlobalVars.updateLocation);
                pstmt.setBoolean(13, GlobalVars.filosofie);
                pstmt.executeUpdate();
                connection.close();

            } else {
                int iResult = xstatement.executeUpdate("INSERT INTO INITVALUES (HOST,PORT,MANDANT,PASSWORT,MITARBEITER,VERSION,EXCHANGE,EXCHANGEUSER,EXCHANGEPASS,INTERNFIRMA,OPENTREEKUNDE,ExchangeCalSuche,FILOSOFIE) Values ('" + GlobalVars.edpHost + "'," + GlobalVars.edpPort + ",'" + GlobalVars.edpMandant + "','" + GlobalVars.edpPasswort + "','" + GlobalVars.mitarbeiter + "','" + GlobalVars.version + "','" + GlobalVars.internFirma
                        + "','" + GlobalVars.exchange + "','" + GlobalVars.exchuser + "','" + GlobalVars.exchpass + "','" + GlobalVars.openTreeKunde + "','" + GlobalVars.exchangeCalSuche + "','" + GlobalVars.filosofie +"')");
            }
            dbresultSet.close();
            xstatement.close();

        } catch (SQLException ex) {
            Logger.getLogger(Einstellungen.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }
    }

    private void MyException(String exString) {

        JOptionPane.showMessageDialog(this, "Es ist ein Fehler aufgetreten\n\n" + exString, "Java Excpetion", JOptionPane.ERROR_MESSAGE);
    }

    private void DBInit() {
        try {
            //Datenbank
            String DB_COMMAND;
            String dbversion = "";
            PreparedStatement pstmt;
            Connection connection = DB_CONNECT();
            ResultSet resultSet = connection.getMetaData().getTables("%", "%", "%", new String[]{"TABLE"});
            int columnCnt = resultSet.getMetaData().getColumnCount();
            boolean shouldCreateTableOrders = true;
            boolean shouldCreateTableInitValues = true;
            boolean shouldCreateTableTN = true;
            boolean shouldCreateTableTNArchiv = true;
            boolean shouldCreateTableExchangeCal = true;
            boolean shouldCreateTableKennzahlen = true;
            boolean shouldCreateTableProjekte = true;
            Statement statement;
            while (resultSet.next()) {
                if (resultSet.getString("TABLE_NAME").equalsIgnoreCase("ORDERS")) {
                    shouldCreateTableOrders = false;
                }
                if (resultSet.getString("TABLE_NAME").equalsIgnoreCase("INITVALUES")) {
                    shouldCreateTableInitValues = false;
                }
                if (resultSet.getString("TABLE_NAME").equalsIgnoreCase("TN")) {
                    shouldCreateTableTN = false;
                }
                if (resultSet.getString("TABLE_NAME").equalsIgnoreCase("TNARCHIV")) {
                    shouldCreateTableTNArchiv = false;
                }
                if (resultSet.getString("TABLE_NAME").equalsIgnoreCase("EXCHANGECAL")) {
                    shouldCreateTableExchangeCal = false;
                }
                if (resultSet.getString("TABLE_NAME").equalsIgnoreCase("KENNZAHLEN")) {
                    shouldCreateTableKennzahlen = false;
                }
                if (resultSet.getString("TABLE_NAME").equalsIgnoreCase("PROJEKTE")) {
                    shouldCreateTableProjekte = false;
                }
            }
            resultSet.close();
            //Tabelle Erzeugen wenn noch nicht da
            if (shouldCreateTableOrders) {
                //System.out.println("Creating Table Orders...");
                statement = connection.createStatement();
                statement.execute("create table ORDERS (id varchar(60), nummer varchar(15),kundesw varchar(15),artname varchar(100),limge real, mge real,ptext varchar(200),pnum varchar(6),audatum date,betreff varchar(500),"
                        + "ffirmenart varchar(30),fstrasse varchar (34),fplz varchar(5),fort varchar(34), ftele varchar(34), ffax varchar(34), femail varchar(100),"
                        + " kans varchar (200), kplz varchar(5), kstr varchar(34), kort varchar (34), BetrStaette varchar(50))");

                statement.close();
            }
            if (shouldCreateTableInitValues) {
                //System.out.println("Creating Table InitValues...");
                statement = connection.createStatement();
                statement.execute("create table INITVALUES (HOST varchar(50),PORT integer, MANDANT varchar(50),PASSWORT varchar(20), Mitarbeiter varchar(20) )");


                // und mit version beschreiben
             /*  DB_COMMAND = "UPDATE INITVALUES Set  version=? ";
                       
                 pstmt = connection.prepareStatement(DB_COMMAND);
                 pstmt.clearParameters();
                 pstmt.setString (1,version);
                 pstmt.executeUpdate();*/
                statement.close();
            }
            if (shouldCreateTableTN) {
                // System.out.println("Creating Table TN...");
                statement = connection.createStatement();
                statement.execute("create table TN (ID Integer PRIMARY KEY GENERATED ALWAYS AS IDENTITY,AuposId varchar(60),datum Date,von Time, bis Time, pause Time,fahrtkosten integer, text varchar(1000),kunde varchar (20), auftrag varchar (20),freigabe integer, verwaltung varchar(500),pnum varchar(6),audatum date,betreff varchar(500),"
                        + "ffirmenart varchar(30),fstrasse varchar (34),fplz varchar(5),fort varchar(34), ftele varchar(34), ffax varchar(34), femail varchar(100),"
                        + " kans varchar (200), kplz varchar(5), kstr varchar(34), kort varchar (34)"
                        + ",artname varchar(100),limge real,mge real,ptext varchar(200),BetrStaette varchar(50)"
                        + ")");

                statement.close();
            }
            if (shouldCreateTableTNArchiv) {
                //System.out.println("Creating Table TNARCHIV...");
                statement = connection.createStatement();
                statement.execute("create table TNARCHIV (ID Integer PRIMARY KEY GENERATED ALWAYS AS IDENTITY,AuposId varchar(60),datum Date,von Time, bis Time, pause Time,fahrtkosten integer, text varchar(1000),kunde varchar (20), auftrag varchar (20),freigabe integer, verwaltung varchar(500),pnum varchar(6),audatum date,betreff varchar(500),"
                        + "ffirmenart varchar(30),fstrasse varchar (34),fplz varchar(5),fort varchar(34), ftele varchar(34), ffax varchar(34), femail varchar(100),"
                        + " kans varchar (200), kplz varchar(5), kstr varchar(34), kort varchar (34)"
                        + ",artname varchar(100),limge real,mge real,ptext varchar(200),BetrStaette varchar(50)"
                        + ")");
                statement.close();
            }
            if (shouldCreateTableExchangeCal) {
                //System.out.println("Creating Table TNARCHIV...");
                statement = connection.createStatement();
                statement.execute("create table EXCHANGECAL (Startdate Date,EndDate Date, Starttime TIME, ENDTIME TIME,Subject varchar(100))");
                statement.close();
            }

            if (shouldCreateTableKennzahlen) {
                //System.out.println("Creating Table TNARCHIV...");
                statement = connection.createStatement();
                statement.execute("create table KENNZAHLEN (yaukufr INTEGER,yaukuho INTEGER,yaukuka INTEGER,yaukula INTEGER,yaukulue INTEGER,yaukumue INTEGER, yaukuvs INTEGER,yauneufr INTEGER,yauneuho INTEGER,yauneuka INTEGER,yauneula INTEGER,yauneulue INTEGER,yauneumue INTEGER,yauneuvs INTEGER,  "
                        + "yplanakt INTEGER,yistakt INTEGER,yerfuellakt real,yplanvormo INTEGER,yistvormo INTEGER,yplanjanvormo INTEGER, yistjanvormo INTEGER,yerfuelljanvormo INTEGER,"
                        + " yerpplanakt INTEGER,yerpistakt INTEGER,yerperfuellakt real,yerpplanvormo INTEGER, yerpistvormo INTEGER, yerpplanjanvormo INTEGER,yerpistjanvormo INTEGER,"
                        + "yerperfuelljanvorm REAL, yhotstdakt INTEGER,yhotstdvormo INTEGER,yhotstdjanvormo INTEGER,yhoterlakt INTEGER, yhoterlvormo INTEGER,yhoterljanvormo INTEGER,"
                        + "yhotoffenakt INTEGER,yhotaltakt INTEGER,yhotaltvormo INTEGER,yhotaltjanvormo INTEGER)");


                statement.close();
            }
            if (shouldCreateTableProjekte) {
                //System.out.println("Creating Table TNARCHIV...");
                statement = connection.createStatement();
                statement.execute("create table PROJEKTE (ybetriebsstaette   VARCHAR(150),ykuname   VARCHAR(150),ystatus   VARCHAR(150), yvertret   VARCHAR(150),ypleiter   VARCHAR(150),yplfibu1   VARCHAR(150),yaupwert Varchar(10),ylizenz varchar(10), ystufeapmeth  Varchar(10),ynaechststufe   VARCHAR(10),yechtgeplant   VARCHAR(10) ) ");

                statement.close();
            }

// Prüfen ob version in Initvalues vorhanden

            resultSet = connection.getMetaData().getColumns(null, null, "INITVALUES", "VERSION");
            if (resultSet.next()) {
                // Version ab 1.1
            } else {
                // DB Version ist 1.0 -> wir müssen auf 1.1 Upgraden
                //von 1.0 auf 1.1 
                // Version in INITVALUES einfügen
                // TN Text  auf 2000 Zeichen vergrößeren
                // von 1.0 auf 1.2

                statement = connection.createStatement();
                //Version einfügen 
                statement.execute("ALTER TABLE Initvalues ADD COLUMN Version Varchar(10) ");
                // und mit 1.1 beschreiben
                ResultSet dbresultSet = statement.executeQuery("SELECT * FROM INITVALUES");
                if (dbresultSet.next()) {
                    DB_COMMAND = "UPDATE INITVALUES Set  version=? ";

                    pstmt = connection.prepareStatement(DB_COMMAND);
                    pstmt.clearParameters();
                    pstmt.setString(1, "1.1");
                    pstmt.executeUpdate();

                } else {
                    DB_COMMAND = "INSERT INTO INITVALUES VALUES(?,?,?,?,?,?)";

                    pstmt = connection.prepareStatement(DB_COMMAND);
                    pstmt.clearParameters();
                    pstmt.setString(1, "");
                    pstmt.setInt(2, 0);
                    pstmt.setString(3, "");
                    pstmt.setString(4, "");
                    pstmt.setString(5, "");
                    pstmt.setString(6, "1.1");
                    pstmt.executeUpdate();

                }
                dbresultSet.close();



                // Feld TNText vergrössern
                statement.execute("ALTER TABLE TN ALTER TEXT SET DATA TYPE varchar(2000)");
                statement.execute("ALTER TABLE TNARCHIV  ALTER TEXT SET DATA TYPE varchar(2000)");
                // Feld he in ORDERS einfügen
                statement.execute("ALTER TABLE ORDERS ADD COLUMN he Varchar(10)");
                statement.execute("ALTER TABLE TN ADD COLUMN he Varchar(10)");
                statement.execute("ALTER TABLE TNARCHIV ADD COLUMN he Varchar(10)");
                dbversion = "1.1";
                statement.close();


            }
            //  statement.close();
// Fortlaufende Update Routine- Versionsfeld ist drin, also kann ich in einer While Schleife alle Änderungen durchlaufen bis auf aktuelle Version
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select version from INITVALUES ");
            if (resultSet.next()) {
                dbversion = resultSet.getString(1);
            }
            {
                while (!dbversion.equals(GlobalVars.version)) {
                    if (dbversion.equals("1.1")) {
                        // Kubduget und Arbpaket einfügen
                        statement.execute("ALTER TABLE TN ADD Kubudget  Varchar(15) Default ''");
                        statement.execute("ALTER TABLE TN ADD arbpaket  Varchar(15) Default ''");
                        statement.execute("ALTER TABLE TNARCHIV ADD Kubudget  Varchar(15) Default ''");
                        statement.execute("ALTER TABLE TNARCHIV ADD arbpaket  Varchar(15) Default ''");
                        DB_COMMAND = "UPDATE INITVALUES Set  version=? ";

                        dbversion = "1.2";
                    }
                    if (dbversion.equals("1.2")) {
                        // Kubduget und Arbpaket einfügen
                        statement.execute("ALTER TABLE INITVALUES ADD EXCHANGE  Varchar(100) Default ''");
                        statement.execute("ALTER TABLE INITVALUES ADD EXCHANGEUSER  Varchar(100) Default ''");
                        statement.execute("ALTER TABLE INITVALUES ADD EXCHANGEPASS  Varchar(100) Default ''");
                        statement.execute("ALTER TABLE INITVALUES ADD INTERNFIRMA  Varchar(20) Default 'GmbH & Co. KG.' ");
                        statement.execute("ALTER TABLE INITVALUES ADD OpenTreeKunde  Integer Default 0");
                        statement.execute("ALTER TABLE INITVALUES ADD ExchangeCALSuche  Integer Default 0");
                        DB_COMMAND = "UPDATE INITVALUES Set  version=? ";


                        dbversion = "1.3";
                    }
                    if (dbversion.equals("1.3")) {
                        // Kubduget und Arbpaket einfügen
                        statement.execute("ALTER TABLE INITVALUES ADD UPDATELOCATION  Varchar(200) Default '\\\\ap.abas-projektierung.local\\ap-gmbh-kg\\owdoku\\invoiceIT-2012\\'");
                        statement.execute("ALTER TABLE ORDERS ALTER COLUMN PTEXT SET DATA TYPE Varchar(1000)");
                        statement.execute("ALTER TABLE TN ALTER COLUMN PTEXT SET DATA TYPE Varchar(1000)");
                        statement.execute("ALTER TABLE TNARCHIV ALTER COLUMN PTEXT SET DATA TYPE Varchar(1000)");
                        DB_COMMAND = "UPDATE INITVALUES Set  version=? ";


                        dbversion = "1.31";
                    }
                    if (dbversion.equals("1.31")) {



                        dbversion = "1.32";
                    }
                    if (dbversion.equals("1.32")) {
                        statement.execute("ALTER TABLE ORDERS  ALTER KPLZ SET DATA TYPE varchar(10)");
                        dbversion = "1.33";
                    }

                    if (dbversion.equals("1.33")) {

                        dbversion = "1.34";
                    }

                    if (dbversion.equals("1.34")) {
                        statement.execute("ALTER TABLE INITVALUES  ALTER MITARBEITER SET DATA TYPE varchar(100)");


                        dbversion = "1.35";
                    }

                    if (dbversion.equals("1.35")) {
                        statement.execute("ALTER TABLE TN   ADD Uebernachtung  integer");
                        statement.execute("ALTER TABLE TNARCHIV  ADD Uebernachtung  integer");
                        statement.execute("ALTER TABLE INITVALUES ADD FILOSOFIE Integer Default 0");


                        dbversion = "1.37";
                    }
                    
                    if (dbversion.equals("1.36")) {
                        
                        statement.execute("ALTER TABLE INITVALUES ADD FILOSOFIE Integer Default 0");


                        dbversion = "1.37";
                    }
                     if (dbversion.equals("1.37")) {
                        
                         //Keine DB Änderung
                        


                        dbversion = "1.38";
                    }
                }
            }


            // Version in der DB hochsetzen

            DB_COMMAND = "UPDATE INITVALUES Set  version=? ";

            pstmt = connection.prepareStatement(DB_COMMAND);
            pstmt.clearParameters();
            pstmt.setString(1, GlobalVars.version);
            pstmt.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }





    }

    private void InitValues_READ() {
        // InitValues aus DB INITVALUES lesen und zuweisen
        try {

            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();
            ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM INITVALUES");
            if (dbresultSet.next()) {
                GlobalVars.edpHost = dbresultSet.getString(1);
                GlobalVars.edpPort = Integer.parseInt(dbresultSet.getString(2));
                GlobalVars.edpMandant = dbresultSet.getString(3);
                GlobalVars.edpPasswort = dbresultSet.getString(4);
                GlobalVars.mitarbeiter = dbresultSet.getString(5);
                GlobalVars.exchange = dbresultSet.getString(7);
                GlobalVars.exchuser = dbresultSet.getString(8);
                GlobalVars.exchpass = dbresultSet.getString(9);
                GlobalVars.internFirma = dbresultSet.getString(10);
                GlobalVars.openTreeKunde = dbresultSet.getBoolean(11);
                GlobalVars.exchangeCalSuche = dbresultSet.getBoolean(12);
                GlobalVars.updateLocation = dbresultSet.getString(13);
                GlobalVars.filosofie=dbresultSet.getBoolean(14);
                connection.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(Einstellungen.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }
    }

    private void Orders_READ() {
        String altesDatum = "";
        SimpleDateFormat formatM;
        SimpleDateFormat formatJ;
        String Monat = "";
        String Jahr = "";
        String altesJahr = "";
        String alterMonat = "";
        float nettotime;
        float ptime;
        float monatszeit = 0;
        float jahreszeit = 0;
        int tnoffen = 0;

        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            Date pzero = dateFormat.parse("01.01.1970 00:00");
            rootnode = new DefaultMutableTreeNode("abas");

            java.sql.Date dummyDate = null;
            java.sql.Time dummyTime = null;
            treeModel = new DefaultTreeModel(rootnode);
            jTree1.setModel(treeModel);
            //String auNodeString="Aufträge";
            auNode = new DefaultMutableTreeNode("Aufträge");
            rootnode.add(auNode);
            tnNode = new DefaultMutableTreeNode("TN's");
            rootnode.add(tnNode);
            aTnNode = new DefaultMutableTreeNode("TN Archiv");
            rootnode.add(aTnNode);

            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();
            //Selekt auf alles in Orders
            ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM ORDERS");
            Integer nummer = 0;
            String kunde = "";
            String alterkunde = "";
            String auftrag = "";
            String alterauftrag = "";
            while (dbresultSet.next()) {

                //Tree Aufbauen Aufträge  
/*                String db,
                 String id,
                 String artname,
                 Float limge,
                 Integer dbid,
                 String ptext,
                 Date datum,
                 Date von,
                 Date bis
                                  
                 */

                kunde = dbresultSet.getString(3);
                auftrag = dbresultSet.getString(2);
                if (kunde.equals(alterkunde)) {
                    // nkunde.add(new DefaultMutableTreeNode(edpQ1.getField(2))); 
                    if (auftrag.equals(alterauftrag)) {
                        npos = new DefaultMutableTreeNode(new Positionen("AUPOS",
                                dbresultSet.getString(1),
                                dbresultSet.getString(4),
                                dbresultSet.getFloat(5),
                                0,
                                dbresultSet.getString(7),
                                dummyDate,
                                dummyTime,
                                dummyTime,
                                "",
                                false,
                                false));
                        nauftrag.add(npos);
                    } else {
                        nauftrag = new DefaultMutableTreeNode(dbresultSet.getString(2) + " " + dbresultSet.getString(10));
                        nkunde.add(nauftrag);
                        //npos= new DefaultMutableTreeNode(dbresultSet.getString(4));
                        npos = new DefaultMutableTreeNode(new Positionen("AUPOS",
                                dbresultSet.getString(1),
                                dbresultSet.getString(4),
                                dbresultSet.getFloat(5),
                                0,
                                dbresultSet.getString(7),
                                dummyDate,
                                dummyTime,
                                dummyTime,
                                "",
                                false,
                                false));
                        nauftrag.add(npos);
                        //jTree1.scrollPathToVisible(new TreePath(npos.getPath()));
                        alterauftrag = dbresultSet.getString(2);
                    }
                } else {
                    // Kunde an Root Node anhängen
                    nkunde = new DefaultMutableTreeNode(kunde);
                    auNode.add(nkunde);
                    // Auftrag an Kunden Node
                    nauftrag = new DefaultMutableTreeNode(dbresultSet.getString(2) + " " + dbresultSet.getString(10));
                    nkunde.add(nauftrag);
                    // Position an Auftrags Node
                    //npos= new DefaultMutableTreeNode(dbresultSet.getString(4));
                    npos = new DefaultMutableTreeNode(new Positionen("AUPOS",
                            dbresultSet.getString(1),
                            dbresultSet.getString(4),
                            dbresultSet.getFloat(5),
                            0,
                            dbresultSet.getString(7),
                            dummyDate,
                            dummyTime,
                            dummyTime,
                            "",
                            false,
                            false));

                    nauftrag.add(npos);

                    alterkunde = dbresultSet.getString(3);
                    alterauftrag = dbresultSet.getString(2);


                }
            }
            //Tree Aufbauen TN's
            dbresultSet = xstatement.executeQuery("SELECT * FROM TN ORDER BY DATUM,Von ASC");
            while (dbresultSet.next()) {

                //nDatum=new DefaultMutableTreeNode(dbresultSet.getDate(3));
                float dummy = 0;
                nDatum = new DefaultMutableTreeNode(new Positionen("TNPOS",
                        dbresultSet.getString(2),
                        "",
                        dummy,
                        dbresultSet.getInt(1),
                        "",
                        dbresultSet.getDate(3),
                        dbresultSet.getTime(4),
                        dbresultSet.getTime(5),
                        dbresultSet.getString(9),
                        dbresultSet.getBoolean(7),
                        dbresultSet.getBoolean(11)));

                tnNode.add(nDatum);
            }

            //Tree Aufbauen TN ARchiv
            dbresultSet = xstatement.executeQuery("SELECT * FROM TNARCHIV ORDER BY DATUM,von ASC");
            while (dbresultSet.next()) {

                //nDatum=new DefaultMutableTreeNode(dbresultSet.getDate(3));
                float dummy = 0;
                formatM = new SimpleDateFormat("MMMMM"); // Angabe des Formates für die Ausgabe des Datumsstrings
                Monat = (formatM.format(dbresultSet.getDate(3)));
                formatJ = new SimpleDateFormat("yyyy");
                Jahr = (formatJ.format(dbresultSet.getDate(3)));


                //Neues Jahr 
                //xxxxx
                if (!Jahr.equals(altesJahr)) // if ((!Monat.equals(alterMonat))&(Monat.equals("April"))|alterMonat.equals(""))
                {
                    if (nJahr != null) {
                        nJahr.setUserObject(nJahr.getUserObject() + " - " + jahreszeit + " h - " + jahreszeit * 120 + " €");
                        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
                        model.nodeChanged(nJahr);
                        jahreszeit = 0;
                    }
                    altesJahr = formatJ.format(dbresultSet.getDate(3));

                    altesJahr = Jahr;
                    nJahr = new DefaultMutableTreeNode(Jahr);
                    aTnNode.add(nJahr);
                }
                //Neuer Monat
                if (!Monat.equals(alterMonat)) {
                    System.out.println(alterMonat);
                    //Monatsstatistik in Tree darstellen
                    if (nMonat != null) {
                        nMonat.setUserObject(nMonat.getUserObject() + " - " + strPre(monatszeit) + " h - " + strPre(monatszeit * 120) + " €");
                        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
                        model.nodeChanged(nMonat);

                        monatszeit = 0;
                    }
                    alterMonat = formatM.format(dbresultSet.getDate(3));

                    alterMonat = Monat;
                    nMonat = new DefaultMutableTreeNode(Monat);
                    nJahr.add(nMonat);

                }
                nDatum = new DefaultMutableTreeNode(new Positionen("ARCHIV",
                        dbresultSet.getString(2),
                        "",
                        dummy,
                        dbresultSet.getInt(1),
                        "",
                        dbresultSet.getDate(3),
                        dbresultSet.getTime(4),
                        dbresultSet.getTime(5),
                        dbresultSet.getString(9),
                        dbresultSet.getBoolean(7),
                        dbresultSet.getBoolean(11)));
                nMonat.add(nDatum);

                ptime = (dbresultSet.getTime(6).getTime() - pzero.getTime());
                ptime = ptime / 3600000;
                nettotime = (dbresultSet.getTime(5).getTime() - dbresultSet.getTime(4).getTime());
                nettotime = ((nettotime / 3600000) - ptime);
                //nettotime=( java.lang.Math.round( nettotime *100 )/100);
                monatszeit = monatszeit + nettotime;

                jahreszeit = jahreszeit + nettotime;
            }

// Und nun noch die aktuellen Werte der Umsätze
            if (nMonat != null) {

                nMonat.setUserObject(nMonat.getUserObject() + " - " + strPre(monatszeit) + " h - " + strPre(monatszeit * 120) + " €");
                DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
                model.nodeChanged(nMonat);

            }
            if (nJahr != null) {
                nJahr.setUserObject(nJahr.getUserObject() + " - " + strPre(jahreszeit) + " h - " + strPre(jahreszeit * 120) + " €");
                DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
                model.nodeChanged(nJahr);

            }

            jStundenMonWert.setText(strPre(monatszeit) + " h");
            jEuroMonWert.setText(strPre(monatszeit * 120) + " €");
            jStundenJahrWert.setText(strPre(jahreszeit) + " h");
            jEuroJahrWert.setText(strPre(jahreszeit * 120) + " €");


// Auftragsknoten aufklappen V1.2    

            if (GlobalVars.openTreeKunde & nauftrag != null) {
                jTree1.scrollPathToVisible(new TreePath(nkunde.getPath()));
            }
// Summierung der nicht freigegebenen TN'S
            dbresultSet = xstatement.executeQuery("SELECT * FROM TN ");
            while (dbresultSet.next()) {
                tnoffen = tnoffen + 1;
            }
            jOffeneTNWert.setText(new Integer(tnoffen).toString());





            connection.close();
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        } catch (SQLException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }


    }

    public String strPre(double inValue) {
        DecimalFormat threeDec = new DecimalFormat("0.00");
        String shortString = (threeDec.format(inValue));
        return shortString;
    }

    private void GetJoke() {
        InputStream is = null;
if (GlobalVars.filosofie) {
        try {
            URL url = new URL(" http://www.swr3.de/wraps/fun/filosofie/neu.php?rand=1 ");
            is = url.openStream();
            String Filosofie = new Scanner(is).useDelimiter("\\Z").next();
            System.out.println(Filosofie);
            Filosofie = Filosofie.substring(Filosofie.indexOf("schrift") + 9, Filosofie.length());
            //klein  noch raus filtern

            if (Filosofie.indexOf("lein") > 0) {
                Filosofie = Filosofie.substring(Filosofie.indexOf("lein") + 7, Filosofie.length());
            }
            //TODO
            Filosofie = Filosofie.substring(0, Filosofie.indexOf("</strong>"));
            //System.out.println(Filosofie);
            Filosofie = (StringEscapeUtils.unescapeHtml3(Filosofie));

            JOptionPane.showMessageDialog(this, Filosofie, "Filosofie des Tages", JOptionPane.QUESTION_MESSAGE);
        } catch (Exception e) {
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
            }

        }
     }
    }

 
        
       
        
        
    

    

 

    public class CalPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            try {
                String komponente;
                int ikomponente;
                Date caltag;
                int ywert = 21;
                super.paintComponent(g);

                g.setColor(new Color(185, 209, 234));
                g.fillRect(0, 0, this.getWidth(), 20);
                g.setColor(Color.WHITE);
                // g.fillRect( 0, 21, this.getWidth(),this.getHeight() );
                //System.out.println(  mainPanel.getComponent( 0 ).getName());
                komponente = this.getName();
                //  komponente=this.getParent().getName();
                if (komponente != null) {
                    komponente = komponente.substring(komponente.length() - 1, komponente.length());
                    ikomponente = Integer.parseInt(komponente);
                    g.setColor(Color.BLACK);
                    caltag = new Date(GlobalVars.caldatum.getTime() - 86400000 * (ikomponente - 1));
                    SimpleDateFormat dateFormat = new SimpleDateFormat("E dd.MM.yyyy");

                    if (ikomponente == 7) {
                        kalenderrange.setText((dateFormat.format(caltag) + " - " + dateFormat.format(GlobalVars.caldatum)));
                    }
                    g.drawString(dateFormat.format(caltag), 10, 15);
                    long sqllong = caltag.getTime();
                    java.sql.Date sqltag = new java.sql.Date(sqllong);
                    Font fontg = new Font("Sego UI", Font.PLAIN, 10);
                    Font fontk = new Font("Sego UI", Font.PLAIN, 9);

                    // Exchange Daten holen
                    Connection connection = DB_CONNECT();
                    dateFormat = new SimpleDateFormat("HH:mm");
                    java.sql.Statement xstatement = connection.createStatement();
                    java.sql.Statement xstatementTN = connection.createStatement();
                    ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM EXCHANGECAL WHERE startdate ='" + sqltag.toString() + "'");
                    while (dbresultSet.next()) {

                        ResultSet dbresultSetTN = xstatementTN.executeQuery("SELECT * FROM TN WHERE datum ='" + sqltag.toString() + "'AND Kunde= '" + dbresultSet.getString(5) + "'");
                        if (dbresultSetTN.next()) {
                            g.setColor(Color.GREEN);
                            g.fillRect(0, ywert, this.getWidth(), 40);
                            g.setColor(Color.BLACK);
                            g.setFont(fontg);
                            g.drawString(dateFormat.format(dbresultSetTN.getTime(4)).toString() + " - " + dateFormat.format(dbresultSetTN.getTime(5)).toString(), 15, ywert + 15);
                        } else {
                            g.setColor(Color.WHITE);
                            g.fillRect(0, ywert, this.getWidth(), 40);
                            g.setColor(Color.BLACK);
                            g.setFont(fontg);
                            g.drawString(dateFormat.format(dbresultSet.getTime(3)).toString() + " - " + dateFormat.format(dbresultSet.getTime(4)).toString(), 15, ywert + 15);
                        }


                        g.setFont(fontk);
                        g.drawString(dbresultSet.getString(5), 5, ywert + 30);
                        g.setColor(Color.LIGHT_GRAY);
                        g.drawLine(0, ywert + 40, this.getWidth(), ywert + 40);
                        ywert = ywert + 41;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
                MyException(ex.toString());
            }



        }
    }

    private Date Combo2Date(javax.swing.JComboBox chour, javax.swing.JComboBox cminute) {
        try {
            System.out.println(cminute.getSelectedItem());
            String dString;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            dString = "01.01.1970 " + (String) chour.getSelectedItem() + ":" + (String) cminute.getSelectedItem();
            Date datum = dateFormat.parse(dString);

            return datum;
        } catch (ParseException ex) {
            Logger.getLogger(invoiceIT.class.getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
            return null;
        }
    }

    private void Date2Combo(Date datum, javax.swing.JComboBox chour, javax.swing.JComboBox cminute) {
        int i;
        Calendar cal = Calendar.getInstance();
        cal.setTime(datum);
        i = cal.get(Calendar.HOUR_OF_DAY);
        chour.setSelectedIndex(i);

        i = cal.get(Calendar.MINUTE);
        i = i / 15;
        cminute.setSelectedIndex(i);
        System.out.println(i);
        return;
    }

    private void Kalender_Abgleich(Connection connection, ExchangeService service, int timezoneOffset) {
        try {
            java.sql.Statement xstatement;
            PreparedStatement preparedStatement;
            jProgressBar1.setString("Kalender synchronisieren");
            jProgressBar1.paint(jProgressBar1.getGraphics());

            xstatement = connection.createStatement();
            // DB Löschen  
            int iresult = xstatement.executeUpdate("DELETE  FROM EXCHANGECAL");
            SimpleDateFormat xformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            // create Calendar instance with actual date
            Date now = new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(now);

            // add 50 days to calendar instance
            calendar.add(Calendar.DAY_OF_MONTH, 50);
            // get the date instance
            Date endDate = calendar.getTime();
            // add -100 days to calendar instance
            //debug
            calendar.add(Calendar.DAY_OF_MONTH, -100);
            // get the date instance
            Date startDate = calendar.getTime();
            //System.out.println(now);
            System.out.println(startDate);
            // System.out.println(endDate);
            //Date xendDate = xformatter.parse("2012-12-31 23:59:59");                  
            CalendarFolder cf;

            cf = CalendarFolder.bind(service, WellKnownFolderName.Calendar);

            FindItemsResults<Appointment> findResults = cf.findAppointments(new CalendarView(startDate, endDate));
            for (Appointment appt : findResults.getItems()) {

                System.out.println(appt.getStart().toString() + " - " + appt.getSubject());
                preparedStatement = connection.prepareStatement("INSERT INTO EXCHANGECAL VALUES (?,?,?,?,?)");
                long xanf = appt.getStart().getTime() + timezoneOffset;
                long xend = appt.getEnd().getTime() + timezoneOffset;
                preparedStatement.setDate(1, new java.sql.Date(xanf));
                preparedStatement.setDate(2, new java.sql.Date(xend));
                preparedStatement.setTime(3, new java.sql.Time(xanf));
                preparedStatement.setTime(4, new java.sql.Time(xend));
                if (appt.getSubject() != null) {
                    if (appt.getSubject().length() > 99) {
                        preparedStatement.setString(5, appt.getSubject().substring(0, 99));
                    } else {
                        preparedStatement.setString(5, appt.getSubject());
                    }
                } else {
                    preparedStatement.setString(5, "");
                }
                preparedStatement.execute();
                preparedStatement.close();
            }



        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            MyException("Kalendersync mit folgendem Fehler abgebrochen:\n" + ex.toString());
        }

    }

    private void Kennzahlen_LOAD(EDPQuery edpQ1, Connection connection) {
        try {
            String selektion;
            PreparedStatement preparedStatement;
            //Firmenkennzahlen abholen   
            selektion = "nummer=0monat";
            //Auftragsbestand
            edpQ1.startQuery("47:3", "", selektion, "yaukufr,yaukuho,yaukuka,yaukula,yaukulue,yaukumue,yaukuvs,yauneufr,yauneuho,yauneuka,yauneula,yauneulue,yauneumue,yauneuvs");
            // edpE1 = session.createEditor();
            preparedStatement = connection.prepareStatement("DELETE FROM KENNZAHLEN  ");
            preparedStatement.execute();
            preparedStatement.close();
            preparedStatement = connection.prepareStatement("INSERT INTO KENNZAHLEN VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");

            while (edpQ1.getNextRecord()) {



                preparedStatement.setInt(1, Integer.parseInt((edpQ1.getField(1)).trim()));
                preparedStatement.setInt(2, Integer.parseInt((edpQ1.getField(2)).trim()));
                preparedStatement.setInt(3, Integer.parseInt((edpQ1.getField(3)).trim()));
                preparedStatement.setInt(4, Integer.parseInt((edpQ1.getField(4)).trim()));
                preparedStatement.setInt(5, Integer.parseInt((edpQ1.getField(5)).trim()));
                preparedStatement.setInt(6, Integer.parseInt((edpQ1.getField(6)).trim()));
                preparedStatement.setInt(7, Integer.parseInt((edpQ1.getField(7)).trim()));
                preparedStatement.setInt(8, Integer.parseInt((edpQ1.getField(8)).trim()));
                preparedStatement.setInt(9, Integer.parseInt((edpQ1.getField(9)).trim()));
                preparedStatement.setInt(10, Integer.parseInt((edpQ1.getField(10)).trim()));
                preparedStatement.setInt(11, Integer.parseInt((edpQ1.getField(11)).trim()));
                preparedStatement.setInt(12, Integer.parseInt((edpQ1.getField(12)).trim()));
                preparedStatement.setInt(13, Integer.parseInt((edpQ1.getField(13)).trim()));
                preparedStatement.setInt(14, Integer.parseInt((edpQ1.getField(14)).trim()));





                //Umsätze
            }
            edpQ1.startQuery("47:3", "", selektion, "yplanakt,yistakt,yerfuellakt,yplanvormo,yistvormo,yplanjanvormo,yistjanvormo,yerfuelljanvormo,yerpplanakt,yerpistakt,yerperfuellakt,yerpplanvormo,yerpistvormo,yerpplanjanvormo,yerpistjanvormo,yerperfuelljanvorm");

            while (edpQ1.getNextRecord()) {



                preparedStatement.setInt(15, Integer.parseInt(edpQ1.getField(1).trim()));
                preparedStatement.setInt(16, Integer.parseInt(edpQ1.getField(2).trim()));
                preparedStatement.setDouble(17, Double.parseDouble(edpQ1.getField(3).trim()));
                preparedStatement.setInt(18, Integer.parseInt(edpQ1.getField(4).trim()));
                preparedStatement.setInt(19, Integer.parseInt(edpQ1.getField(5).trim()));
                preparedStatement.setInt(20, Integer.parseInt(edpQ1.getField(6).trim()));
                preparedStatement.setInt(21, Integer.parseInt(edpQ1.getField(7).trim()));
                preparedStatement.setDouble(22, Double.parseDouble(edpQ1.getField(8).trim()));
                preparedStatement.setInt(23, Integer.parseInt(edpQ1.getField(9).trim()));
                preparedStatement.setInt(24, Integer.parseInt(edpQ1.getField(10).trim()));
                preparedStatement.setDouble(25, Double.parseDouble(edpQ1.getField(11).trim()));
                preparedStatement.setInt(26, Integer.parseInt(edpQ1.getField(12).trim()));
                preparedStatement.setInt(27, Integer.parseInt(edpQ1.getField(13).trim()));
                preparedStatement.setInt(28, Integer.parseInt(edpQ1.getField(14).trim()));
                preparedStatement.setInt(29, Integer.parseInt(edpQ1.getField(15).trim()));
                preparedStatement.setDouble(30, Double.parseDouble(edpQ1.getField(16).trim()));


            }

            edpQ1.startQuery("47:3", "", selektion, "yhotstdakt,yhotstdvormo,yhotstdjanvormo,yhoterlakt,yhoterlvormo,yhoterljanvormo,yhotoffenakt,yhotaltakt,yhotaltvormo,yhotaltjanvormo");

            while (edpQ1.getNextRecord()) {



                preparedStatement.setInt(31, Integer.parseInt(edpQ1.getField(1).trim()));
                preparedStatement.setInt(32, Integer.parseInt(edpQ1.getField(2).trim()));
                preparedStatement.setInt(33, Integer.parseInt(edpQ1.getField(3).trim()));
                preparedStatement.setInt(34, Integer.parseInt(edpQ1.getField(4).trim()));
                preparedStatement.setInt(35, Integer.parseInt(edpQ1.getField(5).trim()));
                preparedStatement.setInt(36, Integer.parseInt(edpQ1.getField(6).trim()));
                preparedStatement.setInt(37, Integer.parseInt(edpQ1.getField(7).trim()));
                preparedStatement.setInt(38, Integer.parseInt(edpQ1.getField(8).trim()));
                preparedStatement.setInt(39, Integer.parseInt(edpQ1.getField(9).trim()));
                preparedStatement.setInt(40, Integer.parseInt(edpQ1.getField(10).trim()));

            }
            preparedStatement.execute();
            preparedStatement.close();


            //Projekte
            selektion = "nummer=0monat;@zeilen=ja";
            edpQ1.startQuery("47:3", "", selektion, "ybetriebsstaette,ykuname,ystatus,yvertret^name,ypleiter^name,yplfibu1^name,yaupwert,ylizenz,ystufeapmeth,ynaechststufe,yechtgeplant");
            preparedStatement = connection.prepareStatement("DELETE FROM PROJEKTE  ");
            preparedStatement.execute();
            preparedStatement.close();


            while (edpQ1.getNextRecord()) {
                preparedStatement = connection.prepareStatement("INSERT INTO PROJEKTE VALUES (?,?,?,?,?,?,?,?,?,?,?) ");

                preparedStatement.setString(1, edpQ1.getField(1));
                preparedStatement.setString(2, edpQ1.getField(2));
                preparedStatement.setString(3, edpQ1.getField(3));
                preparedStatement.setString(4, edpQ1.getField(4));
                preparedStatement.setString(5, edpQ1.getField(5));
                preparedStatement.setString(6, edpQ1.getField(6));
                preparedStatement.setString(7, edpQ1.getField(7));
                preparedStatement.setString(8, edpQ1.getField(8));
                preparedStatement.setString(9, edpQ1.getField(9));
                preparedStatement.setString(10, edpQ1.getField(10));
                preparedStatement.setString(11, edpQ1.getField(11));
                preparedStatement.execute();
            }

            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidQueryException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

    private EDPSession SessionAufbauen() {

        EDPSession session = EDPFactory.createEDPSession(GlobalVars.edpversion);
        try {
            // Verbindung testen zum Server via edp
            //Session aufbauen
            session.beginSession(GlobalVars.edpHost, GlobalVars.edpPort, GlobalVars.edpMandant, GlobalVars.edpPasswort, "JEDP_0001");

        } catch (CantBeginSessionException ex) {
            Logger.getLogger(Einstellungen.class.getName()).log(Level.SEVERE, null, ex);
            JFrame mainFrame = this;
            JOptionPane.showMessageDialog(mainFrame, "Verbindungsaufnahme gescheitert\n\n" + ex, "EDP Fehler", JOptionPane.ERROR_MESSAGE);
            session = null;
        }
        return session;
    }

    private void checkupdate() {
        try {
            BufferedReader in = null;

            in = new BufferedReader(new FileReader(GlobalVars.updateLocation + "version.txt"));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                System.out.println("Gelesene Zeile: " + zeile);
                // String schneiden
                int index = zeile.indexOf('#');
                String updateversion = zeile.substring(0, index);
                String updatename = zeile.substring(index + 1);
                if (!updateversion.equals(GlobalVars.version)) {
                    // Neue Version verfügbar  


                    Object[] options = {"Yes", "No"};
                    int ret = JOptionPane.showOptionDialog(mainPanel, "Neue Version " + updateversion + " verfügbar! Download starten?", "Update Check",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE, null,
                            options, options[0]);
                    if (ret == JOptionPane.YES_OPTION) {

                        downloader(updatename);
                        
            




                    }

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            MyException(ex.toString());
        }
    }

    private void downloader(String downloadfile) {
        int promille;
        //Download starten

        // URL url = new URL("\\\\ap\\ap-vorlage-demo\\owdoku\\invoiceIT-2012\\invoiceIT13.zip" );
        FileInputStream infile = null;



        JFrame wnd = new JFrame("Download von " + downloadfile);
        wnd.setSize(300, 50);
        JProgressBar progress = new JProgressBar();
        wnd.add(progress);
        wnd.setLocationRelativeTo(null);
        wnd.setVisible(true);
        progress.setMaximum(1000);
        progress.setValue(0);
        progress.setIndeterminate(false);
        // Datei kopieren
        try {

            File source = new File(GlobalVars.updateLocation + downloadfile);
            long max = source.length();
            long copied = 0;

            BufferedInputStream strin = new BufferedInputStream(new FileInputStream(GlobalVars.updateLocation + downloadfile));
            BufferedOutputStream strout = new BufferedOutputStream(new FileOutputStream(downloadfile));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = strin.read(buffer)) > -1) {
                strout.write(buffer, 0, len);

                // Progressbar
                copied += len;
                promille = (int) (copied * 1000.0 / max);
                progress.setValue(promille);
                progress.paint(progress.getGraphics());
            }

            strout.flush();
            strin.close();
            strout.close();
            unzipper(downloadfile);
        } catch (IOException e) {
        }

        wnd.dispose();
    }

    private void unzipper(String packedfile) {
        try {
            ZipFile zipFile = new ZipFile(packedfile);
            Enumeration<?> enu = zipFile.entries();
            while (enu.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) enu.nextElement();

                String name = zipEntry.getName();
                long size = zipEntry.getSize();
                long compressedSize = zipEntry.getCompressedSize();
                System.out.printf("name: %-20s | size: %6d | compressed size: %6d\n",
                        name, size, compressedSize);

                File file = new File(name);
                if (name.endsWith("/")) {
                    file.mkdirs();
                    continue;
                }

                File parent = file.getParentFile();
                if (parent != null) {
                    parent.mkdirs();
                }


                java.io.InputStream is = zipFile.getInputStream(zipEntry);

                FileOutputStream fos = new FileOutputStream(file);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = is.read(bytes)) >= 0) {
                    fos.write(bytes, 0, length);
                }
                is.close();
                fos.close();

            }
            zipFile.close();
            Runtime.getRuntime().exec("java -jar invoiceIT.jar");
            System.exit(0);
        } catch (IOException e) {
        }

    }

    private void Kennzahlen_READ() {
        try {




    
            String vertreter = "";
            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();
            ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM KENNZAHLEN");
            while (dbresultSet.next()) {
                NumberFormat nf = NumberFormat.getInstance();
                jTyaukufr.setText(nf.format(dbresultSet.getInt(1)));
                jTyaukuho.setText(nf.format(dbresultSet.getInt(2)));
                jTyaukuka.setText(nf.format(dbresultSet.getInt(3)));
                jTyaukula.setText(nf.format(dbresultSet.getInt(4)));
                jTyaukulue.setText(nf.format(dbresultSet.getInt(5)));
                jTyaukumue.setText(nf.format(dbresultSet.getInt(6)));
                jTyaukuvs.setText(nf.format(dbresultSet.getInt(7)));
                jTyauneufr.setText(nf.format(dbresultSet.getInt(8)));
                jTyauneuho.setText(nf.format(dbresultSet.getInt(9)));
                jTyauneuka.setText(nf.format(dbresultSet.getInt(10)));
                jTyauneula.setText(nf.format(dbresultSet.getInt(11)));
                jTyauneulue.setText(nf.format(dbresultSet.getInt(12)));
                jTyauneumue.setText(nf.format(dbresultSet.getInt(13)));
                jTyauneuvs.setText(nf.format(dbresultSet.getInt(14)));





                jTyplanakt.setText(nf.format(dbresultSet.getInt(15)));
                jTyistakt.setText(nf.format(dbresultSet.getInt(16)));
                jTyerperfuellakt.setText(strPre(dbresultSet.getFloat(17)));
                jTyplanvormo.setText(nf.format(dbresultSet.getInt(18)));
                jTyistvormo.setText(nf.format(dbresultSet.getInt(19)));
                jTyplanjanvormo.setText(nf.format(dbresultSet.getInt(20)));
                jTyistjanvormo.setText(nf.format(dbresultSet.getInt(21)));
                jTyerfuelljanvormo.setText(strPre(dbresultSet.getFloat(22)));
                jTyerpplanakt.setText(nf.format(dbresultSet.getInt(23)));
                jTyerpistakt.setText(nf.format(dbresultSet.getInt(24)));
                jTyerperfuellakt.setText(strPre(dbresultSet.getFloat(25)));
                jTyerpplanvormo.setText(nf.format(dbresultSet.getInt(26)));
                jTyerpistvormo.setText(nf.format(dbresultSet.getInt(27)));
                jTyerpplanjanvormo.setText(nf.format(dbresultSet.getInt(28)));
                jTyerpistjanvormo.setText(nf.format(dbresultSet.getInt(29)));
                jTyerperfuelljanvorm.setText(strPre(dbresultSet.getFloat(30)));




                jTyhotstdakt.setText(nf.format(dbresultSet.getInt(31)));
                jTyhotstdvormo.setText(nf.format(dbresultSet.getInt(32)));
                jTyhotstdjanvormo.setText(nf.format(dbresultSet.getInt(33)));
                jTyhoterlakt.setText(nf.format(dbresultSet.getInt(34)));
                jTyhoterlvormo.setText(nf.format(dbresultSet.getInt(35)));
                jTyhoterljanvormo.setText(nf.format(dbresultSet.getInt(36)));
                jTyhotoffenakt.setText(nf.format(dbresultSet.getInt(37)));
                jTyhotaltakt.setText(nf.format(dbresultSet.getInt(38)));
                jTyhotaltvormo.setText(nf.format(dbresultSet.getInt(39)));
                jTyhotaltjanvormo.setText(nf.format(dbresultSet.getInt(40)));

                dbresultSet = xstatement.executeQuery("SELECT * FROM PROJEKTE");

                while (((DefaultTableModel) jTable1.getModel()).getRowCount() > 0) {
                    ((DefaultTableModel) jTable1.getModel()).removeRow(0);
                }
                //((DefaultTableModel)jTable1.getModel()).removeRow(100);
                //((DefaultTableModel)jTable1.getModel()).removeRow(((DefaultTableModel)jTable1.getModel()).getRowCount());
                while (dbresultSet.next()) {
                    //Vertreter bereinigen                   
                    vertreter = dbresultSet.getString(4);
                    if (vertreter.length() > 11) {
                        vertreter = vertreter.substring(11);
                    }

                    Object[] newRowData = {dbresultSet.getString(1), dbresultSet.getString(2), dbresultSet.getString(3), vertreter, dbresultSet.getString(5), dbresultSet.getString(6), dbresultSet.getString(7), dbresultSet.getString(8), dbresultSet.getString(9), dbresultSet.getString(10), dbresultSet.getString(11)};
                    ((DefaultTableModel) jTable1.getModel()).addRow(newRowData);

                }



            }
        
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Exchange_Set_Appointment(Date tndatum, String tnkunde, String tntext, Date tnvon, Date tnbis, int timezoneOffset, ExchangeService service, ResultSet dbresultSet) {
        try {
            // Übertragung des Termins an Exchange
            boolean termingefunden = false;
            SimpleDateFormat xformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date xstartDate;
            xstartDate = xformatter.parse(tndatum + " 00:00:00");
            Date xendDate = xformatter.parse(tndatum + " 23:59:59");
            CalendarFolder cf = CalendarFolder.bind(service, WellKnownFolderName.Calendar);
            FindItemsResults<Appointment> findResults = cf.findAppointments(new CalendarView(xstartDate, xendDate));
            for (Appointment appt : findResults.getItems()) {
                if (appt.getSubject().toUpperCase().equals(dbresultSet.getString(9)) & (!termingefunden) & (GlobalVars.exchangeCalSuche)) {
                    ItemId uniqueId = appt.getId();
                    Appointment appointment = Appointment.bind(service, uniqueId);
                    appointment.setSubject("TN/" + tnkunde);
                    appointment.setBody(MessageBody.getMessageBodyFromText(appointment.getBody() + tntext));
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    Date startDate = formatter.parse(tndatum + " " + tnvon);
                    startDate = new Date(startDate.getTime() - timezoneOffset);
                    Date endDate = formatter.parse(tndatum + " " + tnbis);
                    endDate = new Date(endDate.getTime() - timezoneOffset);
                    appointment.setStart(startDate);//new Date(2010-1900,5-1,20,20,00));
                    appointment.setEnd(endDate); //new Date(2010-1900,5-1,20,21,00));
                    appointment.setIsReminderSet(false);
                    appointment.update(ConflictResolutionMode.AutoResolve, SendInvitationsOrCancellationsMode.SendToNone);
                    termingefunden = true;
                }
            }
            if (!termingefunden) {
                Appointment appointment = new Appointment(service);
                appointment.setSubject("TN/" + tnkunde);
                appointment.setBody(MessageBody.getMessageBodyFromText(tntext));
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date startDate = formatter.parse(tndatum + " " + tnvon);
                startDate = new Date(startDate.getTime() - timezoneOffset);
                Date endDate = formatter.parse(tndatum + " " + tnbis);
                endDate = new Date(endDate.getTime() - timezoneOffset);
                appointment.setStart(startDate);//new Date(2010-1900,5-1,20,20,00));
                appointment.setEnd(endDate); //new Date(2010-1900,5-1,20,21,00));
                appointment.setIsReminderSet(false);
                appointment.save();
            }

        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            MyException("Kalenderänderung für " + tndatum + " ergab folgenden Fehler:\n" + ex.toString());
        }
    }

    private void TNAKTIV(boolean status) {
        if (status) {

            jXDatePickerTN.setEnabled(true);
            jTNBisH.setEnabled(true);
            jTNBisM.setEnabled(true);
            jTNVonH.setEnabled(true);
            jTNVonM.setEnabled(true);
            jTNPauseH.setEnabled(true);
            jTNPauseM.setEnabled(true);



            dbID.setEnabled(false);
            jSaveButton.setEnabled(true);
            jTNPanel.setEnabled(true);
            labeldatum.setEnabled(true);
            labelBis.setEnabled(true);
            labelVon.setEnabled(true);
            labelPause.setEnabled(true);
            labelVon.setEnabled(true);
            labelNettoZeit.setEnabled(true);
            jlabeldbid.setEnabled(false);
            jAmpel.setEnabled(true);
            jTnText.setEnabled(true);
            jverwaltungsText.setEnabled(true);
            jFreigabe.setEnabled(true);
            // Prüfen ob wir Fahrtkosten freigeben dürfen
            tnFahrtkosten.setEnabled(true);
            jTNPanel.setEnabled(true);
            jPrintButton.setEnabled(true);
            jKuBudget.setEnabled(true);
            jArbPaket.setEnabled(true);
            jBudgetLabel.setEnabled(true);
            jArbPaketLabel.setEnabled(true);
            jUebernachtung.setEnabled(true);

        } else {

            jXDatePickerTN.setEnabled(false);

            jTNBisH.setEnabled(false);
            jTNBisM.setEnabled(false);
            jTNVonH.setEnabled(false);
            jTNVonM.setEnabled(false);
            jTNPauseH.setEnabled(false);
            jTNPauseM.setEnabled(false);
            tnFahrtkosten.setEnabled(false);
            dbID.setEnabled(false);
            jSaveButton.setEnabled(false);
            jTNPanel.setEnabled(false);
            labeldatum.setEnabled(false);
            labelBis.setEnabled(false);
            labelVon.setEnabled(false);
            labelPause.setEnabled(false);
            labelVon.setEnabled(false);
            labelNettoZeit.setEnabled(false);
            jlabeldbid.setEnabled(false);
            jAmpel.setEnabled(false);
            jTnText.setEnabled(false);
            jverwaltungsText.setEnabled(false);
            jFreigabe.setEnabled(false);
            jPrintButton.setEnabled(false);
            jKuBudget.setEnabled(false);
            jArbPaket.setEnabled(false);
            jBudgetLabel.setEnabled(false);
            jArbPaketLabel.setEnabled(false);
            jUebernachtung.setEnabled(false);


        }

    }

    private void DB_SEARCH(int datensatz) {
        try {
           
            Connection connection = DB_CONNECT();
            java.sql.Statement xstatement = connection.createStatement();
            ResultSet dbresultSet = xstatement.executeQuery("SELECT * FROM TNARCHIV WHERE UPPER(TEXT) LIKE UPPER('%" + jTextSearch.getText() + "%')");
            GlobalVars.treffer = 0;
            while (dbresultSet.next()) {
                GlobalVars.treffer = GlobalVars.treffer + 1;
                System.out.println(dbresultSet.getString(8));

                if (GlobalVars.treffer == datensatz) {
                    //1. TNARCHIV Treffer darstellen
                    dbID.setText(dbresultSet.getString(1));
                    jposid.setText(dbresultSet.getString(2));
                    if (dbresultSet.getDate(3) != null) {
                        jXDatePickerTN.setDate(dbresultSet.getDate(3));

                    }
                    if (dbresultSet.getTime(4) != null) {
                        Date2Combo(dbresultSet.getTime(4), jTNVonH, jTNVonM);
                    }
                    if (dbresultSet.getTime(5) != null) {

                        Date2Combo(dbresultSet.getTime(5), jTNBisH, jTNBisM);
                    }
                    if (dbresultSet.getTime(6) != null) {

                        Date2Combo(dbresultSet.getTime(6), jTNPauseH, jTNPauseM);
                    }

                    tnFahrtkosten.setSelected(dbresultSet.getBoolean(7));
                    jTnText.setText(dbresultSet.getString(8));
                    jKunde.setText(dbresultSet.getString(9));
                    jAuftrag.setText(dbresultSet.getString(10));
                    jFreigabe.setSelected(dbresultSet.getBoolean(11));
                    jverwaltungsText.setText(dbresultSet.getString(12));
                    jpnum.setText(dbresultSet.getString(13));
                    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                    jAudatum.setText(sdf.format(dbresultSet.getDate(14)));
                    jBetreff.setText(dbresultSet.getString(15));
                    jLimge.setText(dbresultSet.getString(28));
                    jMge.setText(dbresultSet.getString(29));
                    jPText.setText(dbresultSet.getString(30));
                    jArtname.setText(dbresultSet.getString(27));
                    jBetrStaette.setText(dbresultSet.getString(31));
                    jHe.setText(dbresultSet.getString(32));
                    jAmpel.setIcon(new ImageIcon(GlobalVars.gruen));
                    //jSaveButton.setEnabled(true);
                    jDelButton.setEnabled(true);
                    jKuBudget.setText(dbresultSet.getString(33));
                    jArbPaket.setText(dbresultSet.getString(34));
                    jUebernachtung.setSelected(dbresultSet.getBoolean(35));
                    jSearchKunde.setText(dbresultSet.getString(9));
                    jSearchAuftrag.setText(dbresultSet.getString(10));
                    TNAKTIV(false);

                    jPrintButton.setEnabled(true);
                }
            }

            jLabelSearchSatz.setText(String.valueOf(datensatz));
            jLabelTreffer.setText("von " + String.valueOf(GlobalVars.treffer));
            connection.close();
            jButtonSearchRueck.setEnabled(true);
            jButtonSearchVorw.setEnabled(true);
            if (datensatz == 1) {
                jButtonSearchRueck.setEnabled(false);
            }
            if (datensatz == GlobalVars.treffer) {
                jButtonSearchVorw.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }

    }
private void Releasetext()
{
    
    
    File f = new File("release.txt");
    if(f.exists() && !f.isDirectory())
    {
 JFrame mainFrame = this;
        releasetxt releasewindow ; 
        releasewindow = new releasetxt(mainFrame,true);
        releasewindow.setVisible(true);
     f.delete();

    }
    
        

}
    class Positionen {

        private String DB;
        private String id;
        private String artname;
        private Float limge;
        private Integer dbid;
        private String ptext;
        private java.sql.Date datum;
        private Date von;
        private Date bis;
        private String kunde;
        private boolean fahrtkosten;
        private boolean freigabe;

        public Positionen(String db,
                String id,
                String artname,
                Float limge,
                Integer dbid,
                String ptext,
                java.sql.Date datum,
                Date von,
                Date bis,
                String kunde,
                boolean fahrtkosten,
                boolean freigabe) {
            this.DB = db;
            this.id = id;
            this.artname = artname;
            this.limge = limge;
            this.dbid = dbid;
            this.ptext = ptext;
            this.datum = datum;
            this.von = von;
            this.bis = bis;
            this.kunde = kunde;
            this.fahrtkosten = fahrtkosten;
            this.freigabe = freigabe;

        }

        @Override
        public String toString() {
            String retValue = "";
            if (DB.equals("AUPOS")) {
                retValue = artname + " - " + limge + " - " + ptext;
            }
            if (DB.equals("TNPOS") || (DB.equals("ARCHIV"))) {
                retValue = kunde + ": " + datum + " - " + von + " - " + bis;
            }
            return retValue;
        }
    }
    
   
    
    DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer() {
        URL dicon = this.getClass().getResource("euro.png");
        URL cicon = this.getClass().getResource("bicycle.png");
        ImageIcon CAR_ICON = new ImageIcon(cicon);
        ImageIcon DOLLAR_ICON = new ImageIcon(dicon);

        @Override
        public Component getTreeCellRendererComponent(JTree tree,
                Object value, boolean sel, boolean expanded, boolean leaf,
                int row, boolean hasFocus) {
            DefaultMutableTreeNode currentTreeNode = (DefaultMutableTreeNode) value;
            Object nodeInfo = currentTreeNode.getUserObject();
            if (nodeInfo instanceof Positionen) {
                Positionen positionen = (Positionen) nodeInfo;
                if (positionen.DB.equals("TNPOS")) {

                    //TreeEntry userObject = (TreeEntry) currentTreeNode.getUserObject();

                    if (positionen.fahrtkosten) {
                        setLeafIcon(CAR_ICON);
                        super.getTreeCellRendererComponent(tree, value, sel,
                                expanded, leaf, row, hasFocus);
                    } else {
                        setLeafIcon(DOLLAR_ICON);
                        super.getTreeCellRendererComponent(tree, value, sel,
                                expanded, leaf, row, hasFocus);
                    }
                    if (positionen.freigabe) {

                        setBackground(Color.WHITE);
                        setForeground(new Color(0, 100, 0));
                    } else {
                        setBackground(Color.WHITE);
                        setForeground(new Color(139, 0, 0));
                    }



                } else {
                    setLeafIcon(null);
                    super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
                    setBackground(tree.getBackground());
                    setForeground(tree.getForeground());
                }

            } else {
                setLeafIcon(null);
                super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
                setBackground(tree.getBackground());
                setForeground(tree.getForeground());
            }

            return this;

        }
    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KalenderPanel;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JTextField dbID;
    private javax.swing.JLabel jAmpel;
    private javax.swing.JTextField jArbPaket;
    private javax.swing.JLabel jArbPaketLabel;
    private javax.swing.JTextField jArtname;
    private javax.swing.JTextField jAudatum;
    private javax.swing.JTextField jAuftrag;
    private javax.swing.JTextField jBetrStaette;
    private javax.swing.JTextArea jBetreff;
    private javax.swing.JLabel jBudgetLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearchRueck;
    private javax.swing.JButton jButtonSearchVorw;
    private javax.swing.JButton jButtonleft;
    private javax.swing.JPanel jCalPanel1;
    private javax.swing.JPanel jCalPanel2;
    private javax.swing.JPanel jCalPanel3;
    private javax.swing.JPanel jCalPanel4;
    private javax.swing.JPanel jCalPanel6;
    private javax.swing.JPanel jCalPanel7;
    private javax.swing.JPanel jCalpanel5;
    private javax.swing.JButton jDelButton;
    private javax.swing.JLabel jEuroJahrWert;
    private javax.swing.JLabel jEuroMonWert;
    private javax.swing.JCheckBox jFreigabe;
    private javax.swing.JLabel jHe;
    private javax.swing.JTextField jKuBudget;
    private javax.swing.JTextField jKunde;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel59;
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
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabelSearchSatz;
    private javax.swing.JLabel jLabelTreffer;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JTextField jLimge;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEinstellungen;
    private javax.swing.JMenuItem jMenuExchange;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuWartung;
    private javax.swing.JTextField jMge;
    private javax.swing.JLabel jOffeneTNWert;
    private javax.swing.JTextArea jPText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jPrintButton;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton jSaveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jSearchAuftrag;
    private javax.swing.JTextField jSearchKunde;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel jStundenJahrWert;
    private javax.swing.JLabel jStundenMonWert;
    private javax.swing.JComboBox jTNBisH;
    private javax.swing.JComboBox jTNBisM;
    private javax.swing.JPanel jTNPanel;
    private javax.swing.JComboBox jTNPauseH;
    private javax.swing.JComboBox jTNPauseM;
    private javax.swing.JComboBox jTNVonH;
    private javax.swing.JComboBox jTNVonM;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JTextArea jTnText;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField jTyaukufr;
    private javax.swing.JTextField jTyaukuho;
    private javax.swing.JTextField jTyaukuka;
    private javax.swing.JTextField jTyaukula;
    private javax.swing.JTextField jTyaukulue;
    private javax.swing.JTextField jTyaukumue;
    private javax.swing.JTextField jTyaukuvs;
    private javax.swing.JTextField jTyauneufr;
    private javax.swing.JTextField jTyauneuho;
    private javax.swing.JTextField jTyauneuka;
    private javax.swing.JTextField jTyauneula;
    private javax.swing.JTextField jTyauneulue;
    private javax.swing.JTextField jTyauneumue;
    private javax.swing.JTextField jTyauneuvs;
    private javax.swing.JTextField jTyerfuellakt;
    private javax.swing.JTextField jTyerfuelljanvormo;
    private javax.swing.JTextField jTyerperfuellakt;
    private javax.swing.JTextField jTyerperfuelljanvorm;
    private javax.swing.JTextField jTyerpistakt;
    private javax.swing.JTextField jTyerpistjanvormo;
    private javax.swing.JTextField jTyerpistvormo;
    private javax.swing.JTextField jTyerpplanakt;
    private javax.swing.JTextField jTyerpplanjanvormo;
    private javax.swing.JTextField jTyerpplanvormo;
    private javax.swing.JTextField jTyhotaltakt;
    private javax.swing.JTextField jTyhotaltjanvormo;
    private javax.swing.JTextField jTyhotaltvormo;
    private javax.swing.JTextField jTyhoterlakt;
    private javax.swing.JTextField jTyhoterljanvormo;
    private javax.swing.JTextField jTyhoterlvormo;
    private javax.swing.JTextField jTyhotoffenakt;
    private javax.swing.JTextField jTyhotstdakt;
    private javax.swing.JTextField jTyhotstdjanvormo;
    private javax.swing.JTextField jTyhotstdvormo;
    private javax.swing.JTextField jTyistakt;
    private javax.swing.JTextField jTyistjanvormo;
    private javax.swing.JTextField jTyistvormo;
    private javax.swing.JTextField jTyplanakt;
    private javax.swing.JTextField jTyplanjanvormo;
    private javax.swing.JTextField jTyplanvormo;
    private javax.swing.JCheckBox jUebernachtung;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerTN;
    private javax.swing.JLabel jlabeldbid;
    private javax.swing.JTextField jpnum;
    private javax.swing.JTextField jposid;
    private javax.swing.JTextField jverwaltungsText;
    private javax.swing.JLabel kalenderrange;
    private javax.swing.JLabel labelBis;
    private javax.swing.JLabel labelNettoZeit;
    private javax.swing.JLabel labelPause;
    private javax.swing.JLabel labelVon;
    private javax.swing.JLabel labeldatum;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox tnFahrtkosten;
    // End of variables declaration//GEN-END:variables
}
