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

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Random;

/**
 * This is the Microservice resource class.
 * See <a href="https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 0.1
 */
@Path("/hello")
public class HelloService {

//    @POST
//    @Path("/sum")
//    public String response(String name) {
//        long t1= System.currentTimeMillis();
//        int l=Integer.MAX_VALUE/10;
//        long x=0;
//        for (int i=0;i<l;i++){
//            x=x+i;
//        }
//        String t= String.valueOf(System.currentTimeMillis()-t1);
//        return  t + ", "+ x;
//    }

    @POST
    @Path("/sum")
    public String response(String name) {
        long t1= System.currentTimeMillis();
        Random random =new Random();
        int h=Integer.MAX_VALUE/6;
        int l=Integer.MAX_VALUE/10;
        double r= random.nextInt(h-l)+l;
        long x=0;
        for (int i=0;i<r;i++){
            x=x+i;
        }
        String t= String.valueOf(System.currentTimeMillis()-t1);
        return  t + " Random no=" + r;
    }


}
