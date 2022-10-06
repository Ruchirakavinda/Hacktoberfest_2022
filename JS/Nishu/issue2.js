$(function() {
    $("#findArea").click(function() {

        let userName = $("#name").val();
        let val = $("#rad").val();

        let area = (22 * val * val) / 7;
        
        let message = "Hello " + userName + "!, " + "The area of your circle is " + area + " square centimeters.";
        $("#areaDisplay").html(message);
    });
});
