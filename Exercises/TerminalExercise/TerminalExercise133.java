public class TerminalExercise133 {
	public static void main(String[] args){
		
		//1. What class in school are you going according to age;
		int age = Integer.parseInt(args[0]);
		if ( age >= 5 && age <= 12) {
			System.out.println("Dhmotiko");
		} else if ( age <= 15) {
			System.out.println("Gymnasio");
		} else if ( age <= 18) {
			System.out.println("Lykeio");
		} else {
			System.out.println("Invalid age");
		}
		
		// Can you use a switch statement? switch doesnt accept boolean so no "age >= 5 && age <= 12"
		switch(age) {
			case 5:
			case 6:
		  	case 7:
		  	case 8:
			case 9:
		  	case 10:
		  	case 11:
		  	case 12:
		  		System.out.println("Dhmotiko");
				break;
			case 13:
			case 14:
			case 15:
		  		System.out.println("Gymnasio");
				break;
			case 16:
			case 17:
			case 18:
		  		System.out.println("Lykeio");
				break;
			default:
				System.out.println("Invalid age");
				break;
		}

		//2. What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing
		int day = Integer.parseInt(args[1]);
		switch(day){
			case 1:
			case 2: 
			case 3: 
			case 4: 
			case 5: 
				System.out.println("Go to work");
				break;
			case 6:			
			case 7: 
				System.out.println("relaxing");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}
		
		//3. What season is according to month. Enter month from terminal.
		String month = args[2];
		switch(month){
			case "December": 
			case "January":
			case "February": 
				System.out.println("It's winter");
				break;
			case "March": 
			case "April": 
			case "May":
				System.out.println("It's Sprint");
				break;
			case "June":
			case "July": 
			case "August": 
				System.out.println("It's Summer");
				break;
			case "September": 
			case "Octomber": 
			case "November":
				System.out.println("It's Autumn");
				break;
 			default:
				System.out.println("That's not a month");
				break;
		}
		
		//4. Print the number of days each month has. Use switch.
		switch(month){
			case "December": 
			case "January":
			case "March": 
			case "May":
			case "July":
			case "August": 
			case "October":  
				System.out.println(args[2] + " has 31 days.");
				break;
			case "June":
			case "April": 
			case "September":
			case "November": 
				System.out.println(args[2] + " has 30 days.");
				break;
			case "February": 
				System.out.println(args[2] + " has 29 days.");
				break;
			default:
				System.out.println("That's not a month");
				break;
		}
		
		//5. Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest).
		char grade = args[3].charAt(0);
		switch(grade){
			case 'A':
			case 'a':
				System.out.println("Perfect");
				break;
			case 'B':
			case 'b':
				System.out.println("Perfect");
				break;
			case 'C':
			case 'c':
			case 'D':
			case 'd':
				System.out.println("Pass");
				break;
			case 'E':
			case 'e':
			case 'F':
			case 'f':
				System.out.println("Fail");
				break;

			default:
				System.out.println("Invalid grade");
				break;
		}
		
		//6. Based on age what can you do?
		if(age >= 1 && age <=100){
			if(age < 16){
				System.out.println("You can not drive");
			}else if(age <=17){
				System.out.println("You can drive but not vote");
			}else if(age <=21){
				System.out.println("You can vote but not drink");
			}else {
				System.out.println("You can do anything");
			}

		} else {
			System.out.println("Invalid number, age must be between 1-100");
		}
		
		//7. Program should ask your weight and planet. Compute your weight on the planet based on the table below:
		Double weight = Double.parseDouble(args[4]);
		String planet = args[5];
		
		switch(planet){
			case "Venus":
				double planetWeight = Double.parseDouble(args[4]) * 0.78;
				System.out.println("Your weight is " + planetWeight);
				break;
			case "Mars":
				 planetWeight = Double.parseDouble(args[4]) * 0.39;
				System.out.println("Your weight is " + planetWeight);
				break;
			case "Jupiter":
				 planetWeight = Double.parseDouble(args[4]) * 2.65;
				System.out.println("Your weight is " + planetWeight);
				break;
			case "Saturn":
				 planetWeight = Double.parseDouble(args[4]) * 1.17;
				System.out.println("Your weight is " + planetWeight);
				break;
			case "Uranus":
				 planetWeight = Double.parseDouble(args[4]) * 1.05;
				System.out.println("Your weight is " + planetWeight);
				break;
			case "Neptune":
				 planetWeight = Double.parseDouble(args[4]) * 1.23;
				System.out.println("Your weight is " + planetWeight);
				break;
			default:
				System.out.println("You either typed an invalid planet, an invalid weight or both");
				break;
		}
		
		//8. Use ternary to return a message child or adult. Older than 18 is adult.
		String message = (age<=17)?"Child":"Adult";
		System.out.println(message);
			
 		//9. Create a program that stores the names of your 4 best friends in an array. Then print these names from the array. Use for-traditional, for enhanced, while, do-while.
		String[] bestFriends = {args[6],args[7],args[8],args[9]};
		for(int i=0; i<bestFriends.length; i++){
			System.out.println(i+1 + ". " + bestFriends[i]);
		}
		int i = 0;
		for(String names : bestFriends){
			System.out.println(i+1 + ". " + names);
			i++;
		}
		i = 0;
		while(i<bestFriends.length){
			System.out.println(i+1 + ". " + bestFriends[i]);
		i++;
		}
		i = 0;
		do {
			System.out.println(i+1 + ". "  + bestFriends[i]);
		i++;
		} while (i<bestFriends.length);
		{
		}
	}
}

//javac TerminalExercise133.java
//java TerminalExercise133 5 5 August A 64 Venus Luffy Zoro Jack Tom
