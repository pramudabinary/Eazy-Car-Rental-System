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

function hideAll() {
    $("#home, #loginform ,#register").css('display', "none");
}

$("#homebtn").click(function () {
    $("#register").css("display", "none");
    $("#loginform").css("display", "none");
    $("#home").css("display", "block");
});

$("#btnSignUp").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "block");
    $("#loginform").css("display", "none");
});

$("#btnSignIn").click(function () {
    $("#home").css("display", "none");
    $("#register").css("display", "none");
    $("#loginform").css("display", "block");
});
