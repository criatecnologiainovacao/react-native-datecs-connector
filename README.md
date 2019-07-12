
# react-native-datecs-connector

## Getting started

`$ npm install react-native-datecs-connector --save`

### Mostly automatic installation

`$ react-native link react-native-datecs-connector`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNDatecsConnectorPackage;` to the imports at the top of the file
  - Add `new RNDatecsConnectorPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-datecs-connector'
  	project(':react-native-datecs-connector').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-datecs-connector/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-datecs-connector')
  	```

## Usage
```javascript
import RNDatecsConnector from 'react-native-datecs-connector';

// TODO: What to do with the module?
RNDatecsConnector;
```
  
