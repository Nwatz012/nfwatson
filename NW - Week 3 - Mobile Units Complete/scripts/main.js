function update() {
    var selectUnits = $('#selectUnits option:selected').text();
    var units = $("#units").val();
    var result = $('#result');
    const LITERS = 3.78541;
    const GALLONS = 0.264172;

    if (units.length === 0 || $.isNumeric(units) === false || units < 1 || units > 500) {
        $('#unitsInvalid').text('Please enter a valid number.');
    } else {

        $('#unitsInvalid').text('');
        let convert = (selectUnits == 'Gallons' ? units * LITERS + ' Liters' : units * GALLONS + ' Gallons');
        result.text(units + ' ' + selectUnits + ' converts to ' + convert);
    }
}