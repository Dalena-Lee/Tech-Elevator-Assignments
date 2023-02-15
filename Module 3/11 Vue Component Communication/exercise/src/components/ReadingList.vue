<template>
  <div class="book-container">
    <book-card 
      v-for="book in allBooks" 
      v-bind:key="book.title"
      v-bind:book="book"
    />
  </div>
</template>

<script>
import BookCard from './BookCard';

export default {
  name: 'reading-list',
  components: {
    BookCard
  },
  computed: {
    allBooks(){
      return this.$store.state.books;
    }
  }
};
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>