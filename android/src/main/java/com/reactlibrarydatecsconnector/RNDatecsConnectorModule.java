
package com.reactlibrarydatecsconnector;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Set;

public class RNDatecsConnectorModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDatecsConnectorModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNDatecsConnector";
  }

  @ReactMethod
  public Set<BluetoothDevice> listDevices() {

    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
    return defaultAdapter.getBondedDevices();
  }

}