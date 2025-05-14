document.addEventListener ('keyup',e => {
    if (e.key === 'Escape')e.target.value = ""

    if (e.target.matches('#buscador')) {
        document.querySelectorAll('.razas-card').forEach(raza => {
            raza.textContent.toLowerCase().includes(e.target.value.toLowerCase())
                ? raza.classList.remove('filtro')
                : raza.classList.add('filtro')
        })
    }
} )

document.addEventListener ('keyup',e => {
    if (e.key === 'Escape')e.target.value = ""
    
    if (e.target.matches('#buscador')) {
        document.querySelectorAll('.cow-card').forEach(vaca => {
            vaca.textContent.toLowerCase().includes(e.target.value.toLowerCase())
                ? vaca.classList.remove('filtro')
                : vaca.classList.add('filtro')
        })
    }
} )

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