package Solution.strStr

fun main(args: Array<String>) {
    val needle="issip"
    val hayStack="mississippi"

    println(strStr(hayStack, needle))
}

fun strStr(hayStack:String,needle:String):Int{

    val nLength=needle.length
    val hLength=hayStack.length

    if(hLength==0){
        if(nLength==0)
            return 0
        else
            return -1
    }else{
        if(nLength==0)
            return 0
    }

    val hCharArray=hayStack.toCharArray()
    val nCharArray=needle.toCharArray()

    val next=IntArray(nLength)

    getNext(needle,next)

    var i=0
    var j=0

    while (i<hLength&&j<nLength){
        if(hLength-i<nLength-j)
            return -1

        if(hCharArray[i]==nCharArray[j]){
            if(j==nLength-1)
                return i-j
        }else{
            val n=next[j]
            if(n==-1)
                j=-1
            else{
                j=n-1
                i--
            }
        }

        i++
        j++

    }

    return -1
}

fun getNext(needle: String,target:IntArray){

    var i=0;
    var j=-1;
    target[0]=-1;

    val charArray:CharArray=needle.toCharArray()

    while (i<needle.length-1){
        if(j==-1||charArray[i]==charArray[j]){
            i++
            j++
            target[i]=j
        }else{

            j=target[j]
        }
    }

}