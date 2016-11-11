package udacity.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubmissionRequestWaitingList {
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("position")
    @Expose
    private Integer position;

    /**
     * @return The projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId The project_id
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * @return The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "SubmissionRequestWaitingList{" +
                "projectId=" + projectId +
                ", language='" + language + '\'' +
                ", position=" + position +
                '}';
    }
}
