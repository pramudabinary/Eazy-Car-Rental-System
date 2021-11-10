// ============================Registration===================
$("#btnRegister").click(function () {

    let customerID = $("#customerId").val();
    let customerName = $("#customerName").val();
    let customerAddress = $("#customerAddress").val();
    let customerEmail = $("#email").val();
    let customerPassword = $("#password").val();
    let customerNIC = $("#nicNum").val();
    let customerContact = $("#contact").val();
    let customerLicense = $("#license").val();


    $.ajax({
        method: "POST",
        url: "http://localhost:8080/Backend_war/api/v1/customer",
        contentType: 'application/json',
        async: true,
        data: JSON.stringify({
            id: customerID,
            name: customerName,
            address: customerAddress,
            email: customerEmail,
            password: customerPassword,
            nic: customerNIC,
            contact: customerContact,
            license: customerLicense,
        }),
        success: function (data) {
           alert("SignUp Successful!!")
        }

    })
});

// =========================Register Success Popup Box===================

// ============================Login===================
$("#loginBtn").click(function () {

    let userName = $("#exampleInputUserName").val();
    let password = $("#exampleInputPassword1").val();


    $.ajax({
        method: 'POST',
        url: "http://localhost:8080/Backend_war/api/v1/admin/oauth/token",
        contentType: 'application/json',
        async: true,
        data: JSON.stringify({
            username:userName,
            password:password,
        }),
        success: function (data) {
            $("#loginform").css("display", "none");
            $("#dashboard").css("display", "block");
        }
    });
// }else{
    // $.ajax({
    //     method: 'POST',
    //     url: "http://localhost:8080/Backend_war/api/v1/customer/loginfu",
    //     contentType: 'application/json',
    //     async: true,
    //     data: data,
    //     success: function (data) {
    //         alert("Customer");
    //     }
    //
    //
    // })}
});



// ============================File Upload===================
var fileObject = $("#file")[0].files[0];//access file object from input field
var fileName = $("#file")[0].files[0].name; //get file name

var data = new FormData(); //setup form data object to send file data
data.append("file", fileObject, fileName); //append data

$.ajax({
    url: 'up',
    method: 'post',
    async: true,
    processData: false, //stop processing data of request body
    contentType: false, // stop setting content type by jQuery
    data: data,
    success: function () {
        alert("File Uploaded");
    }
});
