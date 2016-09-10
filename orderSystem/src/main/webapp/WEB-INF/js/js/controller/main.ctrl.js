/**
 * @desc 全局ctrl
 * @auth sherlock221b
 */
Demoapp.controller("MainCtrl", function ($rootScope, $scope, SERVER, $location, $state, Util, VERSION) {
    SERVER.url = SERVER.login;


    $rootScope.user = {
        id : 0,
        username : "",
        sex : "",
        phone : "",
        wechat : "",
        balance : ""
    }
    $rootScope.ordering = {
        id : 0,
        userId : 0,
        orderTime : "",
        menuType : "",
        location : "",
        price : "",
        isTaken : ""
    }

    //go state
    $rootScope.goState = function (name) {
        if ($rootScope.settingLayer) {
            $rootScope.settingLayer = false;
        }
        $state.go(name);
    }

    $rootScope.nav="";
    //退出
    $rootScope.loginOut=function(){
        Util.removeLg("user");
    }

    //获取用户
    $rootScope.getUser=function(){
        return Util.getLgObj("user");
    }

    //设置用户
    $rootScope.setUser=function(user){
        Util.setLgObj("user",user);
        $rootScope.user=user;
    }

    $rootScope.removeUser=function(){
        Util.removeLg("user");
    }
});

