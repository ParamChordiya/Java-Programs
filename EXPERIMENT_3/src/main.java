
public  class  main  {
	public  static  void  main(String[]  args)  {

	Rectangle  r1  =  new  Rectangle();
	Rectangle  r2  =  new  Rectangle(); 
	r1.get_length(); 
	r1.get_width(); 
	r1.get_colour(); 
	r2.get_length(); 
	r2.get_width(); 
	r2.get_colour();
	if((r1.find_area()==r2.find_area())&&(r1.colour.equals(r2.colour)))
		System.out.println("Matching  rectangles");
	else
		System.out.println("Non-matching  rectangles");
	}
}
