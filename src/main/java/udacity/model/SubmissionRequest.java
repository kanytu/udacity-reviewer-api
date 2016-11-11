package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubmissionRequest {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("status")
    @Expose
    private SubmissionRequestStatus status;
    @SerializedName("closed_at")
    @Expose
    private Date closedAt;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("submission_id")
    @Expose
    private Integer submissionId;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("submission_request_projects")
    @Expose
    private List<SubmissionRequestProject> submissionRequestProjects = new ArrayList<SubmissionRequestProject>();

    /**
     * @return ID of the submission request
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
     * @return ID of the reviewer that owns the request
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
     * @return available' requests are awaiting submissions. 'fulfilled' is set if a submission is assigned that meets the requirement. 'closed' is set on requests either deleted by the caller or that time out. = ['available', 'fulfilled', 'closed']
     */
    public SubmissionRequestStatus getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(SubmissionRequestStatus status) {
        this.status = status;
    }

    /**
     * @return Date at time the request will expire, or time was manually closed/fulfilled
     */
    public Date getClosedAt() {
        return closedAt;
    }

    /**
     * @param closedAt The closed_at
     */
    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    /**
     * @return Date of the time the request was created.
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
     * @return Submission ID that fulfilled this request
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
     * @return Date of the time the request was last updated
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
     * @return The submissionRequestProjects
     */
    public List<SubmissionRequestProject> getSubmissionRequestProjects() {
        return submissionRequestProjects;
    }

    /**
     * @param submissionRequestProjects The submission_request_projects
     */
    public void setSubmissionRequestProjects(List<SubmissionRequestProject> submissionRequestProjects) {
        this.submissionRequestProjects = submissionRequestProjects;
    }

    @Override
    public String toString() {
        return "SubmissionRequest{" +
                "id=" + id +
                ", userId=" + userId +
                ", status=" + status +
                ", closedAt=" + closedAt +
                ", createdAt=" + createdAt +
                ", submissionId=" + submissionId +
                ", updatedAt=" + updatedAt +
                ", submissionRequestProjects=" + submissionRequestProjects +
                '}';
    }
}
