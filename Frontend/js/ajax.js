// ============================Registration===================
$("#btnRegister").click(function (){

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
            registerValidation(parse);
        }

    })
})
// =========================Register Success Popup Box===================
function registerValidation(parse){
    if(parse){
        Swal.fire(
            'Good Job!',
            'You are now a new customer!',
            'success'
        );
    }else{
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Something went to wrong!',
        })
    }
}

// ============================Login===================
$("#loginBtn").click(function (){

    let customerEmail = $("#email").val();
    let customerPassword = $("#password").val();

    $.ajax({
        method: "POST",
        url: "http://localhost:8080/Backend_war/api/v1/customer/login",
        contentType: 'application/json',
        async: true,
        data: JSON.stringify({
            email: customerEmail,
            password: customerPassword,
        }),
        success: function () {
            if (true){
                $("#dashboard").css('display', 'block');
            }else{
                alert("Error");
            }
        }

    })
})
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