package com.optivem.eshop.systemtest.driver.adapter.tax;

import com.optivem.eshop.systemtest.driver.adapter.tax.client.TaxStubClient;
import com.optivem.eshop.systemtest.driver.adapter.tax.client.dtos.ExtCountryDetailsResponse;
import com.optivem.eshop.systemtest.driver.port.tax.dtos.ReturnsTaxRateRequest;
import com.optivem.eshop.systemtest.driver.port.shared.error.ErrorResponse;
import com.optivem.common.Converter;
import com.optivem.common.Result;

public class TaxStubDriver extends BaseTaxDriver<TaxStubClient> {
    public TaxStubDriver(String baseUrl) {
        super(new TaxStubClient(baseUrl));
    }

    @Override
    public Result<Void, ErrorResponse> returnsTaxRate(ReturnsTaxRateRequest request) {
        var country = request.getCountry();
        var taxRate = Converter.toBigDecimal(request.getTaxRate());

        var response = ExtCountryDetailsResponse.builder()
                .id(country)
                .taxRate(taxRate)
                .countryName(country)
                .build();

        return client.configureGetCountry(response)
                .mapError(ext -> ErrorResponse.builder().message(ext.getMessage()).build());
    }
}

