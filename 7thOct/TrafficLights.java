class TrafficLights{
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter input color (red / yellow/ green)");
		String color = scan.next();
        color = color.toUpperCase();
		switch(color)
		{
			case "RED" : System.out.println("Stop");
			            break;
			case "YELLOW" : System.out.println("Ready");
			            break;
			case "GREEN" : System.out.println("Go");
			            break;

			default : System.out.println("Invalid color");
			            break;
		}
	}
}