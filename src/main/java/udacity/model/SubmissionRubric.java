package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SubmissionRubric {

    @SerializedName("file_filter_regex")
    @Expose
    private String fileFilterRegex;
    @SerializedName("upload_types")
    @Expose
    private List<String> uploadTypes = new ArrayList<String>();
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("nomination_eligible")
    @Expose
    private Boolean nominationEligible;
    @SerializedName("stand_out")
    @Expose
    private String standOut;
    @SerializedName("hide_criteria")
    @Expose
    private Boolean hideCriteria;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("hashtag")
    @Expose
    private String hashtag;
    @SerializedName("reviewer_toolkit_url")
    @Expose
    private Object reviewerToolkitUrl;
    @SerializedName("reviewer_toolkit_updated_at")
    @Expose
    private Object reviewerToolkitUpdatedAt;
    @SerializedName("max_upload_size_mb")
    @Expose
    private Integer maxUploadSizeMb;
    @SerializedName("project")
    @Expose
    private Project project;

    /**
     * @return The fileFilterRegex
     */
    public String getFileFilterRegex() {
        return fileFilterRegex;
    }

    /**
     * @param fileFilterRegex The file_filter_regex
     */
    public void setFileFilterRegex(String fileFilterRegex) {
        this.fileFilterRegex = fileFilterRegex;
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
     * @return The nominationEligible
     */
    public Boolean getNominationEligible() {
        return nominationEligible;
    }

    /**
     * @param nominationEligible The nomination_eligible
     */
    public void setNominationEligible(Boolean nominationEligible) {
        this.nominationEligible = nominationEligible;
    }

    /**
     * @return The standOut
     */
    public String getStandOut() {
        return standOut;
    }

    /**
     * @param standOut The stand_out
     */
    public void setStandOut(String standOut) {
        this.standOut = standOut;
    }

    /**
     * @return The hideCriteria
     */
    public Boolean getHideCriteria() {
        return hideCriteria;
    }

    /**
     * @param hideCriteria The hide_criteria
     */
    public void setHideCriteria(Boolean hideCriteria) {
        this.hideCriteria = hideCriteria;
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
     * @return The hashtag
     */
    public String getHashtag() {
        return hashtag;
    }

    /**
     * @param hashtag The hashtag
     */
    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    /**
     * @return The reviewerToolkitUrl
     */
    public Object getReviewerToolkitUrl() {
        return reviewerToolkitUrl;
    }

    /**
     * @param reviewerToolkitUrl The reviewer_toolkit_url
     */
    public void setReviewerToolkitUrl(Object reviewerToolkitUrl) {
        this.reviewerToolkitUrl = reviewerToolkitUrl;
    }

    /**
     * @return The reviewerToolkitUpdatedAt
     */
    public Object getReviewerToolkitUpdatedAt() {
        return reviewerToolkitUpdatedAt;
    }

    /**
     * @param reviewerToolkitUpdatedAt The reviewer_toolkit_updated_at
     */
    public void setReviewerToolkitUpdatedAt(Object reviewerToolkitUpdatedAt) {
        this.reviewerToolkitUpdatedAt = reviewerToolkitUpdatedAt;
    }

    /**
     * @return The maxUploadSizeMb
     */
    public Integer getMaxUploadSizeMb() {
        return maxUploadSizeMb;
    }

    /**
     * @param maxUploadSizeMb The max_upload_size_mb
     */
    public void setMaxUploadSizeMb(Integer maxUploadSizeMb) {
        this.maxUploadSizeMb = maxUploadSizeMb;
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
}