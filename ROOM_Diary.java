//  This is Original project of room dairy
//  you have to create separte frontend for this project using AWT
//   And create connetction  Using JDBC
//   but this project is based on CUI catagary
//  PRO_R_D.java file Contain all advancd things 
//  
//


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;


class ROOM_Diary  

//  Actual Code Work start form R_D then  rNodeX class
  // create data stuctures when we call create_Name Funtion
{
    public static void main(String [] Arg)
    {
    Scanner sobj = new Scanner(System.in);
     int Special_ID = 0;
    int Choice =0;

    //  For starting you to start from here Unlock following statement
    ActionableX aobj = new ActionableX();   //   Roomate Mate Object

    UserAskX uobj  = new UserAskX();

    System.out.println(" *** Welcome to Imagine_Room_Diary *** \n");
     uobj.firstChoice();     ///   First time asking
    Choice =uobj.getUserChoice();  //   First Calling
  

    while(true)
    {
    if(Choice == 1)    //   Create Names
    {  
    Special_ID++;
    aobj.Create_Team(Special_ID);
    // uobj.firstChoice();
    // Choice = uobj.getUserChoice(); 
    }
    else if(Choice == 2) 
    {
    System.out.println("Funtion not Avalible");    //    Pending Funtion
    // uobj.firstChoice(); 
    // Choice =uobj.getUserChoice(); 
    }
     else if(Choice == 3) 
    {
    // uobj.firstChoice(); 
    // Choice =uobj.getUserChoice(); 
    System.out.println(" \n Welcome  \n  ");    //   Welcome massage
  
    String sChoice = "";
    String aName = "";
    double dExp = 0.0;
     uobj.askRoomers();
    sChoice = sobj.nextLine();
      while(true)
      {
           
    if(("Add".equals(sChoice) == true) || "add".equals(sChoice) == true)
     {
     System.out.println(" please Enter your name ");
      aName  =sobj.nextLine();
     System.out.println(" please Enter Expence ");
      dExp = sobj.nextDouble(); 
     aobj.nameCheckaddMoney(aName,(dExp+0.0F));
    
     }
     else  if(("Total".equals(sChoice) == true) || "total".equals(sChoice) == true)
     {
         System.out.println("Total Expencess is "+aobj.Total());      
     }
     else  if(("Act".equals(sChoice) == true) || "act".equals(sChoice) == true)
     {
        System.out.println(" This funtion is pending \n Sorry for inconvenice ");
     }
     else  if (("My_Lent".equals(sChoice) == true) || "my_lent".equals(sChoice) == true)
     {   
      System.out.println(" please Enter your name ");
      aName=sobj.nextLine();
      aobj.My_Lent(aName);
     }
     else  if(("My_Share".equals(sChoice) == true) || "my_share".equals(sChoice) == true)
     {   
      System.out.println(" please Enter your name ");
      aName =sobj. nextLine();
      aobj.My_Share(aName);     
     }
      else if (("Settle_Up".equals(sChoice) == true) || "settle_up".equals(sChoice) == true)
     {
         aobj.Settle_Up();      
     }
      else if (("Show".equals(sChoice) == true) || "show".equals(sChoice) == true)
     {
         aobj.Display();    
     }
       else if (("Menu".equals(sChoice) == true) || "menu".equals(sChoice) == true)
     {
         break;      
     }
     else
     {
      System.out.println(" Please enter the valid input ");
     } 
     aName = "";
     dExp = 0.0F;   
    // Loop Asking 
     uobj.askRoomers();
     sChoice = sobj.nextLine();
      }
   }///    Exit Situation 
    else if(Choice == 4) 
    {  
    System.out.println(" Thank you for using Imagine_Room_Diary");
   break;
  }
   uobj.firstChoice();
  Choice = uobj.getUserChoice(); 
    }
      sobj.close();
   }
   }
 
  //   Class Contain dataStructure 

  class rNodeX
 {
    public String Name;
    public double Exp[];
    public int ID;
    public rNodeX next;

    public rNodeX(int SID,String SName)  
    { 
      Name = SName;
      Exp = new double[30];
      ID =SID;
    }
    // class Contain dataStructure 
  }
  
   //   Here dataStructur will create and actual memory will allocate 
 class ActionableX
 {
   public int iCount;           
   public rNodeX first;          //   this first 
   public double stotr[];
  
   public ActionableX()
   {
    first = null;
    iCount = 0;
   }
  
   public int Count()
   {
    return iCount;  
   }

  // We have to create data stucture according to data structre diagram

    public void Create_Team(int RID)
    {
     Scanner sobj = new Scanner(System.in);
      System.out.println(" Enter the Name ");
      //  On follwing funtion when you start your While (true)Loop -> main Loop
      // System.out.println("Enter the Team_mate Name");
       String SName = sobj.nextLine();
       
      rNodeX newn = new rNodeX(RID,SName);
       if(first == null)
       {
         first = newn;
        
       }
       else
       {
         rNodeX temp  =first;
         while (temp.next != null)
        {
          temp = temp.next;
         }
         temp.next = newn;
       }
       iCount++;
    }



   public void Display()
   { 
     
      System.out.println("Name Mates are");

       rNodeX temp = first;

      while(temp != null)
      {
        System.out.println(temp.ID+" "+temp.Name);
        temp=temp.next;
      }
      System.out.println("All Name are printed\n");
   }
  
   public void DisplayNames()
   { 
     
      System.out.println("Names are");

       rNodeX temp = first;

      while(temp != null)
      {
        System.out.println(temp.Name);
        temp=temp.next;
      }
      System.out.println("All Name are printed\n");
   }

   public int getID(String Name)
   {
    rNodeX ntemp = first;
     boolean bRet = false;
     while(ntemp != null)
     {
      bRet = ((ntemp.Name).equals(Name)); 
      if(bRet == true)
      {
      break;
      }
      ntemp=ntemp.next;
     }
     if(ntemp == null)
     {
      return -1;
     }
     return (ntemp.ID);
   }


  public void nameCheckaddMoney(String Name,double MoneyA)
  {
    rNodeX ntemp = first;
    int iid = getID(Name);
     
    if( iid == -1)
    {
    System.out.println(" Invalid name .\n Expence Not added");
    System.out.println(" Names should be ");
    this.DisplayNames();

       return;
    }
     int A=0;
      while(ntemp != null)
      {
        if(iid == ntemp.ID)
        {
          break;
        }
     ntemp = ntemp.next;
      }
     while(ntemp.Exp[A] != 0)
     {
       A++;
     }
     ntemp.Exp[A]=MoneyA;
     System.out.println("Expences Added Successfully "+ntemp.Exp[A]+" of "+ntemp.Name);
  }
 
   
   public double Total()
   {
     rNodeX ttemp = first;
     int A=0;
     double iTotal =0;
     while(ttemp != null)
     { 
      A=0;
     while(ttemp.Exp[A] != 0)
     {
       iTotal =iTotal +ttemp.Exp[A];
       A++;
     } 
     ttemp = ttemp.next;
    } 
     return iTotal; 
   }
    //
    //   we not taking activity from user
    //
   public void  Act()
   {
    

   }
 
   //
   //  This funtion help us to Imuch we own or how much we lent
   //
   public double My_Lent(String Name)
   {  
    double  iTotal = Total();
    double iMyShare = My_Share(Name);
    double iCou = Count();
    double avgDiv =iTotal / iCou;
    double flent = iMyShare-avgDiv;  
    System.out.println("iCount is "+iCou);
    System.out.println("avgDiv is "+avgDiv);
     if(flent > 0)
     {
      System.out.println("you Own "+flent+"\n You spend More than others");
     }
     else if(flent < 0)
     {
       System.out.println("You Lent "+flent+"\n You spend Less than others");
     }
     else if(flent == 0)
     {
      System.out.println("You Dont have have to pay \n You pay equally thats other pays");
     }
    return flent;
   }
    
   //
   //  Here we print how we spent
   //
   public double My_Share(String Name)
   {
      rNodeX mTemp = first;
      int iid=getID(Name);
       double myShare = 0;
      while(mTemp != null)
      {
        if(iid == mTemp.ID)
        {
          break;
        }
     mTemp = mTemp.next;
      }
       int A = 0;
      while(mTemp.Exp[A] != 0)
     {

    myShare = myShare + mTemp.Exp[A]; 
    A++;
       } 
      System.out.println("My Id is "+mTemp.ID);
      System.out.println(mTemp.Name+" is Spended till "+myShare+" Rupees");
        return  myShare; 
    }

   //
   //  Here everyOne Lent is printed
   //
   public void Settle_Up()
   {
    rNodeX sTemp = first;
    int iCou = Count();
   
     stotr = new double[iCou];
     int A = 0;  
     while(sTemp != null)
     {
       stotr[A] =My_Lent(sTemp.Name);
       A++;
       sTemp = sTemp.next;
     }
      this.trySettle();
       }

public void trySettle()
  {
    int i = 0; 
    rNodeX dtemp = first;   
    double Crr[] =new double[stotr.length];

      for(;i<stotr.length;i++)
    {
       Crr[i] = stotr[i];
    }
    
     double iStake =0.0; 
    
    System.out.println("After copying array  the array element ");
     for(i = 0; i < Crr.length; i++)
    {
     System.out.println(Crr[i]);
    }
    
    for(int f=0; f < Crr.length; f++)
    {
      if(Crr [f] != 0)
      {
        if(Crr [f] > 0)
        {
    // System.out.println("31 is "+Crr [f]+ " greater than to zero");
         for(int z = 0; z< Crr.length; z++)
         {
          if(Crr[z] < 0 && f != z)
          {
            // System.out.println("36 after finding less than zero is "+Crr[z]);
           iStake = (Crr [f] + Crr[z]); 
            // System.out.println("stake of "+Crr [f]+" and "+Crr[z]+" stake  become is "+iStake);
            //  System.out.println("\niStake is "+iStake);
            if(iStake > 0)   // this fro fromat printing
           {
            
            if( z > f)
            {
           dtemp = first;
          while(dtemp != null)
          {
            if(dtemp.ID == (f+1))
            {
         System.out.print("\n"+f +" will get "+Crr[z]);
            }
          else if(dtemp.ID == (z+1))
          {
            System.out.print(" money from "+z+" \n");
          }
          dtemp =dtemp.next;
          }
           Crr [f]=iStake;  
            Crr[z] = 0;
           }
           else if(z < f)
           {
          dtemp = first;
          while(dtemp != null)
          {
            if(dtemp.ID == (z+1))
            {
             System.out.print("\n"+dtemp.Name+"^ will pay "+Crr[z]+" to ");
            }
             else if(dtemp.ID == (f+1))
          {
            System.out.print(dtemp.Name+" \n");
          }
           dtemp = dtemp.next;
          }
            Crr[f]=iStake;  
            Crr[z] = 0;
           }
          }
         
          else if(iStake < 0)
           {
             if( f < z)
            {
           dtemp = first;
          while(dtemp != null)
          { 
           if(dtemp.ID == (f+1))
            {
         
           System.out.print("\n"+dtemp.Name +" will get "+(Crr[f])+" Ruppe  from ");   
            }
              else if(dtemp.ID == (z+1))
          {
            System.out.print(dtemp.Name+"\n");
          }
          dtemp =dtemp.next;
          } 
           Crr[f]=iStake;
            Crr[z]=0;         
           }
            else if( f > z)
           {
          dtemp = first;
          while(dtemp != null)
          {
            if(dtemp.ID == (z+1))
            {
             System.out.print("\n"+dtemp.Name+"1  will pay "+(Crr[f])+" to ");
            }
             else if(dtemp.ID == (f+1))
          {
            System.out.print(dtemp.Name+" \n");
          }
          dtemp =dtemp.next;
          }  
            Crr[z]=iStake; 
            Crr[f] = 0;       
          }
          }
           else
           {
            if(Crr[z] > 0)
            {
              if(z < f)
              {
               dtemp = first;
          while(dtemp != null)
          {
            if(dtemp.ID == (z+1))
            {
         System.out.print("\n"+dtemp.Name+" will get "+Crr[z]);
            }
          else if(dtemp.ID == (f+1))
          {
            System.out.print(" money from "+dtemp.Name+" \n");
          }
          dtemp =dtemp.next;
          }
              }
              else if(z > f)
              {
            dtemp = first;
          while(dtemp != null)
          {
            if(dtemp.ID == (f+1))
            {
             System.out.println("\n"+dtemp.Name+" will pay "+Crr[z]+" to ");
            }
             else if(dtemp.ID == (z+1))
          {
            System.out.print(dtemp.Name+" \n");
          }
          dtemp =dtemp.next;
          }   
       }
    }
           else if(Crr [z] < 0)
            {

          if(z < f)
              {
           dtemp = first;
          while(dtemp != null)
          {
            if(dtemp.ID == (z+1))
            {
         System.out.print("\n"+dtemp.Name +" will pay "+Crr[f]+" to ");
            }
          else if(dtemp.ID == (f+1))
          {
          System.out.print(dtemp.Name+" \n");         
         }
          dtemp =dtemp.next;
          }
            }
             else if(z > f)
              {
            dtemp = first;
          while(dtemp != null)
          {
            if(dtemp.ID == (f+1))
            {
         System.out.print("\n "+dtemp.Name+" will get "+Crr[f]);
            }
             else if(dtemp.ID == (z+1))
          {
            System.out.print(" money from "+dtemp.Name+" \n");
          }
          dtemp =dtemp.next;
          }   
         }
              // System.out.println("\n$"+z +" wiil pay " +Crr[f]+" Ruppe to "+f);
            }
             Crr[z]=iStake;
             Crr[f] =iStake;
           }
          }
         }
        }
      }
    }
   
  }


   //
   //
   //
   public void New_G()
   {


   }

 }
 /////
 ////    Below class is menu driven class 
 ////     it is used for help to user which thing he have press 
class UserAskX  
{

  //  following funtion return the Integer input Only
public int getUserChoice() {
    Scanner sobj = new Scanner(System.in);
    int iVal;

    while (true) {
        try {
            iVal = Integer.parseInt(sobj.nextLine().trim());
            break;
        }
         catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            firstChoice();
        }
    }
    return iVal;
}

 public void firstChoice()
 {   
System.out.println(" Please Enter your choice \n");
// System.out.println(" Press  '1'  for  Create New Group ");
System.out.println(" Press  '1'  for  Enter your Name ");
System.out.println(" Press  '2'  for  Search_Group_by_Name");
System.out.println(" Press  '3'  for  For Enter in this group ");
System.out.println(" Press  '4'  for  Exit \n");
 }

 public void askRoomers()
 {
    System.out.println( " \n            Enter Below keyWords\n");
    System.out.println(" * 'Add'        Enter For Adding_Expence");
    System.out.println(" * 'Show'       Enter For Showing Memebers names");
    System.out.println(" * 'Total'      Enter For  Getting Total_Expences ");
    System.out.println(" * 'Act'        Enter For Getting All Activities ");
    System.out.println(" * 'My_Lent'    Enter For Kwoning how much we have to pay for settle up ");  
    System.out.println(" * 'My_Share'   Enter ForTerminate the Program ");
    System.out.println(" * 'Settle_Up'  Enter For ");  
    System.out.println(" * 'Menu'       For go to Previou Menu \n");  
 }
}

