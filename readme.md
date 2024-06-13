# JavaFX Login and Registration Application

## Description

This JavaFX application includes:
1. **Registration Screen**: Register with a username and password.
2. **Login Screen**: Log in using the registered credentials.
3. **WebView Screen**: Displays your GitHub profile.

## Requirements

- **JDK 11 or later**
- **JavaFX SDK 11 or later**

## Setup Instructions

## Step 1: Download JavaFX

1. Download JavaFX from [Gluon JavaFX](https://gluonhq.com/products/javafx/).
2. Extract the downloaded JavaFX SDK.

## Step 2: Configure Your IDE

## IntelliJ IDEA

1. **Add JavaFX Library**:
   - Go to `File > Project Structure > Libraries`.
   - Click `+` and add the `lib` folder from the extracted JavaFX SDK.

2. **Set VM Options**:
   - Go to `Run > Edit Configurations`.
   - Add the following to VM options:
     ```plaintext
     --module-path "path/to/javafx-sdk-XX/lib" --add-modules javafx.controls,javafx.fxml,javafx.web
     ```

