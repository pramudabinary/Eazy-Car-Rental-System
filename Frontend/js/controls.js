// Forms Control
hideAll();
$("#home").css('display', 'block');

$("#btnHome").click(function () {
    $("#register").css("display", "none");
    $("#loginform").css("display", "none");
    $("#home").css("display", "block");
    $("#dashboard").css("display", "none");
});

$("#btnSignUp").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "block");
    $("#loginform").css("display", "none");
    $("#dashboard").css("display", "none");
});

$("#btnSignIn").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "none");
    $("#loginform").css("display", "block");
    $("#dashboard").css("display", "none");
});

function hideAll() {
    $("#home, #loginform ,#register,#dashboard").css('display', "none");
}

// Btns Control

$("#btnPay").css('display', 'none');
$("#btnCars").css('display', 'none');
$("#btnBook").css('display', 'none');
$("#btnLogOut").css('display', 'none');