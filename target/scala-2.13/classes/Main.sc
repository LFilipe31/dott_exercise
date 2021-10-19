object Main {

  case class Order (var customerName : String, var contact : Int, var shippingAddress : String, var grandTotal : Int, var date : Int){
    def ordersList() = {
      println("hello")
    }
  }

  case class Item (var cost : Int, var shippingFee : Int, var taxAmount : Int){

  }

  case class Product (var productName : String, var category : String, var weight : Int, var price : Int, var creationDate : Int){

  }

  def main (args : Array[String]): Unit ={
    var o1 = Order(customerName = "Luís", contact = 910294661, shippingAddress = "Street 2", grandTotal = 20, date = 2020)
    o1.ordersList()
  }
}