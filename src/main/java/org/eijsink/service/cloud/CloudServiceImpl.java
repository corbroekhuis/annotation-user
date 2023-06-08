package org.eijsink.service.cloud;

import org.eijsink.model.Ticket;

import java.io.IOException;
import java.util.UUID;

public class CloudServiceImpl implements CloudService {

    public String login( String url, String user, String password) throws IOException {
        // call login, return token
        return UUID.randomUUID().toString();
    }

    public void logout( String url) throws IOException {
        // call logout
        return ;
    }

    public String callApi( String url, String token, Ticket bon) throws IOException {
        // Call url and pass token in request
        return "Ok";
    }
}
