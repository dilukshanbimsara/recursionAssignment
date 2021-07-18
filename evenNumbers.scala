object even{
    def sum_even(n:Int):Int={
        if(n==0) return 0
        else if(n%2==0) {
            return (n + sum_even(n-2))
        }
        else sum_even(n-1)
    }
    def main(args:Array[String]){
        val n=9
        println(sum_even(n-1))
    }
    
}