


//COPIED OUT OF NETBEANS FROM REVMANHAL PROGRAM!!!

import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
import javax.swing.JSeparator;


public class SelfMadeHelpIrrelevant extends javax.swing.JFrame  
{

	private JScrollPane ScrollPane2 = new JScrollPane();
	private JScrollPane ScrollPane3 = new JScrollPane();
 private JPanel Panel1 = new JPanel();
 private JLabel jLabel1 = new JLabel();
 private JLabel jLabel2 = new JLabel();
 private JSeparator Separator1 = new JSeparator();
 private JLabel jLabel3 = new JLabel();
 private JLabel  jLabel4 = new JLabel();
 private JLabel  jLabel5 = new JLabel();
 private JLabel  jLabel6 = new JLabel();
 private JLabel  jLabel7 = new JLabel();
 private JLabel  jLabel8 = new JLabel();
 private JLabel  jLabel9 = new JLabel();
 private JLabel  jLabel10 = new JLabel();
 private JLabel  jLabel11 = new JLabel();      
 private JLabel  jLabel12 = new JLabel();
 private JLabel  jLabel13 = new JLabel();
 private JLabel  jLabel14 = new JLabel();
 private JLabel  jLabel15 = new JLabel();
 private JLabel  jLabel16 = new JLabel();
 private JLabel  jLabel18 = new JLabel();
 private JLabel  jLabel19 = new JLabel();
 private JLabel  jLabel20 = new JLabel();
 
	
	

 public SelfMadeHelpIrrelevant() 
 {
 	this.setSize(600,800);
 	this.setLocation(400,150);
     initComponents();
 }
                   
 private void initComponents() {

   Panel1.setLayout(null);
   
   jLabel1.setBounds(10,2,300,50);
   jLabel1.setHorizontalAlignment(JLabel.CENTER);
   jLabel2.setBounds(240,2,220,50);
   jLabel2.setHorizontalAlignment(JLabel.CENTER);
   jLabel3.setBounds(20,80,300,200);
   jLabel4.setBounds(20,320,500,600);
   jLabel5.setBounds(2,2,2,2); 
   jLabel10.setBounds(2,2,2,2);
   jLabel11.setBounds(2,2,2,2);
   jLabel13.setBounds(2,2,2,2);
   jLabel16.setBounds(2,2,2,2);
   
   ScrollPane2.setBounds(580,0,20,1000);
//   ScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
   ScrollPane2.setViewportView(Panel1);
   
   

   JPanel panel = new JPanel();
   
   panel.setSize(10,1000);
   panel.setLocation(580,0);
   panel.add(ScrollPane2);
     

    
     Panel1.add(jLabel1);
     Panel1.add(jLabel2);
     Panel1.add(jLabel3);
     Panel1.add(jLabel4);
     Panel1.add(jLabel5);
     Panel1.add(jLabel6);
     Panel1.add(jLabel7);
     Panel1.add(jLabel8);
     Panel1.add(jLabel9);
     Panel1.add(jLabel10);
     Panel1.add(jLabel11);
     Panel1.add(jLabel12);
     Panel1.add(jLabel13);
     Panel1.add(jLabel14);
     Panel1.add(jLabel15);
     Panel1.add(jLabel16);
     Panel1.add(jLabel18);
     Panel1.add(jLabel19);
     Panel1.add(jLabel20);
     
     
     this.setContentPane(Panel1);
   

     setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("ScreeningPick - Help");
     setResizable(false);

    
     Panel1.setBackground(new java.awt.Color(247, 247, 247));

     jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
     jLabel1.setForeground(new java.awt.Color(0, 0, 102));
     jLabel1.setText("Instructions for Irrelevant Frame of");

     jLabel2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
     jLabel2.setForeground(new java.awt.Color(0, 102, 255));
     jLabel2.setText("ScreeningPick");

     jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
     jLabel3.setText("<html><body>1.) Please select for every BROWSE-Button one file:<p><p> BROWSE TEXT has to be the text you want to search for.<p><p> BROWSE KEYWORDS have to be the keywords you want look for in the text.<p><p> BROWSE SAVE is the place where you want to save the created files.<p><p> Please be sure your keywordlist is formatted correctly (see picture).</body></html>");


     jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("KeywordList-Pic1.png"))); // NOI18N
     
     jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
     jLabel5.setText("<html><body>2.) Here you have to enter the tags you want to search for IRRELEVANT keywords.<p><p> Please enter the first 5 characters of the Tag, e.g. for \"Abstract\" \"AB  -\" (two spaces) . You do not need to insert something in all of the tags.<p><p> It is very(!) important that you insert them in the right order. So the first textfield is the textfield for Abstract, the second one for Title and the third one for Source. The \"Additional\"-tags can be choosed freely (see picture).<html><body>");

    // jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("screeningMedium.jpg"))); // NOI18N

  //   jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
   //  jLabel8.setText(" >> The following window appears:");

   //  jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("screeningMedium.jpg"))); // NOI18N

     jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
     jLabel10.setText("<html><body>3.) Here you have to enter the tags you want to search for REVIEW keywords.<p><p> Please do it in the same way as with the IRRELEVANT keywords, especially the right order! Here again just insert the fields you want to search for and leave the rest the way it is.<p><p> Please make sure again that your keywordlist is formatted correctly!<html><body>");

  

   //  jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
   //  jLabel12.setText(" >> The following window appears:");

     jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
     jLabel13.setText("<html><body>4.) Now you can choose whether you want to see the created files directly after the process is finished (then check the checkboxes for the files you want to be opened) or not (then just uncheck all of them).<p><p> The Review-File contains all the records which have a review keyword (from your keywordlist) in one of the tags you entered.<p><p> The Irrelevant-File contains all the records which have a irrelevant keyword (from your keywordlist) in one of the tags you entered.<p><p> The FurtherResearching-File contains none of them in the tags you entered.<html><body>");

  //   jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
  //   jLabel14.setText(" >> The following window appears:");

  //   jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("screeningMedium.jpg"))); // NOI18N

     jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
     jLabel16.setText("<html><body>5.) When you are sure you inserted everything correctly, press RUN :)<html><body>");
     
 }
    
/*     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
     jPanel1.setLayout(jPanel1Layout);
     jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addContainerGap()
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addGap(18, 18, 18)
                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(jLabel7)
                                 .addComponent(jLabel9)))
                         .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                 .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGroup(jPanel1Layout.createSequentialGroup()
                                     .addComponent(jLabel1)
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                     .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                 .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(jSeparator1))
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(37, 37, 37)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel11)
                         .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addContainerGap()
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(jLabel15)
                             .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addContainerGap()
                     .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addContainerGap()
                     .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(33, 33, 33)
                     .addComponent(jLabel19))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addContainerGap()
                     .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
             .addGap(326, 326, 326))
     );
     jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(0, 24, Short.MAX_VALUE)
                     .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel3)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addComponent(jLabel7)
             .addGap(18, 18, 18)
             .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addComponent(jLabel9)
             .addGap(18, 18, 18)
             .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(jLabel11)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(jLabel15)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addComponent(jLabel19)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(35, 35, 35))
     ); */

     

     //javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
   //  getContentPane().setLayout(layout);
   //  layout.setHorizontalGroup(
    //     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     //    .addComponent(ScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
   //  );
   //  layout.setVerticalGroup(
      //   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     //    .addComponent(ScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
    // );

   //  pack();
// }// </editor-fold>                       

 
public static void main(String[]args)
{
	  FrameStart frame2 = new FrameStart();
		frame2.validate();
		frame2.setVisible(true);
		
		
}




 
 // Variables declaration - do not modify     
 
/*    private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel10;
 private javax.swing.JLabel jLabel11;
 private javax.swing.JLabel jLabel12;
 private javax.swing.JLabel jLabel13;
 private javax.swing.JLabel jLabel14;
 private javax.swing.JLabel jLabel15;
 private javax.swing.JLabel jLabel16;
 private javax.swing.JLabel jLabel18;
 private javax.swing.JLabel jLabel19;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel20;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JLabel jLabel8;
 private javax.swing.JLabel jLabel9;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JScrollPane jScrollPane2;
 private javax.swing.JSeparator jSeparator1;

 // End of variables declaration      */             
}

