public class User {

    String name;
    String id;
    String username;
    String password;

    User(BuilderClass builder)
    {
        this.name = builder.name;
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+" ID:"+ this.id;
    }

    public static class BuilderClass
    {
        String name;
        String id;
        String username;
        String password;
        public BuilderClass(String username,String password)
        {
            this.username = username;
            this.password = password;
        }

        public BuilderClass name(String name) {
            this.name = name;
            return this;
        }

        public BuilderClass id(String id) {
            this.id = id;
            return this;
        }
        public User build()
        {
            User user = new User(this);
            return user;
        }
    }
}
