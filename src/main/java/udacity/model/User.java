package udacity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("github_token")
    @Expose
    private String githubToken;
    @SerializedName("accepted_terms")
    @Expose
    private Boolean acceptedTerms;
    @SerializedName("preconditions_completed")
    @Expose
    private Boolean preconditionsCompleted;
    @SerializedName("udacity_key")
    @Expose
    private String udacityKey;
    @SerializedName("application")
    @Expose
    private Application application;

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
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return The role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role The role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return The githubToken
     */
    public String getGithubToken() {
        return githubToken;
    }

    /**
     * @param githubToken The github_token
     */
    public void setGithubToken(String githubToken) {
        this.githubToken = githubToken;
    }

    /**
     * @return The acceptedTerms
     */
    public Boolean getAcceptedTerms() {
        return acceptedTerms;
    }

    /**
     * @param acceptedTerms The accepted_terms
     */
    public void setAcceptedTerms(Boolean acceptedTerms) {
        this.acceptedTerms = acceptedTerms;
    }

    /**
     * @return The preconditionsCompleted
     */
    public Boolean getPreconditionsCompleted() {
        return preconditionsCompleted;
    }

    /**
     * @param preconditionsCompleted The preconditions_completed
     */
    public void setPreconditionsCompleted(Boolean preconditionsCompleted) {
        this.preconditionsCompleted = preconditionsCompleted;
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
     * @return The application
     */
    public Application getApplication() {
        return application;
    }

    /**
     * @param application The application
     */
    public void setApplication(Application application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", githubToken='" + githubToken + '\'' +
                ", acceptedTerms=" + acceptedTerms +
                ", preconditionsCompleted=" + preconditionsCompleted +
                ", udacityKey='" + udacityKey + '\'' +
                ", application=" + application +
                '}';
    }
}
