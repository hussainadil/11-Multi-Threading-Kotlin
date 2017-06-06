//Multi Threading Demo
fun main(args: Array<String>) {

    var t1=thread("thread1")
    t1.start()
    var t2=thread("thread2")
    t2.start()
    var t3=thread("thread3")
    t3.start()
    t3.join()
    println("Thread in run")
}
class thread():Thread(){
var ThreadName:String?=null
    constructor(ThreadName:String) : this(){
        this.ThreadName=ThreadName
        println(this.ThreadName+" is start")
    }


    override fun run() {
        var count=0
        while(count<10){
            println(this.ThreadName+" Count : $count")
            count++
            try {
                Thread.sleep(1000)
            }//try end
            catch (ex:Exception){
                println(ex.message)
            }// catch end
        }//while loop end
    }// fun end
}//class end