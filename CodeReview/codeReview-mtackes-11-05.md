### Team Day's Code Review Checklist

Review by Michael Tackes  
November 5, 2015 ([closest point-in-time snapshot](https://github.com/CaddJoseph/JavaEnterpriseProject/tree/7372e47ccc9ea5a6c529d7dd05e1fd4a8ac19f38))

### Project Structure
| Metric | Measurement | Notes |
| :---------- | :----------: | :---------- |
| Classes are single-purpose | Most | `YouTubeManager` might be a bit overloaded. |
| Proper file structure | Yes | Yes, but: the package structure `com.youtube` kind if indicates that this is an official youtube.com project. |
| Proper implementation of industry-standard high-level structure (or, appropriate separation of concerns) | Good |  |

### Code Structure and Style
| Metric | Measurement | Notes |
| :---------- | :----------: | :---------- |
| No duplicate code | Yes |  |
| No dead/useless/lazy/unreachable code | No | Several unused methods in `YouTubeMedia` and `YouTubeVideo` |
| Variables and methods have appropriate access modifiers | Yes | are variables private with public getters/setters, are methods private unless called from outside the class, etc |
| No hardcoded variables/magic numbers/strings | Yes |  |
| Readability | Good |  |
| Full, complete Javadoc for all classes and methods | None |  |
| Appropriate and descriptive variable and function names | Good | The non-word "medias" is used in severl places. "Media" is already plural. |
| Consistent formatting | Yes |  |
| Methods are concise and single-purpose | Most | `YouTubeManager.convertVideos()` could probably be broken into a few different methods. |
| Class constructors are present and appropriately implemented | Most | The explicit call to `super()` in `YouTubeMedia` is unnecessary. |

### Testing
| Metric | Measurement | Notes |
| :---------- | :----------: | :---------- |
| Code compiles with no errors or warnings | Yes |  |
| Appropriate use of logging | Poor |  |
| No System.out.println use | No | There are `println`s, but they're in what looks like some experiment code, not the main project code. |
| Testing for positive results | No | |
| Testing for negative resuts | No | |
| Testing for errors and exceptions | No | |
| Code coverage with tests | None | |
