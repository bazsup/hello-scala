



object EntryPoint extends App {
    // def main(params: Array[String]) = {
        // println("Hello World, Temp")
    // }
    import scalaj.http._

    val response: HttpResponse[String] = Http("http://feeds.bbci.co.uk/news/rss.xml").asString
    import scala.xml.XML
    val elements = XML.loadString(response.body)
    // val nodes = elements.\\("item").\("title")
    val nodes = elements \\ "item" \ "title" // omit "." "()"
    // for (node <- nodes) println(node.text)

    val nodes2 = for (
        node <- nodes
        if (node.text.contains("Queen"))
    ) yield node

    nodes2.foreach(n => println(n.text))

    // homework slide 34
    // feed-sources

    // save to file -> format DD-MM-YYYY-HH-MM-SS-keyword
}
