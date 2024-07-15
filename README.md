# JoinMeetingAutomation

This project automates the process of joining Google Meet meetings using Java and Selenium. It allows you to join a meeting at a specified time and handles the "Join now" or "Ask to join" buttons.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/JoinMeetingAutomation.git
    cd JoinMeetingAutomation
    ```

2. Set up your development environment:
    - Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
    - Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
    - Download [Selenium WebDriver](https://www.selenium.dev/downloads/) and add the required JAR files to your project dependencies.

3. Configure your ChromeDriver:
    - Download [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads) that matches your Chrome version.
    - Place `chromedriver.exe` in a known directory and update your project to use this path.

## Usage

1. Update the `MeetLinkAutomation.java` file with your Google Meet link:
    ```java
    String meetLink = "https://meet.google.com/your-meeting-link";
    ```

2. Run the `MeetLinkAutomation` class from IntelliJ IDEA or via the command line:
    ```bash
    java -cp "path\to\your\project\classes;path\to\selenium\jars\*" seleni.MeetLinkAutomation
    ```

3. The script will launch a Chrome browser, navigate to the Google Meet link, and handle the "Join now" or "Ask to join" buttons.

## Features

- Automates joining Google Meet meetings
- Handles "Join now" and "Ask to join" buttons
- Uses Selenium WebDriver for browser automation

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For any questions or issues, please contact:
- Name: [Abhishek Kumar Singh]
- Email: [abhikumar1324@gmail.com.com]
- GitHub: (https://github.com/The-Abhishekhh)
