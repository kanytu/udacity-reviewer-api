package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Submission {

    @SerializedName("status")
    @Expose
    private SubmissionStatus status;
    @SerializedName("result")
    @Expose
    private ReviewResult result;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("rubric_id")
    @Expose
    private Integer rubricId;
    @SerializedName("grader_id")
    @Expose
    private Integer graderId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("repo_url")
    @Expose
    private String repoUrl;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("commit_sha")
    @Expose
    private String commitSha;
    @SerializedName("assigned_at")
    @Expose
    private Date assignedAt;
    @SerializedName("price")
    @Expose
    private Float price;
    @SerializedName("completed_at")
    @Expose
    private Date completedAt;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("zipfile")
    @Expose
    private Zipfile zipfile;
    @SerializedName("udacity_key")
    @Expose
    private String udacityKey;
    @SerializedName("status_reason")
    @Expose
    private String statusReason;
    @SerializedName("result_reason")
    @Expose
    private String resultReason;
    @SerializedName("training_id")
    @Expose
    private Integer trainingId;
    @SerializedName("files")
    @Expose
    private List<String> files = new ArrayList<String>();
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("annotation_urls")
    @Expose
    private List<String> annotationUrls = new ArrayList<String>();
    @SerializedName("general_comment")
    @Expose
    private String generalComment;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("previous_submission_id")
    @Expose
    private Integer previousSubmissionId;
    @SerializedName("nomination")
    @Expose
    private String nomination;
    @SerializedName("language")
    @Expose
    private Languages language;
    @SerializedName("is_training")
    @Expose
    private Boolean isTraining;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("grader")
    @Expose
    private Grader grader;
    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("rubric")
    @Expose
    private Rubric rubric;

    /**
     * @return Status of submission = ['processing', 'awaiting_review', 'in_review', 'completed', 'erred']
     */
    public SubmissionStatus getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(SubmissionStatus status) {
        this.status = status;
    }

    /**
     * @return Result of review = ['ungradeable', 'passed', 'failed', 'exceeded']
     */
    public ReviewResult getResult() {
        return result;
    }

    /**
     * @param result The result
     */
    public void setResult(ReviewResult result) {
        this.result = result;
    }

    /**
     * @return id of the submission for Reviews API
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
     * @return ID of the rubric of this submission
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
     * @return ID of assigned grader, if any
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
     * @return ID of the student
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
     * @return Notes on the submission provided by the student
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
     * @return URL of the Github repo, if available
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    /**
     * @param repoUrl The repo_url
     */
    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    /**
     * @return Date of creation
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
     * @return Date of last modification
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
     * @return SHA1 hash from the Github repo on creation of submission
     */
    public String getCommitSha() {
        return commitSha;
    }

    /**
     * @param commitSha The commit_sha
     */
    public void setCommitSha(String commitSha) {
        this.commitSha = commitSha;
    }

    /**
     * @return Date of assignment to a reviewer
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
     * @return Price to be paid, recorded at time assigned
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return Date of completion of review
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
     * @return S3 URL for the submission zip file
     */
    public String getArchiveUrl() {
        return archiveUrl;
    }

    /**
     * @param archiveUrl The archive_url
     */
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
     * @return Used for creation
     */
    public Zipfile getZipfile() {
        return zipfile;
    }

    /**
     * @param zipfile The zipfile
     */
    public void setZipfile(Zipfile zipfile) {
        this.zipfile = zipfile;
    }

    /**
     * @return identifier of submission on Udacity API
     */
    public String getUdacityKey() {
        return udacityKey;
    }

    /**
     * @param udacityKey The udacity_key
     */
    public void setUdacityKey(String udacityKey) {
        this.udacityKey = udacityKey;
    }

    /**
     * @return Error reason if the submission has an error status
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * @param statusReason The status_reason
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * @return Reason the submission was ungradeable
     */
    public String getResultReason() {
        return resultReason;
    }

    /**
     * @param resultReason The result_reason
     */
    public void setResultReason(String resultReason) {
        this.resultReason = resultReason;
    }

    /**
     * @return ID of the training if this a training submission
     */
    public Integer getTrainingId() {
        return trainingId;
    }

    /**
     * @param trainingId The training_id
     */
    public void setTrainingId(Integer trainingId) {
        this.trainingId = trainingId;
    }

    /**
     * @return Used for creation
     */
    public List<String> getFiles() {
        return files;
    }

    /**
     * @param files The files
     */
    public void setFiles(List<String> files) {
        this.files = files;
    }

    /**
     * @return URL to be reviewed. Typically a LinkedIn or Github profile
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return URLs of annotation PDFs supplied by reviewer
     */
    public List<String> getAnnotationUrls() {
        return annotationUrls;
    }

    /**
     * @param annotationUrls The annotation_urls
     */
    public void setAnnotationUrls(List<String> annotationUrls) {
        this.annotationUrls = annotationUrls;
    }

    /**
     * @return Comment on the review by the reviewer
     */
    public String getGeneralComment() {
        return generalComment;
    }

    /**
     * @param generalComment The general_comment
     */
    public void setGeneralComment(String generalComment) {
        this.generalComment = generalComment;
    }

    /**
     * @return true if submission is a staff revision of a prior submission
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * @param hidden The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * @return ID of the prior submission that was revised
     */
    public Integer getPreviousSubmissionId() {
        return previousSubmissionId;
    }

    /**
     * @param previousSubmissionId The previous_submission_id
     */
    public void setPreviousSubmissionId(Integer previousSubmissionId) {
        this.previousSubmissionId = previousSubmissionId;
    }

    /**
     * @return Submission excellence nomination text
     */
    public String getNomination() {
        return nomination;
    }

    /**
     * @param nomination The nomination
     */
    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    /**
     * @return The language
     */
    public Languages getLanguage() {
        return language;
    }

    /**
     * @param language The language
     */
    public void setLanguage(Languages language) {
        this.language = language;
    }

    /**
     * @return The isTraining
     */
    public Boolean getIsTraining() {
        return isTraining;
    }

    /**
     * @param isTraining The is_training
     */
    public void setIsTraining(Boolean isTraining) {
        this.isTraining = isTraining;
    }

    /**
     * @return The user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return The grader
     */
    public Grader getGrader() {
        return grader;
    }

    /**
     * @param grader The grader
     */
    public void setGrader(Grader grader) {
        this.grader = grader;
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
     * @return The rubric
     */
    public Rubric getRubric() {
        return rubric;
    }

    /**
     * @param rubric The rubric
     */
    public void setRubric(Rubric rubric) {
        this.rubric = rubric;
    }

    @Override
    public String toString() {
        return "Submission{" +
                "status=" + status +
                ", result=" + result +
                ", id=" + id +
                ", rubricId=" + rubricId +
                ", graderId=" + graderId +
                ", userId=" + userId +
                ", projectId=" + projectId +
                ", notes='" + notes + '\'' +
                ", repoUrl='" + repoUrl + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", commitSha='" + commitSha + '\'' +
                ", assignedAt=" + assignedAt +
                ", price=" + price +
                ", completedAt=" + completedAt +
                ", archiveUrl='" + archiveUrl + '\'' +
                ", zipfile=" + zipfile +
                ", udacityKey='" + udacityKey + '\'' +
                ", statusReason='" + statusReason + '\'' +
                ", resultReason='" + resultReason + '\'' +
                ", trainingId=" + trainingId +
                ", files=" + files +
                ", url='" + url + '\'' +
                ", annotationUrls=" + annotationUrls +
                ", generalComment='" + generalComment + '\'' +
                ", hidden=" + hidden +
                ", previousSubmissionId=" + previousSubmissionId +
                ", nomination='" + nomination + '\'' +
                ", language=" + language +
                ", isTraining=" + isTraining +
                ", user=" + user +
                ", grader=" + grader +
                ", project=" + project +
                ", rubric=" + rubric +
                '}';
    }
}
