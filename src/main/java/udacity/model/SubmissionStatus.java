package udacity.model;

import com.google.gson.annotations.SerializedName;


public enum SubmissionStatus {
    @SerializedName("processing")
    PROCESSING,
    @SerializedName("delaying_review")
    DELAYING_REVIEW,
    @SerializedName("awaiting_review")
    AWAITING_REVIEW,
    @SerializedName("in_review")
    IN_REVIEW,
    @SerializedName("completed")
    COMPLETED,
    @SerializedName("erred")
    ERRED
}
