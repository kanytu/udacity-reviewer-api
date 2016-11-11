package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class StudentFeedback {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("submission_id")
    @Expose
    private Integer submissionId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("grader_id")
    @Expose
    private Integer graderId;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("read_at")
    @Expose
    private Date readAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
     * @return The submissionId
     */
    public Integer getSubmissionId() {
        return submissionId;
    }

    /**
     * @param submissionId The submission_id
     */
    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    /**
     * @return The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId The user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return The body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body The body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return The rating
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * @param rating The rating
     */
    public void setRating(Integer rating) {
        this.rating = rating;
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
     * @return The readAt
     */
    public Date getReadAt() {
        return readAt;
    }

    /**
     * @param readAt The read_at
     */
    public void setReadAt(Date readAt) {
        this.readAt = readAt;
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

    @Override
    public String toString() {
        return "StudentFeedback{" +
                "project=" + project +
                ", submissionId=" + submissionId +
                ", userId=" + userId +
                ", body='" + body + '\'' +
                ", rating=" + rating +
                ", graderId=" + graderId +
                ", createdAt=" + createdAt +
                ", readAt=" + readAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
