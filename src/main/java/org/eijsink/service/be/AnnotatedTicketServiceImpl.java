package org.eijsink.service.be;

import org.eijsink.annotation.CallCloudService;

@CallCloudService( url = "http://someserver:8888/service/bon",
          user = "gebruiker",
          password = "Secr&t01")
public class AnnotatedTicketServiceImpl implements TicketService {

}
