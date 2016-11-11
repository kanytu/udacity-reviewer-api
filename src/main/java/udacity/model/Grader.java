package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Grader {

    @SerializedName("name")
    @Expose
    private String name;

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grader{" +
                "name='" + name + '\'' +
                '}';
    }
}
