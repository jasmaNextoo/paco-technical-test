package technical.test.renderer.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.renderer.clients.TechnicalApiClient;
import technical.test.renderer.viewmodels.FiltersViewModel;
import technical.test.renderer.viewmodels.FlightViewModel;

import java.util.UUID;

@Service
public class FlightService {
    private final TechnicalApiClient technicalApiClient;

    public FlightService(TechnicalApiClient technicalApiClient) {
        this.technicalApiClient = technicalApiClient;
    }

    public Flux<FlightViewModel> getFlights() {
        return this.technicalApiClient.getFlights();
    }

    public Mono<FlightViewModel> createdFlight(FlightViewModel flightViewModel) {
        return this.technicalApiClient.createdFlight(flightViewModel);
    }

    public Flux<FlightViewModel> getAllFilteredFlights(FiltersViewModel filtersViewModel) {
        return this.technicalApiClient.getAllFilteredFlights(filtersViewModel);
    }

    public Mono<FlightViewModel> getFlightById(UUID id) {
        return this.technicalApiClient.getFlightById(id);
    }
}
