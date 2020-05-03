$(function () {
    $("#listForm").bind("submit", function () {
        console.log("Loading...");
    });

    List();

    function List() {
        $.ajax({
            url: 'client.do',
            data: {},
            type: 'GET',
            dataType: 'json',
            contentType: 'application/json',
            success: function (respJson) {
                $("#tblEmpleados").html("");
                $("#tblEmpleados").html(
                    "<thead>" +
                    "<tr>" +
                    "<th style='width: 6%;border: 1px solid; text-align: center'>ID</th>" +
                    "<th style='width: 7%;border: 1px solid; text-align: center'>Nombre</th>" +
                    "<th style='width: 7%;border: 1px solid; text-align: center'>Apellido</th>" +
                    "<th style='width: 6%;border: 1px solid; text-align: center'>Teléfono</th>" +
                    "<th style='width: 13%;border: 1px solid; text-align: center'>Correo Eléctronico</th>" +
                    "<th style='width: 6%;border: 1px solid; text-align: center'>Fecha de Nacimiento</th>" +
                    "<th style='width: 15%;border: 1px solid; text-align: center'>Dirección</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>" +
                    "</tbody>"
                );
                for (let i in respJson) {
                    let employee = respJson[i];  //Guarda cada registro en cada iteración //
                    $("#tblEmpleados tbody").append(
                        "<tr style='border: 1px solid'>"+
                        "<td style='text-align: center'>" + employee.document + "</td>"+
                        "<td style='text-align: center'>" + employee.name + "</td>" +
                        "<td style='text-align: center'>" + employee.lastName + "</td>" +
                        "<td style='text-align: center'>" + employee.phone + "</td>" +
                        "<td style='text-align: center'>" + employee.email + "</td>" +
                        "<td style='text-align: center'>" + employee.birthday + "</td>"+
                        "<td style='text-align: center'>" + employee.address + "</td>" +
                        "</tr>"
                    );
                }
            }
        });
    }
});