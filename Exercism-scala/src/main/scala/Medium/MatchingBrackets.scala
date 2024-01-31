package Medium

object MatchingBrackets extends App{
  def isPaired(brackets: String): Boolean = {
    var stack: List[Char] = List()

    for (x <- brackets) {
      x match {
        case '{' | '[' | '(' => stack = x :: stack
        case '}' => if (stack.isEmpty || stack.head != '{') return false else stack = stack.tail
        case ']' => if (stack.isEmpty || stack.head != '[') return false else stack = stack.tail
        case ')' => if (stack.isEmpty || stack.head != '(') return false else stack = stack.tail
        case _ => None
      }
    }
    print(stack)
    stack.isEmpty

  }
  println(isPaired("}{"))

}