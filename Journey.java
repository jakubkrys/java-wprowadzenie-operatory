class Journey {
	public static void main(String args[]){
		short kilometers = 1848;
		short kszKa = 570;
		short kkaLu = 349;
		short kluOl = 382;
		short kolGd = 199;
		short kgdSz = 348;
		short minutes = 1227;
		short mszKa = 323; 
		short mkaLu = 251;
		short mluOl = 270;
		short molGd = 127;
		short mgdSz = 256;
		byte days = 5;
		double accountBalance = 1000;
		double aszKa = 284.45; 
		double akaLu = 270.83;
		double aluOl = 127.09;
		double aolGd = 256.25;
		double agdSz = 320.12;
		char currency = 044;
		
		System.out.println();
		System.out.println("-----My Journey-----");
		System.out.println("Main cities: Szczecin, Katowice, Lublin, Olsztyn, Gdynia");
		System.out.println("Kilometers: "+kilometers);
		System.out.println("Minutes: "+minutes);
		System.out.println("Days: "+days--);
		System.out.println("Budget: "+accountBalance+currency);
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("Day 1: Szczecin - Katowice");
		System.out.println();
		System.out.println("Kilometers: "+kszKa);
		System.out.println("Kilometers left: "+(kilometers-=kszKa));
		System.out.println("Time: "+mszKa);
		System.out.println("Time left: "+(minutes-=mszKa));
		System.out.println("Cost: "+aszKa+currency);
		System.out.println("Account balance: "+(accountBalance-=aszKa)+currency);
		System.out.println("Days to go: "+(days--));
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("Day 2: Katowice - Lublin");
		System.out.println();
		System.out.println("Kilometers: "+kkaLu);
		System.out.println("Kilometers left: "+(kilometers-=kkaLu));
		System.out.println("Time: "+mkaLu);
		System.out.println("Time left: "+(minutes-=mkaLu));
		System.out.println("Cost: "+akaLu+currency);
		System.out.println("Account balance: "+(accountBalance-=akaLu)+currency);
		System.out.println("Days to go: "+days--);
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("Day 3: Lublin - Olsztyn");
		System.out.println();
		System.out.println("Kilometers: "+kluOl);
		System.out.println("Kilometers left: "+(kilometers-=kluOl));
		System.out.println("Time: "+mluOl);
		System.out.println("Time left: "+(minutes-=mluOl));
		System.out.println("Cost: "+aluOl+currency);
		System.out.println("Account balance: "+(accountBalance-=aluOl)+currency);
		System.out.println("Days to go: "+days--);
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("Day 4: Olsztyn - Gdynia");
		System.out.println();
		System.out.println("Kilometers: "+kolGd);
		System.out.println("Kilometers left: "+(kilometers-=kolGd));
		System.out.println("Time: "+molGd);
		System.out.println("Time left: "+(minutes-=molGd));
		System.out.println("Cost: "+aolGd+currency);
		System.out.println("Account balance: "+(accountBalance-=aolGd)+currency);
		System.out.println("Days to go: "+days--);
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("Day 5: Gdynia - Szczecin");
		System.out.println();
		System.out.println("Kilometers: "+kgdSz);
		System.out.println("Kilometers left: "+(kilometers-=kgdSz));
		System.out.println("Time: "+mgdSz);
		System.out.println("Time left: "+(minutes-=mgdSz));
		System.out.println("Cost: "+agdSz+currency);
		System.out.println("Account balance: "+(accountBalance-=agdSz)+currency);
		System.out.println("Days to go: "+days--);
		System.out.println();
	}
}