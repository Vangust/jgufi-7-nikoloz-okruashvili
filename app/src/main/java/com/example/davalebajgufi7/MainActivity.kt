fun main () {

    var gela = Point(10,5)

    var emzari = Point(20,24)

    println(gela == emzari)
    gela.symetry()
    gela.toString()


//=======================================================

    val f1 = Fraction(12F, 8F)
    val f2 = Fraction(3F, 2F)

    f1.multiplication(f2)
    f1.addition(f2)
    f1.shekveca()

}

class Point(x:Int, y:Int) {
    var x:Int = x
    var y:Int = y
    //===================================
    override fun toString(): String {
        return println("$x , $y").toString()
    }
    //===================================
//2. equals მეთოდი - უნდა იძლეოდეს საშუალებას შევადაროთ 2 point კლასის ობიექტი, mtlad ver gavige ras mtxovdit aq mara sxva azri ver gamovitane
    override fun equals(other: Any?): Boolean{

        if (other is Point){
            if (x==y) return true

        }
        return false


    }
    //===================================
    fun symetry() {
        y *= (-1)
    }

//===================================


}

//=========================================================================================

class Fraction(n:Float, d:Float) {

    var numerator: Float = n
    var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator){
                return true
            }
        }
        return false
    }

    // ================================================== SHEKVECA==================================================
    fun shekveca(){

        for(i in numerator.toInt() downTo 1){
            if(numerator.toInt()%i==0 && denominator.toInt()%i==0)   {
                numerator /= i
                denominator /= i
                println(numerator)
                println(denominator)
                break
            }

        }




    }
// ================================================== SHEKVECA==================================================

    // ================================================== ADDITION==================================================
    fun addition(add:Fraction){
        if(denominator==add.denominator){
            var newfrac = Fraction(numerator+add.numerator, denominator)
            return println(newfrac.numerator)//print(newfrac.denominator) orive ratomgac ar iprinteba, rogor davprinto? QUESTION
        }
        else{
            var newfrac = Fraction(numerator*add.denominator+add.numerator*denominator, denominator*add.denominator)
            return println(newfrac.numerator)
        }
    }
// ================================================== ADDITION==================================================

    // ================================================== MULTIPLICATION=============================================
    fun multiplication(m:Fraction){
        var mult_reasult = Fraction(numerator*m.numerator, denominator*m.denominator)
        return println(mult_reasult.numerator) //print(mult_reasult.denominator) orive ratomgac ar iprinteba, rogor davprinto? SAME QUESTION

    }
// ================================================== MULTIPLICATION=============================================

}


