/**
 * *****************************************************************************
 * Copyright (c) 2012, Institute for Pervasive Computing, ETH Zurich. All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer. 2. Redistributions in
 * binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other
 * materials provided with the distribution. 3. Neither the name of the
 * Institute nor the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE INSTITUTE AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE INSTITUTE OR CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * This file is part of the Californium (Cf) CoAP framework.
 * ****************************************************************************
 */
package uk.ac.surrey.ee.iot.fiware.ngsi9.endpoint.coap;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;
import javax.xml.bind.JAXBException;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.coap.*;
import org.eclipse.californium.core.server.resources.CoapExchange;
import org.restlet.data.MediaType;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ResourceException;
import uk.ac.surrey.ee.iot.fiware.ngsi9.op.standard.Resource01_ContextRegistration;

public class CoapR01_ContextRegistration extends CoapResource {

    public CoapR01_ContextRegistration(String name) {
        super(name);
    }

    @Override
    public void handlePOST(CoapExchange exchange) {
        
            Response response = new Response(CoAP.ResponseCode.CONTENT);
            
            int contentType = exchange.getRequestOptions().getContentFormat();
            int acceptTypeVal = exchange.getRequestOptions().getAccept();
            String acceptType = "";
            switch (acceptTypeVal){
            
                case MediaTypeRegistry.APPLICATION_EXI:
                    break;
                case MediaTypeRegistry.APPLICATION_XML:
                    acceptType= MediaType.APPLICATION_XML.getSubType();
                    break;
                case MediaTypeRegistry.APPLICATION_JSON:
                    acceptType= MediaType.APPLICATION_JSON.getSubType();
                    break;
            }
            
            Resource01_ContextRegistration rc = new Resource01_ContextRegistration();
            byte[] message = exchange.getRequestPayload();
            InputStream isMsg =  new ByteArrayInputStream(message);
            StringRepresentation sr = new StringRepresentation("");
            
            try {
            switch (contentType){               
                
                case MediaTypeRegistry.APPLICATION_JSON:
                    sr = rc.registerJsonHandler(isMsg, acceptType);
                    response.setPayload(sr.getText());
                    break;
                default: 
                    response.setPayload("accept types supported: application/exi; application/xml; application/json");
            }            
           
        } catch (ResourceException ex) {
            Logger.getLogger(CoapR01_ContextRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       exchange.respond(response);

    }
}
