# First Day Trying Out Kotlin and Intelligi IDEA

I started today with docs provided in github for [Create and Publish a multiplatform library](https://kotlinlang.org/docs/multiplatform-library.html) and was able to set up the basic. However, first problem I ran to after completing all the file and tried test with some common test provided in the doc with command

```
./gradlew check
```

![First Error with multiplatform library](/images//Error%20With%20ld%20when%20trying%20to%20setup%20multiplatform%20Lib.png)

Problem said something about ld and seems to be a macos problem so I tried to configure it for the next hour, restarted the project, used different JDK settings but still came to the same erorr.

Then I tried a simpler file just printing hello world to the terminal and it seems like everything working fine
![Hello World Terminal](/images/Basic%20function%20with%20saying%20helloworld%20in%20terminal.png)

After that I started with another docs to about [compose-multiplatform-desktop-template](https://github.com/JetBrains/compose-multiplatform-desktop-template#readme). After setting up I also ran into another problem ![Error after setting up with docs](/images/Error%20when%20trying%20to%20set%20up%20project%20for%20desktop%20app.png) After research and multiple attemp to config the system, deleted and recreated project, for some reason the error went away and sadly I wasn't able to pinpoint the solution for this error but I got the app working.

Ran a couple of code and these are the result, first was the button change from Hello World to Hello Desktop then the button for counter and it seems working.

![Hello World](/images/App%20running%20button%20hello%20world.png)
![Hello Desktop](/images/Got%20App%20to%20work.%20button%20change%20from%20Hello%20Wold%20to%20Hello%20Desktop.png)
![Counter](/images/Adding%20on%20counter%20for%20button.png)

I will try to work on with the ld problem from the beginning later on today and will give update about it if I figured it out.
