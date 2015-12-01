
$('#nav_ul').click(function (e) {
    e.preventDefault();
    $(this).tab('show');
});
$(function () {
    //then load the JavaScript file
    $.getScript('js/users.js');
});
$('a[href="#users"]').on("shown.bs.tab", function (e) {
    w2ui.grid1.resize();
    w2ui.grid2.resize();
});
