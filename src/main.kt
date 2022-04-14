import java.time.temporal.TemporalAmount

fun main(){
    var currentAccount = CurrentAccount("098787","Nadine",1000000.0,)
    (currentAccount.deposit(5000.20))
    (currentAccount.withdraw(292000.35))
    (currentAccount.details())

    fruit("banana")
}
open class CurrentAccount( var accountNumber:String,var accountName:String,var balance:Double,){
    fun deposit(amount:Double){
        balance+= amount
        println(balance)
    }
    fun withdraw(amount: Double){
        var withdrawan = amount-balance
        balance-=withdrawan
        println (balance)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName ")
    }
}
class SavingsAccount(accountNumber: String,accountName: String,balance: Double,withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
   fun withdraw(){
   }
}

data class Product(var name:String, var weight:Double, var price:Int, var category:String)
fun takeProduct(){

}

fun fruit(name: String):String{
    name.forEachIndexed { index, c ->
        if (index % 2 == 0) {
            println(c)
        }
    }
        return name
    }


