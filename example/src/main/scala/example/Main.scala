package example

object Main extends App {
  
  println(Lists.max(List(1,3,2)))
  println(Lists.max(List(1,3,23)))
  println(Lists.max(List(13,3,2)))
  
  println(Lists.sum(List(1,3,2)))
  println(Lists.sum(List(1,32,2)))
  println(Lists.sum(List(1,3,22)))
}