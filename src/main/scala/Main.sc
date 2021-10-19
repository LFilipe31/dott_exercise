import com.github.nscala_time.time.Imports._

object Main {

  def main (args : Array[String]): Unit ={
    var o1 = Order(customerName = "Luís", contact = 910294661, shippingAddress = "Street 2", grandTotal = 20, date = DateTime.now())
    o1.ordersList(DateTime.lastYear(), DateTime.now())
  }

  case class Order (var customerName : String, var contact : Int, var shippingAddress : String, var grandTotal : Int, var date : DateTime){

    var p1 = Product(productName = "Computer", category = "Technology", weight = 8, price = 700, creationDate = DateTime.lastMonth())
    var p2 = Product(productName = "Cellphone", category = "Technology", weight = 100, price = 300, creationDate = DateTime.lastMonth())

    val dateStr = "2021-06-13"
    val formatter = DateTimeFormat.forPattern("yyyy-MM-dd")
    val dateTime:DateTime = formatter.parseDateTime(dateStr)

    def ordersList(beginDate : DateTime, endDate : DateTime) = {

      var count1 : Int = 0
      var count2 : Int = 0
      var count3 : Int = 0

      var totalOrders : Int = p2.getNumberOfInstances()
      val month : Int = p1.creationDate.getMonthOfYear

      if (month <= 3){
        count1 += 1
      }
      if(3 < month && month <= 6){
        count2 += 1
      }
      if(6 < month && month <= 12){
        count3 += 1
      }

      println("1-3 months: " + count1 + " order(s).")
      println("4-6 months: " + count2 + " order(s).")
      println("7-12 months: " + count3 + " order(s).")
    }
  }

  case class Product (var productName : String, var category : String, var weight : Int, var price : Int, var creationDate : DateTime){
    var objCounter : Int = 0

    def Product(): Unit ={
      objCounter+=1
    }

    def getNumberOfInstances(): Int ={
      return objCounter
    }
  }

  case class Item (var cost : Int, var shippingFee : Int, var taxAmount : Int){

  }
}