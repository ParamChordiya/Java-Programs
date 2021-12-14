class player

{
     public static void main(String args[])
    {
        Cricket c = new Cricket("Sachin tendulakr", "Cricket", 20);
        Football f = new Football("Ronaldo", "Football", 21);
        Hockey h = new Hockey("Alex Ovechkin", "Hockey", 25);

        c.show();
        System.out.println("----------------------------------------------------------------");
        f.show();
        System.out.println("----------------------------------------------------------------");
        h.show();
        System.out.println("----------------------------------------------------------------");

    }

}