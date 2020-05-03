$(function () {
    $("#createForm").bind("submit", function () {
        return Create();
    });

    function Create() {
        $.ajax({
            url: 'client.do',
            type: 'POST',
            data: {
                name: $("#name").val(),
                lastName: $("#lastName").val(),
                phone: $("#phone").val(),
                address: $("#address").val(),
                email: $("#email").val(),
                birthday: $("#birthday").val(),
                identify: $("#identify").val()
            },
            success:function(response){
                alert(response.concat("El empleado a sido registrado!"));
            }
        });
    }
});