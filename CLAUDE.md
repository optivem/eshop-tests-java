# Java-specific instructions

_Shared instructions (ATDD rules, architecture, git safety) are in the `eshop-tests` repository, loaded automatically via the workspace._

## Test Location

- **Acceptance tests** go in `system-test/src/test/java/com/optivem/eshop/systemtest/v7/acceptance/`
- **Contract tests** go in `system-test/src/test/java/com/optivem/eshop/systemtest/v7/contract/<system>/` (e.g. `erp/`, `tax/`, `clock/`)
- Do **NOT** use v1–v6 directories. All new tests go in v7.

## Test Pattern

Acceptance tests use the ScenarioDSL pattern — **not** raw driver calls.

```java
class SubmitReviewPositiveTest extends BaseAcceptanceTest {
    @TestTemplate
    @Channel({ChannelType.UI, ChannelType.API})
    void canSubmitReviewOnDeliveredOrder() {
        scenario
                .given().order()
                    .withStatus(OrderStatus.DELIVERED)
                .when().submitReview()
                    .withRating("5")
                .then().shouldSucceed();
    }
}
```

Key rules:
- Extend `BaseAcceptanceTest` (in `v7/acceptance/base/`)
- Use `@TestTemplate` + `@Channel({ChannelType.UI, ChannelType.API})` — **no separate API/UI subclasses**
- Use `scenario.given()...when()...then()` DSL — not `shopDriver`, `erpDriver`, etc.
- File names: `<UseCase>PositiveTest.java` and `<UseCase>NegativeTest.java` (one file each, no "Base" split)
- Contract tests extend `BaseExternalSystemContractTest` (in `v7/contract/base/`)
