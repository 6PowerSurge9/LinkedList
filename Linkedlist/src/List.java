public class List {

	public static void main(String[] args) {
	
	StringNode str = new StringNode();
	str.setData("Dino");
	StringNode str2 = new StringNode("Fido", str);
	StringNode str3 = new StringNode("Fred",str2);
	StringNode str4 = new StringNode("Barney", str3);
	StringNode str5 = str4;
	
	
	while (str4 != null) {
		System.out.println(str4.getData());
		str4 = str4.getLink();
	}
	
	
	
	
	
	}
}