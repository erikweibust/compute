// contextual keyword
module com.agiledeveloper.computation { // use 'open' to open entire module
    opens com.agiledeveloper.compute;

    //opens com.agiledeveloper.fibonacci; // better to only open a single package over all packages.
}

// module always requires other modules and exports its own packages.
// requires modules, exports packages

//Reuse-release equivalency principle
