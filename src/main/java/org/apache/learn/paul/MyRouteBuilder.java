package org.apache.learn.paul;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.learn.paul.DTO.Client;


public class MyRouteBuilder extends RouteBuilder
{

    DataFormat bindy = new BindyCsvDataFormat(Client.class);

    public void configure()
    {
        from("file:src/data/?noop=True&fileName=cardsclients.csv")
                .unmarshal(bindy)
                .process(new ProcessorClient())
                .to("log:foo");
    }

}
