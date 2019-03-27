package com.capgemini.client;

public class School {
    
	    private String name;
	    private String city;
	    private String school_district;
	    private int greatSchoolRanking;
		
	    
	    
	    public School(String name, String city, String school_district, int greatSchoolRanking) {
			super();
			this.name = name;
			this.city = city;
			this.school_district = school_district;
			this.greatSchoolRanking = greatSchoolRanking;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public String getSchool_district() {
			return school_district;
		}



		public void setSchool_district(String school_district) {
			this.school_district = school_district;
		}



		public int getGreatSchoolRanking() {
			return greatSchoolRanking;
		}



		public void setGreatSchoolRanking(int greatSchoolRanking) {
			this.greatSchoolRanking = greatSchoolRanking;
		}



		@Override
		public String toString() {
			return "School [name=" + name + ", city=" + city + ", school_district=" + school_district
					+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
		}
	    
	    
	    
	    
	    
}

