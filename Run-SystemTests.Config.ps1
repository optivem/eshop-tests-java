# System Test Configuration
# This file contains configuration values for Run-SystemTests.ps1

$Config = @{

    BuildCommands = @(
        @{  Name = "Clean Build";
            Command = ".\gradlew.bat clean compileJava compileTestJava"
        }
    )

    Tests = @(

        # Smoke Tests
        @{  Id = "smoke-stub";
            Name = "Smoke Tests - Stubbed External Systems";
            Command = "& .\gradlew.bat :system-test:test -Dtype=smoke -DexternalSystemMode=stub -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },
        @{  Id = "smoke-real";
            Name = "Smoke Tests - Real External Systems";
            Command = "& .\gradlew.bat :system-test:test -Dtype=smoke -DexternalSystemMode=real -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },

        # Acceptance Tests
        @{  Id = "acceptance-api";
            Name = "Acceptance Tests - Channel: API";
            Command = "& .\gradlew.bat :system-test:test -Dtype=acceptance -DexcludeTags=isolated -Dchannel=API -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },
        @{  Id = "acceptance-ui";
            Name = "Acceptance Tests - Channel: UI";
            Command = "& .\gradlew.bat :system-test:test -Dtype=acceptance -DexcludeTags=isolated -Dchannel=UI -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },
        @{  Id = "acceptance-isolated-api";
            Name = "Acceptance Tests - Isolated - Channel: API";
            Command = "& .\gradlew.bat :system-test:test -Dtype=acceptance -DincludeTags=isolated -Dchannel=API -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },
        @{  Id = "acceptance-isolated-ui";
            Name = "Acceptance Tests - Isolated - Channel: UI";
            Command = "& .\gradlew.bat :system-test:test -Dtype=acceptance -DincludeTags=isolated -Dchannel=UI -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },

        # External System Contract Tests
        @{  Id = "contract-stub";
            Name = "Contract Tests - Stubbed External Systems";
            Command = "& .\gradlew.bat :system-test:test -Dtype=contract -DexternalSystemMode=stub -Denvironment=local --tests `"*Stub*`"";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },
        @{  Id = "contract-real";
            Name = "Contract Tests - Real External Systems";
            Command = "& .\gradlew.bat :system-test:test -Dtype=contract -DexternalSystemMode=real -Denvironment=local --tests `"*Real*`"";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html"
            TestInstallCommands = $null; },

        # E2E Tests
        @{
            Id = "e2e-no-channel";
            Name = "E2E Tests - No Channel (v1, v2, v3)";
            Command = "& .\gradlew.bat :system-test:test -Denvironment=local --tests `"com.optivem.eshop.systemtest.e2etests.v1.*`" --tests `"com.optivem.eshop.systemtest.e2etests.v2.*`" --tests `"com.optivem.eshop.systemtest.e2etests.v3.*`"";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html";
            TestInstallCommands = $null; },
        @{
            Id = "e2e-api";
            Name = "E2E Tests - Channel: API";
            Command = "& .\gradlew.bat :system-test:test -Dtype=e2e -Dchannel=API -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html";
            TestInstallCommands = $null; },
        @{
            Id = "e2e-ui";
            Name = "E2E Tests - Channel: UI";
            Command = "& .\gradlew.bat :system-test:test -Dtype=e2e -Dchannel=UI -Denvironment=local";
            Path = ".";
            TestReportPath = "system-test\build\reports\tests\test\index.html";
            TestInstallCommands = $null; }

    )
}

# Export the configuration
return $Config

