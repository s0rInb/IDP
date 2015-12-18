    $('#users_table').DataTable( {
        "ajax": "api/usersAll",
"processing": true,
    "serverSide": true,
    "sort": "username",
    "bStateSave": true,
    "iDisplayStart": 0,
        "columns": [
            { "data": "id" },
            { "data": "firstName" },
            { "data": "lastName" }
        ]
    } );
