package com.example.BanqueSI.WebServices;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


/**
 * Created by amino on 02/08/2017
 */

@EnableWs
@Configuration
@ComponentScan(basePackages = "com.example.BanqueSI.WebServices")
public class WSConfig extends WsConfigurerAdapter{

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    // operation
    @Bean(name = "operation")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema operationSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("operationPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/operation");
        wsdl11Definition.setSchema(operationSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema operationSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/operation.xsd"));
    }
    // -- //

    // task
    @Bean(name = "task")
    public DefaultWsdl11Definition defaultWsdl11Definitiontask(XsdSchema taskSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("taskPort");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/task");
        wsdl11Definition.setSchema(taskSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema taskSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/task.xsd"));
    }
    //--//

    // employe
    @Bean(name = "employe")
    public DefaultWsdl11Definition defaultWsdl11Definitionemploye(XsdSchema employeSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("employePort");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/employe");
        wsdl11Definition.setSchema(employeSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema employeSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/employe.xsd"));
    }
    //--//

    // cheque
    @Bean(name = "cheque")
    public DefaultWsdl11Definition defaultWsdl11Definitioncheque(XsdSchema chequeSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("chequePort");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/cheque");
        wsdl11Definition.setSchema(chequeSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema chequeSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/cheque.xsd"));
    }
    //--//

    // change
    @Bean(name = "change")
    public DefaultWsdl11Definition defaultWsdl11Definitionchange(XsdSchema changeSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("changePort");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/change");
        wsdl11Definition.setSchema(changeSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema changeSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/change.xsd"));
    }
    //--//

    // client
    @Bean(name = "client")
    public DefaultWsdl11Definition defaultWsdl11Definitionclient(XsdSchema clientSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("clientPort");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/client");
        wsdl11Definition.setSchema(clientSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema clientSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/client.xsd"));
    }
    //--//

    // agence
    @Bean(name = "agence")
    public DefaultWsdl11Definition defaultWsdl11Definitionagence(XsdSchema agenceSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("agencePort");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/agence");
        wsdl11Definition.setSchema(agenceSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema agenceSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/agence.xsd"));
    }
    //--//

    // compte
    @Bean(name = "cp")
    public DefaultWsdl11Definition defaultWsdl11Definitioncp(XsdSchema cpSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setPortTypeName("cpPort");
        wsdl11Definition.setTargetNamespace("http://com.exemple.banqueSI.WebServices/cp");
        wsdl11Definition.setSchema(cpSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema cpSchema(){
        return new SimpleXsdSchema(new ClassPathResource("WebServicesWSDL/cp.xsd"));
    }
    //--//


}