<template>
  <div class="card">
    <h2 class="book-title">{{ filteredBooks.title }}</h2>
    <img v-if="filteredBooks.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + filteredBooks.isbn + '-M.jpg'" />
    <h3 class="book-author">{{ filteredBooks.author }}</h3>
  </div>
</template>

<script>

export default {
    name: 'book-details',
    computed: {
      filteredBooks() {
        let books = this.$store.state.books;
        const booksFiltered = books.filter((book) => {
            return this.$route.params.isbn === book.isbn;
        })
      return booksFiltered[0];
    }
  }

}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>
