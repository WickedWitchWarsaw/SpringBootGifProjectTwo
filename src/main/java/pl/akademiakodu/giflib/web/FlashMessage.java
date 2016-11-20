package pl.akademiakodu.giflib.web;

import static jdk.nashorn.tools.Shell.SUCCESS;
import static org.ietf.jgss.GSSException.FAILURE;

/**
 * Created by ZuZ on 2016-11-20.
 */
public class FlashMessage {

    public enum Status {
        SUCCESS, FAILURE;
    }

    private Status status;
    private String message;


    public FlashMessage(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
