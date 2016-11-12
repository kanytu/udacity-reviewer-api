package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    @SerializedName("languages_to_recruit")
    @Expose
    private List<Language> languageToRecruit = new ArrayList<Language>();
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("udacity_key")
    @Expose
    private String udacityKey;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("required_skills")
    @Expose
    private String requiredSkills;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("awaiting_review_count")
    @Expose
    private Integer awaitingReviewCount;
    @SerializedName("waitlist")
    @Expose
    private Boolean waitlist;
    @SerializedName("nanodegree_key")
    @Expose
    private String nanodegreeKey;
    @SerializedName("audit_project_id")
    @Expose
    private Integer auditProjectId;
    @SerializedName("upload_types")
    @Expose
    private String uploadTypes;
    @SerializedName("file_filter_regex")
    @Expose
    private String fileFilterRegex;
    @SerializedName("nomination_eligible")
    @Expose
    private Boolean nominationEligible;
    @SerializedName("hashtag")
    @Expose
    private String hashtag;
    @SerializedName("stand_out")
    @Expose
    private String standOut;
    @SerializedName("hide_criteria")
    @Expose
    private Boolean hideCriteria;

    @SerializedName("audit_rubric_id")
    @Expose
    private Integer auditRubricId;
    @SerializedName("is_cert_project")
    @Expose
    private Boolean isCertProject;

    /**
     * @return The languageToRecruit
     */
    public List<Language> getLanguageToRecruit() {
        return languageToRecruit;
    }

    /**
     * @param languageToRecruit The languages_to_recruit
     */
    public void setLanguageToRecruit(List<Language> languageToRecruit) {
        this.languageToRecruit = languageToRecruit;
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
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return The udacityKey
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
     * @return The requiredSkills
     */
    public String getRequiredSkills() {
        return requiredSkills;
    }

    /**
     * @param requiredSkills The required_skills
     */
    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    /**
     * @return The visible
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * @param visible The visible
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * @return The awaitingReviewCount
     */
    public Integer getAwaitingReviewCount() {
        return awaitingReviewCount;
    }

    /**
     * @param awaitingReviewCount The awaiting_review_count
     */
    public void setAwaitingReviewCount(Integer awaitingReviewCount) {
        this.awaitingReviewCount = awaitingReviewCount;
    }

    /**
     * @return The waitlist
     */
    public Boolean getWaitlist() {
        return waitlist;
    }

    /**
     * @param waitlist The waitlist
     */
    public void setWaitlist(Boolean waitlist) {
        this.waitlist = waitlist;
    }

    /**
     * @return The nanodegreeKey
     */
    public String getNanodegreeKey() {
        return nanodegreeKey;
    }

    /**
     * @param nanodegreeKey The nanodegree_key
     */
    public void setNanodegreeKey(String nanodegreeKey) {
        this.nanodegreeKey = nanodegreeKey;
    }

    /**
     * @return The auditProjectId
     */
    public Integer getAuditProjectId() {
        return auditProjectId;
    }

    /**
     * @param auditProjectId The audit_project_id
     */
    public void setAuditProjectId(Integer auditProjectId) {
        this.auditProjectId = auditProjectId;
    }

    /**
     * @return The uploadTypes
     */
    public String getUploadTypes() {
        return uploadTypes;
    }

    /**
     * @param uploadTypes The upload_types
     */
    public void setUploadTypes(String uploadTypes) {
        this.uploadTypes = uploadTypes;
    }

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
     * @return The auditRubricId
     */
    public Integer getAuditRubricId() {
        return auditRubricId;
    }

    /**
     * @param auditRubricId The audit_rubric_id
     */
    public void setAuditRubricId(Integer auditRubricId) {
        this.auditRubricId = auditRubricId;
    }

    /**
     * @return The isCertProject
     */
    public Boolean getIsCertProject() {
        return isCertProject;
    }

    /**
     * @param isCertProject The is_cert_project
     */
    public void setIsCertProject(Boolean isCertProject) {
        this.isCertProject = isCertProject;
    }

    @Override
    public String toString() {
        return "Project{" +
                "languageToRecruit=" + languageToRecruit +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", udacityKey='" + udacityKey + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", description='" + description + '\'' +
                ", requiredSkills='" + requiredSkills + '\'' +
                ", visible=" + visible +
                ", awaitingReviewCount=" + awaitingReviewCount +
                ", waitlist=" + waitlist +
                ", nanodegreeKey='" + nanodegreeKey + '\'' +
                ", auditProjectId=" + auditProjectId +
                ", uploadTypes='" + uploadTypes + '\'' +
                ", fileFilterRegex='" + fileFilterRegex + '\'' +
                ", nominationEligible=" + nominationEligible +
                ", hashtag='" + hashtag + '\'' +
                ", standOut='" + standOut + '\'' +
                ", hideCriteria=" + hideCriteria +
                ", auditRubricId=" + auditRubricId +
                ", isCertProject=" + isCertProject +
                '}';
    }
}
