
(function () {

    var idArray=[];
    var finalTable = "";
    var tableCreate = [];
    var tableData = "";
    var tableCreator = "";
    var deletebtn = null;
    var sum = 0;
    var sumArray = [];
    var quantityOfProduct = 0;
    var selectedItem = {};
    var products = [{
        product_id: 1,
        product_name: "iPhone 6s",
        product_price: 28000
    },
    {
        product_id: 2,
        product_name: "iPhone 7",
        product_price: 37999

    },
    {
        product_id: 3,
        product_name: "iPhone 8",
        product_price: 56999

    },
    {
        product_id: 4,
        product_name: "iPhone X",
        product_price: 68000

    },
    {
        product_id: 5,
        product_name: "iPhone Xr",
        product_price: 58000

    },
    {
        product_id: 6,
        product_name: "iPhone Xs",
        product_price: 94000

    },
    {
        product_id: 7,
        product_name: "iPhone Xs Max",
        product_price: 104900

    },
    ]

    function itemsLoadInHTML() {
        var paragraph = document.getElementById("paragraph_id");
        var htmlTagString = "";
        for (var i = 0; i < products.length; i++) {
            htmlTagString = htmlTagString + "<option value=" + products[i].product_id + ">" + products[i].product_name + " " + products[i].product_price + "<option>"
        }
        paragraph.innerHTML = '<label style="background-color: crimson"> Products  </label> ' + '&nbsp&nbsp<select id="select_id" name="products"><option>Select Product</option>'
            + htmlTagString + '</select>' + '&nbsp&nbsp<input style="width:30px" id="quantityID" type="number"></input>' + '&nbsp&nbsp<button style="background-color:cyan " id="addbtn_id">Add To Cart</button>';
    }
    
    itemsLoadInHTML();

    var add = document.getElementById("addbtn_id");
    add.addEventListener("click", addToCart);

    function addToCart() {

        quantityOfProduct = document.getElementById("quantityID").value;
        console.log(quantityOfProduct);
        tableData = "";
        var tableDataStart = "<tr>"
        var tableDataEnd = "</tr>"
        tableCreator = '<table id="products"><thead><th >ID</th><th >Name</th><th >Price</th><th >Quantity</th><th>Amount</th><th>Action</th></thead>';
        selectedItem = document.getElementById("select_id").value;
        for (var index = 0; index < products.length; index++) {
            if (products[index].product_id == parseInt(selectedItem)) {
                tableData = "<td>" + products[index].product_id + "</td>" + "<td>" + products[index].product_name + "</td>" + "<td>" + products[index].product_price + "</td>" + "<td>" + quantityOfProduct + "</td>" + "<td>" + products[index].product_price * parseInt(quantityOfProduct) + "</td>" + '<td><button class="btn" id="btn_id' + products[index].product_id + '">Remove</button></td>';
                finalTable = tableDataStart + tableData + tableDataEnd;
                tableCreate.push(finalTable);
                sumArray.push(products[index].product_price * parseInt(quantityOfProduct))
                console.log(sumArray);
            }

        }

        displayTable();
    };

    function displayTable() {
        var tableValue = "";

        for (var i = 0; i < tableCreate.length; i++) {
            tableValue = tableValue + tableCreate[i];
        }
        document.getElementById("table_id").innerHTML = tableCreator + tableValue + "</table>";
        for (var i = 0; i < tableCreate.length; i++) {
            sum = sum + sumArray[i];
        }
        document.getElementById("amount_id").innerHTML = '<label style="background-color:"red">Bill Summmery : ' + sum + "</label>";

        deletebtn = document.querySelectorAll(".btn");
        deletebtn.forEach(element => {

            element.addEventListener("click", function () {
                sum = 0;
                var indexOfRaw = this.parentNode.parentNode.rowIndex;
                console.log(indexOfRaw);
                document.getElementById("products").deleteRow(indexOfRaw);
                tableCreate.splice(indexOfRaw - 1, 1);
                sumArray.splice(indexOfRaw - 1, 1);
                console.log(tableCreate);
                for (var i = 0; i < tableCreate.length; i++) {
                    console.log(sumArray);

                    sum = sum + sumArray[i];


                }
                document.getElementById("amount_id").innerHTML = '<label style="background-color:"red">Total is :' + sum + "</label>";
                sum = 0;

            })


        })


    }




})();








