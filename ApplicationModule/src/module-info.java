// Main application module that uses all government services
module ApplicationModule {
    requires IdentityModule;
    requires Taxmodule;
    requires PassportModule;
    requires BusinessModule;
}