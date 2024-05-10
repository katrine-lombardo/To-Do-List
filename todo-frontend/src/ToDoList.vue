<template>
  <div>
    <h1>To-Do List</h1>
    <InputField placeholder="Enter a new task" v-model="newTask" />
    <ButtonComponent class="primary" @click="addTask">Add Task</ButtonComponent>
    <AlertDialog v-if="errorMessage" type="error">{{
      errorMessage
    }}</AlertDialog>
    <ul>
      <li v-for="(task, index) in tasks" :key="index">
        {{ task }}
        <Button class="secondary" @click="removeTask(index)">Remove</Button>
      </li>
    </ul>
  </div>
</template>

<script>
import InputField from "./components/InputField.vue";
import ButtonComponent from "./components/ButtonComponent.vue";
import AlertDialog from "./components/AlertDialog.vue";

export default {
  components: {
    InputField,
    ButtonComponent,
    AlertDialog,
  },
  data() {
    return {
      newTask: "",
      tasks: [],
      errorMessage: "",
    };
  },
  methods: {
    addTask() {
      if (this.newTask.trim() !== "") {
        this.tasks.push(this.newTask);
        this.newTask = "";
        this.errorMessage = "";
      } else {
        this.errorMessage = "Task cannot be empty";
      }
    },
    removeTask(index) {
      this.tasks.splice(index, 1);
    },
  },
};
</script>

<style scoped>
ul {
  list-style-type: none;
  padding: 0;
}
</style>
