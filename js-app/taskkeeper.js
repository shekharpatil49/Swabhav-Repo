(function () {

   let taskArray = [];
   let finalArray = [];
   setTask = {
      taskName: "Gym",
      priority: 1,
      id: 0,
      status: false,
      date: "2",
      time: "3",
      deleted: false
   }

   taskAdder.addEventListener("click", pushInToArray);

   var radioBtn1 = document.getElementById('myRadio1').onclick = function () {
      setTask.priority = 1;
      console.log("inside1");
   };
   var radioBtn2 = document.getElementById('myRadio2').onclick = function () {
      setTask.priority = 2;
      console.log("inside2");
   };
   var radioBtn3 = document.getElementById('myRadio3').onclick = function () {
      setTask.priority = 3;
      console.log("inside3");
   };


   function pushInToArray() {

      var taskAdder = document.getElementById("taskAdder");
      var today = new Date();
      var date1 = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear();
      var task = document.getElementById("userInput").value;
      setTask.taskName = task;
      setTask.date = date1;
      setTask.id = Date.now() / 1000;

      var retrievedData = localStorage.getItem("finalArray");
      var newTaskArray = JSON.parse(retrievedData);
      taskArray.push(setTask);
      finalArray = newTaskArray.concat(taskArray);
      localStorage.setItem('finalArray', JSON.stringify(finalArray));

      location.reload(true);
   }


   var takeData = JSON.parse(localStorage.getItem("finalArray"));
   var uniqueDataArray = [];
   var takeDataLength = takeData.length;
   for (var i = 0; i < takeDataLength; i++) {
      for (var j = i + 1; j < takeDataLength; j++) { if (takeData[i].taskName === takeData[j].taskName) j = ++i; }
      uniqueDataArray.push(takeData[i]);
   }
   var listAdder = document.querySelector('#listAdder');
   var str = '';
   function display() {
      for (var i = 0; i < uniqueDataArray.length; i++) {
         if (uniqueDataArray[i].deleted == true) {
            continue;
         }
         if ((uniqueDataArray[i].status == true) && (uniqueDataArray[i].priority == 1)) {
            str = str + '<li id="list' + i + '"><input type="checkbox" id="checkBox' + i + '">';
            str = str + '<label style="background-color:red" id="label_id' + i + '"><strike>' + uniqueDataArray[i].taskName + '</strike></label>';
            str = str + '<button id="deletebtn_id' + i + '"class="delete">Delete</button></li>';
         }
         if ((uniqueDataArray[i].status == true) && (uniqueDataArray[i].priority == 2)) {
            str = str + '<li id="list' + i + '"><input type="checkbox" id="checkBox' + i + '">';
            str = str + '<label style="background-color:green" id="label_id' + i + '"><strike>' + uniqueDataArray[i].taskName + '</strike></label>';
            str = str + '<button id="deletebtn_id' + i + '"class="delete">Delete</button></li>';
         }
         if ((uniqueDataArray[i].status == true) && (uniqueDataArray[i].priority == 2)) {
            str = str + '<li id="list' + i + '"><input type="checkbox" id="checkBox' + i + '">';
            str = str + '<label style="background-color:yellow" id="label_id' + i + '"><strike>' + uniqueDataArray[i].taskName + '</strike></label>';
            str = str + '<button id="deletebtn_id' + i + '"class="delete">Delete</button></li>';
         }
         if ((uniqueDataArray[i].status == false) && (uniqueDataArray[i].priority == 1)) {
            str = str + '<li id="list' + i + '"><input type="checkbox" id="checkBox' + i + '">';
            str = str + '<label style="background-color:red" id="label_id' + i + '">' + uniqueDataArray[i].taskName + '</label>';
            str = str + '<button id="deletebtn_id' + i + '"class="delete">Delete</button></li>';
         }
         if (uniqueDataArray[i].status == false && (uniqueDataArray[i].priority == 2)) {
            str = str + '<li id="list' + i + '"><input type="checkbox" id="checkBox' + i + '">';
            str = str + '<label style="background-color:green" id="label_id' + i + '">' + uniqueDataArray[i].taskName + '</label>';
            str = str + '<button id="deletebtn_id' + i + '"class="delete">Delete</button></li>';
         }
         if (uniqueDataArray[i].status == false && (uniqueDataArray[i].priority == 3)) {
            str = str + '<li id="list' + i + '"><input type="checkbox" id="checkBox' + i + '">';
            str = str + '<label style="background-color:yellow" id="label_id' + i + '">' + uniqueDataArray[i].taskName + '</label>';
            str = str + '<button id="deletebtn_id' + i + '"class="delete">Delete</button></li>';
         }
      }

   }
   display();
   listAdder.innerHTML = str;
   var checkBoxid = "checkBox" + i;
   console.log(checkBoxid);
   var complete = document.querySelector('#completebtn');
   complete.addEventListener("click", completedEventChecker);

   function completedEventChecker() {

      for (var i = 0; i < uniqueDataArray.length; i++) {

         if (document.getElementById("checkBox" + i).checked) {
            uniqueDataArray[i].status = true;
            finalArray.push(uniqueDataArray[i]);
            localStorage.setItem('finalArray', JSON.stringify(finalArray));
            var textlabel = document.getElementById("label_id" + i).innerHTML;
            var label1 = document.getElementById("label_id" + i);
            label1.innerHTML = '<strike>' + textlabel + '</strike>';
         }

         finalArray.push(uniqueDataArray[i]);
         localStorage.setItem('finalArray', JSON.stringify(finalArray));

      }

   }

   var deletebtn = document.querySelectorAll(".delete");
   console.log(deletebtn)
   deletebtn.forEach(element => {

      element.addEventListener("click", function () {
         var str = element.id;
         var idfetch = str.split("id");

         var idex = parseInt(idfetch[1]);
         uniqueDataArray[idex].deleted = true;
         console.log(uniqueDataArray[idex]);
         element.parentElement.style.display = "none"
         rescan();
      })


   })

   function rescan() {
      for (var i = 0; i < uniqueDataArray.length; i++) {
         if (uniqueDataArray[i].deleted == true) {
            finalArray.push(uniqueDataArray[i])
            localStorage.setItem('finalArray', JSON.stringify(finalArray));
         }
         else {
            finalArray.push(uniqueDataArray[i])
            localStorage.setItem('finalArray', JSON.stringify(finalArray));
         }
      }
   }

   var sortButton = document.getElementById("sortbtn");
   sortButton.addEventListener("click", sortBy);
   function sortBy() {
      var val = document.getElementsByTagName('select')[0].value;

      if (val.toString() == "high") {
         uniqueDataArray.sort(function (a, b) {
            return a.priority - b.priority;
         });
         for (var i = 0; i < uniqueDataArray.length; i++) {
            finalArray.push(uniqueDataArray[i])
            localStorage.setItem('finalArray', JSON.stringify(finalArray));

         }

      }
      if (val.toString() == "low") {
         uniqueDataArray.sort(function (a, b) {
            return b.priority - a.priority;
         });
         for (var i = 0; i < uniqueDataArray.length; i++) {
            finalArray.push(uniqueDataArray[i])
            localStorage.setItem('finalArray', JSON.stringify(finalArray));


         }

      }
      location.reload(true);

   }







})();