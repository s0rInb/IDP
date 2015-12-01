jQuery.ajax({
    url: 'tpl/users.dust',
    success: function(url){
        $("#users").append(url)
        }

    });
jQuery.ajax({
    url: 'tpl/home.dust',
    success: function(url){
        $("#home").append(url)
    }
});
jQuery.ajax({
    url: 'tpl/plans.dust',
    success: function(url){
        $("#plans").append(url)
    }
});
