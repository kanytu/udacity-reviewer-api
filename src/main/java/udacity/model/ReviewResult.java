package udacity.model;


import com.google.gson.annotations.SerializedName;

public enum ReviewResult {
    @SerializedName("ungradeable")
    UNGRADEABLE,
    @SerializedName("passed")
    PASSED,
    @SerializedName("failed")
    FAILED,
    @SerializedName("exceeded")
    EXCEEDED
}
