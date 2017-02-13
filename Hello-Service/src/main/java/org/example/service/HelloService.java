/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.example.service;

import org.apache.commons.io.IOUtils;
import org.wso2.msf4j.formparam.FormItem;
import org.wso2.msf4j.formparam.FormParamIterator;
import org.wso2.msf4j.formparam.exception.FormUploadException;
import org.wso2.msf4j.formparam.util.StreamUtil;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * This is the Microservice resource class.
 * See <a href="https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 0.1
 */
@Path("/hello")
public class HelloService {

//    @GET
//    @Path("/{name}")
//    public String hello(@PathParam("name") String name) {
//        return name;
//    }
//
//    @POST
    @GET
    @Path("/Response")
    @Consumes({ MediaType.APPLICATION_FORM_URLENCODED, MediaType.MULTIPART_FORM_DATA })
    public Response response() {
//        System.out.println(body);
        return Response.ok().entity("Hello world !").build();
    }

}
