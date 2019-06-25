var urlToGetData = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
var fetchDataFromURL = () => {
    return new Promise(function (resolve, reject) {
        $.ajax({
            async: true,
            type: "GET",
            url: urlToGetData,

            success: function (response) {
                resolve(response);
            }
        });
    })
}

var postMyDataToURL = (obj) => {

    return new Promise(function (resolve, reject) {

        $.ajax({
            url: urlToGetData,
            type: 'POST',
            data: obj,
            success: function (response) {
                alert(response.status);
            },
            error: function () {
                alert("error");
            }
        });



    })

}

var deteleMyDataFromURL = (id) => {

    return new Promise(function (resolve, reject) {
        $.ajax({
            url: urlToGetData + "/" + id,
            type: 'DELETE',
            success: function (response) {
                alert("success");
            },
            error: function () {
                alert("failed");
            }

        });

    })

}

var updateData = (id, obj) => {

    return new Promise(function (resolve, reject) {

        $.ajax({
                  url:urlToGetData+"/"+id,
                  type:'PUT',
                  data: obj,
                  success:function(response){
                      alert("success");
                  }
       
     

    })

})
}

