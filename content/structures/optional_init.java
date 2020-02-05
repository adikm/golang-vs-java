public record Student(String name, int age) {
    public Student(String name) {
        this(name, 0);
    }
}

var student = new Student("John");
