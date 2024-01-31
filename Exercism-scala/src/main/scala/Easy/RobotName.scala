package Easy

object RobotName extends App {

  class Robot {

    private var code: String = generateName()

    def generateName(): String = {

      def randomLetras(): List[Char] = scala.util.Random.shuffle(('A' to 'Z').toList)

      def randomNumeros(): List[Int] = scala.util.Random.shuffle((0 to 9).toList)

      val letasYNumeros: String = (randomLetras.take(2) ++ randomNumeros.take(3)).mkString
      letasYNumeros.toString
    }

    def name(): String = code

    def reset(): Unit = {
      code = generateName()
    }
  }

  val robot = new Robot
  println(robot.name)
  robot.reset()
  println(robot.name)

}
