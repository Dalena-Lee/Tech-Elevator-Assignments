<template>
    <div>
        <button>Add Book</button>

        <form class="new-book-form" v-on:submit.prevent="addNewBook()">
            <label for="title-input">Title:</label>
            <input class="title-input" type="text" v-model="newBook.title">
        
            <label for="author-input">Author:</label>
            <input class="author-input" type="text" v-model="newBook.author">
    
            <label for="isbn-input">ISBN:</label>
            <input class="isbn-input" type="text" v-model="newBook.isbn">
    
            <input type="submit" value="Save">
        </form>
    </div>
</template>

<script>
export default {
    name: 'new-book-form',
    data() {
        return {
            showForm: false,
            newBook: {
                read: false,
            },
        };
    },
    methods: {
        addNewBook() {
            this.$store.commit('ADD_BOOK', this.newBook);
            this.resetForm();
        },
        resetForm() {
            this.showForm = false;
            this.newBook = {
                read: false
            };
        },
    },
};
</script>


<style>
div.form-element {
  margin-top: 10px;
}
div.form-element > label {
  display: block;
}
div.form-element > input,

form > input[type="button"] {
  width: 100px;
}

</style>