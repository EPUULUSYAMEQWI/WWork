fun main() {
//var t=getEven("Amekwi")
    var w=Currentaccount(45,"Lucy",258)
    println(w)


}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”(5points)
class Currentaccount(var accountnumber:Int, var accountname:String , var balance:Int) {
    fun Deposit(amount: Double): Double {
        var z = balance * amount
        return z

        fun withdrawFees(Amount: Double): Int {
            var t = balance * Amount
            println(t)
            return t



//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)

data class catego(var name:String,var weight:Int,var price:Int,var category:String)


//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
fun getEven(name:String):Char {
    var s = name
    if (s  % 2==0)

        return s










