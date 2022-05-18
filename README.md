# Automation FrameWork

## Introduction

Appium is an open source test automation framework for use with native, hybrid and mobile web apps. It drives iOS, Android, and Windows apps using the WebDriver protocol.

## Why we developed this:

The target of this archetype is to make teams easier to start a new Appium test automation project and integrate with the different adidasRuntastic infrastructure and testing tools:

- Jenkins
- Jira
- Test Reporting Portal
- Teams
- ....

### Tech stach:

- Java
- Maven
- Cucumber
- BDD

### This project uses the following tools:

- Appium
- Cucumber
- Selenium
- BDD
- IntelliJ as IDE
- Android studio
- Serenity BDD

## Structure

The structure of the project follows the rules of BDD and Cucumber, taking into consideration the Page Object Models

- applications

- data

- src

    - main

        - java
            - adidasRuntastic
                - base
                - pages
                - utilities

    - test

        - java
            - cucumber
               - runner
               - stepDefinitions

        - resources
            - features
            - config


**applications**-> Folder to locate app to be tested. Demo apps are already here. Copy your .app, .ipa or .apk if needed.

**src\main\java\adidasRuntastic\base\PageBase.java** -> Add your common actions for the locators

**src\main\java\adidasRuntastic\pages** -> Add all your locators for every screen in the app

**src\test\java\cucumber** -> Cucumber test runners and step definitions

**src\test\resources\features** -> Add all the feature files including scenarios using Gherkin.

**src\test\resources\config** -> Add all the properties files.