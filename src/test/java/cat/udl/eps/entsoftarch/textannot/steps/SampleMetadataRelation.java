package cat.udl.eps.entsoftarch.textannot.steps;

import cat.udl.eps.entsoftarch.textannot.domain.MetadataField;
import cat.udl.eps.entsoftarch.textannot.domain.MetadataValue;
import cat.udl.eps.entsoftarch.textannot.domain.Sample;
import cat.udl.eps.entsoftarch.textannot.repository.MetadataFieldRepository;
import cat.udl.eps.entsoftarch.textannot.repository.MetadataValueRepository;
import cat.udl.eps.entsoftarch.textannot.repository.SampleRepository;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.RequestPostProcessor;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.anonymous;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class SampleMetadataRelation {

    @Autowired
    private SampleRepository sampleRepository;

    @Autowired
    private MetadataFieldRepository metadataFieldRepository;

    @Autowired
    private MetadataValueRepository metadataValueRepository;


    @Given("^A Sample with text \"([^\"]*)\" with MetadataValue value \"([^\"]*)\" and MetadataField name \"([^\"]*)\"$")
    public void aSampleWithTextWithMetadataValueValueAndMetadataFieldName(String text, String value, String name) throws Throwable {
        Sample s = new Sample(text);
        MetadataValue mv = new MetadataValue(value);
        MetadataField mf = new MetadataField(name, "");

        mv.setValued(mf);
        mv.setForA(s);

        this.sampleRepository.save(s);
        this.metadataFieldRepository.save(mf);
        this.metadataValueRepository.save(mv);

    }

    @When("^I find Samples by MetadataValue value \"([^\"]*)\" and MetadataField name \"([^\"]*)\"$")
    public void iFindSamplesByMetadataValueValueAndMetadataFieldName(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I get the list with the Sample with text \"([^\"]*)\"$")
    public void iGetTheListWithTheSampleWithText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
