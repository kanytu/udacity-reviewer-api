package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SubmissionRequestPair {

    @SerializedName("projects")
    @Expose
    private List<SubmissionRequestProject> submissionRequestProjectList;

    public List<SubmissionRequestProject> getSubmissionRequestProjectList() {
        return submissionRequestProjectList;
    }

    public void setSubmissionRequestProjectList(List<SubmissionRequestProject> submissionRequestProjectList) {
        this.submissionRequestProjectList = submissionRequestProjectList;
    }

    @Override
    public String toString() {
        return "SubmissionRequestPair{" +
                "submissionRequestProjectList=" + submissionRequestProjectList +
                '}';
    }
}
