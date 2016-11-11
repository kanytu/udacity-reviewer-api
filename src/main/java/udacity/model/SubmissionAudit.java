package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class SubmissionAudit {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("submission_id")
    @Expose
    private Integer submissionId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("grader_id")
    @Expose
    private Integer graderId;
    @SerializedName("assigned_at")
    @Expose
    private Date assignedAt;
    @SerializedName("completed_at")
    @Expose
    private Date completedAt;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("read_at")
    @Expose
    private Date readAt;
    @SerializedName("rubric_id")
    @Expose
    private Integer rubricId;
    @SerializedName("submission_rubric")
    @Expose
    private SubmissionRubric submissionRubric;

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result The result
     */
    public void setResult(String result) {
        this.result = result;
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
     * @return The assignedAt
     */
    public Date getAssignedAt() {
        return assignedAt;
    }

    /**
     * @param assignedAt The assigned_at
     */
    public void setAssignedAt(Date assignedAt) {
        this.assignedAt = assignedAt;
    }

    /**
     * @return The completedAt
     */
    public Date getCompletedAt() {
        return completedAt;
    }

    /**
     * @param completedAt The completed_at
     */
    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
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
     * @return The rubricId
     */
    public Integer getRubricId() {
        return rubricId;
    }

    /**
     * @param rubricId The rubric_id
     */
    public void setRubricId(Integer rubricId) {
        this.rubricId = rubricId;
    }

    /**
     * @return The submissionRubric
     */
    public SubmissionRubric getSubmissionRubric() {
        return submissionRubric;
    }

    /**
     * @param submissionRubric The submission_rubric
     */
    public void setSubmissionRubric(SubmissionRubric submissionRubric) {
        this.submissionRubric = submissionRubric;
    }
}
