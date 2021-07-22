hideAll();
$("#btnHome").css('display', 'block');
$("#btnSupport").css('display', 'block');
$("#btnSignUp").css('display', 'block');
$("#btnSignIn").css('display', 'block');

$('#btnHome').click(function () {
    hideAll();
    $("#btnHome").css('display', 'block');
    $("#loginform").css('display', 'none');
    $("#register").css('display', 'none');
    $("#btnSupport").css('display', 'block');
    $("#btnSignUp").css('display', 'block');
    $("#btnSignIn").css('display', 'block');
});

$('#btnSignIn').click(function () {
    hideAll();
    $("#btnHome").css('display', 'block');
    $("#loginform").css('display', 'block');
    $("#home").css('display', 'none');
    $("#btnSupport").css('display', 'block');
    $("#btnSignUp").css('display', 'block');
    $("#btnSignIn").css('display', 'block');
});

$('#btnSignUp').click(function () {
    hideAll();
    $("#btnHome").css('display', 'block');
    $("#btnSupport").css('display', 'block');
    $("#btnSignUp").css('display', 'block');
    $("#btnSignIn").css('display', 'block');
});

$('#btnLogOut').click(function () {
    hideAll();
    $("#btnHome").css('display', 'block');
    $("#btnSupport").css('display', 'block');
    $("#btnSignUp").css('display', 'block');
    $("#btnSignIn").css('display', 'block');
});

$('#loginBtn').click(function () {
    hideAll();
    $("#btnSupport").css('display', 'block');
    $("#btnLogOut").css('display', 'block');
    $("#btnCars").css('display', 'block');
    $("#btnPay").css('display', 'block');
    $("#btnBook").css('display', 'block');
});

function hideAll() {
    $("#btnHome, #btnCars ,#btnPay,#btnBook,#btnSupport,#btnSignIn,#btnSignUp,#btnLogOut").css('display', "none");
}
