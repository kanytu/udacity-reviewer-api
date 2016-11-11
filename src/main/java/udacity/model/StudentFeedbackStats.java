package udacity.model;

/**
 * Created by pjoliveira on 30-10-2016.
 */
public class StudentFeedbackStats {
    private int unreadCount;
    private int recentCount;

    public StudentFeedbackStats(CountResponse count) {
        unreadCount = count.getUnreadCount();
        recentCount = count.getRecentCount();
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
    }

    public int getRecentCount() {
        return recentCount;
    }

    public void setRecentCount(int recentCount) {
        this.recentCount = recentCount;
    }

    @Override
    public String toString() {
        return "StudentFeedbackStats{" +
                "unreadCount=" + unreadCount +
                ", recentCount=" + recentCount +
                '}';
    }
}
