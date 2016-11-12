package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubmissionRequestProject {

    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("language")
    @Expose
    private Language language;

    /**
     * @return ID of the Project of submissions being requested
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
     * @return Language code of submissions being requested = ['en-us', 'zh-cn', 'pt-br']
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * @param language The language
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "SubmissionRequestProject{" +
                "projectId=" + projectId +
                ", language=" + language +
                '}';
    }
}
