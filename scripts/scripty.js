$(window).on('load', function(){

    $('#docbtn').on('click', function(){
        openInfo(event, 'docs')
    })

    $('#docbtn2').on('click', function(){
        openInfo(event, 'docs2')
    })

    $('#picbtn').on('click', function(){
        openInfo(event, 'pics')
    })

    $('#picbtn2').on('click', function(){
        openInfo(event, 'pics2')
    })

    $('#linkbtn').on('click', function(){
        openInfo(event, 'links')
    })

    $('#reqbtn').on('click', function(){
        openInfo(event, 'req')
    })

    $('#archbtn').on('click', function(){
        openInfo(event, 'arch')
    })

    $('#planbtn').on('click', function(){
        openInfo(event, 'plan')
    })

    $('#riskbtn').on('click', function(){
        openInfo(event, 'risk')
    })

    $('#impbtn').on('click', function(){
        openInfo(event, 'imp')
    })

    $('#testbtn').on('click', function(){
        openInfo(event, 'test')
    })

    $('#cibtn').on('click', function(){
        openInfo(event, 'ci')
    })

    $('#chngbtn').on('click', function(){
        openInfo(event, 'chng')
    })

})

function openInfo(evt, tabname) {

    $('.section').hide();

    // Get all elements with class="tablinks" and remove the class "active"

    $('.navlinks').removeClass('active');

    // Show the current tab, and add an "active" class to the button that opened the tab

    var tempname = '#' + tabname;

    $(tempname).show();

    evt.currentTarget.className += " active";
}
