

document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('formDelete');
    const select = document.getElementById('selectRaza');
    form.addEventListener('submit', function (event) {
        event.preventDefault();
        const selectedId = select.options[select.selectedIndex].getAttribute('data-id');
        if (selectedId) {
            form.action = `/razas/deleteRaza/${selectedId}`;
            form.submit();
        } else {
            alert("Por favor selecciona una raza válida.");
        }
    });
});
document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('formDelete');
    const select = document.getElementById('selectVaca');
    form.addEventListener('submit', function (event) {
        event.preventDefault();
        const selectedId = select.options[select.selectedIndex].getAttribute('data-id');
        if (selectedId) {
            form.action = `/vacas/deleteVaca/${selectedId}`;
            form.submit();
        } else {
            alert("Por favor selecciona una raza válida.");
        }
    });
});