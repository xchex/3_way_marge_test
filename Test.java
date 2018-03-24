class Test {
    final private String name;
    final private int sem;
    final private int year;

    public void Test(String name , int sem, int year) {
        this.name = name;
        this.sem = sem;
        this.year = year;
        System.out.println("Test constructor");
    }

    protected onFinished() {
        System.out.println("Celebrate semester" + sem)
    }
}