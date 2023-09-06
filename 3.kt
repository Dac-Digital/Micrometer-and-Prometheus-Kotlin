data class Event(val label: String, val content: String)


fun send(event: Event) {
   count("my.app.processed.events") {
       tag("label", event.label)
       Thread.sleep(Default.nextLong(1000))
       println("$event sent")
   }
}
