package udacity.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubmissionContent {
    @SerializedName("submission_id")
    @Expose
    private Integer submissionId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("blob")
    @Expose
    private String blob;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;

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
     * @return The sha
     */
    public String getSha() {
        return sha;
    }

    /**
     * @param sha The sha
     */
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * @return The path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path The path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * @return The blob
     */
    public String getBlob() {
        return blob;
    }

    /**
     * @param blob The blob
     */
    public void setBlob(String blob) {
        this.blob = blob;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return The commentsCount
     */
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     * @param commentsCount The comments_count
     */
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    @Override
    public String toString() {
        return "SubmissionContent{" +
                "submissionId=" + submissionId +
                ", id=" + id +
                ", sha='" + sha + '\'' +
                ", path='" + path + '\'' +
                ", size=" + size +
                ", blob='" + blob + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", commentsCount=" + commentsCount +
                '}';
    }
}
