<template>
  <div id="app">
    <ToDoList />
  </div>
</template>

<script>
import ToDoList from "./views/ToDoList.vue";

export default {
  name: "App",
  components: {
    ToDoList,
  },
};
</script>

<style>
#app {
  font-family: Arial, sans-serif;
  text-align: center;
  margin-top: 20px;
}
</style>
