double disabilityAmount() {
    final boolean isSenior = seniority >= 2;
    final boolean yearDisabled = monthsDisabled > 12;

    if (!isSenior || yearDisabled || isPartTime) { return 0 }

  // Compute the disability amount.
  // ...
}