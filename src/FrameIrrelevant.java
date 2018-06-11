import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.*;

//	 THIS FRAME IS NOT USED!!! MAYBE IT IS USEFUL LATER - CHEERS SEBASTIAN & BEN

public class FrameIrrelevant extends JFrame implements ActionListener
{
	// Instanzvariablen

	private static final JOptionPane YES_OPTION = null;
	private static final Component YES_NO_OPTION = null;

	private JPanel panel = new JPanel();

	private JButton buttonRun = new JButton("  RUN");
	private JButton buttonContin = new JButton("CONTINUE");
	private JButton buttonBack = new JButton("BACK");
	private JButton buttonBrowseText = new JButton ("BROWSE TEXT");
	private JButton buttonBrowseKeywords = new JButton ("BROWSE KEYWORDS");
	private JButton buttonBrowsePlace = new JButton ("BROWSE SAVE");
	private JButton buttonHelp = new JButton("HELP");

	private JTextArea taMainText = new JTextArea(400,400);
	private JTextArea taMainText2 = new JTextArea(400,400);            

	private JTextField tfTagTitle = new JTextField("TI");
	private JTextField tfTagAbstract = new JTextField("AB");
	private JTextField tfTagSource = new JTextField("J2");
	private JTextField tfTagAdditional1 = new JTextField("Add 1");
	private JTextField tfTagAdditional2 = new JTextField("Add 2");
	private JTextField tfTagAdditional3 = new JTextField("Add 3");
	private JTextField tfTagAdditional4 = new JTextField("Add 4");
	private JTextField tfTagAdditional5 = new JTextField("Add 5"); 
	private JTextField tfTagTitleR = new JTextField("TI");
	private JTextField tfTagAbstractR = new JTextField("AB");
	private JTextField tfTagSourceR = new JTextField("J2");
	private JTextField tfTagAdditionalR1 = new JTextField("Add 1");
	private JTextField tfTagAdditionalR2 = new JTextField("Add 2");
	private JTextField tfTagAdditionalR3 = new JTextField("Add 3");
	private JTextField tfTagAdditionalR4 = new JTextField("Add 4");
	private JTextField tfTagAdditionalR5 = new JTextField("Add 5");
	private JTextField tfBrowsedFile = new JTextField();
	private JTextField tfBrowsedFile2 = new JTextField();
	private JTextField tfBrowsedPlace = new JTextField();
	private JTextField tfEndTag = new JTextField("ER");

	private JCheckBox cbShow1 = new JCheckBox ("Show Completely Irrelevant",true);
	private JCheckBox cbShow2 = new JCheckBox ("Show Further Researching",false);
	private JCheckBox cbShow3 = new JCheckBox ("Show Review",false);


	private JLabel label1 = new JLabel("1. Please browse these three files");
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel("4. Please choose your end-tag");
	private JLabel label5 = new JLabel();
	private JLabel label6 = new JLabel("6. Press RUN and then CONTINUE");

	private String text = "";
	private String temp=""; 
	private String tempSave = "";
	private String phrases ="";
	private String phrases2 = "";
	private String checkingWord="";
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
	private String subStr = "";
	private String checking;
	private String word = "";
	private String SVec="";
	private String catchCategory="";
	private String textWithoutCat ="";           
	private String longWord ="";
	private String allText;
	private String allKeyword;

	private int nextParagraph;
	private int i=0;
	private int value;
	private int amount;
	private int valueChoose;               
	private int score=0;
	private int zaehler = 0;   
	private int counterPhrases=0;
	private int counterPhrasesatEnd = 0;
	private int questionmarkKiller = 1;

	private Hashtable wordScore = new Hashtable();

	private Vector vStrings = new Vector();
	private Vector vABWords = new Vector();
	private Vector vTIWords = new Vector();
	private Vector vJ2Words = new Vector();
	private Vector vRevABWords = new Vector();
	private Vector vRevTIWords = new Vector();
	private Vector vRevJ2Words = new Vector();
	private Vector vAdd1Words = new Vector();
	private Vector vAdd2Words = new Vector();
	private Vector vAdd3Words = new Vector();
	private Vector vAdd4Words = new Vector();
	private Vector vAdd5Words = new Vector();
	private Vector vRevAdd1Words = new Vector();
	private Vector vRevAdd2Words = new Vector();
	private Vector vRevAdd3Words = new Vector();
	private Vector vRevAdd4Words = new Vector();
	private Vector vRevAdd5Words = new Vector();               
	private Vector vectorWords = new Vector();

	private Boolean leave2 = false;
	private Boolean leave1 = false;
	private Boolean leave3 = false;
	private Boolean leave4 = false;
	private Boolean leave5 = false;
	private Boolean leave6 = false;
	private Boolean leave7 = false;
	private Boolean leave8 = false;
	private Boolean leave9 = false;
	private Boolean leave10 = false;
	private Boolean leave11 = false;
	private Boolean leave12 = false;
	private Boolean leave13 = false;
	private Boolean leave14 = false;
	private Boolean leave15 = false;
	private Boolean leave16 = false;
	private Boolean leave17= false;
	private Boolean leave18 = false;
	private Boolean leave19 = false; 
	private Boolean checkedRev = false;
	private Boolean runCompleted = false;
	private Boolean checked = false;

	private JFileChooser fc = new JFileChooser("C:/Users/mczfs/Desktop");
	private JFileChooser fc2 = new JFileChooser("C:/Users/mczfs/Desktop");
	private JFileChooser fs = new JFileChooser("C:/Users/mczfs/Desktop");

	private File file;
	private File file2;
	private File fileSave;
	private File desktopOpen1;
	private File desktopOpen2;
	private File desktopOpen3;         

	private JOptionPane optionPane = new JOptionPane();


	public FrameIrrelevant()
	{
		init();
	}

	private void init()
	{
		this.setSize(new Dimension(980,504));
		this.setTitle("Screening");
		this.setLocation(200,250);

		panel.setLayout(null);

		taMainText.setBounds(600,160,200,200);
		taMainText2.setBounds(20,160,550,500);

		buttonRun.setBounds(410,330,120,60);
		buttonContin.setBounds(845,350,100,30);
		buttonBack.setBounds(20,350,100,30);
		buttonBrowsePlace.setBounds(655,40,145,30);
		buttonBrowseKeywords.setBounds(330,40,160,30);
		buttonBrowseText.setBounds(20,40,145,30);
		buttonHelp.setBounds(428,417,80,30);

		tfBrowsedPlace.setBounds(805,40,140,30);
		tfBrowsedFile2.setBounds(495,40,140,30);  
		tfBrowsedFile.setBounds(170,40,140,30);
		tfTagAbstract.setBounds(20,140,160,30);
		tfTagTitle.setBounds(20,180,160,30);
		tfTagSource.setBounds(20,220,160,30);
		tfTagAdditional1.setBounds(20,260,160,30);
		tfTagAdditional2.setBounds(190,140,160,30);
		tfTagAdditional3.setBounds(190,180,160,30);
		tfTagAdditional4.setBounds(190,220,160,30);
		tfTagAdditional5.setBounds(190,260,160,30);
		tfTagAbstractR.setBounds(380, 140,160,30);
		tfTagTitleR.setBounds(380,180,160,30);
		tfTagSourceR.setBounds(380,220,160,30);
		tfTagAdditionalR1.setBounds(380,260,160,30);
		tfTagAdditionalR2.setBounds(550,140,160,30);
		tfTagAdditionalR3.setBounds(550,180,160,30);
		tfTagAdditionalR4.setBounds(550,220,160,30);
		tfTagAdditionalR5.setBounds(550,260,160,30);
		tfEndTag.setBounds(735,140,100,30);
		tfBrowsedFile.setEditable(false);
		tfBrowsedFile2.setEditable(false);
		tfBrowsedPlace.setEditable(false);

		cbShow1.setBounds(735,225,200,30);
		cbShow2.setBounds(735,255,200,30);
		cbShow3.setBounds(735,285,200,30);

		label1.setBounds(20,1,250,50);
		label2.setBounds(20,90,250,50);
		label3.setBounds(380,90,250,50);
		label4.setBounds(740,90,200,50);
		label5.setBounds(740,180,250,50);                             
		label6.setBounds(380,290,250,50);

		taMainText.setEditable(false);
		taMainText.setVisible(false);
		taMainText2.setVisible(false);

		try 
		{


			Image imageButtonRun = ImageIO.read(getClass().getResource("playSmall.png"));
			buttonRun.setIcon(new ImageIcon(imageButtonRun));

			//pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("screeningMedium.jpg"))); 
		} 
		catch (IOException ex) 
		{

		}

		tfTagAbstract.setHorizontalAlignment(JTextField.CENTER);
		tfTagTitle.setHorizontalAlignment(JTextField.CENTER);
		tfTagSource.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditional1.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditional2.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditional3.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditional4.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditional5.setHorizontalAlignment(JTextField.CENTER);
		tfTagAbstractR.setHorizontalAlignment(JTextField.CENTER);
		tfTagTitleR.setHorizontalAlignment(JTextField.CENTER);
		tfTagSourceR.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditionalR1.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditionalR2.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditionalR3.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditionalR4.setHorizontalAlignment(JTextField.CENTER);
		tfTagAdditionalR5.setHorizontalAlignment(JTextField.CENTER);

		label2.setText("<html><body>2. Please enter the tags you want to search for irrelevant keywords</body></html>");
		label3.setText("<html><body>3. Please enter the tags you want to search for review keywords</body></html>");
		label5.setText("<html><body>5. Please choose which file you want to look at after pressing RUN</body></html>");

		buttonRun.addActionListener(this);
		buttonContin.addActionListener(this);
		buttonBack.addActionListener(this);
		buttonBrowseText.addActionListener(this);
		buttonBrowseKeywords.addActionListener(this);
		buttonBrowsePlace.addActionListener(this);
		buttonHelp.addActionListener(this);

		panel.add(buttonRun);
		panel.add(buttonContin);
		panel.add(taMainText);
		panel.add(taMainText2);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(cbShow1);
		panel.add(cbShow2);
		panel.add(cbShow3);
		panel.add(tfTagSource);
		panel.add(tfTagAbstract);
		panel.add(tfTagTitle);                     
		panel.add(tfTagAdditional1);
		panel.add(tfTagAdditional2);
		panel.add(tfTagAdditional3);
		panel.add(tfTagAdditional4);
		panel.add(tfTagAdditional5);
		panel.add(tfTagTitleR);
		panel.add(tfTagSourceR);
		panel.add(tfTagAbstractR);
		panel.add(tfTagAdditionalR1);
		panel.add(tfTagAdditionalR2);
		panel.add(tfTagAdditionalR3);
		panel.add(tfTagAdditionalR4);
		panel.add(tfTagAdditionalR5); 
		panel.add(tfBrowsedFile);
		panel.add(tfBrowsedFile2);
		panel.add(tfBrowsedPlace);
		panel.add(tfEndTag);
		panel.add(buttonBrowseText);
		panel.add(buttonBrowseKeywords);
		panel.add(buttonBrowsePlace);               
		panel.add(buttonBack);
		panel.add(buttonHelp);                                


		this.setContentPane(panel);
	}


	public void actionPerformed(ActionEvent evt)
	{
		Object src = evt.getSource();


		if (src == buttonBack) // if Button "back" is pressed
		{
			this.dispose();
			FrameStart start = new FrameStart(); //go back to the start frame
			start.validate();
			start.setVisible(true);

		}


		if(src == buttonHelp)
		{
			FrameHelpRelevant fr = new FrameHelpRelevant();
			fr.setVisible(true);
			fr.validate();


		}

		if (src == buttonContin) 
		{
			/*if(runCompleted == false)
                                                {
                                                                optionPane.showMessageDialog(this,"Please do screening first",
                                                                                                "ERROR", JOptionPane.ERROR_MESSAGE);
                                                }
                                                else
                                                {*/
			FrameRelevant frame = new FrameRelevant();
			frame.setVisible(true);
			frame.validate();
			this.dispose();
		}

		//}


		if (src == buttonBrowsePlace)
		{
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Textfile", "txt");
			fs.setFileFilter(filter);
			fs.showSaveDialog(this);

			try 
			{
				// Open an input stream
				fileSave = fs.getSelectedFile();                                 
				tfBrowsedPlace.setText(fileSave.getPath());
			}

			catch (Exception ex)                 
			{
				if(tfBrowsedPlace.getText().equals("")) 
				{

				}
				else // if there is an error while saving
				{
					final JOptionPane pane = new JOptionPane("Error in your saving path: "+ex.toString());  //open this error pop-up window
					final JDialog d = pane.createDialog((JFrame)null, "ERROR");
					d.setLocation(525,430);
					d.setVisible(true);
				}
			}
		}


		if (src==buttonBrowseText)
		{       
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Textfile", "txt");
			fc.setFileFilter(filter);
			fc.showOpenDialog(null);

			try 
			{
				// Open an input stream
				file = fc.getSelectedFile();      
				tfBrowsedFile.setText(file.getPath());    //set the text of tfBrowsedFile to the selected path 
				allText = new Scanner( file, "UTF-8").useDelimiter("\\A").next().toString();    //save the text from the file in the string "allText"

				taMainText.setText(allText);    //copy the text of the string "allText" into the invisible text area "taMainText"
			}

			catch (Exception ex)
			{
				if(tfBrowsedFile.getText().equals(""))
				{

				}
				else
				{
					final JOptionPane pane = new JOptionPane("Error while browsing text: "+ ex.toString());  //if there is an error while getting the text, bring this error window.
					final JDialog d = pane.createDialog((JFrame)null, "ERROR");
					d.setLocation(525,430);
					d.setVisible(true);
				}
			}
		}


		if (src==buttonBrowseKeywords)    //if the button browseKeyword was pressed...
		{
			FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Textfile", "txt");   //filter, only textfiles
			fc2.setFileFilter(filter2);  
			fc2.showOpenDialog(null);                // open a window to choose the keyword file


			try 
			{
				// Open an input stream
				file2 = fc2.getSelectedFile();
				tfBrowsedFile2.setText(file2.getPath());    //set the text of tfBrowsedFile2 to the selected path 
				allKeyword = new Scanner(file2).useDelimiter("\\A").next().toString();

				taMainText2.setText(allKeyword);   //copy the text of the string "allKeyword" into the invisible text area "taMainText2"

				String [] linesKeywords = taMainText2.getText().split("\n");
				System.out.println("text: "+taMainText2.getText());
				System.out.println(linesKeywords.length);
				String tester="";

				for(int l=0;l<linesKeywords.length;l++)     
				{        
					System.out.println("das ist linesK: "+linesKeywords[l]);
					try
					{
						tester = linesKeywords[l];						
						System.out.println("Tester: "+tester.substring(tester.length()-2,tester.length()-1));
					}
					catch(Exception e)
					{
						tester = "ghdhahwhbf";
					}


					if(linesKeywords[l].contains("\""))
					{
						String sTemp1="";
						int le = linesKeywords[l].length();
						if(tester.substring(tester.length()-2,tester.length()-1).equals("\""))
						{
							sTemp1 = linesKeywords[l].trim().substring(1,le-2);
						}
						else
						{
							sTemp1 = linesKeywords[l].trim().substring(1,le-1);
						}

						sTemp1 = sTemp1+"^#";
						//  System.out.println("das ist string: "+sTemp1);
						linesKeywords[l] = sTemp1;
						//  System.out.println("das ist lines: "+linesKeywords[l]);
					}


					if(linesKeywords[l].substring(0,1).equals("*"))
					{
						int le = linesKeywords[l].length();
						String sTemp2 = linesKeywords[l].substring(1,le);

						sTemp2 = "~#"+sTemp2;
						System.out.println("das ist string1: "+sTemp2);
						linesKeywords[l] = sTemp2;
						System.out.println("das ist lines1: "+linesKeywords[l]);
					}

					else if(tester.substring(tester.length()-2,tester.length()-1).trim().equals("*"))  // * at the end
					{

						linesKeywords[l] = linesKeywords[l].substring(0,linesKeywords[l].length()-2); 
						System.out.println("das ist singleWord: "+linesKeywords[l]);

					}

					else if(!linesKeywords[l].contains("*") && !linesKeywords[l].contains("\"") && !linesKeywords[l].trim().contains(" ") && !linesKeywords[l].substring(0,1).trim().equals("-")) 
					{
						String sTemp1=linesKeywords[l];

						sTemp1 = sTemp1+"^#";
						System.out.println("das ist string: "+sTemp1);
						linesKeywords[l] = sTemp1;
						//  System.out.println("das ist lines: "+linesKeywords[l]);
					}


					if(linesKeywords[l].trim().equals(""))     
					{                                        
						l = l+1;
					}

					if(linesKeywords[l].trim().equalsIgnoreCase("-Title-"))  //if there is line which is called Title, then leave4 = true
					{                                        
						leave4 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-Abstract-")) //if there is line which is called Abstract, then leave5 = true
					{
						leave4 = false;

						leave5 = true;
						System.out.println("in Abstract Dinna, true");
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-Source-")) //if there is line which is called Source, then leave6 = true
					{
						leave5 = false;
						leave6 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewTitle-"))    //if there is line which is called ReviewTitle, then leave7 = true
					{
						leave6 = false;
						leave7 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewSource-"))    //if there is line which is called ReviewSource, then leave8 = true
					{
						leave7 = false;
						leave8 = true;
						l = l+1;                                        
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewAbstract-")) //if there is line which is called ReviewAbstract, then leave9 = true
					{
						System.out.println("In ReviewAbstract dinna");
						leave8 = false;
						leave9 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-AddedTag1-")) //if there is line which is called Abstract, then leave5 = true
					{
						System.out.println("in Added Tag 1");
						leave9 = false;
						leave10 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-AddedTag2-")) //if there is line which is called Source, then leave6 = true
					{
						leave10 = false;
						leave11 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-AddedTag3-"))    //if there is line which is called ReviewTitle, then leave7 = true
					{
						leave11 = false;
						leave12 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-AddedTag4-"))    //if there is line which is called ReviewSource, then leave8 = true
					{
						leave12 = false;
						leave13 = true;
						l = l+1;                                        
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-AddedTag5-")) //if there is line which is called ReviewAbstract, then leave9 = true
					{
						leave13 = false;
						leave14 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewAddedTag1-")) //if there is line which is called Abstract, then leave5 = true
					{      
						System.out.println("in Added Tag 1");
						leave14 = false;
						leave15 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewAddedTag2-")) //if there is line which is called Source, then leave6 = true
					{
						System.out.println("in Added Review Tag 2");
						leave15 = false;
						leave16 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewAddedTag3-"))    //if there is line which is called ReviewTitle, then leave7 = true
					{
						leave16 = false;
						leave17 = true;
						l = l+1;
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewAddedTag4-"))    //if there is line which is called ReviewSource, then leave8 = true
					{
						leave17 = false;
						leave18 = true;
						l = l+1;                                        
					}
					else if(linesKeywords[l].trim().equalsIgnoreCase("-ReviewAddedTag5-")) //if there is line which is called ReviewAbstract, then leave9 = true
					{
						leave18 = false;
						leave19 = true;
						l = l+1;
					}

					System.out.println("leave16: "+leave16);



					if (leave4 == true)      
					{                                          
						vTIWords.addElement(linesKeywords[l]);   //add all Title Words into the Vector TIWords
						System.out.println("linesKeywords: "+linesKeywords[l]);
					}
					if (leave5 == true)
					{                                        
						vABWords.addElement(linesKeywords[l]);          //add all Abstract Words into the Vector ABWords

					}
					if (leave6 == true)
					{                                        
						vJ2Words.addElement(linesKeywords[l]);             //add all Source Words into the Vector J2Words
					}
					if (leave7 == true)
					{                                        

						vRevTIWords.addElement(linesKeywords[l]);              //add all RevTitle Words into the Vector RevTiWords
					}
					if (leave8 == true)
					{                                        
						vRevJ2Words.addElement(linesKeywords[l]);              //add all RevSource Words into the Vector RevJ2Words
					}
					else if (leave9 == true)
					{
						vRevABWords.addElement(linesKeywords[l]);              //add all RevAbstract Words into the Vector RevABWords
					} 
					if (leave10 == true)      
					{        

						vAdd1Words.addElement(linesKeywords[l]);   //add all Title Words into the Vector TIWords
					}
					if (leave11 == true)
					{                                        
						vAdd2Words.addElement(linesKeywords[l]);               //add all Abstract Words into the Vector ABWords
					}
					if (leave12 == true)
					{                                        
						vAdd3Words.addElement(linesKeywords[l]);                  //add all Source Words into the Vector J2Words
					}
					if (leave13 == true)
					{                                        
						vAdd4Words.addElement(linesKeywords[l]);        //add all RevTitle Words into the Vector RevTiWords
					}
					if (leave14 == true)
					{                                        
						vAdd5Words.addElement(linesKeywords[l]);        //add all RevSource Words into the Vector RevJ2Words
					}
					if (leave15 == true)
					{
						vRevAdd1Words.addElement(linesKeywords[l]);            //add all RevAbstract Words into the Vector RevABWords
					}
					if (leave16 == true)
					{

						System.out.println("in vector add2 dinna else "+ linesKeywords[l]);
						vRevAdd2Words.addElement(linesKeywords[l]);            //add all RevAbstract Words into the Vector RevABWords

					} 
					if (leave17 == true)
					{
						vRevAdd3Words.addElement(linesKeywords[l]);            //add all RevAbstract Words into the Vector RevABWords
					} 
					if (leave18 == true)
					{
						vRevAdd4Words.addElement(linesKeywords[l]);            //add all RevAbstract Words into the Vector RevABWords
					} 
					if (leave19 == true)
					{
						vRevAdd5Words.addElement(linesKeywords[l]);            //add all RevAbstract Words into the Vector RevABWords
					}                          

				}

			}

			catch (Exception exc)
			{

				if(tfBrowsedFile2.getText().equals(""))
				{

				}
				else
				{
					final JOptionPane pane = new JOptionPane("Error while browsing Keywords: "+ exc.toString());
					final JDialog d = pane.createDialog((JFrame)null, "ERROR");
					d.setLocation(525,430);
					d.setVisible(true);   
					exc.printStackTrace();
				}
			}
		}                                



		if(src==buttonRun)  // run-method
		{
			if(tfBrowsedFile.getText().equals("")||tfBrowsedFile2.getText().equals("") || tfBrowsedPlace.getText().equals("") )  // error notice: if files are empty
			{
				optionPane.showMessageDialog(this,"Please select all the 3 files necessary to start the screening!",
						"ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else if (tfTagAbstract.getText().length() > 5 || tfTagTitle.getText().length() > 5 || tfTagSource.getText().length() > 5 ||
					tfTagAdditional1.getText().length() > 5 || tfTagAdditional2.getText().length() > 5 || tfTagAdditional3.getText().length() > 5 ||
					tfTagAdditional4.getText().length() > 5 || tfTagAdditional5.getText().length() > 5)                                                                               // error notice: if the length of the tags is more than 5
			{
				final JOptionPane pane = new JOptionPane("Please control your tags in the text fields! They should have maximally 5 characters");
				final JDialog d = pane.createDialog((JFrame)null, "ERROR");
				d.setLocation(525,430);
				d.setVisible(true);
			}
			/*else if(tfTagAbstract.getText().equals("") && tfTagTitle.getText().equals("")  && tfTagSource.getText().equals("")  && tfTagAdditional1.getText().equals("")
                                                                                && tfTagAdditional2.getText().equals("") && tfTagAdditional3.getText().equals("") && tfTagAdditional4.getText().equals("")
                                                                                && tfTagAdditional5.getText().equals(""))
                                                {
                                                                final JOptionPane pane = new JOptionPane("All your tags-text-fields are empty! Please enter at least one tag!");
                                                                final JDialog d = pane.createDialog((JFrame)null, "NOTE");
                                                                d.setLocation(450,430);
                                                                d.setVisible(true);
                                                }*/
			else if(runCompleted ==true)
			{
				final JOptionPane pane = new JOptionPane("You have already pressed the RUN-Button. Please press continue");
				final JDialog d = pane.createDialog((JFrame)null, "NOTE");
				d.setLocation(450,430);
				d.setVisible(true);
			}
			else                // if everything is all right...
			{
				runCompleted = true;
				Vector test = new Vector();                     // just for testing reasons
				questionmarkKiller = 1;  

				source = tfTagSource.getText()+"  -";                // get the tags entered and save them in the variables
				title = tfTagTitle.getText()+"  -";
				abstr = tfTagAbstract.getText()+"  -";
				additional1 = tfTagAdditional1.getText()+"  -";
				additional2 = tfTagAdditional2.getText()+"  -";
				additional3 = tfTagAdditional3.getText()+"  -";
				additional4 = tfTagAdditional4.getText()+"  -";
				additional5 = tfTagAdditional5.getText()+"  -";                       


				try           
				{
					FileOutputStream fos1 = new FileOutputStream(tfBrowsedPlace.getText()+"CompletelyNotRelevant.txt");
					FileOutputStream fos3 = new FileOutputStream(tfBrowsedPlace.getText()+"Review.txt");
					FileOutputStream fos4 = new FileOutputStream(tfBrowsedPlace.getText()+"FurtherResearching.txt");


					PrintWriter PWNotRelev = new PrintWriter(new OutputStreamWriter(fos1));
					PrintWriter PWReview = new PrintWriter(new OutputStreamWriter(fos3));
					PrintWriter PWFurtherSearching = new PrintWriter(new OutputStreamWriter(fos4));               // create printwriters based on the outputstreams

					// copy the whole text from the text area into an array, whereby every line gets an own index

					String [] linesWhole = taMainText.getText().split("\n");                                   // Text aus  TextArea lesen
					String u = "";
					for(int d=0;d<linesWhole.length;d++)
					{

						int x = linesWhole.length;
						try                                             // try to get the first 2 characters; if failed -> use c| (just randomly choosen like this)
						{
							u = linesWhole[d].substring(0,2);
						}
						catch (Exception e)
						{
							u="c|";
						}

						if(u.equals(tfEndTag.getText()))                       // if the tag is ER -> insert |||| as a stopping sign for the algorithm and increase d with one
						{
							vectorWords.addElement(linesWhole[d]);
							vectorWords.addElement("||||");
							d = d+1;
						}
						else                              // else add it to the vector
						{
							vectorWords.addElement(linesWhole[d]);
						}

					}
					// logic of the algorithm: every line of the records are saved into the vector. Then every line (which has its own index) is read by the algorithm
					// through analysing every character and adding them to a word (if the first 5 characters equals any of the 5 one entered by the user
					// If there is a " " the word is finished and will be checked. When the line is |||| the record is at an end and the saving process will start.
					// Afterwards the program will get to the next paragraph

					for(int a=0;a<50000;a++)                          // quantity of paragraphs (because it is easier it was just set to this number                                                                     
					{
						nextParagraph = i;                    // to start the new paragraph / record                                                                           
						vStrings.clear();
						leave1 = false;
						leave2 = false;
						leave3 = false;
						checked = false;
						checkedRev = false;
						// refresh some variables for each record

						for(i=nextParagraph;i<vectorWords.size();i++)                                 // get the lines from the array until there is a break
						{
							vStrings.add((String)vectorWords.elementAt(i));                                          // add the line to another vector

							if (vectorWords.elementAt(i).toString().equals("||||"))                                      // as soon as there is "||||" (which is after "ER  -") -> saving should be done                        // sobald eine leere Zeile kommt..
							{
								leave1 = true;
							}

							if (leave1==true)
							{
								if(leave2 == true)                                     // as soon as everything is saved, refresh some variables and go to the next paragraph
								{                                                           
									checked = false;
									checkedRev = false;
									leave2 = false;
									leave1 = false;
									leave3 = false;

									break;                                                                        // go to the next paragraph / record
								}

								try
								{
									for(int h=0;h<vStrings.size();h++)                   // get every line out of the vector and save it in the String SVec
									{                                                  
										leave2 = true;
										SVec =(String)vStrings.elementAt(h);

										if (SVec.equals("||||"))                 // because this sign means end of the text -> in the saved file it should just be " "
										{
											SVec = "\n";
										}

										if(questionmarkKiller == 1)
										{    
											SVec = SVec.substring(1, SVec.length()-1); 
											questionmarkKiller = questionmarkKiller+1;                                                       
										}
										if (checked == true && checkedRev == false)               // save the lines whether it is a review (as soon as there is the word review in the text it should be saved to review file), needs further researching or is irrelevant
										{
											PWNotRelev.println(SVec+"\n");                                                                         
										}
										else if(checkedRev == true && checked == false)
										{
											PWReview.println(SVec+"\n");                                                                           
										}
										else if (checkedRev == true && checked == true)
										{
											PWReview.println(SVec+"\n");                                                                           
										}
										else
										{
											PWFurtherSearching.println(SVec+"\n");                                                                          
										}
									}

								}


								catch (Exception e)               // error message while saving
								{
									final JOptionPane pane = new JOptionPane("Error while saving to files: "+ e.toString());
									final JDialog d = pane.createDialog((JFrame)null, "ERROR");
									d.setLocation(525,430);
									d.setVisible(true);
									e.printStackTrace();
								}
							}

							else                      // if it is not the end..
							{
								try 
								{                                                                                   
									substring = (String)vectorWords.elementAt(i);                     
									subStr = substring.substring(0,5);       // get the first 5 characters of the line
								}
								catch (Exception e)
								{
									subStr = "abcde";                                // if it is not possible just add some useless characters because then the line itself is useless
								}


								// if the substring equals one of the entered tags the user has entered the line needs to be checked for the keywords...

								if (subStr.equals(abstr) || subStr.equals(title) || subStr.equals(source)|| subStr.equals(additional1)
										|| subStr.equals(additional2) || subStr.equals(additional3) || subStr.equals(additional4)
										|| subStr.equals(additional5) || subStr.substring(0,2).equals(tfTagTitleR.getText()) || subStr.substring(0,2).equals(tfTagSourceR.getText())
										|| subStr.substring(0,2).equals(tfTagAbstractR.getText())|| subStr.substring(0,2).equals(tfTagAdditionalR1.getText())  || subStr.substring(0,2).equals(tfTagAdditionalR2.getText())  || subStr.substring(0,2).equals(tfTagAdditionalR3.getText())
										|| subStr.substring(0,2).equals(tfTagAdditionalR4.getText())  || subStr.substring(0,2).equals(tfTagAdditionalR5.getText())) 
								{                                                      
									counterPhrasesatEnd = 0;
									for(int l=0;l<100000;l++)                                                         // so now get the words to check them with the keywords
									{            

										try
										{
											checking = substring.substring(l,l+1);                 //checking is every letter of the line as long as there is one..
										}
										catch (Exception e)
										{
											break;                                                         // if not it is the end of the line -> break                                                                                                // dann springe hier rein und beende die Schleife
										}

										if (checking.equals(" "))                                                       // if there is a blank -> next word needs to start -> reset everything
										{
											counterPhrasesatEnd=counterPhrasesatEnd+1;
											if(counterPhrases%2 == 0)
											{
												phrases = "";
												phrases2 = phrases2.trim() + word.trim();
												phrases = phrases.trim() + word.trim();
											}
											else
											{
												phrases2 = "";
												phrases2 = phrases2.trim() + word.trim();
												phrases = phrases.trim() + word.trim();

											}

											word = "";                                                         // word is getting empty because next word starts after this 
											counterPhrases = counterPhrases + 1;
										}
										else
										{


											counterPhrasesatEnd = counterPhrasesatEnd+1;
											word = word.trim() + checking.trim();                                // add the characters to the variable "word" (which consists of the characters which have already been collected or is empty)

											String q =(String)vectorWords.elementAt(i);

											if(counterPhrasesatEnd == q.length())
											{
												if(counterPhrases%2 == 0)
												{
													phrases = phrases2+word;
												}
												else
												{
													phrases2 = phrases+word;
												}

											}


											if(subStr.equals(abstr))   // from here on it is the same for every line, just depending in which line we are at the moment: if the line we are in is abstract
											{

												for(int x=0;x<vABWords.size();x++)  // get the words from the abstract vector
												{
													word.trim();
													longWord = (String)vABWords.elementAt(x);

													System.out.println("das ist longWord Abstract: "+longWord);

													if(longWord.contains("^#"))
													{

														try
														{

															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{

																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna danach, longWord: "+longWord +"nextChar "+nextChar);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))

															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vABWords.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}



													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))                        // if word is one of the keywords or phrases or phrases2; the last requirement is to make sure nothing is counted double, 
														// e.g. when it is a phrase (random controlled) and a word (e.g. random) in the list
													{
														System.out.println(word + "= word "+ longWord + "=longword" + phrases +"= phrases "+ phrases2 +"= phrases2");
														System.out.println("test erfolgreich Abstract");

														checked = true;                                                  // checked = true -> decides were to save the record
														break;
													}

													if (counterPhrases%2 == 0)            // phrases needs to be cleared here
													{
														phrases = "";
													}
												}
											}

											if(subStr.substring(0,2).equalsIgnoreCase(tfTagAbstract.getText()))                     // from here on it is the same for every line, just depending in which line we are at the moment: if the line we are in is abstract
											{
												for(int x=0;x<vRevABWords.size();x++)                   // this is just the same, only with the review vector (so if the word review is inside the record -> record will be saved in review)
												{
													longWord = (String)vRevABWords.elementAt(x);

													if(longWord.contains("^#"))
													{



														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) || (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))

															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevABWords.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}



													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														// System.out.println("test erfolgreich");
														checkedRev = true;
														break;
													}
												}


												if (counterPhrases%2 == 0)            // phrases needs to be cleared here
												{
													phrases = "";
												}

											}

											// END ABSTRACT

											if(subStr.equals(title))          // this is just the same as in above, only when it is in the tag title
											{


												for(int x=0;x<vTIWords.size();x++)
												{
													//   System.out.println("awdwadawdawdaw "+ word);

													word.trim();
													longWord = (String)vTIWords.elementAt(x);


													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("Title, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																System.out.println("in if schleife dinna, longWord 1: "+longWord);
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord 2: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) || (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))

															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vTIWords.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														System.out.println(word + "= word "+ longWord + "=longword" + phrases +"= phrases "+ phrases2 +"= phrases2");
														System.out.println("test erfolgreich title");
														checked = true;
														break;
													}
												}
											}

											if(subStr.substring(0,2).equalsIgnoreCase(tfTagTitleR.getText())) 
											{

												for(int x=0;x<vRevTIWords.size();x++)
												{

													longWord = (String)vRevTIWords.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);




															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))

															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevTIWords.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}



													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{

														checkedRev = true;
														break;
													}
												}


												if (counterPhrases%2 == 0)
												{
													phrases = "";
												}  
											}
											// END TITLE

											if(subStr.equals(source))
											{
												for(int x=0;x<vJ2Words.size();x++)
												{
													word.trim();
													longWord = (String)vJ2Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vJ2Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														checked = true;
														break;
													}
												}
											}

											if(subStr.substring(0,2).equalsIgnoreCase(tfTagSourceR.getText())) 
											{
												for(int x=0;x<vRevJ2Words.size();x++)
												{
													longWord = (String)vRevJ2Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevJ2Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}



													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														//  System.out.println("test erfolgreich");
														checkedRev = true;
														break;
													}
												}

												if (counterPhrases%2 == 0)
												{
													phrases = "";
												}

											}
											// END SOURCE

											if(subStr.equals(additional1))
											{
												for(int x=0;x<vAdd1Words.size();x++)
												{
													word.trim();
													longWord = (String)vAdd1Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vAdd1Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														checked = true;
														break;
													}
												}
											}

											if(subStr.substring(0,2).trim().equalsIgnoreCase(tfTagAdditionalR1.getText().trim())) 
											{
												System.out.println("in Add1 rev dinna");

												for(int x=0;x<vRevAdd1Words.size();x++)
												{
													System.out.println("in Add1 for schleife rev dinna");

													longWord = (String)vRevAdd1Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevAdd1Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}



													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														//  System.out.println("test erfolgreich");
														checkedRev = true;
														break;
													}
												}

												if (counterPhrases%2 == 0)
												{
													phrases = "";
												}


											}// END ADD 1

											if(subStr.equals(additional2))
											{
												System.out.println("in additional 2, run dinna");

												for(int x=0;x<vAdd2Words.size();x++)
												{

													longWord = (String)vAdd2Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vAdd2Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.trim().equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														checked = true;
														break;
													}
												}
											}

											if(subStr.substring(0,2).equalsIgnoreCase(tfTagAdditionalR2.getText())) 
											{                                                                                  
												for(int x=0;x<vRevAdd2Words.size();x++)
												{
													longWord = (String)vRevAdd2Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevAdd2Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}
													System.out.println("in rev 2 add "+word +"phr "+"phr2 "+phrases2);                                                                       


													if(word.trim().equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord.trim()) && !longWord.trim().equalsIgnoreCase(wordInList.trim()))
													{
														//  System.out.println("test erfolgreich");
														System.out.println("in additional 2, RevAdd2, for + if-Schleife dinna " + word + "phr "+phrases + " phr2 "+phrases2);
														checkedRev = true;
														break;
													}
												}

												if (counterPhrases%2 == 0)
												{
													phrases = "";
												}

											}
											// END ADD 2


											if(subStr.equals(additional3))
											{
												for(int x=0;x<vAdd3Words.size();x++)
												{
													word.trim();
													longWord = (String)vAdd3Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vAdd3Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														checked = true;
														break;
													}
												}
											}

											if(subStr.substring(0,2).equalsIgnoreCase(tfTagAdditionalR3.getText()))
											{
												for(int x=0;x<vRevAdd3Words.size();x++)
												{
													longWord = (String)vRevAdd3Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevAdd3Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}



													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														//  System.out.println("test erfolgreich");
														checkedRev = true;
														break;
													}
												}

												if (counterPhrases%2 == 0)
												{
													phrases = "";
												}

											} 
											// END ADD 3

											if(subStr.equals(additional4))
											{
												for(int x=0;x<vAdd4Words.size();x++)
												{

													word.trim();
													longWord = (String)vAdd4Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vAdd4Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														checked = true;
														break;
													}
												}
											}

											if(subStr.substring(0,2).equalsIgnoreCase(tfTagAdditionalR4.getText()))
											{
												for(int x=0;x<vRevAdd4Words.size();x++)
												{
													longWord = (String)vRevAdd4Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevAdd4Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}



													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														//  System.out.println("test erfolgreich");
														checkedRev = true;
														break;
													}
												}

												if (counterPhrases%2 == 0)
												{
													phrases = "";
												}

											}
											// END ADD 4


											if(subStr.equals(additional5))
											{
												for(int x=0;x<vAdd5Words.size();x++)
												{
													word.trim();
													longWord = (String)vAdd5Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vAdd5Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}

													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														checked = true;
														break;
													}
												}
											}

											if(subStr.substring(0,2).equalsIgnoreCase(tfTagAdditionalR5.getText()))
											{
												for(int x=0;x<vRevAdd5Words.size();x++)
												{
													longWord = (String)vRevAdd5Words.elementAt(x);

													if(longWord.contains("^#"))
													{

														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															//System.out.println("Abstract, genaues Wort: das ist word:" +word+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);


															if(nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																	||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-")||endOfLine == (substring.indexOf(word)+word.length()))
															{
																longWord = longWord.substring(0,longWord.length()-2);
																System.out.println("in if schleife dinna, longWord: "+longWord);
															}
															else if(word.length()>longWord.length())
															{
																break;                                                                                                 
															}
														}
														catch(Exception e)
														{

														}

													}
													if(longWord.contains("~#"))
													{
														longWord = longWord.substring(2,longWord.length());


														try
														{
															int endOfLine=0;
															String nextChar = substring.substring(l+1,l+2);
															int temp = word.length()-longWord.length()+1;                                                                                                                                                                                                                                      
															endOfLine = substring.length()-1;
															System.out.println("das ist word:" +word+" word.substring: "+word.substring(temp,word.length())+" das ist nextChar: "+nextChar+" das ist longWord: "+longWord+"index: "+substring.indexOf(word)+" "+(substring.indexOf(word)+word.length())+" "+endOfLine);



															if(word.trim().substring(temp,word.length()).equals(longWord.trim()) && (endOfLine == (substring.indexOf(word)+word.length()) 
																	|| (nextChar.equalsIgnoreCase(" ") ||nextChar.equalsIgnoreCase(".") ||nextChar.equalsIgnoreCase(",")||nextChar.equalsIgnoreCase(":")
																			||nextChar.equalsIgnoreCase(";")||nextChar.equalsIgnoreCase("-"))))
															{
																//longWord = (String)vABWords.elementAt(x);
																//longWord=longWord.substring(2,longWord.length());
																longWord = word;
																System.out.println("longWord: dinna ===="+longWord);
															}
															else
															{
																longWord = (String)vRevAdd5Words.elementAt(x);
															}


														}
														catch(Exception e)
														{

														}


													}

													if (phrases.equals(""))              // this is just in case these variable are empty and then in the following if clause are equal to a blank
													{
														phrases = "^^##**";
													}
													if (phrases2.equals(""))
													{
														phrases2 = "^^##**";
													}
													if (word.equals(""))
													{
														word = "^^##**";
													}



													if(word.equalsIgnoreCase(longWord.trim()) || (phrases.trim().equalsIgnoreCase(longWord.trim())
															&& counterPhrases%2 ==0) || (phrases2.trim().equalsIgnoreCase(longWord.trim()) && counterPhrases%2 !=0)
															|| wordInList.contains(longWord) && !longWord.equalsIgnoreCase(wordInList))
													{
														//  System.out.println("test erfolgreich");
														checkedRev = true;
														break;
													}
												}

												if (counterPhrases%2 == 0)
												{
													phrases = "";
												}

											}      // END ADD 5



											// close the printwriters

										}

									}
								}
							}
						}
					}
					PWNotRelev.close();
					PWReview.close();
					PWFurtherSearching.close();      

					final JOptionPane pane = new JOptionPane("Files have been created sucessfully - Please click CONTINUE for further screening");             // tell the user the program is finished
					final JDialog d = pane.createDialog((JFrame)null, "PROCESS SUCCESSFUL");
					d.setLocation(525,430);
					d.setVisible(true);

				}



				catch (Exception e)               // error message
				{
					final JOptionPane pane = new JOptionPane("Error in run method: "+ e.toString());
					final JDialog d = pane.createDialog((JFrame)null, "ERROR");
					d.setLocation(525,430);
					d.setVisible(true);
					System.out.println(e);
					e.printStackTrace();
				}

				int gesamt=0;              // just for test reasons
				for(int i=0;i<test.size();i++)
				{
					int parse = (Integer)test.elementAt(i) ;
					if (parse > 20)
					{
						zaehler = zaehler+1;
					}

					if (parse < 100)
					{
						gesamt = gesamt+1;
					}

				}

				File foler = new File(".");

				try {

					if (cbShow1.isSelected())
					{
						desktopOpen1 = new File(fileSave.getPath()+"CompletelyNotRelevant.txt");

						Desktop desktop1 = null;
						if (Desktop.isDesktopSupported()) 
							desktop1 = Desktop.getDesktop();
						desktop1.open(desktopOpen1);      
					}
					if (cbShow2.isSelected())
					{
						desktopOpen2 = new File(fileSave.getPath()+"FurtherResearching.txt");

						Desktop desktop2 = null;
						if (Desktop.isDesktopSupported()) 
							desktop2 = Desktop.getDesktop();
						desktop2.open(desktopOpen2);
					}

					if (cbShow3.isSelected())
					{
						desktopOpen3 = new File(fileSave.getPath()+"Review.txt");                                                                                                   
						Desktop desktop3 = null;
						if (Desktop.isDesktopSupported()) 
							desktop3 = Desktop.getDesktop();
						desktop3.open(desktopOpen3);
					}

				} 

				catch (Exception e1) 
				{
					e1.printStackTrace();
				}

			}                     
			nextParagraph = -1;
			vStrings.clear();
		}
	}

	protected void processWindowEvent(WindowEvent e)
	{

		super.processWindowEvent(e);
		if(e.getID()==WindowEvent.WINDOW_CLOSING)
		{
			System.exit(0);

		}

	}


}









