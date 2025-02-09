package technical.test.renderer.facades;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.renderer.services.FlightService;
import technical.test.renderer.viewmodels.FiltersViewModel;
import technical.test.renderer.viewmodels.FlightViewModel;

import java.util.UUID;

@Component
public class FlightFacade {

    private final FlightService flightService;

    public FlightFacade(FlightService flightService) {
        this.flightService = flightService;
    }

    public Flux<FlightViewModel> getFlights() {
        return this.flightService.getFlights();
    }

    public Mono<FlightViewModel> createFlight(FlightViewModel flightViewModel) {
        return this.flightService.createdFlight(flightViewModel);
    }

    public Flux<FlightViewModel> getAllFilteredFlights(FiltersViewModel filtersViewModel) {
        return this.flightService.getAllFilteredFlights(filtersViewModel);
    }

    public Mono<FlightViewModel> getFlightById(UUID id) {
        return this.flightService.getFlightById(id);
    }
}
