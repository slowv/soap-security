//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.02 at 03:27:35 PM ICT 
//


package com.fintech.soapclient.bindings;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fintech.soapclient.bindings package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fintech.soapclient.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllTasksRequest }
     * 
     */
    public GetAllTasksRequest createGetAllTasksRequest() {
        return new GetAllTasksRequest();
    }

    /**
     * Create an instance of {@link GetAllTasksResponse }
     * 
     */
    public GetAllTasksResponse createGetAllTasksResponse() {
        return new GetAllTasksResponse();
    }

    /**
     * Create an instance of {@link TaskInfo }
     * 
     */
    public TaskInfo createTaskInfo() {
        return new TaskInfo();
    }

}
