<h1 style = "color:red;">Java Project - Online-Grocery-Shopping</h1>
<br>Team Members-
<br>1. Nasir Ahammad Suvo
<br>2. SM Najmul Hossain
<br>3. Robiul Hasan
<br>4. Sudip Mandal
<h2 > UML Diagram </h2>
<pre>
+--------------------+           +---------------------+         
|      User          |           |       Order         |
+--------------------+           +---------------------+
| - userId: int      |           | - orderId: int      |
| - name: String     |           | - orderDate: Date   |
| - email: String    |           | - status: String    |
| - password: String |           | - totalAmount: float|
|--------------------|           |---------------------|
| + register()       |           | + placeOrder()      |
| + login()          |           | + cancelOrder()     |
| + logout()         |           | + trackOrder()      |
+--------------------+           +---------------------+
         |                                     |
         |                                     |
         |                                     |
         |          +---------------------+    |
         +----------|        Cart         |----+
                    |---------------------|
                    | - cartId: int       |
                    | - items: List       |
                    | - totalPrice: float |
                    |---------------------|
                    | + addItem()         |
                    | + removeItem()      |
                    | + calculateTotal()  |
                    +---------------------+
           +--------|                   |------------------+
           |                            |                  |
           v                            v                  v
+--------------------+     +---------------------+     +--------------------------+
|      Product       |     |      Payment        |     |    Delivery              |
|--------------------|     |---------------------|     |--------------------------|
| - productId: int   |     | - paymentId: int    |     | - deliveryId: int        |
| - name: String     |     | - amount: float     |     | - address: String        |
| - price: float     |     | - method: String    |     | - deliveryStatus: String |
| - category: String |     |---------------------|     |----------------------    |
| - availability: int|     | + processPayment()  |     | + updateStatus()         |
|--------------------|     +---------------------+     +--------------------------+
| + addProduct()     |
| + updateAvailability()|
| + viewProduct()    |
+--------------------+

</pre>