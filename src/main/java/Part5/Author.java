package Part5;

public class Author {
    public long getId() {
        return id;
    }

    public Author setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Author setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private long id;
    private String name;
    private int age;
}
