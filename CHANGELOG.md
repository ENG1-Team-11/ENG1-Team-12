# Changelog
All notable changes to this project will be documented in this file.

</br></hr>

## [2.1.0] - 09-02-2021
### Changed:
Website
- Updated content

</br></hr>

## [2.1.0] - 06-02-2021
### Changed
Codebase:
- Added save manager and game saving functionality
- Removed unused functions
- Documented remaining undocumented code
- Added assets to replace temporary assets
- Now fulfills all user requirements, technically complete

Repo:
- Updated Implementation to latest version on master branch
- Fixed link to source tree for version 2.0.3

<br><hr>

## [2.0.3] - 04-02-2021
### Added
Website
- Updated content
- Added temporary documents

</br></hr>

## [2.0.3] - 31-01-2021
### Changed
Codebase:
- Added difficulty selection in the options menu
- Further tweaked Boat AI to improve boat performance
- Updated movement functions to use deltaTime rather than relying on the game running at 60 frames per second
- Added a more robust UI system.  Converted start menu and options to use it
- Tweaked boat stats slightly
- Added function-level comments to catch up on documentation debt
- Restructured assets folder

Repo:
- Updated Implementation to latest version on master branch

<br><hr>

## [2.0.2] - 29-01-2021
### Changed
Codebase:
- Added powerups (speed boost, repair, teleport, stamina, and time reduction)
- Improved Boat AI
- Updated player movement to make it harder to exploit
- Replaced snake_case with camelCase as is Java convention
- Added Unit tests for a few base classes (AIBoat, Boat, CollisionBounds, GameObject, MovableObject)

Repo:
- Updated Implementation to latest version on master branch

<br><hr>

## [2.0.1] - 27-01-2021
### Added
Deliverables:
- new risks (+mitigation, owners) in Risk1 document
- updated Change Report

### Changed
Deliverables:
- risk ID format in Risks table in Risk1 document
- risk owners
- Introduction to Risk Format and Level of Detail section in Risk1

### Removed
Deliverables:
- Backup Owner column of Risks table in Risk1 document

<br><hr>

## [2.0.1] - 26-01-2021
### Added
Deliverables:
- updated Req1 document, added new user requirements: UR_LEVELS, UR_SAVE and UR_POWER_UP (+risk, alternatives, assumptions)
- added new functional requirement to the table
- added new new tools, team management approach and other info to Plan1 document
- created a new Gantt Chart
- created Requirements sheet
- justification and alternatives to some of the tools in Plan1
- updated Change Report

### Changed
Deliverables:
- changed abstract architecture, added new entity PowerUpPack
- changed Plan Strategy, Team Organisation Approach and overall structure of Plan1 document

### Removed
Deliverables:
- deleted Key Event List and Announcements sections from Plan1 document

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
[2.1.0]: https://github.com/ENG1-Team-11/ENG1-Team-12/tree/351855281994cdf1d7fcae2bdc0a93fa281f76be
[2.0.3]: https://github.com/ENG1-Team-11/ENG1-Team-12/tree/a22f71f0fec6ae774953c452349e6a0cfbf76e47
[2.0.2]: https://github.com/ENG1-Team-11/ENG1-Team-12/tree/ecec61cbd3cee92f1823d56f530d768ecb813fd4
[2.0.1]: https://github.com/ENG1-Team-11/ENG1-Team-12/tree/c645f195e18970556f9b6d68e353e12a454e3d93
[2.0.0]: https://github.com/ENG1-Team-11/ENG1-Team-12/tree/66afcea8025ad0b71c6617bc653de1f5f76679a8
[Unreleased]: https://github.com/wpw503/ENG1-Team-12/compare/main...ENG1-Team-11:main

