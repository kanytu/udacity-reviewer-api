package udacity.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Certification {

    @SerializedName("status")
    @Expose
    private CertificationStatus status;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("grader_id")
    @Expose
    private Integer graderId;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("waitlisted_at")
    @Expose
    private Date waitlistedAt;
    @SerializedName("certified_at")
    @Expose
    private Date certifiedAt;
    @SerializedName("trainings_count")
    @Expose
    private Integer trainingsCount;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("project")
    @Expose
    private Project project;

    /**
     * @return The status
     */
    public CertificationStatus getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(CertificationStatus status) {
        this.status = status;
    }

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
     * @return The graderId
     */
    public Integer getGraderId() {
        return graderId;
    }

    /**
     * @param graderId The grader_id
     */
    public void setGraderId(Integer graderId) {
        this.graderId = graderId;
    }

    /**
     * @return The createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return The waitlistedAt
     */
    public Date getWaitlistedAt() {
        return waitlistedAt;
    }

    /**
     * @param waitlistedAt The waitlisted_at
     */
    public void setWaitlistedAt(Date waitlistedAt) {
        this.waitlistedAt = waitlistedAt;
    }

    /**
     * @return The certifiedAt
     */
    public Date getCertifiedAt() {
        return certifiedAt;
    }

    /**
     * @param certifiedAt The certified_at
     */
    public void setCertifiedAt(Date certifiedAt) {
        this.certifiedAt = certifiedAt;
    }

    /**
     * @return The trainingsCount
     */
    public Integer getTrainingsCount() {
        return trainingsCount;
    }

    /**
     * @param trainingsCount The trainings_count
     */
    public void setTrainingsCount(Integer trainingsCount) {
        this.trainingsCount = trainingsCount;
    }

    /**
     * @return The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return The notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes The notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
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

    @Override
    public String toString() {
        return "Certification{" +
                "status=" + status +
                ", id=" + id +
                ", projectId=" + projectId +
                ", graderId=" + graderId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", waitlistedAt=" + waitlistedAt +
                ", certifiedAt=" + certifiedAt +
                ", trainingsCount=" + trainingsCount +
                ", active=" + active +
                ", notes='" + notes + '\'' +
                ", project=" + project +
                '}';
    }
}
