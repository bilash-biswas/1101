import java.util.Scanner;
import scala.util.control.Breaks._
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var sum=0
    breakable {
    while(true)
    {
        var a=input.nextInt()
        var b=input.nextInt()
        
        if(a<=0 || b<=0)
        {
            break
        }
        else if(a<b)
        {
            for(i <- a to b)
            {
                printf("%d ",i)
                sum=sum+i
            }
        }
        else if(a>b)
        {
            for(i <- b to a)
            {
                printf("%d ",i)
                sum=sum+i
            }
        }
        printf("Sum=%d\n",sum)
        sum=0
    }
    }

}
}
 
