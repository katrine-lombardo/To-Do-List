<template>
  <input
    class="input"
    :type="type"
    :placeholder="placeholder"
    v-model="value"
  />
</template>

<script>
export default {
  props: {
    type: {
      type: String,
      default: "text",
    },
    placeholder: {
      type: String,
      default: "",
    },
  },
  data() {
    return {
      value: "",
    };
  },
};
</script>

<style lang="scss">
.input {
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  transition: border-color 0.3s ease;

  &:focus {
    outline: none;
    border-color: #007bff;
  }
}
</style>
