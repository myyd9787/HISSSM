/*
 * @Author: https://github.com/WangEn
 * @Author: https://gitee.com/lovetime/
 * @Date:   2018-03-27
 * @lastModify 2018-3-28
 * +----------------------------------------------------------------------
 * | WeAdmin 表格table中多个删除等操作公用js
 * | 有改用时直接复制到对应页面也不影响使用
 * +----------------------------------------------------------------------
 */
layui.extend({
    admin: '{/}../../static/js/admin'
});
layui.use(['laydate', 'jquery', 'admin'], function() {
    var laydate = layui.laydate,
        $ = layui.jquery,
        admin = layui.admin;
    //执行一个laydate实例
    laydate.render({
        elem: '#start' //指定元素
    });
    //执行一个laydate实例
    laydate.render({
        elem: '#end' //指定元素
    });
    /*用户-停用*/
    window.member_stop = function (obj, id) {
        layer.confirm('确认要停用吗？', function(index) {
            if($(obj).attr('title') == '启用') {

                //发异步把用户状态进行更改
                $(obj).attr('title', '停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!', {
                    icon: 5,
                    time: 1000
                });

            } else {
                $(obj).attr('title', '启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!', {
                    icon: 5,
                    time: 1000
                });
            }
        });
    }

    /*删除*/
    window.member_del = function (obj, id,url) {
        layer.confirm('确认要删除吗？', function(index) {
            //发异步删除数据
            $.ajax({
                "url" : "../../"+url+"?method=del", // 要提交的URL路径
                "type" :  "post",// 发送请求的方式
                "data":  "id="+id,// 要发送到服务器的数据
                "dataType" :  "text",// 指定传输的数据格式
                "success": function(result) { // 请求成功后要执行的代码
                    if(result=="success"){
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!', {
                            icon: 1,
                            time: 1000
                        });
                    }
                },
                "error" : function() {// 请求失败后要执行的代码
                    layer.alert("内部发生异常", {
                        title: '操作提示'
                    });
                }
            });

        });
    }

    window.delAll = function (argument) {
        var data = tableCheck.getData();
        layer.confirm('确认要删除吗？' + data, function(index) {
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {
                icon: 1
            });
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
    }
});