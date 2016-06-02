package pw.spn.idealista;

import java.io.IOException;
import org.junit.Test;
import pw.spn.idealista.exception.IdealistaException;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.Country;
import pw.spn.idealista.model.common.Location;
import pw.spn.idealista.model.common.OperationType;
import pw.spn.idealista.model.request.BedroomSearchRequest;
import pw.spn.idealista.model.request.GarageSearchRequest;
import pw.spn.idealista.model.request.HomeSearchRequest;
import pw.spn.idealista.model.request.OfficeSearchRequest;
import pw.spn.idealista.model.request.PremiseSearchRequest;
import pw.spn.idealista.model.response.IdealistaSearchResponse;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class IdealistaTest {

    private final Idealista idealista = new Idealista("G0EMGZQt5otrgAEG7JfWfCEmAeLmIyqh");

    @Test
    public void shouldSearchForBedroomsForRent() throws InvalidRequestException, IOException, IdealistaException {
        BedroomSearchRequest request = new BedroomSearchRequest();
        request.setOperationType(OperationType.RENT);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForGaragesForRent() throws InvalidRequestException, IOException, IdealistaException {
        GarageSearchRequest request = new GarageSearchRequest();
        request.setOperationType(OperationType.RENT);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForGaragesForSell() throws InvalidRequestException, IOException, IdealistaException {
        GarageSearchRequest request = new GarageSearchRequest();
        request.setOperationType(OperationType.BUY);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForHomesForRent() throws InvalidRequestException, IOException, IdealistaException {
        HomeSearchRequest request = new HomeSearchRequest();
        request.setOperationType(OperationType.RENT);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForHomesForSell() throws InvalidRequestException, IOException, IdealistaException {
        HomeSearchRequest request = new HomeSearchRequest();
        request.setOperationType(OperationType.BUY);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForOfficesForRent() throws InvalidRequestException, IOException, IdealistaException {
        OfficeSearchRequest request = new OfficeSearchRequest();
        request.setOperationType(OperationType.RENT);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForOfficesForSell() throws InvalidRequestException, IOException, IdealistaException {
        OfficeSearchRequest request = new OfficeSearchRequest();
        request.setOperationType(OperationType.BUY);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForPremisesForRent() throws InvalidRequestException, IOException, IdealistaException {
        PremiseSearchRequest request = new PremiseSearchRequest();
        request.setOperationType(OperationType.RENT);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }

    @Test
    public void shouldSearchForPremisesForSell() throws InvalidRequestException, IOException, IdealistaException {
        PremiseSearchRequest request = new PremiseSearchRequest();
        request.setOperationType(OperationType.BUY);
        request.setLocation(new Location(Country.SPAIN, 40.42938099999995, -3.7097526269835726, 452));
        IdealistaSearchResponse response = idealista.search(request);
        assertThat(response, notNullValue());
    }
}
