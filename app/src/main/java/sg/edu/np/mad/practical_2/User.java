package sg.edu.np.mad.practical_2;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public String getName() {
        return name;
    }

    public void setName(String MyName) {
        name = MyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String MyDescription) {
        description = MyDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int MyId) {
        id = MyId;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean MyFollowed) {
        followed = MyFollowed;
    }
}
