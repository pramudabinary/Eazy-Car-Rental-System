// Forms Control
hideAll();
$("#home").css('display', 'block');

$("#btnHome").click(function () {
    $("#register").css("display", "none");
    $("#loginform").css("display", "none");
    $("#home").css("display", "block");
    $("#dashboard").css("display", "none");
    $("#cars").css("display", "none");
    $("#admin").css("display", "none");
});

$("#btnSignUp").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "block");
    $("#loginform").css("display", "none");
    $("#dashboard").css("display", "none");
    $("#cars").css("display", "none");
    $("#admin").css("display", "none");
});

$("#btnSignIn").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "none");
    $("#loginform").css("display", "block");
    $("#dashboard").css("display", "none");
    $("#cars").css("display", "none");
    $("#admin").css("display", "none");
})

$("#btnHomeRent").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "none");
    $("#loginform").css("display", "block");
    $("#dashboard").css("display", "none");
    $("#cars").css("display", "none");
    $("#admin").css("display", "none");
})

$("#btnHave").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "none");
    $("#loginform").css("display", "block");
    $("#dashboard").css("display", "none");
    $("#cars").css("display", "none");
    $("#admin").css("display", "none");
})


$("#btnNew").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "block");
    $("#loginform").css("display", "none");
    $("#dashboard").css("display", "none");
    $("#cars").css("display", "none");
    $("#admin").css("display", "none");
})

function hideAll() {
    $("#home, #cars ,admin, #loginform ,#register,#dashboard").css('display', "none");
}

// Btns Control

// Customer Nav Btn

$("#btnPay").css('display', 'none');
$("#btnCars").css('display', 'none');
$("#btnBook").css('display', 'none');
$("#btnLogOut").css('display', 'none');

// Admin Nav Btn

$("#cusManage").css('display', 'none');
$("#carManage").css('display', 'none');
$("#bookManage").css('display', 'none');
