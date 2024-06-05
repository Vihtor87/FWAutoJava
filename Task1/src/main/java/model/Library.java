package model;

public class Library {
    private Long id;
    private String Name;
    private String authorName;

    public Library(String Name, String authorName) {
        this.Name = Name;
        this.authorName = authorName;
    }

    public Library(Long id, String Name, String authorName) {
        this(Name, authorName);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    @Override
    public String toString() {
        return null;
    }
}