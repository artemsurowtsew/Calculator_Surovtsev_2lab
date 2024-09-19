class  Calculator {
    fun calculate() {
        println("Оберіть потрібну вам дію(1-4): ")
        println("1.Додавання")
        println("2.Віднімання")
        println("3.Ділення")
        println("4.Множення")

        val operand = readLine()?.toIntOrNull() ?: return
        val selectedOperand = when (operand) {
            1 -> "Додавання"
            2 -> "Віднімання"
            3 -> "Ділення"
            4 -> "Множення"
            else -> {
                println("Немає такої дії")
                return
            }
        }


        println("Ви обрали:  $selectedOperand")

        println("Введіть число 1: ")

        val literal1 = readLine()?.toIntOrNull()
        if (literal1 != null) {
            println("Число 1: $literal1")
        } else {
            println("Будь-ласка, введіть корректні дані!")
            return
        }

        println("Введіть число 2 : ")
        val literal2 = readLine()?.toIntOrNull()
        if (literal2 != null) {
            println("Число 2: $literal2")
        } else {
            println("Будь-ласка, введіть корректні дані!")
            return
        }
        if (operand == 3 && literal2 == 0) {
            println("Неможна ділити на нуль!")
            return
        }

        val literal3: Int


        literal3 = when (operand) {
            1 -> literal1 + literal2
            2 -> literal1 - literal2
            3 -> literal1 / literal2
            4 -> literal1 * literal2
            else -> 0
        }

        println("Результат: $literal3")
    }
    }


    fun main() {
        val calculator = Calculator()
        calculator.calculate()
    }
