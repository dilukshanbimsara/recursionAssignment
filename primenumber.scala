object primenumber{
    def prime(n:Int, i:Int):Boolean={
        if(i==1) return true
        else if(n%i == 0) return false
        else return prime(n,i-1)
    }

    def main(args:Array[String]){
       var n=10
       print(prime(n,n/2))
    }
}