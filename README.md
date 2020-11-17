# Mars-Weather-Insight

The year is 2055 and the South African Space Agency ("SASA") is at the forefront of interstellar travel. With the Earths’ population soaring, the leaders of the World have turned to SASAfor help. SASA is tasked with observing the geographic conditions of Mars to assess whether or not modern structures could be built on Mars’ dusty surface. The brightest minds at SASA spent months researching and ultimately reached the conclusion that a physical survey of the land would be needed.

After what seemed like ages, the world watched with bated breath as SASA launched their prized spacecraft, the Tsotsi into space. The Tsosti was a technological marvel. Importantly, the Tsotsi housed an on-board weather station that gave the astronauts live data as to Mars’ climatic conditions. The weather can be a matter of life and death on an alien planet. Only the finest young astronauts and engineers were picked to pilot the Tsosti to its destination- and you were one!

As the Tsosti approached Mars’ atmosphere, a large object, hurdling at the speed of light crashed violently into the port side of the ship. The Tsotsi crashed onto Mars’ surface and your captain sent out a distress call moments later. "The weather monitoring functionality of the ship is destroyed!" you hear her say.

You look out the window and see the NASA Weather Station on Mars. As the chief software engineer aboard the Tsotsi, you wave your handheld communication device and say, "Captain, this device uses an iOS operating system. I can develop an iOS application which uses the NASA MarsAPI to get the weather data from the NASA Weather Station so we can have a daily update on the weather conditions!"

Quick soldier, the fate of the mission is in your hands!
 
YOUR MISSION
After contacting NASA and getting their permission they have provided you with the API that you can use to get weather from:

NASA Mars API: https://api.nasa.gov/

Your lead engineer has mentioned to you that even though that we’re in a rush, good engineering principles should be followed, and she has designed the following specifications for the Android application for you to develop:

Specification Description

User Interface The application should be simple for any crew member to use. It should consist of 2 screens.

•	A screen wherein the user can select what kind of forecast the want to see.
•	A screen that displays the selected forecast data.

Networking	Make use of networking libs/frameworks (ie Retrofit)
Multithreading	Make use of co-routines to switch threads to fetch data
Architecture	Make use of MVVM
Testing	Unit testing must be completed for all business logic (viewModel, repo and service layer where applicable)
Behavior and error handling	The application must use a progress loader when fetching data and the appropriate error must be displayed if something went wrong
Coding Style	You must name all your variables correctly and make use of clear concise naming conventions for functions.
UI theming	Create and style your application (be unique, do not use generic theming)
CI/CD	The Repo and ci/cd pipelines need to be on github
Make use of trunk-based development
Make use of small incremental pull requests





