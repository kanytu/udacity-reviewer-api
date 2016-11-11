package udacity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import udacity.model.*;

import java.io.IOException;
import java.util.Date;

import static udacity.UdacityException.UdacityExceptionHandler;

public final class UdacityAPI {

    private static final String FORMAT = ".json";
    private static final String API_URL = "https://review-api.udacity.com/api/v1/";
    //me
    private static final String ME = "/me";
    private static final String CERTIFICATIONS = ME + "/certifications";
    private static final String SUBMISSIONS_ASSIGNED = ME + "/submissions/assigned";
    private static final String SUBMISSIONS_ASSIGNED_COUNT = ME + "/submissions/assigned_count";
    private static final String SUBMISSIONS = ME + "/submissions";
    private static final String STUDENT_FEEDBACKS = ME + "/student_feedbacks";
    private static final String STUDENT_FEEDBACKS_READ = "/student_feedbacks/%d/read";
    private static final String STUDENT_FEEDBACKS_STATS = ME + "/student_feedbacks/stats";
    private static final String SUBMISSION_REQUESTS = ME + "/submission_requests";
    private static final String SUBMISSIONS_COMPLETED = ME + "/submissions/completed";
    private static final String PROJECT_ASSIGN_SUBMISSION = "/projects/%d/submissions/assign";
    private static final String PROJECT_INFO = "/projects/%d";
    private static final String SUBMISSION_INFO = "/submissions/%d";
    private static final String SUBMISSION_CONTENT = SUBMISSION_INFO + "/contents";
    private static final String SUBMISSION_AUDIT = SUBMISSION_INFO + "/audit";
    private static final String GET_SUBMISSION_REQUESTS = "/submission_requests";
    private static final String ACTION_SUBMISSION_REQUESTS = GET_SUBMISSION_REQUESTS + "/%d";
    private static final String SUBMISSION_REQUESTS_REFRESH = ACTION_SUBMISSION_REQUESTS + "/refresh";
    private static final String SUBMISSION_REQUESTS_WAIT = GET_SUBMISSION_REQUESTS + "/%d" + "/waits";
    private static final String UNASSIGN_SUBMISSION_REQUESTS = GET_SUBMISSION_REQUESTS + "/%d" + "/unassign";
    private static final String CONTENT_COMMENTS = "contents/%d" + "/comments";
    private static final String AUDIT_CRITIQUES = "/audits/%d/critiques";
    private static String apiKey = null;
    private static final Gson gsonObject;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        gsonObject = builder.create();
    }

    private UdacityAPI() {
        //prevents initialization
    }

    private static String getMethod(String method) {
        return API_URL + method + FORMAT;
    }

    public static void initialize(String apiKey) {
        UdacityAPI.apiKey = apiKey;
    }

    private static <T> T getResponseObject(String method, REQUEST_TYPE requestType, String params, Class<T> aClass) throws UdacityException, IOException {
        return gsonObject.fromJson(getResponseObject(method, requestType, params), aClass);
    }

    private static String getResponseObject(String method, REQUEST_TYPE requestType, String params) throws UdacityException, IOException {
        assertAPIToken();
        Response response = ApacheUtils.getResponse(getMethod(method), requestType, apiKey, params);
        final String json = response.getContent();
        assertResponse(response, new UdacityExceptionHandler() {
            @Override
            public void handleStatusCode(int statusCode) throws UdacityException {
                if (statusCode < 200 || statusCode >= 300) {
                    throw new UdacityException(statusCode, gsonObject.fromJson(json, ErrorResponse.class));
                }
            }
        });
        return json;
    }

    /**
     * Fetches info on the logged in reviewer
     *
     * @return User information
     * @throws IOException
     * @throws UdacityException
     */
    public static User getMyInfo() throws IOException, UdacityException {
        return getResponseObject(ME, REQUEST_TYPE.GET, null, User.class);
    }

    /**
     * Returns all certifications for the logged in reviewer.
     *
     * @return Certification's array
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static Certification[] getMyCertifications() throws IOException, UdacityException {
        return getResponseObject(CERTIFICATIONS, REQUEST_TYPE.GET, null, Certification[].class);
    }

    /**
     * Returns all submissions currently assigned to the logged in reviewer
     *
     * @return Assigned submission's array
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static Submission[] getAssignedSubmissions() throws IOException, UdacityException {
        return getResponseObject(SUBMISSIONS_ASSIGNED, REQUEST_TYPE.GET, null, Submission[].class);
    }

    /**
     * Get submissions created by the authenticated user
     *
     * @return Submissions created by the authenticated user
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static Submission[] getSubmissions() throws IOException, UdacityException {
        return getResponseObject(SUBMISSIONS, REQUEST_TYPE.GET, null, Submission[].class);
    }

    /**
     * Get submissions completed by the authenticated reviewer
     *
     * @return Submissions reviewed by the authenticated user
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static Submission[] getSubmissionsCompleted() throws IOException, UdacityException {
        return getResponseObject(SUBMISSIONS_COMPLETED, REQUEST_TYPE.GET, null, Submission[].class);
    }

    /**
     * Get submissions completed by the authenticated reviewer
     *
     * @return Submissions reviewed by the authenticated user
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static Submission[] getSubmissionsCompleted(Date startDate, Date endDate) throws IOException, UdacityException {
        String params = "start_date=" + String.valueOf(startDate.getTime()) + "&end_date=" + String.valueOf(endDate.getTime());
        return getResponseObject(SUBMISSIONS_COMPLETED, REQUEST_TYPE.GET, params, Submission[].class);
    }

    /**
     * Get the active submission request for the currently authenticated reviewer.
     *
     * @return The active ({@link SubmissionRequestStatus} == {@link SubmissionRequestStatus#AVAILABLE}) submission request objects. Under current constraints this should always be zero or one such requests.
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static SubmissionRequest[] getSubmissionsRequests() throws IOException, UdacityException {
        return getResponseObject(SUBMISSION_REQUESTS, REQUEST_TYPE.GET, null, SubmissionRequest[].class);
    }

    /**
     * Get student feedback available for the authenticated reviewer.
     *
     * @param startDate Minimum {@link StudentFeedback#createdAt} date
     * @param endDate   Maximum {@link StudentFeedback#createdAt} date
     * @return Student feedback on submissions reviewed by authenticated user
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static StudentFeedback[] getStudentFeedbacks(Date startDate, Date endDate) throws IOException, UdacityException {
        String params = "start_date=" + String.valueOf(startDate.getTime()) + "&end_date=" + String.valueOf(endDate.getTime());
        return getResponseObject(STUDENT_FEEDBACKS, REQUEST_TYPE.GET, params, StudentFeedback[].class);
    }

    public static void markStudentFeedbackAsRead(int feedbackId) throws UdacityException, IOException {
        getResponseObject(String.format(STUDENT_FEEDBACKS_READ, feedbackId), REQUEST_TYPE.PUT, null);
    }

    /**
     * Get student feedback available for the authenticated reviewer.
     *
     * @return Student feedback on submissions reviewed by authenticated user. It will supply feedback created within the last 30 days.
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static StudentFeedback[] getStudentFeedbacks() throws IOException, UdacityException {
        return getResponseObject(STUDENT_FEEDBACKS, REQUEST_TYPE.GET, null, StudentFeedback[].class);
    }

    /**
     * Returns count of all open submissions
     *
     * @return Number of submissions {@link SubmissionStatus#IN_REVIEW} assigned to user
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static int getSubmissionsAssignedCount() throws IOException, UdacityException {
        return getResponseObject(SUBMISSIONS_ASSIGNED_COUNT, REQUEST_TYPE.GET, null, CountResponse.class).getAssignedCount();
    }

    /**
     * Get information about student feedback available for the authenticated reviewer.
     *
     * @return Information about student feedback received by the authenticated user
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static StudentFeedbackStats getStudentFeedbackStats() throws IOException, UdacityException {
        return new StudentFeedbackStats(getResponseObject(STUDENT_FEEDBACKS_STATS, REQUEST_TYPE.GET, null, CountResponse.class));
    }

    /**
     * Attempt to assign an available submission of the specified project to the authenticated reviewer.
     *
     * @param projectID ID of the project to request assignment of a submission for.
     * @return Successfully assigned submission
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static Submission assignSubmissionToProject(int projectID) throws IOException, UdacityException {
        return getResponseObject(String.format(PROJECT_ASSIGN_SUBMISSION, projectID), REQUEST_TYPE.POST, null, Submission.class);
    }

    /**
     * Create a new submission request for the authenticated reviewer
     *
     * @param submissionRequestProjects Project ID and language pairs you'd like to review.
     * @return Successfully created request
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static SubmissionRequest createSubmissionRequest(SubmissionRequestPair submissionRequestProjects) throws IOException, UdacityException {
        String json = gsonObject.toJson(submissionRequestProjects);
        return getResponseObject(GET_SUBMISSION_REQUESTS, REQUEST_TYPE.POST, json, SubmissionRequest.class);
    }

    /**
     * Terminate the submission request
     *
     * @param submissionId ID of the request owned by the currently authenticated reviewer
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static void deleteSubmissionRequest(int submissionId) throws IOException, UdacityException {
        getResponseObject(String.format(ACTION_SUBMISSION_REQUESTS, submissionId), REQUEST_TYPE.DELETE, null);
    }

    /**
     * Fetch a submission request by ID
     *
     * @param submissionId ID of the request owned by the currently authenticated reviewer
     * @return A submission request
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static SubmissionRequest getSubmissionRequest(int submissionId) throws IOException, UdacityException {
        return getResponseObject(String.format(ACTION_SUBMISSION_REQUESTS, submissionId), REQUEST_TYPE.GET, null, SubmissionRequest.class);
    }

    /**
     * Update the list of projects requested for an existing request
     *
     * @param submissionRequestId       ID of the request owned by the currently authenticated reviewer
     * @param submissionRequestProjects Project ID and language pairs you'd like to review.
     * @return A submission request
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static SubmissionRequest updateSubmissionRequest(int submissionRequestId, SubmissionRequestPair submissionRequestProjects) throws IOException, UdacityException {
        String json = gsonObject.toJson(submissionRequestProjects);
        return getResponseObject(String.format(ACTION_SUBMISSION_REQUESTS, submissionRequestId), REQUEST_TYPE.PUT, json, SubmissionRequest.class);
    }

    /**
     * Determine how many reviewers are ahead of the authenticated grader in queue
     *
     * @param submissionId ID of the request owned by the currently authenticated reviewer
     * @return Position in line awaiting reviews
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static SubmissionRequestWaitingList[] getSubmissionRequestWaitingList(int submissionId) throws IOException, UdacityException {
        return getResponseObject(String.format(SUBMISSION_REQUESTS_WAIT, submissionId), REQUEST_TYPE.GET, null, SubmissionRequestWaitingList[].class);
    }

    /**
     * Attempt to unassign the submission from the authenticated reviewer
     *
     * @param submissionId ID of the submission to unassign from the currently authenticated reviewer
     * @return Submission that was successfully unassigned
     * @throws IOException      if response is malformed
     * @throws UdacityException if status code is not 2xx
     */
    public static Submission unassignSubmission(int submissionId) throws IOException, UdacityException {
        return getResponseObject(String.format(UNASSIGN_SUBMISSION_REQUESTS, submissionId), REQUEST_TYPE.PUT, null, Submission.class);
    }

    public static SubmissionContent[] getSubmissionContents(int submissionId) throws IOException, UdacityException {
        return getResponseObject(String.format(SUBMISSION_CONTENT, submissionId), REQUEST_TYPE.GET, null, SubmissionContent[].class);
    }

    public static AuditCritique[] getAuditCritiques(int auditId) throws IOException, UdacityException {
        return getResponseObject(String.format(AUDIT_CRITIQUES, auditId), REQUEST_TYPE.GET, null, AuditCritique[].class);
    }

    public static SubmissionAudit getSubmissionAudit(int submissionId) throws IOException, UdacityException {
        return getResponseObject(String.format(SUBMISSION_AUDIT, submissionId), REQUEST_TYPE.GET, null, SubmissionAudit.class);
    }

    public static ContentComment[] getContentComments(int contentId) throws IOException, UdacityException {
        return getResponseObject(String.format(CONTENT_COMMENTS, contentId), REQUEST_TYPE.GET, null, ContentComment[].class);
    }

    public static SubmissionRequest refreshSubmissionRequest(int submissionId) throws IOException, UdacityException {
        return getResponseObject(String.format(SUBMISSION_REQUESTS_REFRESH, submissionId), REQUEST_TYPE.PUT, null, SubmissionRequest.class);
    }

    public static Project getProjectInfo(int projectId) throws UdacityException, IOException {
        return getResponseObject(String.format(PROJECT_INFO, projectId), REQUEST_TYPE.GET, null, Project.class);
    }

    public static Submission getSubmissionInfo(int submissionId) throws UdacityException, IOException {
        return getResponseObject(String.format(SUBMISSION_INFO, submissionId), REQUEST_TYPE.GET, null, Submission.class);
    }

    public static <T> T personalizedRequest(String method, String params, REQUEST_TYPE requestType, Class<T> tClass) throws IOException {
        Response response = ApacheUtils.getResponse(getMethod(method), requestType, apiKey, params);
        if (tClass == null) {
            return null;
        } else {
            return gsonObject.fromJson(response.getContent(), tClass);
        }
    }

    private static void assertResponse(Response response, UdacityExceptionHandler handler) throws UdacityException, IOException {
        handler.handleStatusCode(response.getStatusCode());
    }

    private static void assertAPIToken() throws UdacityException {
        if (apiKey == null || apiKey.isEmpty()) {
            throw new UdacityException("No api token found. Make sure you call UdacityAPI.initialize() with your token");
        }
    }

    public enum REQUEST_TYPE {
        GET,
        POST,
        DELETE,
        PUT
    }
}
