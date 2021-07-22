hideAll();
$("#home").css('display', 'block');

$('#btnHome').click(function () {
    hideAll();
    $("#home").css('display', 'block');
});

$('#btnSignIn').click(function () {
    hideAll();
    $("#loginform").css('display', 'block');
});

$('#btnSignUp').click(function () {
    hideAll();
    $("#register").css('display', 'block');
});

$('#btnLogOut').click(function () {
    hideAll();
    $("#loginform").css('display', 'block');
});
$('#loginBtn').click(function () {
    hideAll();
    $("#dashboard").css('display', 'block');
});

function hideAll() {
    $("#home, #loginform ,#register,#dashboard").css('display', "none");
}

$("#homebtn").click(function () {
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
    $("#dashboard").css("display", "none");
    $("#loginform").css("display", "block");
});
$("#btnLogOut").click(function () {
    $("#loginform").css("display", "block");
    $("#register").css("display", "none");
    $("#dashboard").css("display", "none");
    $("#home").css("display", "none");
});
$("#loginBtn").click(function () {
    $("#loginform").css("display", "none");
    $("#register").css("display", "none");
    $("#dashboard").css("display", "block");
    $("#home").css("display", "none");
});
