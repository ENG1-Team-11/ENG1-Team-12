# Changelog
All notable changes to this project will be documented in this file.


<br><hr>

## [2.0.1] - 26-01-2021
### Changed
Deliverables:
- added new user requirements: UR_LEVEL, UR_SAVE and UR_POWER_UP

<br><hr>

## [2.0.1] - 25-01-2021
### Changed
Codebase:
- Drastically improved CPU performance of existing AI function (~66% less CPU time)
- Moved large number of `protected` variables to `private`, and marked a large number of constant variables as `final`
- Removed unnecessary constructors and inlined functions that are only called in one place
- Unwrapped large if statements constructed as `exp1 && exp2 && ... expn`
- Updated Java version from 7 to 8 in order to use Lambdas

Changelog:
- Links refer to source tree at time of update rather than using GitHub compare function (compare function cannot compare specific commits)

<br><hr>

## [2.0.0] - 21-01-2021
### Added

Website:
- new folder 'Documentation2' for Assessment2 docs
- new items in 'Assessment 2' list: 'Change Report', 'Continuous Integration' and 'Testing'

### Changed

Website:
- changed the navigation menu, now it has two items: 'Assessment 1' and 'Assessment 2'
- moved 'Snapshots of Plan' from the navigation to the list of documents (under Method)
- changed the header, now it says 'ENG1 Cohort 2 Team 12 and Team 11'
- changed the title of index.html
- renamed some items in 'Assessment 2' list

<br><hr>

## [Unreleased]

<!-- Commit source tree links -->
[2.0.0]: https://github.com/ENG1-Team-11/ENG1-Team-12/tree/66afcea8025ad0b71c6617bc653de1f5f76679a8
[2.0.1]: https://github.com/ENG1-Team-11/ENG1-Team-12/tree/c645f195e18970556f9b6d68e353e12a454e3d93
[Unreleased]: https://github.com/wpw503/ENG1-Team-12/compare/main...ENG1-Team-11:main

