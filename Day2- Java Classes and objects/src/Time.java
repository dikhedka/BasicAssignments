public class Time
   {
     private int hours;
     private int minutes;
     public void setTimenumber(int hours , int minutes)
       {
          this.hours = hours;
          this.minutes = minutes;
       }
    public void display()
       {
         System.out.println(hours+ "hours" +minutes+ "minutes");
       }
    public Time sumofTime(Time number)
       {
         Time t1 = new Time();
         t1.hours=this.hours+number.hours;
         t1.minutes=this.minutes+number.minutes;
         if(t1.minutes >= 60)
           {
              t1.minutes = t1.minutes-60;
              t1.hours = t1.hours+1;
            }

         return t1;
      }
   } 