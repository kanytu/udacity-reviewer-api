package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountResponse {

    @SerializedName("unread_count")
    @Expose
    private Integer unreadCount;
    @SerializedName("recent_count")
    @Expose
    private Integer recentCount;
    @SerializedName("assigned_count")
    @Expose
    private Integer assignedCount;

    /**
     * @return number of feedbacks not seen by reviewer (no date limitation)
     */
    public Integer getUnreadCount() {
        return unreadCount;
    }

    /**
     * @param unreadCount The unread_count
     */
    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    /**
     * @return number of feedbacks created within the last 30 days
     */
    public Integer getRecentCount() {
        return recentCount;
    }

    /**
     * @param recentCount The recent_count
     */
    public void setRecentCount(Integer recentCount) {
        this.recentCount = recentCount;
    }

    /**
     * @return Number of submissions that are in_review assigned to authenticated user
     */
    public Integer getAssignedCount() {
        return assignedCount;
    }

    public void setAssignedCount(Integer assignedCount) {
        this.assignedCount = assignedCount;
    }

    @Override
    public String toString() {
        return "CountResponse{" +
                "unreadCount=" + unreadCount +
                ", recentCount=" + recentCount +
                ", assignedCount=" + assignedCount +
                '}';
    }
}
