<template>
<div>
    <reading-list></reading-list>
    <router-link v-bind:to="{name: 'newBook'}">My Books</router-link>
</div>
</template>

<script>
import ReadingList from '../components/ReadingList';

export default {
  components: {
    ReadingList
  }
};
</script>