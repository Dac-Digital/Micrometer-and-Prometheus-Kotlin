fun Route.metricsRoutes(prometheusMeterRegistry: PrometheusMeterRegistry) {
   get("/prometheus-metrics") {
       call.respondText(prometheusMeterRegistry.scrape())
   }
}
