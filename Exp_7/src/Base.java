class Base

{
    String name;
    int yrs;

    Base(String n, int a) {
        name = n;
        yrs = a;
    }

    void show() {
        System.out.println("Player name: " + name);
        System.out.println("Experience Years: " + yrs);
    }
}