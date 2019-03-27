package main;

  public class Country
{
     private String countryname;
     private long area;
     private long population;

      public Country(String countryname,long area,long population)
       {
         this.countryname=countryname;
         this.area=area;
         this.population=population;
       }
      
     public Country()
     {}
   
     public void setCountryName(String countryname)
     {
         this.countryname=countryname;
     }
     public String getCountryName()
     {
        return countryname;
     }
     public void setCountryarea(long area)
     {
        this.area=area;
     }
     public long getCountryarea()
     {
         return area;
     }
     public void setCountrypopulation(long population)
     {
        this.population=population;
     }
     public long getCountrypopulation()
     {
        return population;
      }
    
   public Country tofindCountryWithlargestarea(Country country[])
         {
             int index=0;
             long maxarea=country[0].area;
             for(int i=1;i<country.length;i++)
                {
                   if(maxarea==country[1].area)
                     {
                           maxarea = country[i].area;
                           index = i;
                     }
                }
                   return country[index];
        } 
   public Country tofindCountryWithlargestpopulation(Country country[])
        {
            int index=0;
             long maxpopulation = country[0].population;
             for(int i=1;i<country.length;i++)
                {
                   if(maxpopulation==country[1].population)
                     {
                           maxpopulation = country[i].population;
                           index = i;
                     }
                }
                   return country[index];
        } 
     public Country tofindCountryWithlargestpopulationdensity(Country country[])
        {
            int index=0;
             double maxpopulationdensity = country[0].population/country[0].area;
             for(int i=1;i<country.length;i++)
                {
                   double density = country [i].population/country[i].area;
                   if(maxpopulationdensity<density)
                     {
                           maxpopulationdensity = density;
                           index = i;
                     }
                }
                   return country[index];
        } 
            
   }      