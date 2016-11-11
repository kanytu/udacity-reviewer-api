package udacity.model;

import com.google.gson.annotations.SerializedName;

public enum CertificationStatus {
    @SerializedName("applied")
    APPLIED,
    @SerializedName("shortlisted")
    SHORTLISTED,
    @SerializedName("training")
    TRAINING,
    @SerializedName("certified")
    CERTIFIED,
    @SerializedName("inactive")
    INACTIVE,
    @SerializedName("blocked")
    BLOCkED
}
