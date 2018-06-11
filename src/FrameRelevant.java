
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// TO EXPORT THE PROGRAM WITH THE PICTURES YOU NEED TO ADD '/Picture' IN EACH OF THE ICON.SETS (IN THE FRONT)!!!
// IN THE PROGRAM ITSELF IT IS ONLY WORKING WITHOUT THIS; DON'T KNOW WHY.
// SO IF YOU WANT TO RUN THE PROGRAM IN ECLIPSE, JUST DELETE THE 'Picture'-PART.
/**
 *
 * @author msash9 && msabs1
 */
public class FrameRelevant extends javax.swing.JFrame
{
	private HashMap hWordScoreTi = new HashMap();         // HashMap is faster then Hashtable!
	private HashMap hWordScoreAb = new HashMap();
	private HashMap hWordScoreSo = new HashMap();
	private HashMap hWordScoreAdd1 = new HashMap();
	private HashMap hWordScoreAdd2 = new HashMap();
	private HashMap hWordScoreAdd3 = new HashMap();
	private HashMap hWordScoreAdd4 = new HashMap();
	private HashMap hWordScoreAdd5 = new HashMap();

	private Vector vStrings = new Vector();
	private Vector vCategoryA = new Vector();
	private Vector vCategoryB = new Vector();
	private Vector vSort = new Vector();
	private Vector vAbstractChooseA = new Vector();
	private Vector vTitleChooseA = new Vector();
	private Vector vSourceChooseA = new Vector();
	private Vector vAdd1ChooseA = new Vector();
	private Vector vAdd2ChooseA = new Vector();
	private Vector vAdd3ChooseA = new Vector();
	private Vector vAdd4ChooseA = new Vector();
	private Vector vAdd5ChooseA = new Vector();
	private Vector vAbstractChooseB = new Vector();
	private Vector vTitleChooseB = new Vector();
	private Vector vSourceChooseB = new Vector();
	private Vector vAdd1ChooseB = new Vector();
	private Vector vAdd2ChooseB = new Vector();
	private Vector vAdd3ChooseB = new Vector();
	private Vector vAdd4ChooseB = new Vector();
	private Vector vAdd5ChooseB = new Vector();
	private Vector vWords = new Vector();
	private Vector vlist2 = new Vector();
	private Vector vAbstractDouble = new Vector();
	private Vector vStatisticScoreA = new Vector();
	private Vector vStatisticScoreB = new Vector();
	private Vector vAbNotCleanCategoryA = new Vector();
	private Vector vTiNotCleanCategoryA = new Vector();
	private Vector vSoNotCleanCategoryA = new Vector();
	private Vector vAdd1NotCleanCategoryA = new Vector();
	private Vector vAdd2NotCleanCategoryA = new Vector();
	private Vector vAdd3NotCleanCategoryA = new Vector();
	private Vector vAdd4NotCleanCategoryA = new Vector();
	private Vector vAdd5NotCleanCategoryA = new Vector();
	private Vector vScorePrint = new Vector();

	private Vector vAbNotCleanCategoryB = new Vector();
	private Vector vTiNotCleanCategoryB = new Vector();
	private Vector vSoNotCleanCategoryB = new Vector();
	private Vector vAdd1NotCleanCategoryB = new Vector();
	private Vector vAdd2NotCleanCategoryB = new Vector();
	private Vector vAdd3NotCleanCategoryB = new Vector();
	private Vector vAdd4NotCleanCategoryB = new Vector();
	private Vector vAdd5NotCleanCategoryB = new Vector();

	private Object []returnValues = new Object[4];

	private String temp="";
	private String tempSave = "";
	private String text = "";
	private String catchCategory="";
	private String subStr = "";    
	private String word = "";
	private String sVec="";
	private String checkingLetter="";
	private String wordInList="";
	private String substring="";
	private String abstr = "";
	private String title = "";
	private String source = "";
	private String additional1 = "";
	private String additional2 = "";
	private String additional3 = "";
	private String additional4 = "";
	private String additional5 = "";
	private String tempNextWord = "";
	private String longWord ="";
	private String controllWord = "";
	private String lowerCase="";
	private String allText;
	private String allLoad;
	private String controll;
	private String text2;
	private String textWithSpace;
	private String wholeWord="";
	private String temp3="";
	private String tempVectorUnclean="";
	private String wordAndNextWord = "";
	private String controlAndNextWord = "";
	private String previousChar2 = "";
	private String tempDelete2 = "";

	private StringBuilder sbChecking = new StringBuilder();
	private StringBuilder sbWord = new StringBuilder();
	private StringBuilder sbNextWord = new StringBuilder();
	private StringBuilder sbNextWordCreator1 = new StringBuilder();
	private StringBuilder sbNextWordCreator2 = new StringBuilder();

	private int totalScore = 0;
	private int value;
	private int nextParagraph;
	private int i=0;
	private int scoreA=0;
	private int scoreB=0;
	private int scoreRangeA = 0;
	private int scoreRangeB = 0;
	private int scoreTotalIrrelevant = 0;
	private int questionmarkKiller = 1;
	private int score = 0;
	private int counterStatisticRelev = 0;
	private int counterStatisticSusps=0;
	private int counterStatisticIrrelev=0;
	private int counterStatisticRecord=0;
	private int counterPhrasesSingle=0;
	private int counterIndex = 0;
	private int endOfLine=0;
	private int tempInt=0;
	private int temp2=0;
	public int counterProgressBar=0;

	private boolean leave1 = false;
	private boolean leave2 = false;

	private boolean abstractDouble = true;
	private boolean phrasesCheckedA = false;
	private boolean phrasesCheckedB = false;
	private boolean singleWordChecked = false;
	private boolean outOfForAb = false;
	private boolean outOfForTi = false;
	private boolean outOfForSo = false;
	private boolean outOfForAdd1 = false;
	private boolean outOfForAdd2 = false;
	private boolean outOfForAdd3 = false;
	private boolean outOfForAdd4 = false;
	private boolean outOfForAdd5 = false;
	private boolean runCompleted = false;
	private boolean repeatedChecking = false;
	private boolean singleOrPhrases1 = false;
	private boolean singleOrPhrases2 = false;
	private boolean singeOrPhrases3 = false;
	private boolean loadPressed = false;
	private boolean repeatedChecking2 = false;
	private boolean elseCheckPhrases = false;
	private boolean elseCheckSingle = false;
	private boolean checkStarDouble = false;
	public boolean paragraphReady = false;
	boolean goDinna2 = false;
	boolean checkLength = false;
	boolean checkLength2 = false;
	boolean checkLength3 = false;
	boolean phrasesTrue = false;
	boolean checkStar = false;

	private JFileChooser fc = new JFileChooser("C:/Users/mczfs/Desktop");
	private JFileChooser fcLoad = new JFileChooser("C:/Users/mczfs/Desktop");
	private JFileChooser fs = new JFileChooser("C:/Users/mczfs/Desktop");

	private File file;
	private File fileSave;
	private File desktopOpen1;
	private File desktopOpen2;
	private File desktopOpen3;

	private DefaultListModel listenModell1 = new DefaultListModel();
	private DefaultListModel listenModell2 = new DefaultListModel();



	/**
	 * Creates new form Relevant
	 */
	public FrameRelevant()
	{
		this.setLocation(70,30);		
		initComponents();
		this.setBackground(new Color(226,226,226));
		jPanel1.setBackground(new Color(226,226,226));
		this.setTitle("Screen IT - Screening");
		this.setSize(1150,920);

	}
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	// initiating the GUI-elements - AUTOMATICALLY GENERATED CODE OF NETBEANS!
	private void initComponents() {

		 jPanel1 = new javax.swing.JPanel();
	        buttonBrowseText = new javax.swing.JButton();
	        buttonBrowseSavingPlace = new javax.swing.JButton();
	        buttonBrowseList = new javax.swing.JButton();
	        tfBrowsedText = new javax.swing.JTextField();
	        tfBrowsedSavingPlace = new javax.swing.JTextField();
	        tfBrowsedList = new javax.swing.JTextField();
	        jLabel1 = new javax.swing.JLabel();
	        jScrollPane2 = new javax.swing.JScrollPane();
	        keywordList1 = new javax.swing.JList(listenModell1);
	        jScrollPane3 = new javax.swing.JScrollPane();
	        keywordList2 = new javax.swing.JList(listenModell2);
	        buttonLoad = new javax.swing.JButton();
	        tfTagAbstract = new javax.swing.JTextField();
	        tfTagTitle = new javax.swing.JTextField();
	        tfTagSource = new javax.swing.JTextField();
	        tfTagAddition2 = new javax.swing.JTextField();
	        tfTagAddition1 = new javax.swing.JTextField();
	        tfTagAddition4 = new javax.swing.JTextField();
	        tfTagAddition5 = new javax.swing.JTextField();
	        tfTagAddition3 = new javax.swing.JTextField();
	        tfScoreA = new javax.swing.JTextField();
	        tfScoreB = new javax.swing.JTextField();
	        tfScoreTotal = new javax.swing.JTextField();
	        tfEndTag = new javax.swing.JTextField();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        buttonChoose = new javax.swing.JButton();
	        tfCategory = new javax.swing.JTextField();
	        tfNewWord = new javax.swing.JTextField();
	        tfStructure = new javax.swing.JTextField();
	        tfNewValue = new javax.swing.JTextField();
	        jLabel6 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        jLabel8 = new javax.swing.JLabel();
	        jLabel9 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        buttonExit = new javax.swing.JButton();
	        buttonDelete1 = new javax.swing.JButton();
	        buttonDelete2 = new javax.swing.JButton();
	        buttonRun = new javax.swing.JButton();
	        buttonHelp = new javax.swing.JButton();
	        buttonAdd = new javax.swing.JButton();
	        cbShow1 = new javax.swing.JCheckBox();
	        cbShow2 = new javax.swing.JCheckBox();
	        cbShow3 = new javax.swing.JCheckBox();
	        cbShow4 = new javax.swing.JCheckBox();
	        jLabel11 = new javax.swing.JLabel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        taMainText = new javax.swing.JTextArea();
	        jLabel12 = new javax.swing.JLabel();
	        jLabel13 = new javax.swing.JLabel();
	        jLabel14 = new javax.swing.JLabel();
	        jLabel15 = new javax.swing.JLabel();
	        jLabel16 = new javax.swing.JLabel();
	        jLabel17 = new javax.swing.JLabel();
	        jLabel18 = new javax.swing.JLabel();
	        jLabel19 = new javax.swing.JLabel();
	        jLabel20 = new javax.swing.JLabel();
	        jLabel21 = new javax.swing.JLabel();
	        jLabel22 = new javax.swing.JLabel();
	        

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Screening");
	        setPreferredSize(new java.awt.Dimension(1150, 930));

	        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 930));

	        buttonBrowseText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonBrowseText.setText("BROWSE TEXT");
	        buttonBrowseText.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonBrowseTextMouseClicked(evt);
	            }
	        });
	        
	        buttonBrowseSavingPlace.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonBrowseSavingPlace.setText("BROWSE PLACE");
	        buttonBrowseSavingPlace.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonBrowseSavingPlaceMouseClicked(evt);
	            }
	        });

	        buttonBrowseList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonBrowseList.setText("BROWSE WORDS");
	        buttonBrowseList.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonBrowseListMouseClicked(evt);
	            }
	        });


	        tfBrowsedSavingPlace.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                tfBrowsedSavingPlaceActionPerformed(evt);
	            }
	        });
	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel1.setText("1. Please browse these three files:");

	        jScrollPane2.setViewportView(keywordList1);

	        jScrollPane3.setViewportView(keywordList2);

	        buttonLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonLoad.setText("LOAD");
	        buttonLoad.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonLoadMouseClicked(evt);
	            }
	        });

	        tfTagAbstract.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagAbstract.setText("AB");

	        tfTagTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagTitle.setText("TI");
	        tfTagTitle.setToolTipText("");

	        tfTagSource.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagSource.setText("J2");

	        tfTagAddition2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagAddition2.setText("Add 2");

	        tfTagAddition1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagAddition1.setText("Add 1");

	        tfTagAddition4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagAddition4.setText("Add 4");

	        tfTagAddition5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagAddition5.setText("Add 5");

	        tfTagAddition3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfTagAddition3.setText("Add 3");

	        tfScoreA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfScoreA.setText("Score A");

	        tfScoreB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfScoreB.setText("Score B");

	        tfScoreTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfScoreTotal.setText("Score Total - Irrelevant");

	        tfEndTag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        tfEndTag.setText("ER");

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel2.setText("<html><body>2. Please write in the tags you want to search for:</body></html>");

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel3.setText("3. Please write in the score ranges:");

	        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel4.setText("4. Please insert your end-tag:");

	        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel5.setText("<html><body>6. Please choose the words you want to search for from the left list or add new ones: </body></html>\"");

	        buttonChoose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonChoose.setText("CHOOSE");
	        buttonChoose.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonChooseMouseClicked(evt);
	            }
	        });

	        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel6.setText("Please insert a tag (e.g. AB)");

	        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel7.setText("Please enter category (A or B)");

	        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel8.setText("<html><body>Please write a score for this word from -5 till +5</body></html>");

	        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel9.setText("<html><body>Please write your missing keyword in this field:</body></html>");

	        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel10.setText("5. Please press LOAD to load the keywords:");

	        buttonExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("Picture/exit3.png")));
	        buttonExit.setText("EXIT");
	        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonExitMouseClicked(evt);
	            }
	        });

	        buttonDelete1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonDelete1.setText("DELETE");
	        buttonDelete1.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonDelete1MouseClicked(evt);
	            }
	        });

	        buttonDelete2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonDelete2.setText("DELETE");
	        buttonDelete2.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonDelete2MouseClicked(evt);
	            }
	        });

	        buttonRun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        buttonRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("Picture/start.png")));
	        buttonRun.setText("RUN");
	        buttonRun.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonRunMouseClicked(evt);
	            }
	        });

	        buttonHelp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	       buttonHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("Picture/help.png")));
	        buttonHelp.setText("HELP");
	        buttonHelp.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonHelpMouseClicked(evt);
	            }
	        });

	        buttonAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	        buttonAdd.setText("ADD NEW");
	        buttonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                buttonAddMouseClicked(evt);
	            }
	        });

	        cbShow1.setText("Show Relevant");

	        cbShow2.setText("Show Suspicious");
	        
	        cbShow3.setText("Show Not Relevant");
	        

	        cbShow4.setText("Create Statistics");

	        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel11.setText("<html><body>7. Please choose which file you want <p> to look at after pressing RUN <p> or if you want a statistic file:</body></html>");

	        taMainText.setTabSize(0);
	        taMainText.setAlignmentX(0.0F);
	        taMainText.setAlignmentY(0.0F);
	        taMainText.setAutoscrolls(false);
	        taMainText.setCaretColor(new java.awt.Color(204, 204, 204));
	        taMainText.setEnabled(false);
	        taMainText.setVisible(false);
	        jScrollPane1.setViewportView(taMainText);

	        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel12.setText("Abstract:");

	        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel13.setText("Title:");

	        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel14.setText("Source:");

	        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel15.setText("Additional 1:");

	        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel16.setText("Additional 2:");

	        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel17.setText("Additional 3:");

	        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel18.setText("Additional 5:");

	        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel19.setText("Additional 4:");

	        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel20.setText("Score A:");

	        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel21.setText("Score B:");

	        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel22.setText("<html><body>Score Total -<p>Irrelevant:</p> </body></html>");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(33, 33, 33)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(234, 234, 234)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                                .addComponent(jLabel21)
	                                                .addComponent(jLabel20))
	                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
	                                        .addGap(23, 23, 23))
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(18, 18, 18)))
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(tfTagTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfTagAddition4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfTagAddition5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfScoreA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jLabel3)
	                                    .addComponent(tfTagAbstract, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfTagAddition3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfTagSource, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfTagAddition2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfTagAddition1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tfScoreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(tfEndTag, javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGap(2, 2, 2)
	                                .addComponent(buttonHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGap(218, 218, 218)
	                                .addComponent(tfBrowsedSavingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(90, 90, 90)
	                                .addComponent(buttonBrowseList, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(tfBrowsedList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                .addGap(100, 100, 100)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addGap(137, 137, 137))
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel10)
	                                            .addComponent(buttonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(buttonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                                    .addComponent(buttonRun, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                                        .addGap(35, 35, 35)
	                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                            .addComponent(tfCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                            .addComponent(tfNewWord, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                            .addComponent(tfStructure, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                            .addComponent(tfNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                                        .addGap(55, 55, 55)
	                                                        .addComponent(buttonChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                                        .addGap(92, 92, 92)
	                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                                            .addComponent(cbShow1)
	                                                            .addComponent(cbShow4)
	                                                            .addComponent(cbShow2)
	                                                            .addComponent(cbShow3)))
	                                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                                        .addGap(53, 53, 53)
	                                                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
	                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                                .addGap(35, 35, 35)
	                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                                    .addComponent(buttonDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(buttonBrowseText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(tfBrowsedText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(89, 89, 89)
	                        .addComponent(buttonBrowseSavingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(32, 32, 32))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(20, 20, 20)
	                .addComponent(jLabel1)
	                .addGap(11, 11, 11)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(buttonBrowseText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(buttonBrowseSavingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(buttonBrowseList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(tfBrowsedText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(tfBrowsedSavingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(tfBrowsedList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(30, 30, 30)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jLabel10)
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGap(10, 10, 10)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(28, 28, 28)
	                        .addComponent(buttonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagAbstract, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel12))
	                        .addGap(20, 20, 20)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel13))
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagSource, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel14))
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagAddition1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel15))
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagAddition2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel16))
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagAddition3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel17))
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagAddition4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel19))
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(tfTagAddition5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel18))
	                        .addGap(20, 20, 20)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(jLabel3)
	                                .addGap(23, 23, 23)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                    .addComponent(tfScoreA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jLabel20))
	                                .addGap(18, 18, 18)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                                    .addComponent(tfScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jLabel21))
	                                .addGap(18, 18, 18)
	                                .addComponent(tfScoreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(buttonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(buttonDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(27, 27, 27)
	                        .addComponent(buttonChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(tfCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(tfNewWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(tfStructure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(tfNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(5, 5, 5)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(buttonRun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(79, 79, 79)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(cbShow1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(cbShow2)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(cbShow3)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(cbShow4))
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(jLabel4)
	                                .addGap(23, 23, 23)
	                                .addComponent(tfEndTag, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(buttonHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(56, 56, 56)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
	                .addGap(0, 0, 0))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );

	        pack();

	}                  
	  	    
	// init components ends here

	private void tfBrowsedSavingPlaceActionPerformed(java.awt.event.ActionEvent evt)
	{

	}

	private void buttonBrowseTextMouseClicked(java.awt.event.MouseEvent evt)         // button browseText
	{
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Textfile", "txt");
		fc.setFileFilter(filter);
		fc.showOpenDialog(this);

		try {
			// Open an input stream
			file = fc.getSelectedFile();
			tfBrowsedText.setText(file.getPath());
			allText = new Scanner( file, "UTF-8").useDelimiter("\\A").next();  // save the text of the file in a TextArea for further processing
			taMainText.setText(allText);
		}
		catch (Exception ex)
		{
			if(tfBrowsedText.getText().equalsIgnoreCase(""))
			{

			}
			else
			{
				final JOptionPane pane = new JOptionPane("Error in browsing the text! "+ex.toString());
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}

		}

	}


	private void buttonBrowseSavingPlaceMouseClicked(java.awt.event.MouseEvent evt)  // button Browse Place
	{
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Textfile", "txt");
		fs.setFileFilter(filter);
		fs.showSaveDialog(this);


		try
		{
			// Open an input stream
			fileSave = fs.getSelectedFile();

			tfBrowsedSavingPlace.setText(fileSave.getPath());                     
		}
		catch (Exception ex)
		{
			if(tfBrowsedSavingPlace.getText().equalsIgnoreCase(""))          // if the user didn't choose a file (so he aborted the process) -> do nothing
			{

			}
			else  //Error message if the path is wrong
			{
				final JOptionPane pane = new JOptionPane("Error in your saving path: "+ex.toString());
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
		}
	}

	private void buttonBrowseListMouseClicked(java.awt.event.MouseEvent evt)  // Button BrowseList
	{
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Textfile", "txt"); // create new File Filter (only Textfiles will be shown)
		fc.setFileFilter(filter);
		fcLoad.showOpenDialog(this); // create new Window to choose  the Keywordlist


		try
		{
			// Open an input stream
			file = fcLoad.getSelectedFile();
			tfBrowsedList.setText(file.getPath());
			allLoad = new Scanner(file, "UTF-8").useDelimiter("\\A").next(); 			
		}
		catch (Exception ex)
		{
			if(tfBrowsedList.getText().equalsIgnoreCase("")) //error if browsed file is empty
			{

			}
			else
			{
				final JOptionPane pane = new JOptionPane("The file you tried to load is empty!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}

			tfBrowsedList.setText("");
		}
	}

	private void buttonLoadMouseClicked(java.awt.event.MouseEvent evt)        // Button Load
	{
		if(tfBrowsedList.getText().equalsIgnoreCase(""))           // Error handling
		{
			final JOptionPane pane = new JOptionPane("Please select a file!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
		else if(tfBrowsedSavingPlace.getText().equalsIgnoreCase(""))
		{
			final JOptionPane pane = new JOptionPane("Please select a place where you want to save your files!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
		else if(tfBrowsedSavingPlace.getText().equalsIgnoreCase(""))
		{
			final JOptionPane pane = new JOptionPane("Please select a place where you want to save your files!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}


		else if (JOptionPane.showConfirmDialog(null, "Did you enter all the tags on the left hand"
				+ " side you want to search for? ", "WARNING",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{


			String [] linesLoad = allLoad.split("\n");         // get the keywords from the textArea and save each line in one array-entry
			String tester ="";
			String deleteAddedChars="";

			loadPressed = true;

			for(int a = 0;a<linesLoad.length;a++)
			{
				controll = linesLoad[a];

				try
				{
					tester = linesLoad[a];
					int tester2 = linesLoad[a].length();
				}
				catch(Exception e)
				{
					tester = "ghdhahwhbf";
				}

				if(linesLoad[a].contains("\""))                   // save the value of this keyword in another variable because the linesLoad variable will be changed
				{
					deleteAddedChars = linesLoad[a];
				}

				else if(linesLoad[a].substring(0,1).equalsIgnoreCase("*"))
				{
					deleteAddedChars = linesLoad[a];
				}

				else if(tester.substring(tester.length()-2,tester.length()-1).trim().equalsIgnoreCase("*"))  // * at the end
				{
					deleteAddedChars = linesLoad[a];
				}
				else
				{
					deleteAddedChars = linesLoad[a];
				}


				if (!controll.substring(1,2).equalsIgnoreCase(":")||!controll.contains("=")||!controll.contains("(")||!controll.contains(")"))
				{
					final JOptionPane pane = new JOptionPane("The file you want to load"
							+ " is not formatted correctly. For further information press help.");
					final JDialog d = pane.createDialog((JFrame)null, "ERROR");
					d.setLocation(450,430);
					d.setVisible(true);

					tfBrowsedList.setText("");
					listenModell1.clear();
					break;
				}

				for(int l=0;l<100;l++)   // get the word of the line
				{
					try
					{
						checkingLetter = linesLoad[a].substring(l,l+1);
					}
					catch (Exception e)
					{
						break;
					}

					if(checkingLetter.equalsIgnoreCase("="))
					{
						lowerCase = wordInList.toLowerCase();

						String lowerCaseWithoutSpace ="";

						if (lowerCase.contains(" "))             // if there is a blank in the word (means it is a phrase -> for the search algorithm it is important that the words are saved together -> delete blank
						{
							try
							{
								for(int yub = 0; yub<lowerCase.length();yub++)
								{
									checkingLetter = lowerCase.substring(yub,yub+1);

									if(checkingLetter.equals(" "))
									{

									}

									else
									{
										lowerCaseWithoutSpace = lowerCaseWithoutSpace+lowerCase.substring(yub,yub+1);                                                                                
									}

								}
								lowerCase = lowerCaseWithoutSpace;

							}

							catch(Exception e)
							{
								e.printStackTrace();
							}
						}



						if(lowerCase.contains("*")|| lowerCase.contains("\"")) 
						{

						}
						else                 // if the word does not contain any * or " -> means it should be handled as a "..." word -> add " " 
						{
							lowerCase = "\""+lowerCase+"\"";
						}

						if( Integer.parseInt(linesLoad[a].substring(l+5,l+7)) <0)
						{
							value = Integer.parseInt(linesLoad[a].substring(l+5,l+7));
						}
						else
						{
							value = Integer.parseInt(linesLoad[a].substring(l+6,l+7));
						}

						try    // load the word scores from the choosen keywordlist in the relevant HashMaps
						{                                                      

							if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagAbstract.getText().substring(0,2)))
							{
								hWordScoreAb.put(lowerCase, value);
							}
							else if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagTitle.getText().substring(0,2)))
							{
								hWordScoreTi.put(lowerCase, value);
							}
							else if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagSource.getText().substring(0,2)))
							{
								hWordScoreSo.put(lowerCase, value);
							}
							else if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagAddition1.getText().substring(0,2)))
							{
								hWordScoreAdd1.put(lowerCase, value);
							}
							else if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagAddition2.getText().substring(0,2)))
							{
								hWordScoreAdd2.put(lowerCase, value);
							}
							else if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagAddition3.getText().substring(0,2)))
							{
								hWordScoreAdd3.put(lowerCase, value);
							}
							else if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagAddition4.getText().substring(0,2)))
							{
								hWordScoreAdd4.put(lowerCase, value);
							}
							else if(linesLoad[a].substring(l+1,l+3).trim().equalsIgnoreCase(tfTagAddition5.getText().substring(0,2)))
							{
								hWordScoreAdd5.put(lowerCase, value);
							}

						}
						catch(Exception e)
						{
							e.printStackTrace();
						}

						break;
					}
					else
					{
						if(checkingLetter.equalsIgnoreCase(":") ) // if the end of a word is arrived, back off the word.
						{
							wordInList = "";
						}
						else
						{
							wordInList = wordInList + checkingLetter;  //otherwise add the next letter in the string "wordInLIst"
						}
					}

				}

				vSort.addElement(deleteAddedChars); // load the complete line of the keywordlist from the array into the vector (e.g. A:dog-AU (+5)  )

				checkingLetter="";
				value=0;
				wordInList="";
				Collections.sort(vSort); // reset all variables and sort the Vector VSort
				linesLoad[a]="";

			}


			for (int e=0;e<vSort.size();e++)
			{				
				listenModell1.addElement((String)vSort.elementAt(e)); //load the sorted values of the vector in list 1
			}
			
			tfTagAbstract.setEditable(false);
			tfTagTitle.setEditable(false);
			tfTagSource.setEditable(false);
			tfTagAddition1.setEditable(false);
			tfTagAddition2.setEditable(false);
			tfTagAddition3.setEditable(false);
			tfTagAddition4.setEditable(false);
			tfTagAddition5.setEditable(false);	
			
		}

		else
		
		{

		}
		
		
		
		
	}

	private void buttonChooseMouseClicked(java.awt.event.MouseEvent evt)             // button Choose
	{

		if (tfTagAbstract.getText().length() == 0 || tfTagTitle.getText().length() == 0 || tfTagSource.getText().length() ==0 ||
				tfTagAddition1.getText().length() == 0 || tfTagAddition2.getText().length() == 0 || tfTagAddition3.getText().length() == 0 ||
				tfTagAddition4.getText().length() == 0 || tfTagAddition5.getText().length() == 0)                                // error notice if the length of the tags is more than 5 characters
		{
			final JOptionPane pane = new JOptionPane("Please control your tags! They should have maximally 2 characters and it's not allowed to let a field empty.");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(460,430);
			d.setVisible(true);
		}

		else
		{
			tfTagAbstract.setEditable(false);
			tfTagTitle.setEditable(false);
			tfTagSource.setEditable(false);
			tfTagAddition1.setEditable(false);
			tfTagAddition2.setEditable(false);
			tfTagAddition3.setEditable(false);
			tfTagAddition4.setEditable(false);
			tfTagAddition5.setEditable(false);



			Object[]listArray = keywordList1.getSelectedValues(); //Object Array for the selected Values of the keywordList1
			String lowerCaseNotClean = "";





					for (int y = 0; y<listArray.length; y++)
					{

						vlist2.addElement((String)listArray[y]); //Add the selected Values from the Array in the Vector Vlist2
						temp = (String)listArray[y];
						listArray[y]= "";

						try
						{
							catchCategory = temp.substring(0,1);
						}
						catch (Exception e)
						{
							catchCategory = "|";
						}


						for(int l=0;l<9999;l++)
						{
							checkingLetter = temp.substring(l,l+1);

							if(checkingLetter.equalsIgnoreCase("=")) // if the checkingWord is completed, add the choosen keywords (Just the words) into the relevant vectors
							{
								lowerCase = wordInList.toLowerCase(); // String lowerCase = the whole word wordInList


								String lowerCaseWithoutSpaceChoose ="";

								if (lowerCase.contains(" "))                    // if the word contains a blank -> phrases -> delete the blank
								{
									try
									{
										for(int yub = 0; yub<lowerCase.length();yub++)
										{
											checkingLetter = lowerCase.substring(yub,yub+1);

											if(checkingLetter.equals(" "))
											{

											}

											else
											{
												lowerCaseWithoutSpaceChoose = lowerCaseWithoutSpaceChoose+lowerCase.substring(yub,yub+1);                                                                                
											}
										}
										lowerCase = lowerCaseWithoutSpaceChoose;
									}

									catch(Exception e)
									{
										e.printStackTrace();
									}
								}


								lowerCaseNotClean = lowerCase;           // two variables are needed again: one where the word is without the special characters and one with the special characters (notClean)

								//vAbstractChooseSpecialA


								String tester = "";

								try
								{
									tester = lowerCase;                                   
								}
								catch(Exception e)
								{
									tester = "ghdhahwhbf";
								}


								if(tester.contains("\""))         // clean the variable here (so that they are without the special characters)
								{

									int le = (int)(lowerCase).length();
									if(tester.substring(tester.length()-2,tester.length()-1).equalsIgnoreCase("\""))
									{
										lowerCase =lowerCase.trim().substring(1,le-2);                                                             
									}
									else
									{
										lowerCase = (lowerCase).trim().substring(1,le-1);                                                               
									}

								}

								if((lowerCase).substring(0,1).equalsIgnoreCase("*"))
								{
									int le = (int)(lowerCase).length();
									String sTemp2 = (lowerCase).substring(1,le);

									lowerCase = sTemp2;                                                      
								}

								if(tester.substring(tester.length()-1,tester.length()).trim().equalsIgnoreCase("*"))  // * at the end
								{
									lowerCase = (lowerCase).substring(0,(lowerCase).length()-1);        
								}

								if(lowerCaseNotClean.contains("\"") || lowerCaseNotClean.contains("*"))
								{

								}
								else                 // add again the "..." if neccessary
								{                                                        
									lowerCaseNotClean = "\""+lowerCase+"\"";                                                   
								}

								// add the clean word to the two vectors vCategoryA(or vCategoryB, depending in which category the word is) and to the vector to which tag it is applicable.
								// also add it to the notClean vector which is applicable (so depends on the tag)

								if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAbstract.getText().substring(0,2)))
								{
									vAbstractChooseA.addElement(lowerCase);
									vAbNotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagTitle.getText().substring(0,2)))
								{
									vTitleChooseA.addElement(lowerCase);
									vTiNotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagSource.getText().substring(0,2)))
								{
									vSourceChooseA.addElement(lowerCase);
									vSoNotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition1.getText().substring(0,2)))
								{
									vAdd1ChooseA.addElement(lowerCase);
									vAdd1NotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition2.getText().substring(0,2)))
								{
									vAdd2ChooseA.addElement(lowerCase);
									vAdd2NotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition3.getText().substring(0,2)))
								{
									vAdd3ChooseA.addElement(lowerCase);
									vAdd3NotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition4.getText().substring(0,2)))
								{
									vAdd4ChooseA.addElement(lowerCase);
									vAdd4NotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("a")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition5.getText().substring(0,2)))
								{
									vAdd5ChooseA.addElement(lowerCase);
									vAdd5NotCleanCategoryA.addElement(lowerCaseNotClean);
									vCategoryA.addElement(lowerCase);
								}

								// CATEGORY B:

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAbstract.getText().substring(0,2)))
								{
									vAbstractChooseB.addElement(lowerCase);
									vAbNotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagTitle.getText().substring(0,2)))
								{
									vTitleChooseB.addElement(lowerCase);
									vTiNotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagSource.getText().substring(0,2)))
								{
									vSourceChooseB.addElement(lowerCase);
									vSoNotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition1.getText().substring(0,2)))
								{
									vAdd1ChooseB.addElement(lowerCase);
									vAdd1NotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition2.getText().substring(0,2)))
								{
									vAdd2ChooseB.addElement(lowerCase);
									vAdd2NotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition3.getText().substring(0,2)))
								{
									vAdd3ChooseB.addElement(lowerCase);
									vAdd3NotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition4.getText().substring(0,2)))
								{
									vAdd4ChooseB.addElement(lowerCase);
									vAdd4NotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								else if (catchCategory.equalsIgnoreCase("b")&&temp.substring(l+1,l+3).equalsIgnoreCase(tfTagAddition5.getText().substring(0,2)))
								{
									vAdd5ChooseB.addElement(lowerCase);
									vAdd5NotCleanCategoryB.addElement(lowerCaseNotClean);
									vCategoryB.addElement(lowerCase);
								}

								wordInList = "";  // back off the wordInList for the next choosen word
								break;

							}

							else if(checkingLetter.equalsIgnoreCase(":") )
							{
								wordInList = "";
							}

							else
							{
								wordInList = wordInList + checkingLetter;  //put the letters of the choosen word in wordInList together.
							}

						}

					}


					listenModell2.clear(); //clear the listenModell2 before a new word from the vector is added, so that the existing words in the list are no duplicates.
					Collections.sort(vlist2);

					for (int fu = 0; fu<vlist2.size();fu++)
					{
						listenModell2.addElement(vlist2.elementAt(fu));
					}

		}
	}

	private void buttonAddMouseClicked(java.awt.event.MouseEvent evt)         // button Add
	{
		if(loadPressed==true)
		{
			// for checking whether the word entered is in list or not
			String search3 = "";
			String search2 = "";
			Boolean searching = false;
			Boolean searching2 = false;


			// for adding
			String structureTemp = tfStructure.getText();
			text = tfNewWord.getText();

			String textWithoutSpace="";
			String checkingLetter = "d";

			textWithSpace = text;


			if (text.contains(" "))                      // clearing the spaces again
			{
				for(int yu = 0; yu<text.length();yu++)
				{
					checkingLetter = text.substring(yu,yu+1);

					if(checkingLetter.equals(" "))
					{

					}

					else
					{
						textWithoutSpace = textWithoutSpace+text.substring(yu,yu+1);                                               
					}

				}
				text = textWithoutSpace;


			}

			int laengeText = text.length();

			if(text.substring(laengeText-1,laengeText).trim().equalsIgnoreCase("*")|| text.contains("\"")||text.contains("*"))        // add again "..." if it is neccessary
			{                              
				text2 = text;
			}
			else
			{
				text2 =  "\""+ text + "\"";                            
			}

			catchCategory = tfCategory.getText();        // get the category from the textfield


			for(int z =0;z<listenModell1.size();z++)
			{
				if(searching2 == true)
				{
					break;
				}
				String search = (String)listenModell1.elementAt(z);      // getting each element out of the list
				String searchs = search.trim();


				for(int d=2;d<search.length();d++)       // making substrings
				{
					try
					{
						search2 = searchs.trim().substring(d,d+1);       //  getting each characters

						if(search2.equalsIgnoreCase("="))
						{
							search3 = search.substring(2,d);  // search 3 is not the word (because the word is between : and - in the keywordlist)


							if(tfNewWord.getText().equalsIgnoreCase(search3) && tfStructure.getText().trim().equalsIgnoreCase(search.substring(d+1,d+3).trim()))
							{
								// if it equals a word in the list -> both booleans true -> leads to a break for this for and for the error you can find below
								searching = true;
								searching2 = true;                                                             
								break;
							}
						}
					}
					catch(Exception e)         // if there is an error or the line is at the end -> break to get the next keywordline
					{

						if (d == listenModell1.size()-1)
						{
							searching2 = true;
						}
						break;
					}

				}
			}


			if (tfCategory.getText().equalsIgnoreCase(""))                   // error handling
			{
				final JOptionPane pane = new JOptionPane("Please insert a category!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
			else if((tfCategory.getText().length() > 1))
			{
				final JOptionPane pane = new JOptionPane("Category can have only one character!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
			else if((tfCategory.getText().matches("[0-9]")))
			{
				final JOptionPane pane = new JOptionPane("Category cannot be a number!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
			else if(tfNewWord.getText().equalsIgnoreCase(""))
			{
				final JOptionPane pane = new JOptionPane("Please insert a word!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
			else if (tfStructure.getText().equalsIgnoreCase(""))
			{
				final JOptionPane pane = new JOptionPane("Please insert a tag!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}

			else if (tfNewValue.getText().equalsIgnoreCase(""))
			{
				final JOptionPane pane = new JOptionPane("Please insert a score!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}

			else if((tfNewValue.getText().matches("[A-Za-z]")))
			{
				final JOptionPane pane = new JOptionPane("Value cannot be a character!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
			else if((tfNewValue.getText().length() == 1) || (tfNewValue.getText().length() >2) )
			{
				final JOptionPane pane = new JOptionPane("Value cannot be a character!");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
			else if(searching == true)
			{
				final JOptionPane pane = new JOptionPane("This word is already in the list!");
				final JDialog da = pane.createDialog((JFrame)null, "ERROR");
				da.setLocation(525,430);
				da.setVisible(true);
			}

			else
			{
				if (catchCategory.equalsIgnoreCase("a"))          // add the category to the text of the textfield (which is saved in the textWithSpace variable)
				{                                       
					text = "A:" + textWithSpace;
				}
				if (catchCategory.equalsIgnoreCase("b"))
				{                                        
					text = "B:" + textWithSpace;
				}

				FrameRelevant isInteger = new FrameRelevant();  //check the value-Textfield with the "IsInteger" method, if there is a integer value.
				boolean b = isInteger.isInt(tfNewValue.getText());
				isInteger = null;                             


				if(b==true) // if the IsInteger method is true...
				{
					value = Integer.parseInt(tfNewValue.getText());

					if(value >= -5 && value <= 5) // if value between -5 and 5, add value to the relevant Hash Table
					{                                           
						text = text+"="+structureTemp+" ("+tfNewValue.getText()+")";      // add the line together so that the format is correct

						if(structureTemp.equalsIgnoreCase(tfTagAbstract.getText().substring(0,2))) // add the score and the word to the hashMap
						{
							hWordScoreAb.put(text2, value);
						}
						else if(structureTemp.equalsIgnoreCase(tfTagTitle.getText().substring(0,2)))
						{
							hWordScoreTi.put(text2, value);                                                      
						}
						else if(structureTemp.equalsIgnoreCase(tfTagSource.getText().substring(0,2)))
						{
							hWordScoreSo.put(text2, value);
						}
						else if(structureTemp.equalsIgnoreCase(tfTagAddition1.getText().substring(0,2)))
						{
							hWordScoreAdd1.put(text2, value);
						}
						else if(structureTemp.equalsIgnoreCase(tfTagAddition2.getText().substring(0,2)))
						{
							hWordScoreAdd2.put(text2, value);
						}
						else if(structureTemp.equalsIgnoreCase(tfTagAddition3.getText().substring(0,2)))
						{
							hWordScoreAdd3.put(text2, value);
						}
						else if(structureTemp.equalsIgnoreCase(tfTagAddition4.getText().substring(0,2)))
						{
							hWordScoreAdd4.put(text2, value);
						}
						else if(structureTemp.equalsIgnoreCase(tfTagAddition5.getText().substring(0,2)))
						{
							hWordScoreAdd5.put(text2, value);
						}
						vSort.addElement(text);
						Collections.sort(vSort);
						listenModell1.clear();

						for (int e=0;e<vSort.size();e++)
						{
							listenModell1.addElement((String)vSort.get(e));
						}

					}

					else //print a error that the value have to be between -5 and +5
					{                                              
						final JOptionPane pane = new JOptionPane("Value have to be between -5 and +5!");
						final JDialog d = pane.createDialog((JFrame)null, "ERROR");
						d.setLocation(525,430);
						d.setVisible(true);
					}

				}

			}

		}
		else
		{
			final JOptionPane pane = new JOptionPane("Please select a valid keywordlist to add new words!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
	}

	private void buttonDelete1MouseClicked(java.awt.event.MouseEvent evt)            // button delete 1 (left delete button)
	{
		Object[]listArray = keywordList1.getSelectedValues(); //get the selected values and safe it in temp1 (makes it possible to delete more entries with one click)
		Vector listVector = new Vector();
		String temp1 = "";

		for(int ab =0;ab<listArray.length;ab++)              // use a vector instead of an array out of performance reasons
		{
			listVector.addElement((String)listArray[ab]);
			temp1 = (String)listArray[ab];
			listArray[ab]="";                     
		}

		for(int abc = 0; abc<listVector.size();abc++) // delete them in the list and the vSort vector
		{
			vSort.removeElement(listVector.elementAt(abc));
			listenModell1.removeElement(listVector.elementAt(abc));
		}

	}

	private void buttonDelete2MouseClicked(java.awt.event.MouseEvent evt)            // button delete 2 (right delete button)
	{
		Object[]listArray = keywordList2.getSelectedValues(); //get the selected values and safe it in temp1
		Vector listVector = new Vector();
		String temp2 = "";
		int tempSpace = 0;

		for(int ab =0;ab<listArray.length;ab++)              // same as in delete2
		{
			listVector.addElement((String)listArray[ab]);
			temp2 = (String)listArray[ab];                       
			listArray[ab]="";

			for(int ty=0;ty<temp2.length();ty++) // remove it from the RELEVANT Vector AND from the VList2 Vector
			{                               
				checkingLetter = temp2.substring(ty,ty+1);

				if(checkingLetter.equalsIgnoreCase(" "))
				{
					tempSpace = ty;
				}

				if(checkingLetter.equalsIgnoreCase("="))
				{

					if(tempSpace != 0)
					{
						temp2 = temp2.substring(0,tempSpace)+temp2.substring(tempSpace+1,temp2.length());
						ty = ty-1;
					}

					if(temp2.contains("*")|| temp2.contains("\""))
					{
						tempDelete2 = temp2;  // this is the complete, UNCLEAN, word                                                
					}
					else
					{
						tempDelete2 ="\""+temp2.substring(2,ty)+"\"";
						temp2 = temp2.substring(0,2)+"\""+temp2.substring(2,ty)+"\""+temp2.substring(ty,temp2.length());
					}


					if(temp2.substring(2,3).equalsIgnoreCase("*") && !temp2.substring(ty-1,ty).equalsIgnoreCase("*"))
					{
						tempDelete2 = temp2.substring(2,ty);
						temp2 = temp2.substring(0,2)+temp2.substring(3,ty+3);
						ty=ty-1;
					}
					else if(temp2.contains("\""))             // clean the words (because it is neccessary to delete the words in the three vectors -> requieres clean and unclean word)
					{
						temp2 = temp2.substring(0,2)+temp2.substring(3,ty+1)+temp2.substring(ty+2,ty+5);
					}
					else if(temp2.substring(ty-1,ty).equalsIgnoreCase("*")  && !temp2.substring(2,3).equalsIgnoreCase("*"))
					{
						tempDelete2 = temp2.substring(2,ty);
						temp2 = temp2.substring(0,ty-1)+temp2.substring(ty,ty+3);
						ty = ty-1;    // because you delete a character -> need to decrease the ty variable (this is needed in the next step to get the word)
					}
					else if(temp2.substring(ty-1,ty).equalsIgnoreCase("*") && temp2.substring(2,3).equalsIgnoreCase("*"))
					{
						tempDelete2 = temp2.substring(2,ty);
						temp2 = temp2.substring(0,2)+temp2.substring(3,ty-1)+temp2.substring(ty,ty+3);
						ty = ty-2;  // two stars deleted -> need to decrase ty by two
					}


					if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAbstract.getText().substring(0,2)))       // delete the word out of the applicable vectors
					{
						vAbstractChooseA.removeElement(temp2.substring(2,ty));
						vAbNotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagTitle.getText().substring(0,2)))
					{
						vTitleChooseA.removeElement(temp2.substring(2,ty));
						vTiNotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagSource.getText().substring(0,2)))
					{
						vSourceChooseA.removeElement(temp2.substring(2,ty));
						vSoNotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition1.getText().substring(0,2)))
					{
						vAdd1ChooseA.removeElement(temp2.substring(2,ty));
						vAdd1NotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition2.getText().substring(0,2)))
					{

						vAdd2ChooseA.removeElement(temp2.substring(2,ty));
						vAdd2NotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition3.getText().substring(0,2)))
					{
						vAdd3ChooseA.removeElement(temp2.substring(2,ty));
						vAdd3NotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;

					}

					else if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition4.getText().substring(0,2)))
					{
						vAdd4ChooseA.removeElement(temp2.substring(2,ty));
						vAdd4NotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("a")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition5.getText().substring(0,2)))
					{
						vAdd5ChooseA.removeElement(temp2.substring(2,ty));
						vAdd5NotCleanCategoryA.removeElement(tempDelete2);
						vCategoryA.removeElement(temp2.substring(2,ty));
						break;
					}

					// CATEGORY B:

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAbstract.getText().substring(0,2)))
					{
						vAbstractChooseB.removeElement(temp2.substring(2,ty));
						vAbNotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagTitle.getText().substring(0,2)))
					{
						vTitleChooseB.removeElement(temp2.substring(2,ty));
						vTiNotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagSource.getText().substring(0,2)))
					{
						vSourceChooseB.removeElement(temp2.substring(2,ty));
						vSoNotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition1.getText().substring(0,2)))
					{
						vAdd1ChooseB.removeElement(temp2.substring(2,ty));
						vAdd1NotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition2.getText().substring(0,2)))
					{
						System.out.println(" das ist tempdelete2 "+tempDelete2 +" substring "+temp2.substring(2,ty));
						vAdd2ChooseB.removeElement(temp2.substring(2,ty));
						vAdd2NotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition3.getText().substring(0,2)))
					{
						vAdd3ChooseB.removeElement(temp2.substring(2,ty));
						vAdd3NotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition4.getText().substring(0,2)))
					{
						vAdd4ChooseB.removeElement(temp2.substring(2,ty));
						vAdd4NotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

					else if (temp2.substring(0,1).equalsIgnoreCase("b")&&temp2.substring(ty+1,ty+3).equalsIgnoreCase(tfTagAddition5.getText().substring(0,2)))
					{
						vAdd5ChooseB.removeElement(temp2.substring(2,ty));
						vAdd5NotCleanCategoryB.removeElement(tempDelete2);
						vCategoryB.removeElement(temp2.substring(2,ty));
						break;
					}

				}

			}
		}

		for(int abc = 0; abc<listVector.size();abc++)        // delete them out of the list and the vList2 vector
		{
			vlist2.removeElement(listVector.elementAt(abc));
			listenModell2.removeElement(listVector.elementAt(abc));
		}
	}



	private void buttonExitMouseClicked(java.awt.event.MouseEvent evt)        // button Exit
	{
		if (JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "WARNING",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
			if(listenModell1.size()==0)  // if the list is empty
			{
				System.exit(0);
			}

			else
			{
				if (JOptionPane.showConfirmDialog(null, "Do you want to save the keyword list?", "WARNING",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
				try
				{
					FileOutputStream fos = new FileOutputStream(fileSave.getPath()+"SavedKeywords.txt");    // Save the keywords from list 1 under the choosen save path if the exit button was pressed
					PrintWriter toFile = new PrintWriter(fos);

					for(int i=0;i<listenModell1.size();i++)
					{
						tempSave =(String)listenModell1.getElementAt(i);
						try
						{
							toFile.println(tempSave);
						}

						catch(Exception e)
						{
							final JOptionPane pane = new JOptionPane("Error while saving the list to file before exiting: "+e.toString());
							final JDialog d = pane.createDialog((JFrame)null, "ERROR");
							d.setLocation(525,430);
							d.setVisible(true);
						}
					}

					toFile.close();
					fos.close();
				
					System.exit(0);
				}

				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				}
				else
				{
					
					System.exit(0);
				}
			}
		}

		else
		{

		}
	}

	private void buttonRunMouseClicked(java.awt.event.MouseEvent evt)         // button run
	{
		if(tfBrowsedText.getText().equalsIgnoreCase(""))                // error notice if there was no file browsed
		{
			final JOptionPane pane = new JOptionPane("Please select a Text!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
		else if(!tfBrowsedText.getText().substring(tfBrowsedText.getText().length()-3,tfBrowsedText.getText().length()).equalsIgnoreCase("txt"))       // error notice if the file for browsing is no .txt file
		{
			final JOptionPane pane = new JOptionPane("Please select a .txt file!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
		else if(tfBrowsedSavingPlace.getText().equalsIgnoreCase(""))                                 // error notice if there was no file for saving browsed
		{

			final JOptionPane pane = new JOptionPane("Please select a place for saving!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
		else if(tfBrowsedList.getText().equalsIgnoreCase(""))           // error notice if there was no file for loading browsed
		{
			final JOptionPane pane = new JOptionPane("Please select a keyword file!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
		else if (tfTagAbstract.getText().length() > 5 || tfTagTitle.getText().length() > 5 || tfTagSource.getText().length() > 5 ||
				tfTagAddition1.getText().length() > 5 || tfTagAddition2.getText().length() > 5 || tfTagAddition3.getText().length() > 5 ||
				tfTagAddition4.getText().length() > 5 || tfTagAddition5.getText().length() > 5)                                // error notice if the length of the tags is more than 5 characters
		{
			final JOptionPane pane = new JOptionPane("Please control your tags! They should have maximally 5 characters");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(460,430);
			d.setVisible(true);
		}
		else if((tfScoreA.getText().substring(0,1).matches("[A-Za-z]"))
				|| (tfScoreB.getText().substring(0,1).matches("[A-Za-z]"))
				|| (tfScoreTotal.getText().substring(0,1).matches("[A-Za-z]")))                    // error notice for scores if the first (and only the first!!!) character is a number
		{
			final JOptionPane pane = new JOptionPane("The scores cannot be characters!");
			final JDialog d = pane.createDialog((JFrame)null, "ERROR");
			d.setLocation(525,430);
			d.setVisible(true);
		}
		else if (runCompleted== true)                                 // error notice if the user wants to run again after a successful run
		{
			final JOptionPane pane = new JOptionPane("You have already pressed the RUN-Button. If you want to repeat the screening, please restart.");
			final JDialog d = pane.createDialog((JFrame)null, "NOTE");
			d.setLocation(450,430);
			d.setVisible(true);
		}
		else if(listenModell2.size() == 0)                     // error notice if the user presses run without having selected at least one keyword
		{
			final JOptionPane pane = new JOptionPane("Please choose at least one word you want to search for!");
			final JDialog d = pane.createDialog((JFrame)null, "NOTE");
			d.setLocation(500,430);
			d.setVisible(true);
		}
		else                                            // what happens if everything is all right
		{
			runCompleted = true;
			questionmarkKiller = 0;
			source = tfTagSource.getText() + "  -";                             // get the inputs of the text fields of the tags and the scores
			title = tfTagTitle.getText()+ "  -";
			abstr = tfTagAbstract.getText()+ "  -";
			additional1 = tfTagAddition1.getText()+ "  -";
			additional2 = tfTagAddition2.getText()+ "  -";
			additional3 = tfTagAddition3.getText()+ "  -";
			additional4 = tfTagAddition4.getText()+ "  -";
			additional5 = tfTagAddition5.getText()+ "  -";
			scoreRangeA = Integer.parseInt(tfScoreA.getText());
			scoreRangeB = Integer.parseInt(tfScoreB.getText());
			scoreTotalIrrelevant = Integer.parseInt(tfScoreTotal.getText());


			try
			{
				SimpleDateFormat formatter = new SimpleDateFormat ("yyyy_MM_dd'_'HH_m");
				Date currentTime = new Date();

				FileOutputStream fos = new FileOutputStream(tfBrowsedSavingPlace.getText()+"Relevant"+formatter.format(currentTime)+".txt");
				FileOutputStream fos1 = new FileOutputStream(tfBrowsedSavingPlace.getText()+"NotRelevant"+formatter.format(currentTime)+".txt");
				FileOutputStream fos2 = new FileOutputStream(tfBrowsedSavingPlace.getText()+"Suspicious"+formatter.format(currentTime)+".txt"); // create 3 files for saving (try & catch needs to begin here elsewise the printwriter won't work!
				FileOutputStream fos3 = null;

				if(cbShow4.isSelected())             // create the statistics FileOutputStream only when the user wants it (though when he clicked the checkbox)
				{
					fos3 = new FileOutputStream(tfBrowsedSavingPlace.getText()+"Statistics"+formatter.format(currentTime)+".txt");
				}

				PrintWriter PWrelev = new PrintWriter(new OutputStreamWriter(fos));
				PrintWriter PWNotRelev = new PrintWriter(new OutputStreamWriter(fos1));
				PrintWriter PWSuspi = new PrintWriter(new OutputStreamWriter(fos2));
				PrintWriter pw3 = null;

				if(cbShow4.isSelected())
				{
					pw3= new PrintWriter(fos3);
				}

				// copy the whole text from the text area into an array, whereby every line gets an own index

				String [] linesWhole = taMainText.getText().split("\n");

				String u = "";
				for(int d=0;d<linesWhole.length;d++)
				{

					try
					{
						u = linesWhole[d].substring(0,2);
						// try to get the first 2 characters; if failed -> use c| (just randomly choosen like this)
					}
					catch (Exception e)
					{
						u="c|";
					}
					if(u.equalsIgnoreCase(tfEndTag.getText().trim().substring(0,2)))                                                   // if the tag is ER -> insert |||| as a stopping sign for the algorithm and increase d with one
					{
						vWords.addElement(linesWhole[d]);
						linesWhole[d]="";                               // delete line of the array for performance reasons
						vWords.addElement("||||");               // this is added so the the algorithm knows when a record ends
						d = d+1;
						counterProgressBar = counterProgressBar+1;      // this is for the progressBar
					}
					else
					{
						vWords.addElement(linesWhole[d]);
						linesWhole[d]="";
						// else add it to the vector and delete the line again because of performance
					}

				}
				taMainText.setText("");              // clear the textArea for performance reasons

				ProgressBar loader = new ProgressBar (counterProgressBar);             // create a new progressBar
				loader.setVisible(false);
				loader.validate();
				




				// logic of the algorithm: every line of the records are saved into the vector. Then every line (which has its own index) is read by the algorithm
				// through adding every character to a word (if the first 5 characters equals the any of the 5 one entered by the user
				// If there is a " " the word is finished and will be checked. When the line is |||| the record is at an end and the saving process will start.
				// Afterwards the program will get to the next paragraph

				for(int a=0;a<counterProgressBar;a++)       // quantity of paragraphs (because it is easier it was just set to this number
				{
					nextParagraph = i;   // to start the new paragraph / record
					totalScore = 0;
					vStrings.clear();
					scoreA = 0;
					scoreB = 0;
					leave1 = false;
					leave2 = false;
					runCompleted = true;

					counterStatisticRecord = counterStatisticRecord+1;             // for the stastics

					if (paragraphReady == true)        // for the progressBar
					{
						loader.setVisible(true);
						loader.run(counterStatisticRecord);
					}

					paragraphReady = false;

					/// refresh some variables for each record

					for(i=nextParagraph;i<vWords.size();i++)      // get the lines from the array until there is "ER  -"
					{
						vStrings.add((String)vWords.elementAt(i));               // add the line to another vector


						if (vWords.elementAt(i).toString().equalsIgnoreCase("||||"))         // as soon as there is "||||" -> saving should be done
						{
							leave1 = true;
						}

						if (leave1==true)
						{                                                    
							if(leave2 == true)   // as soon as everything is saved, refresh some variables and go to the next paragraph
							{                                                            
								scoreA = 0;
								scoreB = 0;
								vAbstractDouble.clear();
								abstractDouble = true;
								counterIndex = 0;
								break;
							}

							//System.out.println("PARAGRAPH READY");
							totalScore = scoreA + scoreB;
							System.out.println(totalScore);

							if(cbShow4.isSelected())
							{
								vStatisticScoreA.addElement(scoreA);
								vStatisticScoreB.addElement(scoreB);


								pw3.println("Score of record no "+counterStatisticRecord);
								pw3.println("");
								pw3.println("ScoreA       -       ScoreB       -       Total");
								pw3.println(scoreA+"            -       "+scoreB+"            -       "+totalScore);
								pw3.println("");
								pw3.println("");
							}

							try
							{

								vScorePrint.add(totalScore);                // this vector is just for testing reasons!

								for(int h=0;h<vStrings.size();h++)      // get every line out of the vector in which the lines are saved
								{
									leave2 = true;                                         // enable to go to the next paragraph

									sVec =(String)vStrings.elementAt(h);                     // save every line into the String SVec

									if (sVec.equalsIgnoreCase("||||"))              // because this sign means end of the text -> in the saved file it should just be " "

									{
										sVec = "";
									}

									if(questionmarkKiller == 1)               // because there was a question mark sometimes in the beginning as the first sign of the first record -> this should "kill" it
									{
										sVec = sVec.substring(1, sVec.length()-1);         // so get the first line without the first character
										questionmarkKiller = questionmarkKiller+1;
									}

									if (scoreA >= scoreRangeA && scoreB>=scoreRangeB)       // if the score is equal or higher than the score the user has entered -> save in relevant
									{
										PWrelev.println(sVec);
									}
									else if ((scoreA < scoreRangeA && scoreA >0) && (scoreB <scoreRangeB && scoreB >0) || (scoreA >= scoreRangeA && scoreB < scoreRangeB)
											|| (scoreA < scoreRangeA && scoreB >= scoreRangeB))               // if the score is between 0 and the score the user has entered or one of the scores is higher than the user has entered but the other one is lower -> save into suspicious
									{
										PWSuspi.println(sVec);
									}
									else if (scoreA <= 0 || scoreB <=0 || totalScore<scoreTotalIrrelevant)         // if the score is equal or below 0 or the totalscore is less than the score the user has entered -> save to irrelevant
									{
										PWNotRelev.println(sVec);
									}
								}
							}

							catch (Exception e)       // catch method for saving
							{                                                                
								final JOptionPane pane = new JOptionPane("Error while saving to files! "+e.toString());
								final JDialog d = pane.createDialog((JFrame)null, "ERROR");
								d.setLocation(525,430);
								d.setVisible(true);
							}
						}

						else     // if it is not the "end-tag"
						{
							try
							{
								substring = (String)vWords.elementAt(i);     // get the first 5 characters of the line
								subStr = substring.substring(0,5);
							}

							catch (Exception e)
							{
								subStr = "abcde";      // if this is impossible just use a useless string because the line is then useless
							}

							// compare the tags inserted by the user with the string you just created -> are they fitting -> a checking for the keywords is necessary!

							if (subStr.equalsIgnoreCase(abstr) || subStr.equalsIgnoreCase(title) || subStr.equalsIgnoreCase(source)|| subStr.equalsIgnoreCase(additional1)
									|| subStr.equalsIgnoreCase(additional2) || subStr.equalsIgnoreCase(additional3) || subStr.equalsIgnoreCase(additional4) || subStr.equalsIgnoreCase(additional5))

							{
								//System.out.println("found one");                                                               

								boolean stopPhrases = false;
								endOfLine=0;
								endOfLine = substring.length()-1;

								counterIndex = 0;


								for(int l=0;l<900000;l++)
									// get every character of the string and add them to the one before to get the words, which are then compared with the keywords (here again 1000000 was just used because it was easier :D )
								{
									try
									{
										sbChecking.delete(0, 1);
										counterIndex = counterIndex + 1;
										sbChecking.append(substring.substring(l,l+1));  // allocate every character (substring(0,1) to checking as long as there is no one anymore


									}

									catch (Exception e)
									{
										break;             // if there is no further character in this line -> break and get the next line
									}

									if (sbChecking.toString().equalsIgnoreCase(" ") || counterIndex == substring.length())         // this means there is a blank in the text -> so the word is finished and the next one needs to be merged-> 1 "character" has to be skipped + the momentary variable for the word must be reseted
									{
										   
											if(outOfForAb == true || outOfForTi == true || outOfForSo == true || outOfForAdd1 == true ||outOfForAdd2 == true ||
													outOfForAdd3 == true ||outOfForAdd4 == true ||outOfForAdd5 == true)        // because there was problem with the algorithm recognizing a word too often we used these booleans. So if one word was recognized there will be a break!
											{
												break;
											}                                                                                      

											
												if(subStr.substring(0,2).equalsIgnoreCase(abstr.substring(0,2)))                  // check at which tag we are the moment: if it is abstract..
												{
													boolean breaker = false;

													for(int n=0;n<vAbstractChooseA.size();n++)                               // get all the words out of the vector of the abstract words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAbstractChooseA.elementAt(n);

														singleWordChecked = false;

														
														 temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAbNotCleanCategoryA.size();yu++)             // here the search for the keywords begins
														{
															if(singleOrPhrases1 == true)      // if the word has already been checked -> to prevent from giving it again points -> break
															{
																break;
															}

															tempVectorUnclean = (String)vAbNotCleanCategoryA.elementAt(yu);      // get each word out of the list
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();    // get the word and the next word combined to check for phrases

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1) // checked if the word of the text is the word of the string or begins with it
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))         // check if it is a *...* word
															{
																checkStar = true;
																checkLength = true;
															}

															//System.out.println("first part star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//System.out.println("second part star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())  // check if 
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))           // if the word of the vector is a "..." word
															{                                                                                                                              

																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))  // if the wordAndNextWord equals the string -> phrases detected
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())  // check the lengths    
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())
																			&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))       // check again for phrases part (this just to secure that no phrase is missed but on the other hand no single word is detected as phrase)
																		// check whether the first part of tempVectorUnclean contains word and the second part of tempVectorUnclean contains nextWord
																	{                                                                                                                                               
																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}                                                                                                                               

																if(checkLength2==true)                   // if it is a phrase -> do the following:
																{
																	temp3 = tempVectorUnclean; // -> this will be the variable which will get the score out of the hashMap
																	phrasesTrue = true;        // -> save that it is a phrase
																	singleOrPhrases2 = false;  
																	wordInList = wholeWord.trim();    // -> assure that the words are the same so the requirement furhter down is fulfilled
																	breaker=true; // -> break out of this for loop and assure that it will not be searched again
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAbstractChooseA.get(n)) && singleOrPhrases2 == false)       // if it is a single word and has not been in the phrases before (which sometimes was the case  -> boolean just as a security )
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true; // -> this is one possible requirement for the if clause further down -> assures that there will be points for the word
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )         // if the word of the vector is a *... word
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());             // clear the word for the comparison
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();          // get the difference of the length of the phrases and the word out of the vector

																if(sbWord.toString().trim().length() >= longWord.trim().length())       // this if clause was made to shun try..catch.. out of performance reasons
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;      // if it is not possible to make the difference of the single Word and the longWord -> try it with the length of the word - 1
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))  // if the last part of the word is the word of the vector
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;   // neccessary to stop the algorithm from giving points twice because of the detection of the word in phrases, too
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0) // again to shun try..catch.. for perofmance reasons
																{
																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim())) // if it is a phrase which is like *... (so there can be anything infront of the first word)
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAbstractChooseA.get(n)) && yu == vAbNotCleanCategoryA.size()-1) // there was a mistake that points were given when it was the last keyword in the vector -> this prevents it
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)       // if it is a ...* word (single)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;         // prevents from checking the same word at the same position again
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )          // if it is a *...* word
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;           // prevents from checking the same word at the same position again
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true )) // if it is a ...* phrases (so there can be anything behind the second word)
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false ) // if it is a *...* phrases
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}

															else          // if nothing is applicable -> prevent from giving points
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAb.get(temp3);              // get the score out of the hashMap
															tempNextWord = sbNextWord.toString();           // save the nextWord
															singleOrPhrases1 = true;                               // important for the detection of phrases and the reseting -> look down, at the end of the run button
															abstractDouble = true;

															String tempABClean = "";          // clear the word again so to save in the vAbstractDouble vector to remember the words because for each repetition there shall only be one additional point!

															if (temp3.contains("\""))
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															else if (temp3.substring(0,1).equals("*") && !temp3.substring(temp3.length()-1,temp3.length()).equals("*") )
															{
																tempABClean = temp3.substring(1,temp3.length());
															}
															else if(temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(0,temp3.length()-1);
															}
															else if(temp3.substring(0,1).equals("*") && temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															for(int c =0; c<vAbstractDouble.size();c++)                   // check whether the word has been in the tag before
															{

																if(((String)vAbstractDouble.elementAt(c)).equalsIgnoreCase(tempABClean))                  // if yes -> only give one point plus or minus
																{
																	if(score >=1)
																	{
																		score =  1;
																		abstractDouble = false;

																		break;
																	}
																	else if (score <=-1)
																	{
																		score =  -1;
																		abstractDouble = false;                                                                                                                                              
																		break;
																	}
																}

															}
															vAbstractDouble.addElement(tempABClean);        // add the word to the vector
															tempABClean = "";          // clean the variable again out of performance reasons (because there will always be a String object created -> for performance reasons it is important that this is deleted again -> is done by making it empty)
															scoreA = scoreA + score;
															outOfForAb = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAbstractChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{                                                                                                                                                                                                                                                             

															phrasesCheckedA = true;

															score = (Integer)hWordScoreAb.get(temp3);       // get the score

															abstractDouble = true;
															String tempABClean = "";

															if (temp3.contains("\""))         // clean the word
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															else if(temp3.substring(0,1).equals("*") && temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															else if (temp3.substring(0,1).equals("*") && !temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(1,temp3.length());
															}
															else if(temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(0,temp3.length()-1);
															}



															for(int c =0; c<vAbstractDouble.size();c++)                   // check whether the word has been in the tag before
															{

																if(((String) vAbstractDouble.elementAt(c)).equalsIgnoreCase(tempABClean))                  // if yes -> only give one point plus or minus
																{
																	if(score >=1)
																	{
																		score =  1;
																		abstractDouble = false;
																		break;
																	}
																	else if (score <=-1)
																	{
																		score =  -1;
																		abstractDouble = false;
																		break;
																	}
																}
															}
															vAbstractDouble.addElement(tempABClean);
															tempABClean = "";
															scoreA = scoreA + score;   // add it to the score of category A
															outOfForAb = true;                // prevents from going into the loop again
														}
													}
												}   // ENDE VON KAT A - ABSTRACT

												// just do the same for all the other tags! we didnt write a method because we found out that the program is faster in this way! if you want to see it in a more clear way, look at the class "FrameRelevantCleanButSlow" (which has a method with a big amount [but not all] of the functions which are here. This is probably much better to understand the logic behind the algorithm. If you have any problems, feel free to ask us![see the "about" link therefore])

												else if(subStr.substring(0,2).equalsIgnoreCase(title.substring(0,2)))                  // if the tag is title...
												{
													boolean breaker = false;

													for(int n=0;n<vTitleChooseA.size();n++)                               // get all the words out of the vector of the title words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vTitleChooseA.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;

														for(int yu=0;yu<vTiNotCleanCategoryA.size();yu++)
														{

															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vTiNotCleanCategoryA.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1) 
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;

																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{                                                                                                                                
																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{                                                                                                                                              
																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}
																//System.out.println("substring substring " + substring.substring(l+1,l+2)+" vector: "+(String)vTitleChooseA.get(n)+ " WORD: "+word + " endOfLine: "+endOfLine+" counterINDEX: "+counterIndex+" nextWordLENGTH "+nextWord.length() +" checkLength "+checkLength2);

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vTitleChooseA.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vTitleChooseA.get(n)) && yu == vTiNotCleanCategoryA.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}

															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreTi.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreA = scoreA + score;
															outOfForTi = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vTitleChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedA = true;
															score = (Integer)hWordScoreTi.get(temp3);
															scoreA = scoreA + score;
															outOfForTi = true;
														}
													}
												}              // ENDE VON KAT A - TITLE


												else if(subStr.substring(0,2).equalsIgnoreCase(source.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vSourceChooseA.size();n++)                               // get all the words out of the vector of the Source words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vSourceChooseA.elementAt(n);

														singleWordChecked = false;
														

														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vSoNotCleanCategoryA.size();yu++)
														{

															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vSoNotCleanCategoryA.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;

																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{                                                                                                                               

																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{                                                                                                                                               
																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vSourceChooseA.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vSourceChooseA.get(n)) && yu == vSoNotCleanCategoryA.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreSo.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreA = scoreA + score;
															outOfForSo = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vSourceChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedA = true;
															score = (Integer)hWordScoreSo.get(temp3);
															scoreA = scoreA + score;
															outOfForSo = true;
														}
													}
												}   // ENDE VON KAT A - SOURCE


												else if(subStr.substring(0,2).equalsIgnoreCase(additional1.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd1ChooseA.size();n++)                               // get all the words out of the vector of the Add1 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd1ChooseA.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAdd1NotCleanCategoryA.size();yu++)
														{

															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd1NotCleanCategoryA.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;                                                                                                                                                                                                                                                                       }
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{                                                                                                                               
																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{                                                                                                                                                
																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}                                                                                                                              

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd1ChooseA.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd1ChooseA.get(n)) && yu == vAdd1NotCleanCategoryA.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}

															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd1.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreA = scoreA + score;
															outOfForAdd1 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd1ChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedA = true;
															score = (Integer)hWordScoreAdd1.get(temp3);
															scoreA = scoreA + score;
															outOfForAdd1 = true;
														}
													}
												}   // ENDE VON KAT A - ADD1



												else if(subStr.substring(0,2).equalsIgnoreCase(additional2.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd2ChooseA.size();n++)                               // get all the words out of the vector of the Add2 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd2ChooseA.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAdd2NotCleanCategoryA.size();yu++)
														{

															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd2NotCleanCategoryA.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;                                                                                                                                      
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{                                                                                                                               
																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{                                                                                                                                              
																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd2ChooseA.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd2ChooseA.get(n)) && yu == vAdd2NotCleanCategoryA.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}

															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd2.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreA = scoreA + score;
															outOfForAdd2 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd2ChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedA = true;
															score = (Integer)hWordScoreAdd2.get(temp3);
															scoreA = scoreA + score;
															outOfForAdd2 = true;
														}
													}
												}   // ENDE VON KAT A - ADD2


												else if(subStr.substring(0,2).equalsIgnoreCase(additional3.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd3ChooseA.size();n++)                               // get all the words out of the vector of the Add3 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd3ChooseA.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAdd3NotCleanCategoryA.size();yu++)
														{

															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd3NotCleanCategoryA.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;                                                                                                                                       
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}
																//System.out.println("substring substring " + substring.substring(l+1,l+2)+" vector: "+(String)vAdd3ChooseA.get(n)+ " WORD: "+word + " endOfLine: "+endOfLine+" counterINDEX: "+counterIndex+" nextWordLENGTH "+nextWord.length() +" checkLength "+checkLength2);

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd3ChooseA.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd3ChooseA.get(n)) && yu == vAdd3NotCleanCategoryA.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd3.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreA = scoreA + score;
															outOfForAdd3 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd3ChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedA = true;
															score = (Integer)hWordScoreAdd3.get(temp3);
															scoreA = scoreA + score;
															outOfForAdd3 = true;
														}
													}
												}   // ENDE VON KAT A - ADD3


												else if(subStr.substring(0,2).equalsIgnoreCase(additional4.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd4ChooseA.size();n++)                               // get all the words out of the vector of the Add4 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd4ChooseA.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;

														for(int yu=0;yu<vAdd4NotCleanCategoryA.size();yu++)
														{

															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd4NotCleanCategoryA.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}
																//System.out.println("substring substring " + substring.substring(l+1,l+2)+" vector: "+(String)vAdd4ChooseA.get(n)+ " WORD: "+word + " endOfLine: "+endOfLine+" counterINDEX: "+counterIndex+" nextWordLENGTH "+nextWord.length() +" checkLength "+checkLength2);

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd4ChooseA.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd4ChooseA.get(n)) && yu == vAdd4NotCleanCategoryA.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd4.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreA = scoreA + score;
															outOfForAdd4 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd4ChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedA = true;
															score = (Integer)hWordScoreAdd4.get(temp3);
															scoreA = scoreA + score;
															outOfForAdd4 = true;
														}
													}
												}   // ENDE VON KAT A - ADD4

												else if(subStr.substring(0,2).equalsIgnoreCase(additional5.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd5ChooseA.size();n++)                               // get all the words out of the vector of the Add5 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd5ChooseA.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAdd5NotCleanCategoryA.size();yu++)
														{

															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd5NotCleanCategoryA.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}
																//System.out.println("substring substring " + substring.substring(l+1,l+2)+" vector: "+(String)vAdd5ChooseA.get(n)+ " WORD: "+word + " endOfLine: "+endOfLine+" counterINDEX: "+counterIndex+" nextWordLENGTH "+nextWord.length() +" checkLength "+checkLength2);

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd5ChooseA.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd5ChooseA.get(n)) && yu == vAdd5NotCleanCategoryA.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}

															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedA = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd5.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreA = scoreA + score;
															outOfForAdd5 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd5ChooseA.get(n))&&phrasesCheckedA==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedA = true;
															score = (Integer)hWordScoreAdd5.get(temp3);
															scoreA = scoreA + score;
															outOfForAdd5 = true;
														}
													}
												}   // ENDE VON KAT A - ADD5
										
										// do exactly the same for category B!

										outOfForAb = false;
										outOfForTi = false;
										outOfForSo = false;
										outOfForAdd1 = false;
										outOfForAdd2 = false;
										outOfForAdd3 = false;
										outOfForAdd4 = false;
										outOfForAdd5 = false;


										
											if(outOfForAb == true || outOfForTi == true || outOfForSo == true || outOfForAdd1 == true ||outOfForAdd2 == true ||
													outOfForAdd3 == true ||outOfForAdd4 == true ||outOfForAdd5 == true)
											{
												break;
											}
											
												if(subStr.substring(0,2).equalsIgnoreCase(abstr.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAbstractChooseB.size();n++)                               // get all the words out of the vector of the Source words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAbstractChooseB.elementAt(n);

														singleWordChecked = false;
														

														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAbNotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAbNotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         // check if the lengths are the same
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																		
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}
																//System.out.println("substring substring " + substring.substring(l+1,l+2)+" vector: "+(String)vAbstractChooseB.get(n)+ " WORD: "+word + " endOfLine: "+endOfLine+" counterINDEX: "+counterIndex+" nextWordLENGTH "+nextWord.length() +" checkLength "+checkLength2);

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAbstractChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAbstractChooseB.get(n)) && yu == vAbNotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}

															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAb.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															abstractDouble = true;

															String tempABClean = "";

															if (temp3.contains("\""))
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															else if (temp3.substring(0,1).equals("*") && !temp3.substring(temp3.length()-1,temp3.length()).equals("*") )
															{
																tempABClean = temp3.substring(1,temp3.length());
															}
															else if(temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(0,temp3.length()-1);
															}
															else if(temp3.substring(0,1).equals("*") && temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															for(int c =0; c<vAbstractDouble.size();c++)                   // check whether the word has been in the tag before
															{

																if(((String)vAbstractDouble.elementAt(c)).equalsIgnoreCase(tempABClean))                  // if yes -> only give one point plus or minus
																{
																	if(score >=1)
																	{
																		score =  1;
																		abstractDouble = false;

																		break;
																	}
																	else if (score <=-1)
																	{
																		score =  -1;
																		abstractDouble = false;
																		// //System.out.println(wordInList + " ist im MinusScore");
																		break;
																	}
																}

															}
															vAbstractDouble.addElement(tempABClean);
															tempABClean = "";
															scoreB = scoreB + score;
															outOfForAb = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAbstractChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{

															phrasesCheckedB = true;

															score = (Integer)hWordScoreAb.get(temp3);

															abstractDouble = true;
															String tempABClean = "";

															if (temp3.contains("\""))
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															else if(temp3.substring(0,1).equals("*") && temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(1,temp3.length()-1);
															}
															else if (temp3.substring(0,1).equals("*") && !temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(1,temp3.length());
															}
															else if(temp3.substring(temp3.length()-1,temp3.length()).equals("*"))
															{
																tempABClean = temp3.substring(0,temp3.length()-1);
															}



															for(int c =0; c<vAbstractDouble.size();c++)                   // check whether the word has been in the tag before
															{

																if(((String) vAbstractDouble.elementAt(c)).equalsIgnoreCase(tempABClean))                  // if yes -> only give one point plus or minus
																{
																	if(score >=1)
																	{
																		score =  1;
																		abstractDouble = false;
																		break;
																	}
																	else if (score <=-1)
																	{
																		score =  -1;
																		abstractDouble = false;
																		break;
																	}
																}
															}
															vAbstractDouble.addElement(tempABClean);
															tempABClean = "";
															scoreB = scoreB + score;
															outOfForAb = true;
														}
													}
												}   // ENDE VON KAT B - ABSTRACT


												else if(subStr.substring(0,2).equalsIgnoreCase(title.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vTitleChooseB.size();n++)                               // get all the words out of the vector of the title words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vTitleChooseB.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vTiNotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vTiNotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}


																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vTitleChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vTitleChooseB.get(n)) && yu == vTiNotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreTi.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreB = scoreB + score;
															outOfForTi = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vTitleChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedB = true;
															score = (Integer)hWordScoreTi.get(temp3);
															scoreB = scoreB + score;
															outOfForTi = true;
														}
													}
												}   // ENDE VON KAT B - TITLE

												else if(subStr.substring(0,2).equalsIgnoreCase(source.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vSourceChooseB.size();n++)                               // get all the words out of the vector of the Source words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vSourceChooseB.elementAt(n);

														singleWordChecked = false;
														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;

														for(int yu=0;yu<vSoNotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vSoNotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}


																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vSourceChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vSourceChooseB.get(n)) && yu == vSoNotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreSo.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreB = scoreB + score;
															outOfForSo = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vSourceChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedB = true;
															score = (Integer)hWordScoreSo.get(temp3);
															scoreB = scoreB + score;
															outOfForSo = true;
														}
													}
												}   // ENDE VON KAT B - SOURCE


												else if(subStr.substring(0,2).equalsIgnoreCase(additional1.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd1ChooseB.size();n++)                               // get all the words out of the vector of the Add1 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd1ChooseB.elementAt(n);

														singleWordChecked = false;

														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;

														for(int yu=0;yu<vAdd1NotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd1NotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}


																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd1ChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd1ChooseB.get(n)) && yu == vAdd1NotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd1.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreB = scoreB + score;
															outOfForAdd1 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd1ChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedB = true;
															score = (Integer)hWordScoreAdd1.get(temp3);
															scoreB = scoreB + score;
															outOfForAdd1 = true;
														}
													}
												}   // ENDE VON KAT B - ADD 1


												else if(subStr.substring(0,2).equalsIgnoreCase(additional2.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd2ChooseB.size();n++)                               // get all the words out of the vector of the Add2 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd2ChooseB.elementAt(n);

														singleWordChecked = false;

														

														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAdd2NotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd2NotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}


																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd2ChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd2ChooseB.get(n)) && yu == vAdd2NotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd2.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreB = scoreB + score;
															outOfForAdd2 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd2ChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedB = true;
															score = (Integer)hWordScoreAdd2.get(temp3);
															scoreB = scoreB + score;
															outOfForAdd2 = true;
														}
													}
												}   // ENDE VON KAT B - ADD 2

												else if(subStr.substring(0,2).equalsIgnoreCase(additional3.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd3ChooseB.size();n++)                               // get all the words out of the vector of the Add3 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd3ChooseB.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAdd3NotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd3NotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd3ChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd3ChooseB.get(n)) && yu == vAdd3NotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd3.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreB = scoreB + score;
															outOfForAdd3 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd3ChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedB = true;
															score = (Integer)hWordScoreAdd3.get(temp3);
															scoreB = scoreB + score;
															outOfForAdd3 = true;
														}
													}
												}   // ENDE VON KAT B - ADD 3

												else if(subStr.substring(0,2).equalsIgnoreCase(additional4.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd4ChooseB.size();n++)                               // get all the words out of the vector of the Add4 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd4ChooseB.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;

														for(int yu=0;yu<vAdd4NotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd4NotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd4ChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd4ChooseB.get(n)) && yu == vAdd4NotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd4.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;  
															scoreB = scoreB + score;
															outOfForAdd4 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd4ChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedB = true;
															score = (Integer)hWordScoreAdd4.get(temp3);
															scoreB = scoreB + score;
															outOfForAdd4 = true;
														}
													}
												}   // ENDE VON KAT B - ADD 4

												else if(subStr.substring(0,2).equalsIgnoreCase(additional5.substring(0,2)))
												{
													boolean breaker = false;

													for(int n=0;n<vAdd5ChooseB.size();n++)                               // get all the words out of the vector of the Add5 words
													{
														if(breaker == true)
														{
															break;
														}
														wordInList = (String)vAdd5ChooseB.elementAt(n);

														singleWordChecked = false;

														
														temp3 ="";
														 goDinna2 = false;
														 checkLength = false;
														 checkLength2 = false;
														 checkLength3 = false;
														 phrasesTrue = false;
														 checkStar = false;


														for(int yu=0;yu<vAdd5NotCleanCategoryB.size();yu++)
														{
															if(singleOrPhrases1 == true)
															{
																break;
															}

															tempVectorUnclean = (String)vAdd5NotCleanCategoryB.elementAt(yu);
															checkStar = false;
															wordAndNextWord = sbWord.toString()+sbNextWord.toString();

															if(sbWord.toString().length() >= tempVectorUnclean.length()-1)  
															{

																if(sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1)))
																{
																	checkLength = true;
																}
															}

															if( tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&&  tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*"))
															{
																checkStar = true;
																checkLength = true;
															}

															//     //System.out.println("erster Teil star: "+tempVectorUnclean.substring(0,word.length())+" word: "+word+" next Word: "+nextWord);
															//     //System.out.println("zweiter Teil star: "+ tempVectorUnclean.substring(word.length(), tempVectorUnclean.length()-1)+" nextWord erste Buchstaben "+nextWord.substring(0,tempVectorUnclean.substring(word.length()+1, tempVectorUnclean.length()).length()));

															if((sbWord.toString().length()+1 < tempVectorUnclean.length()))   
															{
																if(tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length() <= sbNextWord.toString().length())
																{
																	if(tempVectorUnclean.substring(0,sbWord.toString().length()).equalsIgnoreCase(sbWord.toString())&& tempVectorUnclean.substring(sbWord.toString().length(),
																			tempVectorUnclean.length()-1).equalsIgnoreCase(sbNextWord.toString().substring(0,tempVectorUnclean.substring(sbWord.toString().length()+1, tempVectorUnclean.length()).length())))
																	{
																		checkLength3 = true;
																	}

																	else
																	{
																		checkLength3 = false;
																	}
																}
															}

															if(tempVectorUnclean.contains("\"") && tempVectorUnclean.contains(sbWord.toString()))
															{


																if(wordAndNextWord.trim().equalsIgnoreCase(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim()))
																{
																	checkLength2 = true;
																}

																else if(sbWord.toString().length()+1 < sbWord.toString().length()+sbNextWord.toString().length()+1 && sbWord.toString().length()+sbNextWord.toString().length()+1 <= tempVectorUnclean.length())         
																{

																	if(tempVectorUnclean.substring(1,sbWord.toString().length()+1).equalsIgnoreCase(sbWord.toString())&&tempVectorUnclean.substring(sbWord.toString().length()+1, sbWord.toString().length()+sbNextWord.toString().length()+1).equalsIgnoreCase(sbNextWord.toString())&&!sbNextWord.toString().equals(""))
																	{

																		checkLength2=true;
																	}

																	else
																	{
																		checkLength2=false;
																	}
																}

																if(checkLength2==true)
																{
																	temp3 = tempVectorUnclean;
																	phrasesTrue = true;
																	singleOrPhrases2 = false;
																	wordInList = wholeWord.trim();
																	breaker=true;
																	break;
																}

																else if(sbWord.toString().equalsIgnoreCase((String)vAdd5ChooseB.get(n)) && singleOrPhrases2 == false)
																{
																	temp3 = tempVectorUnclean;
																	goDinna2 = true;
																	breaker = true;
																	break;
																}
															}

															else if(tempVectorUnclean.substring(0, 1).equalsIgnoreCase("*") && !tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") )
															{
																longWord = tempVectorUnclean.substring(1,tempVectorUnclean.length());
																temp2 = wordAndNextWord.trim().length()-longWord.trim().length();

																if(sbWord.toString().trim().length() >= longWord.trim().length())        
																{
																	tempInt = sbWord.toString().trim().length()-longWord.trim().length();
																}
																else
																{
																	tempInt = sbWord.length()-1;
																}

																if(tempInt <= sbWord.toString().length() && tempInt >= 0)  
																{

																	if(sbWord.toString().trim().substring(tempInt,sbWord.toString().length()).equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		goDinna2 =true;
																		stopPhrases =true;
																		break;
																	}
																}

																if(temp2 <= wordAndNextWord.length() && temp2 >=0)  
																{

																	if(stopPhrases == false && !sbNextWord.toString().trim().contains(longWord.trim()) && wordAndNextWord.substring(temp2,wordAndNextWord.length()).trim().equalsIgnoreCase(longWord.trim()))
																	{
																		breaker = true;
																		temp3 = tempVectorUnclean;
																		wordInList = wholeWord.trim();
																		phrasesTrue = true;
																		singleOrPhrases2 = false;
																		break;
																	}
																}

																if(sbWord.toString().equalsIgnoreCase((String)vAdd5ChooseB.get(n)) && yu == vAdd5NotCleanCategoryB.size()-1)
																{
																	sbWord.append("|||");
																	wordInList = wordInList + "|||";
																}
															}


															else if(tempVectorUnclean.length()-1 <= sbWord.toString().length() && checkLength == true && checkStar == false && tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*")
																	&& sbWord.toString().substring(0,tempVectorUnclean.length()-1).equalsIgnoreCase(tempVectorUnclean.substring(0,tempVectorUnclean.length()-1))
																	&& !tempVectorUnclean.substring(0,1).equalsIgnoreCase("*") && singleOrPhrases2 == false && repeatedChecking2 == false)
															{
																breaker = true;
																temp3 = tempVectorUnclean;
																repeatedChecking2 = true;
																goDinna2 =true;
																break;
															}

															else if(checkLength == true && checkStar == true && sbWord.toString().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1))
																	&& (!substring.substring(l,l+1).equalsIgnoreCase(" ") || !substring.substring(l-1,l).equalsIgnoreCase(".")
																			|| !substring.substring(l-1,l).equalsIgnoreCase(";") || !substring.substring(l-1,l).equalsIgnoreCase(",") || !substring.substring(l-1,l).equalsIgnoreCase("-") || !substring.substring(l-1,l).equalsIgnoreCase("+"))
																			&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																goDinna2 =true;
																checkStarDouble = true;
																break;
															}

															else if((tempVectorUnclean.substring(tempVectorUnclean.length()-1,tempVectorUnclean.length()).trim().equalsIgnoreCase("*") && checkLength3 == true ))
															{
																temp3 = tempVectorUnclean;
																phrasesTrue=true;
																wholeWord = wordInList;
																break;
															}

															else if(checkStarDouble == false && checkLength == true && checkStar == true && wordAndNextWord.trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())
																	&& !sbNextWord.toString().trim().contains(tempVectorUnclean.substring(1,tempVectorUnclean.length()-1).trim())&& singleOrPhrases2 == false && repeatedChecking == false )
															{
																temp3 = tempVectorUnclean;
																repeatedChecking = true;
																breaker = true;
																phrasesTrue = true;
																wordInList = wholeWord.trim();
																break;
															}
															else
															{
																temp3 = tempVectorUnclean;
																goDinna2 = false;
																phrasesCheckedB = true;
															}
														}

														if(wordInList.equalsIgnoreCase(wholeWord.trim())&&phrasesTrue==true && singleOrPhrases2 == false)        // if it is a phrase matching with one of the words in the keywordlist..
														{
															score = (Integer)hWordScoreAdd5.get(temp3);
															tempNextWord = sbNextWord.toString();
															singleOrPhrases1 = true;
															scoreB = scoreB + score;
															outOfForAdd5 = true;
														}

														if((sbWord.toString().equalsIgnoreCase((String)vAdd5ChooseB.get(n))&&phrasesCheckedB==false) && (singleOrPhrases2 ==false) || goDinna2 ==true) // if it is a single word matching with one of the words in the keywordlist...
														{
															phrasesCheckedB = true;
															score = (Integer)hWordScoreAdd5.get(temp3);
															scoreB = scoreB + score;
															outOfForAdd5 = true;
														}
													}
												}   // ENDE VON KAT B - ADD 5

									
												


										outOfForAb = false;
										outOfForTi = false;
										outOfForSo = false;
										outOfForAdd1 = false;
										outOfForAdd2 = false;
										outOfForAdd3 = false;
										outOfForAdd4 = false;
										outOfForAdd5 = false;

										stopPhrases = false;

										//System.out.println("IN LEER");
										if(counterPhrasesSingle == 2)
										{
											singleOrPhrases2=false;
											counterPhrasesSingle=0;
										}

										if(singleOrPhrases1 == true)
										{
											//System.out.println("im bool if dinna " + counterPhrasesSingle);
											singleOrPhrases2 = true;
											counterPhrasesSingle =2;
										}



										// these variables are necessary to get the next word in the next which is necessary to recognize the phrases
										sbNextWordCreator1.delete(0, sbNextWordCreator1.length());
										sbNextWordCreator2.delete(0, sbNextWordCreator2.length());
										sbNextWord.delete(0, sbNextWord.length());
										repeatedChecking = false;
										repeatedChecking2 = false;
										singleOrPhrases1 = false;
										elseCheckPhrases = false;
										elseCheckSingle = false;
										checkStarDouble = false;



										for(int b =1;b<50;b++)
										{
											try
											{
												sbNextWordCreator1.delete(0, 1);
												sbNextWordCreator1.append(substring.substring(l+b,l+b+1));     // try to get the characters of the next word (so this is just to get to know how long the word is and to deal with it if it is the last word of the line!)
											}
											catch (Exception e)
											{
												sbNextWordCreator1.delete(0, sbNextWordCreator1.length());
												sbNextWordCreator1.append(" ");// if there is none (e.g. because of the end of the line..
											}

											if(sbNextWordCreator1.toString().equalsIgnoreCase(" "))         // if y is a blank..
											{
												sbNextWord.delete(0, sbNextWord.length());

												for(int c =1;c<40;c++)
												{
													try
													{
														sbNextWordCreator2.delete(0, sbNextWordCreator1.length());
														sbNextWordCreator2.append(substring.substring(l+b+c,l+b+c+1));     // get the character of the next word
													}
													catch(Exception e)
													{
														sbNextWordCreator2.append("|a3b3c3|");    // if this is not possible just add a useless string
														break;
													}

													if(sbNextWordCreator2.toString().equalsIgnoreCase(" "))
													{
														break;           // if the substring is a blank -> break
													}
													else           // else add the character to the variable
													{

														sbNextWord.append(sbNextWordCreator2.toString());      // just add the characters to the next word (so the variable nextWord is used for 2 reasons! 1. get the length of the next word and 2. to then really get the next word and save it
													}

												}

												break;

											}
											else
											{
												sbNextWord.append(substring.substring(l+b,l+b+1));        // again putting characters together

											}

										}
										sbWord.delete(0, sbWord.length());           // blank -> new word needs to start -> variable need to be cleared
									}

									else
									{
										sbWord.append(sbChecking.toString());

										// if the next character is no blank -> add it to the ones before
										// set some booleans false
									}
								}
							}
						}
					}

					paragraphReady = true;  // for the progressBar
				}

				PWrelev.close();    // close the printwriters again! -> really important!
				PWNotRelev.close();
				PWSuspi.close();


				try
				{     // for the checkboxes -> decides which file will be opened after the screening process
					if (cbShow1.isSelected())
					{
						desktopOpen1 = new File(tfBrowsedSavingPlace.getText()+"Relevant"+formatter.format(currentTime)+".txt");

						Desktop desktop1 = null;
						if (Desktop.isDesktopSupported())
							desktop1 = Desktop.getDesktop();
						desktop1.open(desktopOpen1);
					}

					if (cbShow2.isSelected())
					{
						desktopOpen2 = new File(tfBrowsedSavingPlace.getText()+"Suspicious"+formatter.format(currentTime)+".txt");

						Desktop desktop2 = null;
						if (Desktop.isDesktopSupported())
							desktop2 = Desktop.getDesktop();
						desktop2.open(desktopOpen2);
					}

					if (cbShow3.isSelected())
					{
						desktopOpen3 = new File(tfBrowsedSavingPlace.getText()+"NotRelevant"+formatter.format(currentTime)+".txt");
						Desktop desktop3 = null;
						if (Desktop.isDesktopSupported())
							desktop3 = Desktop.getDesktop();
						desktop3.open(desktopOpen3);


					}
					if (cbShow4.isSelected())
					{
						try
						{
							int gesamt=0;         // for the statistic file

							for(int i=0;i<vStatisticScoreA.size();i++)
							{

								int parseA = (Integer)vStatisticScoreA.elementAt(i) ;
								int parseB = (Integer)vStatisticScoreB.elementAt(i) ;

								if (parseA >= scoreRangeA && parseB>=scoreRangeB)       // if the score is equal or higher than the score the user has entered -> save in relevant
								{
									counterStatisticRelev = counterStatisticRelev + 1;

								}
								else if ((parseA < scoreRangeA && parseA >0) && (parseB <scoreRangeB && parseB >0) || (parseA >= scoreRangeA && parseB < scoreRangeB)
										|| (parseA < scoreRangeA && parseB >= scoreRangeB))               // if the score is between 0 and the score the user has entered or one of the scores is higher than the user has entered but the other one is lower -> save into suspicious
								{

									counterStatisticSusps = counterStatisticSusps+1;
								}
								else if (parseA <= 0 || parseB <=0 || totalScore<scoreTotalIrrelevant)         // if the score is equal or below 0 or the totalscore is less than the score the user has entered -> save to irrelevant
								{
									counterStatisticIrrelev = counterStatisticIrrelev + 1;

								}
							}

							SimpleDateFormat formatter2 = new SimpleDateFormat ("yyyy.MM.dd 'at' HH:mm:ss");  // get the time and date and save it in the statistic file
							Date currentTime2 = new Date();

							pw3.println("");
							pw3.println("");
							pw3.println("Quantity of records: " + vScorePrint.size());
							pw3.println("Quantity of relevant records: "+counterStatisticRelev);
							pw3.println("Quantity of suspicious records: "+counterStatisticSusps);
							pw3.println("Quantity of irrelevant records: "+counterStatisticIrrelev);
							pw3.println("");
							pw3.println("compiled at: "+ formatter2.format(currentTime));


							pw3.close();
							fos3.close();
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}


					}
					
					final JOptionPane pane = new JOptionPane("Files have been created successfully!");
					final JDialog d = pane.createDialog((JFrame)null, "NOTICE");
					d.setLocation(525,430);
					d.setVisible(true);

				}

				catch (Exception e1)
				{
					e1.printStackTrace();
				}

			}
			catch (Exception e)
			{
				e.printStackTrace();
				final JOptionPane pane = new JOptionPane("Error occured"+e.toString());
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);

			}

			int gesamt=0;         // for getting the score and to count the records

			for(int i=0;i<vScorePrint.size();i++)
			{                               
				int parse = (Integer)vScorePrint.elementAt(i) ;

				if (parse > 20)
				{
					counterStatisticRelev = counterStatisticRelev+1;
				}
				if (parse < 100)
				{
					gesamt = gesamt+1;
				}
			}                       

		}
		// clearing the variables
		nextParagraph = -1;
		totalScore = 0;
		vStrings.clear();
	}

/*	private void buttonBackMouseClicked(java.awt.event.MouseEvent evt) // button back
	{
		if(listenModell1.size()==0)
		{
			this.dispose(); // close the FrameRelevant window and open the FrameIrrelevant Window
			FrameStart frame = new FrameStart();
			frame.setVisible(true);
			frame.validate();
		}

		else
		{

			FrameIrrelevant frame = new FrameIrrelevant();
			frame.setVisible(true);
			frame.validate();

			try
			{
				FileOutputStream fos = new FileOutputStream(fileSave.getPath()+"SavedKeywords.txt"); // // Save the keywords from list 1 under the choosen save path if the back button was pressed
				PrintWriter toFile = new PrintWriter(fos);

				for(int i=0;i<listenModell1.size();i++)
				{
					tempSave =(String)listenModell1.getElementAt(i);
					try
					{                                              
						toFile.println(tempSave);

					}
					catch(Exception exc)
					{
						final JOptionPane pane = new JOptionPane("Error while saving list on Back-Button: "+exc.toString());
						final JDialog d = pane.createDialog((JFrame)null, "ERROR");
						d.setLocation(525,430);
						d.setVisible(true);
						exc.printStackTrace();
					}

				}
				toFile.close();
				fos.close();

			}


			catch(Exception exc)
			{
				final JOptionPane pane = new JOptionPane("Error at Back-Button: "+exc.toString());
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}

			this.dispose(); // close the FrameRelevant window and open the FrameIrrelevant Window
		}

	} */


	private void buttonHelpMouseClicked(java.awt.event.MouseEvent evt) // button Help
	{
		FrameHelpRelevant fr = new FrameHelpRelevant();
		fr.setVisible(true);
		fr.validate();
	}



	public boolean isInt(String s)  // checks whether the entered variable for value is an integer value or not
	{
		try
		{
			Integer.parseInt(s);
			return true;
		}

		catch (Exception e)
		{
			return false;
		}

	}

	protected void processWindowEvent(WindowEvent e)             // for pressing the "x" in the top right corner
	{
		if(e.getID()==WindowEvent.WINDOW_CLOSING)
		{

			if(JOptionPane.showConfirmDialog(null, "<html><body>Do you really want to close the program?<p> NOTE: The keyword list will not be saved! If you want to save it, please press Exit<body><html>"			
					, "WARNING",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			{
				super.processWindowEvent(e);


				if(listenModell1.size()==0)
				{
					System.exit(0);
				}

				else
				{

					System.gc();
					buttonExit.doClick();

				}
			}
		}

	}





	/**
	 * @param args the command line arguments
	 */



	// Variables declaration - do not modify
	private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBrowseList;
    private javax.swing.JButton buttonBrowseSavingPlace;
    private javax.swing.JButton buttonBrowseText;
    private javax.swing.JButton buttonChoose;
    private javax.swing.JButton buttonDelete1;
    private javax.swing.JButton buttonDelete2;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHelp;
    private javax.swing.JButton buttonLoad;
    private javax.swing.JButton buttonRun;
    private javax.swing.JCheckBox cbShow1;
    private javax.swing.JCheckBox cbShow2;
    private javax.swing.JCheckBox cbShow3;
    private javax.swing.JCheckBox cbShow4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList keywordList1;
    private javax.swing.JList keywordList2;
    private javax.swing.JTextArea taMainText;
    private javax.swing.JTextField tfBrowsedList;
    private javax.swing.JTextField tfBrowsedSavingPlace;
    private javax.swing.JTextField tfBrowsedText;
    private javax.swing.JTextField tfCategory;
    private javax.swing.JTextField tfEndTag;
    private javax.swing.JTextField tfNewValue;
    private javax.swing.JTextField tfNewWord;
    private javax.swing.JTextField tfScoreA;
    private javax.swing.JTextField tfScoreB;
    private javax.swing.JTextField tfScoreTotal;
    private javax.swing.JTextField tfStructure;
    private javax.swing.JTextField tfTagAbstract;
    private javax.swing.JTextField tfTagAddition1;
    private javax.swing.JTextField tfTagAddition2;
    private javax.swing.JTextField tfTagAddition3;
    private javax.swing.JTextField tfTagAddition4;
    private javax.swing.JTextField tfTagAddition5;
    private javax.swing.JTextField tfTagSource;
    private javax.swing.JTextField tfTagTitle;
    // End of variables declaration           
}

