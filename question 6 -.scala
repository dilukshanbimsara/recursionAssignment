// object fibonacci extends App{

    
//     def fibonacci(n:Int):Int={
//         if(n==1) return 0
//         else if(n==2) return 1 
//         else return (fibonacci(n-1)+fibonacci(n-2))   
//     }

//     def seq(n:Int):Unit={
//         if(n>0) seq(n-1)
//         println(fibonacci(n))
//     }

//     seq(5)
// }

object fibonacci extends App{
    def fibonacci(n:Int):Int= n match{
        case 0 => 0
        case x if x==1 => 1
        case _ => fibonacci(n-1)+fibonacci(n-2)
    }
    def fibonacciSeq(n:Int):Unit= {
        if (n > 0) fibonacciSeq(n-1)
        println(fibonacci(n))
    }
    fibonacciSeq(10)
}
