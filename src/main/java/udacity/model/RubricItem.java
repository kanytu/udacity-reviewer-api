package udacity.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RubricItem {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("section_id")
    @Expose
    private Integer sectionId;
    @SerializedName("exceeded_description")
    @Expose
    private String exceededDescription;
    @SerializedName("passed_description")
    @Expose
    private String passedDescription;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private Date deletedAt;
    @SerializedName("optional")
    @Expose
    private Boolean optional;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("reviewer_tips")
    @Expose
    private String reviewerTips;
    @SerializedName("criteria")
    @Expose
    private String criteria;
    @SerializedName("exceedable")
    @Expose
    private Boolean exceedable;
    @SerializedName("section")
    @Expose
    private Section section;

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
     * @return The sectionId
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * @param sectionId The section_id
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * @return The exceededDescription
     */
    public String getExceededDescription() {
        return exceededDescription;
    }

    /**
     * @param exceededDescription The exceeded_description
     */
    public void setExceededDescription(String exceededDescription) {
        this.exceededDescription = exceededDescription;
    }

    /**
     * @return The passedDescription
     */
    public String getPassedDescription() {
        return passedDescription;
    }

    /**
     * @param passedDescription The passed_description
     */
    public void setPassedDescription(String passedDescription) {
        this.passedDescription = passedDescription;
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
     * @return The deletedAt
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt The deleted_at
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * @return The optional
     */
    public Boolean getOptional() {
        return optional;
    }

    /**
     * @param optional The optional
     */
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * @return The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * @return The reviewerTips
     */
    public String getReviewerTips() {
        return reviewerTips;
    }

    /**
     * @param reviewerTips The reviewer_tips
     */
    public void setReviewerTips(String reviewerTips) {
        this.reviewerTips = reviewerTips;
    }

    /**
     * @return The criteria
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * @param criteria The criteria
     */
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    /**
     * @return The exceedable
     */
    public Boolean getExceedable() {
        return exceedable;
    }

    /**
     * @param exceedable The exceedable
     */
    public void setExceedable(Boolean exceedable) {
        this.exceedable = exceedable;
    }

    /**
     * @return The section
     */
    public Section getSection() {
        return section;
    }

    /**
     * @param section The section
     */
    public void setSection(Section section) {
        this.section = section;
    }
}
