<template>
  <div class="alert" :class="type">
    <slot></slot>
  </div>
</template>

<script>
export default {
  props: {
    type: {
      type: String,
      default: "info",
    },
  },
};
</script>

<style lang="scss">
.alert {
  padding: 10px;
  border-radius: 5px;
  margin-bottom: 10px;

  &.info {
    background-color: #007bff;
    color: white;
  }

  &.warning {
    background-color: #ffc107;
    color: #333;
  }

  &.error {
    background-color: #dc3545;
    color: white;
  }
}
</style>
