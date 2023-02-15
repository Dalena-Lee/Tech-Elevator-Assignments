<template>
  <div class="card">
    <h3 class="book-title">{{ book.title }}</h3>
    <!-- Please leave <img> commented out until directed to remove open and close comment tags in the README. -->
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h4 class="book-author">{{ book.author }}</h4>
    <button class="mark-read" v-on:click.prevent="onReadChange()" v-if="book.read === false">Mark Read</button>
    <button class="mark-unread" v-on:click.prevent="onReadChange()" v-else>Mark Unread</button>
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: ["book"],
    methods: {
        onReadChange() {
            this.$store.commit('FLIP_READ', this.book);
        }
    }
};
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