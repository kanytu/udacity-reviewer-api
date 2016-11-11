package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class AuditCritique {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("rubric_item_id")
    @Expose
    private Integer rubricItemId;
    @SerializedName("subject_id")
    @Expose
    private Integer subjectId;
    @SerializedName("observation")
    @Expose
    private String observation;
    @SerializedName("suggestion")
    @Expose
    private String suggestion;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("subject_type")
    @Expose
    private String subjectType;
    @SerializedName("exceedable")
    @Expose
    private Boolean exceedable;
    @SerializedName("rubric_item")
    @Expose
    private RubricItem rubricItem;

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
     * @return The rubricItemId
     */
    public Integer getRubricItemId() {
        return rubricItemId;
    }

    /**
     * @param rubricItemId The rubric_item_id
     */
    public void setRubricItemId(Integer rubricItemId) {
        this.rubricItemId = rubricItemId;
    }

    /**
     * @return The subjectId
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * @param subjectId The subject_id
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * @return The observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * @param observation The observation
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }

    /**
     * @return The suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * @param suggestion The suggestion
     */
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
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
     * @return The subjectType
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * @param subjectType The subject_type
     */
    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
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
     * @return The rubricItem
     */
    public RubricItem getRubricItem() {
        return rubricItem;
    }

    /**
     * @param rubricItem The rubric_item
     */
    public void setRubricItem(RubricItem rubricItem) {
        this.rubricItem = rubricItem;
    }
}
