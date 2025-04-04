var z = intArrayOf(1,2,3,4,5,6,7,8)
var y = 0
while(y < z.size){
    print(z[y])
    y++
}

for(i in z){
    print(i)
}

z.forEach { print(it) }

var num:Int = 21
when(num){
    1-> print("num=1")//1ဆိုရင် num=1 ဆိုပြီးထွက်
    2-> print("num=2")
    in 6..10 -> print("num is between 6 and 10")
    in 11..20 -> print("num is between 11 and 20")
    else -> print("num is $num")//တစ်ခုမှမဟုတ်ရင်
}

