private val tripsInProgressStrongReference = AtomicLong()


fun gaugeTripsInProgress() {
   val tripsInProgress = repository.getTripsInProgress()
   tripsInProgressStrongReference.set(tripsInProgress)
   meterRegistry.gauge("my.app.trips.in.progress", Tags.empty(), tripsInProgressStrongReference) {
       tripsInProgressStrongReference.get().toDouble()
   }
}
