package java_project.simple_maven_project;

public class Hello {

    public String greet() {
        return "Hello, world";
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        System.out.println(h.greet());
    }
}
