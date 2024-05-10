<template>
  <button class="btn" :class="type" @click="$emit('click')">
    <slot></slot>
  </button>
</template>

<style lang="scss">
.btn {
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;

  &.primary {
    background-color: #007bff;
    color: white;
  }

  &.secondary {
    background-color: #6c757d;
    color: white;
  }

  &:hover {
    opacity: 0.8;
  }
}
</style>
