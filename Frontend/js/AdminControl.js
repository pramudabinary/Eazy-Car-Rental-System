hideAll();
$("#dashboard").css('display', 'block');

$("#btnCustomerManage").click(function () {
    $("#driver").css("display", "none");
    $("#customer").css("display", "block");
    $("#dashboard_admin").css("display", "none");
});

$("#btnDriver").click(function () {
    $("#driver").css("display", "block");
    $("#customer").css("display", "none");
    $("#dashboard_admin").css("display", "none");
});

$("#btnAdminHomeTitle").click(function () {
    $("#driver").css("display", "none");
    $("#customer").css("display", "none");
    $("#dashboard_admin").css("display", "block");
});


function hideAll() {
    $("#customer, #driver,#dashboard_admin").css('display', "none");
}
