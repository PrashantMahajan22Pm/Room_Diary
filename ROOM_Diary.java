import java.awt.*;            // imports For Frames
import java.awt.event.*;       // imports For Frames
import java.util.Scanner;


import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

////// import for JDBC Connection 

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.Statement;
 import java.sql.ResultSet;




public class Room_Diray {
    public static void main(String[] args) throws Exception
     {
       AWTFrams aovj = new AWTFrams();
    }
}


class AWTFrams extends Frame implements ActionListener
{
    public Button BNewG,BSearchG,BExit;
    public Frame StartFrame,SecondFrameAddP,SelectGruoup,SelectButton,ExPadder,NameGetterForChk,DynamicNameFrame,SettleUpFrame,HistoryFrame,moneySaveFrame;
    public Label LB,SecondLB,EnterName,EnterExp,nameShowerlb;
    public TextField TexForAdder,TextNameAdder;
 
    public Label TimePrinterlb,TimePrinterlb1,TimePrinterlb2,TimePrinterlb3,TimePrinterlb4,TimePrinterlb5,TimePrinterlb6;
    public Button buttonCreate [];

    public Button AddP,Done,SDoneN ,SDoneExp;
    public Button Menu,Menu1,Menu2,Menu3,Menu4,Menu5;

    public Button AddExp,SettleUp,History,SavingTips;

    public String getNamer = "",  buttonName[],hislabel[];
    public Label HISLabal [];


    public int NameCheckerForOneTimeNameCreation=0;


 public AWTFrams()
  {
    StartFrame = new Frame();                   //    Frist Frame of program
    SecondFrameAddP  = new Frame();             //    From here User ad people name
    SelectGruoup = new Frame();                 //    In feature user can add pepole name 
    ExPadder = new Frame();                     //    It will Shows Dnynamic Name and from where user can ad expences 
    NameGetterForChk = new Frame();             //    It Creats buttons for adding 
    DynamicNameFrame  = new Frame();            //    It contatin Name which created dynamically
    SettleUpFrame  = new Frame();               //    This shows Labal How you have to pay other   
    HistoryFrame  = new Frame();                //    it Shows Who pays Money and which reason
    moneySaveFrame =  new Frame();              //    it will shows How can you save mpney 

    BNewG = new Button(" Create Group");
    BSearchG = new Button(" Search Group");
    BExit = new Button(" Exit");

    //Buttons for SeondFrameAddPeople
     AddP = new Button(" Add People ");
     Done = new Button(" Done ");
     Menu = new Button(" Menu ");
     Menu1 = new Button(" Menu ");
     Menu2 = new Button(" Menu ");
     Menu3= new Button ( " Menu ");
     Menu4 = new Button(" Menu ");
     Menu5 = new Button(" Menu ");


    ///Buttons for SelectGruoup
    AddExp = new Button(" AddExp ");
    SettleUp = new Button(" SettleUp ");
    History = new Button(" History ");
    SavingTips = new Button(" How Can I Save ");

    SDoneN =  new Button(" Done ");
    SDoneExp =  new Button(" Done ");


    // text field 
   
    TexForAdder = new TextField();
    TextNameAdder = new TextField(); 
    
    

    // Label creater

     LB = new Label(" Imagine Room Diary ");
     SecondLB = new Label(" Create Group ");
     EnterName = new Label(" Please Enter your name ");
     EnterExp   = new Label(" Please Enter your Expences "); 
     nameShowerlb  = new Label(" "); 
     TimePrinterlb  = new Label(" ");  
    TimePrinterlb1  = new Label(" ");  
    TimePrinterlb2 = new Label(" ");  
    TimePrinterlb3 = new Label(" ");  
    TimePrinterlb4 = new Label(" ");  
    TimePrinterlb5 = new Label(" ");  
    TimePrinterlb6  = new Label(" ");  
    

////////////////////////////////////////////////////////////////////////////

       TimePrinterlb.setBounds(450,30,120,30);
       TimePrinterlb1.setBounds(450,30,120,30);
       TimePrinterlb2.setBounds(450,30,120,30);
       TimePrinterlb3.setBounds(450,30,120,30);
       TimePrinterlb4.setBounds(450,30,120,30);
       TimePrinterlb5.setBounds(450,30,120,30);
       TimePrinterlb6.setBounds(450,30,120,30);
       LB.setBounds(200,30,187,30);
       SecondLB.setBounds(200,30,90,30);

        BNewG.setBounds(90,100,150,30);
        BSearchG.setBounds(90,150,150,30);
        BExit.setBounds(90,200,150,30);

        //// Size for SeondFrameAddPeople

        AddP.setBounds(90,100,150,30);
        Done.setBounds(90,150,150,30);
        Menu.setBounds(20,600,80,30);
        Menu1.setBounds(20,600,80,30);
        Menu2.setBounds(20,600,80,30);
        Menu3.setBounds(20,600,80,30);
        Menu4.setBounds(20,600,80,30);
        Menu5.setBounds(20,600,80,30);

       
        // SetBounds for SelectGruoup
        AddExp.setBounds(90,150,150,30);
        SettleUp.setBounds(90,200,150,30);
        History.setBounds(90,250,150,30);
        SavingTips.setBounds(90,300,150,30);

        // Sizes for Addidg Frame  Adding Name

        EnterName.setBounds(90,100,150,30);
        TextNameAdder.setBounds(90,150,150,30);
        SDoneN.setBounds(90,200,150,30);

        // Sizes for Addidg Frame  Adding Expence 

        EnterExp.setBounds(90,100,150,30);
        nameShowerlb.setBounds(90,150,150,30);
        TexForAdder.setBounds(110,200,70,25);
        SDoneExp.setBounds(90,250,150,30);

      /////////////////////////////////////////////////////

        BNewG.addActionListener(this);
        BSearchG.addActionListener(this);
        BExit.addActionListener(this);
      
       //Listener for SeondFrameAddPeople

        AddP.addActionListener(this);
        Done.addActionListener(this);
        Menu.addActionListener(this);
        Menu1.addActionListener(this);
        Menu2.addActionListener(this);
        Menu3.addActionListener(this);
        Menu4.addActionListener(this);
        Menu5.addActionListener(this);


      //Listener for SelectGruoup

        AddExp.addActionListener(this);
        SettleUp.addActionListener(this);
        History.addActionListener(this);
        SavingTips.addActionListener(this);

       //Listener for AdderAnd Main using Main functonalitiy
      
        SDoneExp.addActionListener(this);
        SDoneN.addActionListener(this);

 ///////////////////////////////////////////////////////////////////////////////

      StartFrame.setTitle(" Room Diary");
      StartFrame.setSize(700,700);
      StartFrame.setLayout(null);
  
        //FrameLyout for SeondFrameAddPeople
      SecondFrameAddP.setTitle(" Room Diary ");
      SecondFrameAddP.setSize(700,700);
      SecondFrameAddP.setLayout(null);
  
      // third frame
      SelectGruoup.setTitle(" Room Diary ");
      SelectGruoup.setSize(700,700);
      SelectGruoup.setLayout(null);
 
      // this frame will active when they press as to check expences
        
      ExPadder.setTitle(" Add Expences  ");
      ExPadder.setSize(700,700);
      ExPadder.setLayout(null);

      NameGetterForChk.setTitle(" Add Name only here ");
      NameGetterForChk.setSize(700,700);
      NameGetterForChk.setLayout(null);

      DynamicNameFrame.setTitle(" Added Name will shows ");
      DynamicNameFrame.setSize(700,700);
      DynamicNameFrame.setLayout(null);

      SettleUpFrame.setTitle(" Added Name will shows ");
      SettleUpFrame.setSize(700,700);
      SettleUpFrame.setLayout(null);

      HistoryFrame.setTitle(" You are into the history filed ");
      HistoryFrame.setSize(700,700);
      HistoryFrame.setLayout(null);

      moneySaveFrame.setTitle(" You are into the Money Save  filed ");
      moneySaveFrame.setSize(700,700);
      moneySaveFrame.setLayout(null);

///////////////////////////////////////////////////////////////////////////
      StartFrame.add(TimePrinterlb);
      StartFrame.add(LB);
      StartFrame.add(BNewG);
      StartFrame.add(BSearchG);
      StartFrame.add(BExit);
  
       //FrameLyout Adding in Frame SeondFrameAddPeople
      SecondFrameAddP.add(TimePrinterlb1);
      SecondFrameAddP.add(AddP);
      SecondFrameAddP.add(Done);
      SecondFrameAddP.add(SecondLB);
      
      //  FrameLyout Adding in Frame SelectGruoup
      SelectGruoup.add(TimePrinterlb2);
      SelectGruoup.add(AddExp);
      SelectGruoup.add(SettleUp);
      SelectGruoup.add(History);
      SelectGruoup.add(SavingTips);
     
      NameGetterForChk.add(TimePrinterlb3);
      NameGetterForChk.add(EnterName);
      NameGetterForChk.add(TextNameAdder);
      NameGetterForChk.add(SDoneN);
      NameGetterForChk.add(Menu1);
     
      ExPadder.add(TimePrinterlb4);
      ExPadder.add(EnterExp);
      ExPadder.add(nameShowerlb);
      ExPadder.add(TexForAdder);
      ExPadder.add(SDoneExp);
      ExPadder.add(Menu2);

      HistoryFrame.add(Menu3);


      SettleUpFrame.add(Menu4);

  //------------------------------------------------------------------------//

      LB.setBackground(Color.orange);
      SecondLB.setBackground(Color.orange);

      StartFrame.setVisible(true);
      NameGetterForChk.setVisible(false);
      HistoryFrame.setVisible(false);
    
   }
  
  public void ButtonCreation(String strr)
    {
     int iCount = 0;
     int  A = 0;
     
     buttonName = strr.split(" ");                    //   User Entered string we store in strr in this function and we split this string into
     for(String iret : buttonName)                                  //   Our  array using split funtion 
     {
          iCount++;
     }
    System.out.println(" Count is "+iCount);
   
       buttonCreate  = new Button[iCount];

     for(String iret : buttonName)                                
     {
        buttonCreate [A] = new Button(iret);
        this. ButtonPlacer (buttonCreate [A],A);
        A++;
     } 
  }

  public void ButtonPlacer (Button bName, int Number)                     //   It create button automatic when user Enter the Names 
  {
    int y = 50;
      for(int i = 0; i<= Number; i++)
      {
        y += 50;
      }
    bName.setBounds(90,y,150,30);
    bName.addActionListener(this);
    DynamicNameFrame.add(bName);
    
  }

////////////////////////////////////////////////////////////
///////////////

  public void actionPerformed(ActionEvent e)
   {
   JavaJDBCConnetion jdobj = new JavaJDBCConnetion();

   
   
     
   try 
   {
         /////
   //time and date 
   LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
     TimePrinterlb.setText(formattedDate);
      TimePrinterlb1.setText(formattedDate);
       TimePrinterlb2.setText(formattedDate);
        TimePrinterlb3.setText(formattedDate);
         TimePrinterlb4.setText(formattedDate);
          TimePrinterlb5.setText(formattedDate);
           TimePrinterlb6.setText(formattedDate);

    
     if(e.getSource() == BNewG)                                              //    Create Name is Here 
     {
      StartFrame.setVisible(false);
      SecondFrameAddP.setVisible(true);
       HistoryFrame.setVisible(false);
       
       jdobj.DataBaseCreate();                                                //   Database created Successfully        
     }
     else if(e.getSource() == Menu || e.getSource() == Menu1 || e.getSource() == Menu2 || e.getSource() == Menu3 || e.getSource() == Menu4 || e.getSource() == Menu5 )                //    Menu button 
     {
       DynamicNameFrame.setVisible(false);
       StartFrame.setVisible(false);
       NameGetterForChk.setVisible(false);  
       SelectGruoup.setVisible(true);
        HistoryFrame.setVisible(false);
        SecondFrameAddP.setVisible(false);

     }    
     else if(e.getSource() == AddP)                                          //   AddP == Add People function is stare
     {
      StartFrame.setVisible(false);
      SecondFrameAddP.setVisible(false);
      SelectGruoup.setVisible(false);
      NameGetterForChk.setVisible(true);
       HistoryFrame.setVisible(false);
   }                                        
    else if(e.getSource() == Done  ||e.getSource() == SDoneExp)                                        //  All types of Done fuction it will contains
     {
      if(NameCheckerForOneTimeNameCreation == 0)
      {
       this.ButtonCreation(getNamer); 
       jdobj.CreateTableForAll(getNamer);
      }
      NameCheckerForOneTimeNameCreation++;
       StartFrame.setVisible(false);
       SecondFrameAddP.setVisible(false);
       ExPadder.setVisible(false);
       SelectGruoup.setVisible(true);   
          HistoryFrame.setVisible(false);
   }
   else if( e.getSource() == SDoneN)                                       // when you going add Names 
   { 
      getNamer += TextNameAdder.getText() + " ";
       SecondFrameAddP.setVisible(false);
       NameGetterForChk.setVisible(false);
       SelectGruoup.setVisible(false);
       SecondFrameAddP.setVisible(true);
       TextNameAdder.setText("");
        HistoryFrame.setVisible(false);
   } 
  
     else if( e.getSource() == SDoneN)                            // Expence adding section 
     {
       SecondFrameAddP.setVisible(false);
       NameGetterForChk.setVisible(false);
       DynamicNameFrame.setVisible(false);
       SelectGruoup.setVisible(true);
        HistoryFrame.setVisible(false);


     }
    else if( e.getSource() == AddExp)                              // Expence adding section 
     {
       SecondFrameAddP.setVisible(false);
       NameGetterForChk.setVisible(false);
       SelectGruoup.setVisible(false);
       SecondFrameAddP.setVisible(false);  
       DynamicNameFrame.setVisible(true);
        HistoryFrame.setVisible(false);
        
     }
    
     else if( e.getSource() == SettleUp)                             //   Settleup function can show all funaction is used for close the group and final notification  
     {                                                               //   which conation all lent and own money 
       SettleUpFrame.setVisible(true);
       SecondFrameAddP.setVisible(false);
       NameGetterForChk.setVisible(false);
       SelectGruoup.setVisible(false);
       DynamicNameFrame.setVisible(false);
        HistoryFrame.setVisible(false);

     }
    else if( e.getSource() == History)                             //  You can check Expence history
     {
     HistoryFrame.setVisible(true);
      SettleUpFrame.setVisible(false);
       SecondFrameAddP.setVisible(false);
       NameGetterForChk.setVisible(false);
       SelectGruoup.setVisible(false);
       DynamicNameFrame.setVisible(false);


     }
     
       else if( e.getSource() == SavingTips)                            //  You can add Saving tips here 
     {
   HistoryFrame.setVisible(false);


     }
  
   else if(e.getSource() == BExit)
     {
       windowClosing();
    }
     Button bTun [] = buttonCreate;
       for(int i = 0; i < bTun.length ;i++)
       {
         if(e.getSource() == bTun[i])
         {  

          NameGetterForChk.setVisible(false);
          SelectGruoup.setVisible(false);
          SecondFrameAddP.setVisible(false);  
          DynamicNameFrame.setVisible(false);
          ExPadder.setVisible(true);
          nameShowerlb.setText(buttonName[i]); 
          int reupyeEXP = Integer.parseInt(TexForAdder.getText());
          jdobj.creatData(buttonName[i],reupyeEXP);
          nameShowerlb.setText("");
          TexForAdder.setText("");
         }
       }
   }
   catch(Exception eobj)
   {

   }
}

// method for window closing
public void windowClosing()
{
  try{
  StartFrame.dispose();
  }
  catch(Exception wobj)
  {
      wobj.printStackTrace();
    }
   }
  }

class JavaJDBCConnetion
 {
    private String DaabaseName;

   public JavaJDBCConnetion()
   {
     DaabaseName = "27DecRD";
     
   }
   

   public void DataBaseCreate()                                          //   this function call automatically when data base is created 
{
   try
   {
    String URL = "jdbc:mysql://localhost:3307/";
    String UserName = "root";
    String Password = "Prashant22";
      
    Connection cobj = DriverManager.getConnection(URL,UserName,Password);
   
    Statement stmobj = cobj.createStatement();

    String query = "create database "+DaabaseName;

    stmobj.execute(query);

    System.out.println(" Database created successfully !");

}
  catch (Exception eobj)
  {
    eobj.printStackTrace();
  }
}

   private String TablesQuery(String Names)
   {
  //  create table ScoreCard (RDID int(30) , Name int (30))
     String QueryCre = "";
     int iCount = 0;
     int A = 0;
     String NameAddedForQ="create table Room (RDID int(100) , Name int(100)";
          
    String [] crrGet = Names.split(" ");                     //   User Entered string we store in strr in this function and we split this string into
   for(String iret : crrGet)                                       //       Our  array using split funtion 
     {
         iCount++;
      }
   
    System.out.println(" Count is "+iCount);
   
    for(String iret : crrGet)                                
     {
        NameAddedForQ += " , "+iret+" int (100)";
      } 
    NameAddedForQ += ")";
    System.out.println(NameAddedForQ);
   return NameAddedForQ;
 }

                   
 
    public void CreateTableForAll(String Namesstr)                                                   // Create Table as Id & Name 
    {
        try
        {
      String URL = "jdbc:mysql://localhost:3307/"+DaabaseName;
      String UserName = "root";
      String Password = "Prashant22";

      Connection cobj = DriverManager.getConnection(URL, UserName, Password);
      Statement stm = cobj.createStatement();
    

      //////////         call to private function which will help to create create Query as name           /////////////////////////////

      String QueryExe = this.TablesQuery(Namesstr);

     String query = QueryExe;
     stm.execute(query);
     System.out.println("Table created successfully!");
	   cobj.close();  
   }
    catch(Exception eobj)
    {
       eobj.printStackTrace();
    } 
    }


    public void creatData(String strN,int scoreInt)
    {
        try{
     String URL = "jdbc:mysql://localhost:3307/"+DaabaseName;
     String UserName = "root";
     String Password = "Prashant22";

     Connection cobj = DriverManager.getConnection(URL,UserName,Password);

     String query = "Insert into Room ("+strN+") values("+scoreInt+")";
     Statement stm = cobj.createStatement();
      
    stm.executeUpdate(query);
    System.out.println("Data Inserted successfully!");
	  cobj.close(); 
    }
    catch(Exception eobj)
  {
    eobj.printStackTrace();
  }
}


 public void readData()
    {
        try{
     String URL = "jdbc:mysql://localhost:3307/"+DaabaseName;
     String UserName = "root";
     String Password = "Prashant22";

     Connection cobj = DriverManager.getConnection(URL,UserName,Password);
 
     String query = "select * from Room";
     Statement stm = cobj.createStatement();
     ResultSet rs = stm.executeQuery(query);

     while(rs.next())
     {
        System.out.println(" Name is : "+rs.getString("Name")+ "Expences : "+rs.getInt("  RSs "));
     }

    System.out.println("Data readed successfully!");
	  cobj.close(); 
    }
  catch(Exception eobj)
  {
    eobj.printStackTrace();
    }
   }
}

