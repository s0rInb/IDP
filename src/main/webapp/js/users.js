$('a[href="#users"]').on("shown.bs.tab", function (e) {
    w2ui.grid1.resize();
    w2ui.grid2.resize();
});
$(function () {
            $('#grid1').w2grid({
                name: 'grid1',
                header: 'Master',
                show: {header: true},
                columns: [
                    {field: 'recid', caption: 'ID', size: '50px', sortable: true, attr: 'align=center'},
                    {field: 'lname', caption: 'Last Name', size: '30%', sortable: true,
                    editable: {type: 'text' }
                    },
                    {field: 'fname', caption: 'First Name', size: '30%', sortable: true},
                    {field: 'email', caption: 'Email', size: '40%'},
                    {field: 'sdate', caption: 'Start Date', size: '120px'},
                ],
                records: [
                    {recid: 1, fname: 'John', lname: 'doe', email: 'jdoe@gmail.com', sdate: '4/3/2012'},
                    {recid: 2, fname: 'Stuart', lname: 'Motzart', email: 'motzart@hotmail.com', sdate: '4/3/2012'},
                    {recid: 3, fname: 'Jin', lname: 'Franson', email: 'jin@yahoo.com', sdate: '4/3/2012'},
                    {recid: 4, fname: 'Susan', lname: 'Ottie', email: 'sottie@yahoo.com', sdate: '4/3/2012'},
                    {recid: 5, fname: 'Kelly', lname: 'Silver', email: 'kelly@gmail.com', sdate: '4/3/2012'},
                    {recid: 6, fname: 'Francis', lname: 'Gatos', email: 'frank@apple.com', sdate: '4/3/2012'}
                ],
                onClick: function (event) {
                    w2ui['grid2'].clear();
                    var record = this.get(event.recid);
                    w2ui['grid2'].add([
                        {recid: 0, name: 'ID:', value: record.recid},
                        {recid: 1, name: 'First Name:', value: record.fname},
                        {recid: 2, name: 'Last Name:', value: record.lname},
                        {recid: 3, name: 'Email:', value: record.email},
                        {recid: 4, name: 'Date:', value: record.sdate}
                    ]);
                }
            });

            $('#grid2').w2grid({
                header: 'Details',
                show: {header: true, columnHeaders: false},
                name: 'grid2',
                columns: [
                    {
                        field: 'name',
                        caption: 'Name',
                        size: '100px',
                        style: 'background-color: #efefef; border-bottom: 1px solid white; padding-right: 5px;',
                        attr: "align=right"
                    },
                    {field: 'value', caption: 'Value', size: '100%'}
                ]
            });
        });

