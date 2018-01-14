import scala.math._;
import scala.collection.mutable.ArrayBuffer;

object HelloWorld {



  def main(args: Array[String]) {



    val p1 = new Person
    val p2 = new Person("alvin")
    val p3 = new Person("alvin",22)

    for (x <- 1 to 9;j <- 1 to x) print(x + "*" + j + "=" + x * j + "  " + "\t")




/*
    val aa = new Array[Int](5)
    val bb = Array("a","b","c")
    for (i <- (0 until bb.length).reverse)
      print(bb(i))
*/
  //  print(add(4))
   // print(max(1,2,3))


   // val two = Two
    //two.increment();

    //val two1 = new Two1

    //two1.age_=(2)

    //print(two1.age)
   // two1.aaa


   // print(two.curent())

/*
    var a: String = "ssssss";
    var x = 3;
    var b = 4;
    */
  }

  def add(a :Int): Int ={

    var b = 9

    return a + b
  }



  def max(a: Int, b :Int)= if (a >= b) a else b

  def equal(a: Int, b: Int) = if (a == b) true else false

  def max(a: Int, b: Int, c: Int):Int={

    val aa = Array(a,b,c)

    return aa.max
  }


































    //lazy var y = scala.io.Source.fromFile("sa").mkString

    //println("hello".apply(4));

   // var aa = if (x > 0) "positive" else -1
    //print(aa)
    // print(x.+(b));
    //print(b+1);
   // print(1 to 10);
   // print("--------")
    //print(sqrt(2));

    //for (i <- 0 until a.length)
    // print(i);
    //for (i <- 1 to 3; j <- 1 to 3 if i != j)
    //  print((10 * i + j) + " ")

    //print(sum(9));
    //var s = sum(1,4,9,16,25)
   // var s = sum(1 to 5: _*)
    //print("  ")
    //print(s)
   /*
    if ( x > 0) {
      sqrt(x)
    } else throw  new IllegalArgumentException("ss")
*/
/*
    var s = new Array[String](10)
    var aaa = Array("hello","world")
    s(0) = "ss"
   //var bbb = ArrayBuffer[Int]()
    //bbb += 1
    var bbb = Array(2,3,5,7,11)
    //bbb.trimEnd(5)
    //bbb.insert(2,333,33)

    bbb.filter(_ % 2 == 0).map(2 * _)

    for (i <- bbb) {
     print(i)
     print(" ")
    }
    */
    /*
    var e = 0;
    for (q <- 1 to 10 if q != 10)
     // print(q)
    for (w <- 1 to 100 if w % 2 == 0)
      e = e + w
*/
   // print(e)
    //print(fa(5))


  /*
  def addInt(): Int ={

    var sum : Int = 33;
    return sum + 1;
  }
*/
/*
  def fac(n: Int) = {

    var r = 1;
    for (i <- 1 to 10)
      r = r + 1;
    r;
    */

  //def fa(n: Int): Int = if (n <= 0) 1 else n * fa(n - 1)

 // def sum(args: Int*)={
 //   var result = 0;
 //   for (arge <- args) {
 //     result += arge;
//      print("  ")
//      print(result)
//    }
//    result
 // }


}
