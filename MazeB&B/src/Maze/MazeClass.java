package Maze;
import java.util.*;
import java.util.LinkedList;
import java.util.Arrays; 
import java.util.Queue;

public class MazeClass {
	
	public static void main(String[] args) {
		
	    Queue<Integer> q = new LinkedList<Integer>(); // oura gia to prwto monopati
		Queue<Integer> q2 = new LinkedList<Integer>(); // oura gia to deutero monopati
		int[][] multi = new int[6][5]; // pernaw ton lavurintho se pinaka
		multi [0][0] = 1; // vazw assoys sta empodia kai menoun ta mhdenika sta koutia pou mporei na paei
		multi [1][0] = 1;
		multi [2][0] = 1;
		multi [3][0] = 1;
		multi [4][0] = 1;
		multi [5][0] = 1;
		multi [0][2] = 1;
		multi [2][2] = 1;
		multi [3][2] = 1;
		multi [5][2] = 1;
		multi [0][3] = 1;
		multi [5][3] = 1;
		multi [0][4] = 1;
		multi [1][4] = 1;
		multi [2][4] = 1;
		multi [3][4] = 1;
		multi [4][4] = 1;
		multi [5][4] = 1;
		multi [5][1] = 2;
		
		int[] diafora = new int[2]; // pinakas pou apothikeuw to mikos kathe monopatiou
		
		int i = 1; // ksekinaw apo to kouti/thesi (1,1)
		int j = 1;
		
		int MetritisOuras = 0; // metritis gia na kserei se poia stoiva na valei tis theseis
		q.add(0); // vazw sthn stoiba to kouti eisodou (0,1) kai to kouti (1,1) apo to opoio ksekinaw
		q.add(1);
		q.add(1);
		q.add(1);
		q2.add(0); // kanw to idio sthn stoiba gia to 2o monopati
		q2.add(1);
		q2.add(1);
		q2.add(1);
		
		diafora[0] = 2; // arxikopoiw to mikos kathe monopatiou me 2 afou hdh vriskomai sto 2o kouti opote exw kalupsei 2 koutia
		diafora[1] = 2;
			
		for (int d = 0;d <=1;d++) { // ksekinaw thn epanalipsi gia to se poia stoiva kai antistoixa monopati vriskomai
			
			MetritisOuras++;
			
			for (int row = 0; row <= 5; row++) { 
				 for (int col = 0; col <= 4; col++) {
					 
						 
					 if (multi[i][j+1] == 0 && multi[i+1][j] != 2 &&  multi[i][j+1] != 2  &&  multi[i][j-1] != 2 && multi[i-1][j] != 2) {
						 	if (MetritisOuras == 1) {
						 		q.add(i);
								 q.add(j+1);
						 	}
						 	else {
						 		q2.add(i);
								 q2.add(j+1);						 	}
							 
							 multi[i][j+1] = 1;
							 diafora[d]++; 
							 j++;
							 System.out.println("Paw deksia sthn thesi  "+ i + "," + j +  " "  +  " exontas kalupsei " + diafora[d] + " koutia");
							 						
						 }
					
					 else if (multi[i+1][j] == 0 && multi[i+1][j] != 2 &&  multi[i][j+1] != 2  &&  multi[i][j-1] != 2 && multi[i-1][j] != 2 ) {
						 if (MetritisOuras == 1) {
						 		q.add(i+1);
								 q.add(j);
						 	}
						 	else {
						 		q2.add(i+1);
								 q2.add(j);
						 	}
						 multi[i+1][j] = 1;
						 diafora[d]++; 
						 i++;
						 System.out.println("Paw katw sthn thesi  "+ i + "," + j +  " "  +  " exontas kalupsei " + diafora[d] + " koutia");
						
					 	}
					 
					 else if (multi[i-1][j] == 0 && multi[i+1][j] != 2 &&  multi[i][j+1] != 2  &&  multi[i][j-1] != 2 && multi[i-1][j] != 2 ) {
						 if (MetritisOuras == 1) {
						 		q.add(i-1);
								 q.add(j);
						 	}
						 	else {
						 		q2.add(i-1);
								 q2.add(j);
						 	}
						 multi[i-1][j] = 1; 
						 diafora[d]++; 
						 i--; 
						 System.out.println("Paw panw sthn thesi  "+ i + "," + j +  " "  +  " exontas kalupsei " + diafora[d] + " koutia");
					 	}
					 
					 else if (multi[i][j-1] == 0 && multi[i+1][j] != 2 &&  multi[i][j+1] != 2  &&  multi[i][j-1] != 2 && multi[i-1][j] != 2 ) {
						 if (MetritisOuras == 1) {
						 		q.add(i);
								 q.add(j-1);
						 	}
						 	else {
						 		q2.add(i);
								 q2.add(j-1);
						 	}
						 multi[i][j-1] = 1;
						 diafora[d]++; 
						 j--;
						 System.out.println("Paw aristera sthn thesi  "+ i + "," + j +  " "  +  " exontas kalupsei " + diafora[d] + " koutia");
					 	}
					 
				 }
			  }
			
			if(multi[i+1][j] == 2) {
				 multi[i][j] = 0;
				 if (MetritisOuras == 1) {
					 q.add(i+1);
					 q.add(j);
				 }
				 else {
					 q2.add(i+1);
					 q2.add(j);
				 }
				 
				 diafora[d]++;
			 }
			 if(multi[i][j+1] == 2) {
				 multi[i][j] = 0;
				 if (MetritisOuras == 1) {
					 q.add(i);
					 q.add(j+1);
				 }
				 else {
					 q2.add(i);
					 q2.add(j+1);
				 }
				 diafora[d]++;
			 }
			 if(multi[i-1][j] == 2) {
				 multi[i][j] = 0;
				 if (MetritisOuras == 1) {
					 q.add(i-1);
					 q.add(j);
				 }
				 else {
					 q2.add(i-1);
					 q2.add(j);
				 }
				 diafora[d]++;

			 }
			 if(multi[i][j-1] == 2) {
				 multi[i][j] = 0;
				 if (MetritisOuras == 1) {
					 q.add(i);
					 q.add(j-1);
				 }
				 else {
					 q2.add(i);
					 q2.add(j-1);
				 }
				 diafora[d]++;

			 }
			 if (MetritisOuras == 1) {
				 System.out.println(q + " me mikos " + diafora[0]);
			 }
			 else {
				 System.out.println(q2 + " me mikos " + diafora[1]);
			 }
			 
			i = 1;
			j = 1;
			
		 
			
		}

		
		 if(diafora[0]>diafora[1]) {
			 System.out.print("To sintomotero monopati einai to  " + q2 + " me mikos " + diafora[1]);
			 
		 }
		 else {
			 System.out.print("To sintomotero monopati einai to  " + q + " me mikos " + diafora[0]);
		 }
		 
		
	}

}
	