package com.prodapt.OOPbasics;

public class TesterSr {
	public static void main(String[] args) {
		SchoolRecords ob1 = new SchoolRecords();
		ob1.displayRecords();
		ob1.addRecords(111, "SunBeam Matriculation", "Neelankarai" );
		ob1.addRecords(222, "Abacus Montesori", "Perungudi" );
		ob1.addRecords(333, "British International", "Neelankarai" );
		ob1.addRecords(444, "St.John Universal", "Pallvakam" );
		ob1.addRecords(555, "St.Patricks", "Adyar" );
		}
}
