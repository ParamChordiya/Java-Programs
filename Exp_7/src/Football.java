class Football extends Base {
    String type;

    Football(String n, String t, int a) {
        super(n, a);
        type = t;
    }

    public void show()

    {
        super.show();
        System.out.println("Player type : " + type);
    }

}