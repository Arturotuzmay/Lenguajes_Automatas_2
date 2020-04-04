package lenguaje_intermedio;
import java.util.Stack;

//Clase que genera la prioridad y almacena los operadores
public class Pila {

    Character getTopOfOperator(Stack<Character> stack){
        if (stack.isEmpty()){
            return 'e';
            
        }

        Character top=stack.peek();
        return top;
    }

}
