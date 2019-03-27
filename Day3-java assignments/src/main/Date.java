package main;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
 
 public class Date
{
     private int date;
     private int month;
     private int year;

      public Date(int date, int month, int year)
       {
         this.date=date;
         this.month=month;
         this.year=year;
       }
       public String toString()
       {
          return(year +"/" + month + "/" + date);
       }
       public boolean isSmaller(Date date)
       {
         Boolean flag = false;
          if(date.year<this.date)           {
                if(date.month<this.month)
                  {
                     if(date.date<this.date)
                       {
                          flag=true;
                       }
                  }
           }
                  return flag;
      }
      public long daydiff(Date date)
       {
         LocalDate dateBefore = LocalDate.of(this.year,this.month,this.date);
         LocalDate dateAfter = LocalDate.of(this.year,this.month,this.date);
   
         long noOfDays = ChronoUnit.DAYS.between(dateBefore,dateAfter);
          return noOfDays;
       }
}
     
      
  