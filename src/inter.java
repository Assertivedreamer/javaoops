interface inter {

    // public, static and final
    int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface.
class TestClasss implements inter {

    // Implementing the capabilities of
    // interface.
    public void display(){
        System.out.println("Geek");
    }

    // Driver Code
    public static void main(String[] args)
    {
        TestClasss t = new TestClasss();
        t.display();
        System.out.println(a);
    }
}
