# Java-specific instructions

_Shared instructions (ATDD rules, architecture, git safety) are in the `eshop-tests` repository, loaded automatically via the workspace._

## Test Location

- **Acceptance tests** go in `system-test/src/test/java/com/optivem/eshop/systemtest/v8/acceptance/`
- **Contract tests** go in `system-test/src/test/java/com/optivem/eshop/systemtest/v8/contract/<system>/` (e.g. `erp/`, `tax/`, `clock/`)
- Do **NOT** use v1–v7 directories for new acceptance/contract tests. All new tests go in v8.

## Test Pattern

Acceptance tests use the ScenarioDSL pattern — **not** raw driver calls.

```java
class PlaceOrderPositiveTest extends BaseAcceptanceTest {
    @TestTemplate
    @Channel({ChannelType.UI, ChannelType.API})
    void canPlaceOrder() {
        scenario
                .given().product()
                    .withSku("SKU-001")
                    .withUnitPrice("10.00")
                .when().placeOrder()
                    .withSku("SKU-001")
                    .withQuantity("2")
                .then().shouldSucceed();
    }
}
```

Key rules:
- Extend `BaseAcceptanceTest` (in `v8/acceptance/base/`)
- Use `@TestTemplate` + `@Channel({ChannelType.UI, ChannelType.API})` — **no separate API/UI subclasses**
- Use `scenario.given()...when()...then()` DSL — not `shopDriver`, `erpDriver`, etc.
- File names: `<UseCase>PositiveTest.java` and `<UseCase>NegativeTest.java` (one file each, no "Base" split)
- Contract tests extend `BaseExternalSystemContractTest` (in `v8/contract/base/`)
