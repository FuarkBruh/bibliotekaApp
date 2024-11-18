document.getElementById('addBookForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Zapobiega przeładowaniu strony

    const bookData = {
        title: document.getElementById('bookTitle').value,
        author: document.getElementById('bookAuthor').value,
        publisher: document.getElementById('bookPublisher').value,
        id: document.getElementById('bookId').value, // Zakładam, że 'id' to numer książki
        libraryId: document.getElementById('libraryId').value // Zakładam, że 'libraryId' to numer biblioteki
    };

    // Wysyłanie POST do backendu
    fetch('http://localhost:8080/ksiazki', { // Zaktualizuj URL, jeśli to konieczne
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(bookData)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            console.log('Książka dodana:', data);
            // Wyczyść formularz
            document.getElementById('addBookForm').reset();
        })
        .catch(error => {
            console.error('Wystąpił problem z dodawaniem książki:', error);
        });
});
