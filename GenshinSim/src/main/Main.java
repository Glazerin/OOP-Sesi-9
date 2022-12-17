package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Base;
import model.FiveStar;
import model.FourStar;
import model.FourStarWeapon;
import model.ThreeStarWeapon;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	ArrayList<Base> all = new ArrayList<Base>();
	ArrayList<FiveStar> FiveSC = new ArrayList<FiveStar>();
	ArrayList<FourStar> FourSC = new ArrayList<FourStar>();
	ArrayList<FourStarWeapon> FourSW = new ArrayList<FourStarWeapon>();
	ArrayList<ThreeStarWeapon> ThreeSW = new ArrayList<ThreeStarWeapon>();
	
	public void cls() {
		for(int i=0; i<50; i++) {
			System.out.println("");
		}
	}

	public void buffer() {
		System.out.print("Press enter to continue...");
		scan.nextLine();
	}

	public int scanInt() {
		int n = 0;
		try {
			n = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			scan.nextLine();
		}
		return n;
	}

	public Main() {
		int menu = 0;
		while(menu != 2) {
			System.out.println("Genshin Impact Gacha Simulation");
			System.out.println("+=============================+");
			System.out.println("+ 1. Character Banner         +");
			System.out.println("+ 2. Exit                     +");
			System.out.println("+=============================+");
			System.out.print("Choose >> ");
			menu = scanInt();
			cls();;
			
			switch (menu) {
			case 1:
				int menu1 = 0;
				while(menu1 != 3) {
					System.out.println("Character Banner Gacha Simulator");
					System.out.println("+==============================+");
					System.out.println("+ 1. Pull 1x                   +");
					System.out.println("+ 2. Pull 10x                  +");
					System.out.println("+ 3. Back to Main Menu         +");
					System.out.println("+==============================+");
					System.out.print("Choose >> ");
					menu1 = scanInt();
					cls();
					
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
