package com.methods.constructors;
import java.util.*;
public class CricketPlayer {
	String P_name;
	int matchs_played;
	int T_runs;
	CricketPlayer(String P_name,int matchs_played,int T_runs){
		this.P_name=P_name;
		this.matchs_played=matchs_played;
		this.T_runs=T_runs;
	}
	void show() {
		System.out.println("Player Details");
		System.out.println("Player Name:"+P_name);
		System.out.println("Matches Played:"+matchs_played);
		System.out.println("Total runs:"+T_runs);
		int avg=T_runs/matchs_played;
		System.out.println("Average runs:"+avg);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Played Name:");
		String P_name=sc.next();
		System.out.println("Enter Total matches Played :");
		int matchs_played= sc.nextInt();
		System.out.println("Enter total runs:");
		int T_runs =sc.nextInt();
		CricketPlayer cp1=new CricketPlayer(P_name,matchs_played,T_runs);
		cp1.show();
		
	}

}
