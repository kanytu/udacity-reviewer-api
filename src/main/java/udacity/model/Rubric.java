package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Rubric {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("upload_types")
    @Expose
    private List<String> uploadTypes = new ArrayList<String>();

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * @return The project
     */
    public Project getProject() {
        return project;
    }

    /**
     * @param project The project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The uploadTypes
     */
    public List<String> getUploadTypes() {
        return uploadTypes;
    }

    /**
     * @param uploadTypes The upload_types
     */
    public void setUploadTypes(List<String> uploadTypes) {
        this.uploadTypes = uploadTypes;
    }

    @Override
    public String toString() {
        return "Rubric{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", project=" + project +
                ", description='" + description + '\'' +
                ", uploadTypes=" + uploadTypes +
                '}';
    }
}