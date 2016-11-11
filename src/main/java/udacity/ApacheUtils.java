package udacity;


import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;
import org.apache.http.util.TextUtils;
import udacity.model.Response;

import java.io.IOException;

final class ApacheUtils {
    private ApacheUtils() {

    }

    private static Request getRequest(String method, UdacityAPI.REQUEST_TYPE request_type, String key, String params) {
        Request request;
        switch (request_type) {
            case POST:
                request = Request.Post(method);
                if (params != null) {
                    request.bodyString(params, ContentType.APPLICATION_JSON);
                }
                break;
            case DELETE:
                request = Request.Delete(method);
                if (params != null) {
                    request.bodyString(params, ContentType.APPLICATION_JSON);
                }
                break;
            case PUT:
                request = Request.Put(method);
                if (params != null) {
                    request.bodyString(params, ContentType.APPLICATION_JSON);
                }
                break;
            case GET:
            default:
                request = Request.Get(TextUtils.isEmpty(method) ? method : method + "?" + params);
                break;
        }

        return request
                .addHeader("Authorization", key);
    }

    public static Response getResponse(String method, UdacityAPI.REQUEST_TYPE requestType, String key, String params) throws IOException {
        HttpResponse httpResponse = getRequest(method, requestType, key, params).execute().returnResponse();
        Response response = new Response();
        response.setStatusCode(httpResponse.getStatusLine().getStatusCode());
        if (httpResponse.getEntity() == null) {
            return response;
        }
        response.setContent(EntityUtils.toString(httpResponse.getEntity()));
        return response;
    }
}
