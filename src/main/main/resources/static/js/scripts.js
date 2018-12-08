        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar, #content').toggleClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');


            });
            });

    function renameFolder(directory) {
        $.ajax({
            url: "/renomer/" + directory,
            success: function(data) {
                console.log(data);
                $('#renameFolder').html(data);
                $('#rename').modal();
                $('#rename').modal('show');
            }
        });
    }


    function readTecdocFile(file) {
        $.ajax({
            url: "/read/" + file,
            success: function(data) {
                console.log(data);
                $('#readFileHolder').html(data);
                $('#readFile').modal();
                $('#readFile').modal('show');
            }
        });
    }
        function readLocalFile(file) {
            $.ajax({
                url: "/lire/" + file,
                success: function(data) {
                    console.log(data);
                    $('#readFileHolder').html(data);
                    $('#readFile').modal();
                    $('#readFile').modal('show');
                }
            });
        }


$(function () {
  $('[data-toggle="tooltip"]').tooltip()
})