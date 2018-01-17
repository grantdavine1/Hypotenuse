
import java.util.*;
import javax.swing.JOptionPane;

public class lab1 {
	
	private static int sideA = 0;
	private static int sideB = 0;
	

	
	public static void main(String[] args) {
		System.out.println("Usage: Supply 2 integer values as triange sides. ");
		System.out.println("	A - integer value");
		System.out.println("	B - integer value");
		System.out.println(" 	C - attempt a pythagonean calculation");
		System.out.println(" 	Q - quit the program");
		
		String value;
		String side;
		
		boolean carryOn = true;
		while (carryOn) {
			side=JOptionPane.showInputDialog(null, "A or B?");
			if(side.equals("A") || side.equals("B") || side.equals("C") || side.equals("Q")){
				switch(side) {
				case "Q":
						carryOn = false;
						break;
				case "A":
						try{
							value =JOptionPane.showInputDialog(null, "Enter A");
							
							if((value.equals("0") || (Integer.parseInt(value) < 0))){
								System.out.println("Please enter non-zero and positive integer");
								boolean t = true;
								while(t){
									try{
										value =JOptionPane.showInputDialog(null, "Enter A");
										sideA = Integer.parseInt(value);
										if (!value.equals("0") && !(Integer.parseInt(value) < 0))
											break;
										else{
											System.out.println("Please enter non-zero and positive integer");
										}
									}
									catch(NumberFormatException ex2){
										System.out.println("Try again. (" +
										          "Incorrect input: an integer is required)");
									}
								}
							}
							sideA = Integer.parseInt(value);
							break;
						}
						catch(NumberFormatException ex){
							System.out.println("Try again. (" +
							          "Incorrect input: an integer is required)");
							
							boolean t = true;
							while(t){
								try{
									value =JOptionPane.showInputDialog(null, "Enter A");
									sideA = Integer.parseInt(value);
									break;
								}
								catch(NumberFormatException ex2){
									System.out.println("Try again. (" +
									          "Incorrect input: an integer is required)");
								}
							}
							
							break;
						}
				case "B":
					try{
						value =JOptionPane.showInputDialog(null, "Enter B");
						
						if(value.equals("0") || (Integer.parseInt(value) < 0)){
							System.out.println("Please enter non-zero and positive integer");
							boolean t = true;
							while(t){
								try{
									value =JOptionPane.showInputDialog(null, "Enter B");
									sideB = Integer.parseInt(value);
									if (!value.equals("0") && !(Integer.parseInt(value) < 0))
										break;
									else{
										System.out.println("Please enter non-zero and positive integer");
									}
								}
								catch(NumberFormatException ex2){
									System.out.println("Try again. (" +
									          "Incorrect input: an integer is required)");
								}
							}
						}
						sideB = Integer.parseInt(value);
						break;
					}
					catch(NumberFormatException ex){
						System.out.println("Try again. (" +
						          "Incorrect input: an integer is required)");
						
						boolean t = true;
						while(t){
							try{
								value =JOptionPane.showInputDialog(null, "Enter B");
								sideB = Integer.parseInt(value);
								break;
							}
							catch(NumberFormatException ex2){
								System.out.println("Try again. (" +
								          "Incorrect input: an integer is required)");
							}
						}
						
						break;
					}
				case "C":
					double temporary = (sideA * sideA) + (sideB * sideB);
					double result = java.lang.Math.sqrt(temporary);
					if(sideA == 0 && sideB == 0){
						System.out.println("Please enter values for side A and B first");
					}
					else if(sideA == 0 && sideB != 0){
						System.out.println("Please enter side A");
					}
					else if(sideA != 0 && sideB == 0){
						System.out.println("Please enter side B");
					}
					else{
						System.out.println("The hypotenuse value is " + result);
					}
					break;
				default:
//					
//						
				}
			}
			else{
				System.out.println("Try again. (" +
				          "Incorrect input: Please enter A B C or Q)");
			}
		}
		System.out.println("Thank You, Goodbye!");
		return;
	}
}
