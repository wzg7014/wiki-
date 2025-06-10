<template>
  <a-layout id="components-layout-demo-top-side-2">
    <TheHeader></TheHeader>
      <router-view/>
    <TheFooter></TheFooter>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent} from 'vue';
import TheHeader from "@/components/TheHeader.vue";
import TheFooter from "@/components/TheFooter.vue";

export default defineComponent({
  name: 'app',
  components:{
    TheFooter,
    TheHeader,
  }
});
</script>

<style>
  #components-layout-demo-top-side-2 .logo {
    width: 120px;
    height: 31px;
    background: rgba(255, 255, 255, 0.2);
    margin: 16px 28px 16px 0;
    float: left;
  }
</style>