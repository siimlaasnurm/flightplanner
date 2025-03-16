<script>
import {ref} from "vue";

export default {
  name: "FlightSelection",
  setup() {
    const flights = ref(0)
  }
}

</script>

<template>
  <div>
    <div v-for="flight in flights" class="flight">
      <span class="flight-date">{{ new Date(flight.departureTime * 1000) }}</span>
      <span class="flight-duration">{{ (flight.arrivalTime - flight.departureTime) / 60 }} min</span>
      <span class="flight-airport from">{{ flight.departureAirport.shortName }}</span>
      <span class="flight-airport to">{{ flight.arrivalAirport.shortName }}</span>
    </div>
  </div>
</template>

<style scoped>

</style>