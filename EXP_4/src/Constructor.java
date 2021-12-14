class Constructor{
    int a;
    int b;

    Constructor(){
        a=5;
        b=10;
        System.out.println("Inside constr 1");
        show();
    }

    Constructor(int a) {
        this.a = a;
        System.out.println("Inside constr 2");
        show();
    }

    Constructor(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside constr 3");
        show();
    }

    public void show(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}