fun <T> count(metricName: String, process: ResourceSample.() -> T): T =
   Timer.resource(meterRegistry, metricName)
       .use {
           process(it)
       }
