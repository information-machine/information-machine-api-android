Information Machine API
=================

How To Configure:
=================
The example app project reads configuration values from the AndroidManifest.xml file and it contains the following.

	1. <meta-data android:name="clientid" android:value="YOUR_CLIENT_ID" />
	2. <meta-data android:name="clientsecret" android:value="YOUR_CLIENT_SECRET" />
    3. <meta-data android:name="supermarketname" android:value="STORE_NAME(EXAMPLE:WALMART)" />
    4. <meta-data android:name="username" android:value="USERNAME_FOR_GIVEN_STORE" />
    5. <meta-data android:name="password" android:value="PASSWORD_FOR_GIVEN_STORE" />

So, you need to replace the above lines in app\src\main\AndroidManifest.xml file with corresponding values.

How To Build:
=============
The generated code uses a java library namely UniRest. The reference to this
library is already added as a maven dependency in the generated gradle build
file. Therefore, you will need internet access to resolve this dependency.

For build process do the following:

    1. Open Android Studio and use "Import Project" option.
    2. Provide path to the cloned git repository.
    3. Press Ctrl+F9 or use "Make Project" menu command to build.

How To Use:
===========
The build process generates android libaray, which can be used just like an
ordinary AAR library. See the following link for more information on this
topic.

http://tools.android.com/tech-docs/new-build-system/user-guide#TOC-Referencing-a-Library

The quickest way to see how you should use the API and library itself is to open app module in Android Studio and debug the APIExample class to see how the api is used.

The generated controller classes accept the client_id and client_secret key parameters (which are in this case extracted from AndroidManifest.xml file) in their respective constructors. An example of this is given below:

```
	ProductsController productsController = new ProductsController(clientId, clientSecret);
```

Then you can use that to call methods such as:

```
	ProductData productFull = productsController.productsGetProduct("380728", true).getResult();
    List<ProductData> kaleProducts = productsController.productsGetProducts("Kale", null, 1, 25, true).getResult();
```

All methods return wrapper object which contains meta information (number of available requests, maximum number of requests per minute) and result object. Additionally if the result is of an array type, meta object will contain paging information (current page, items per page, total number of items, url to next page if there is a next page).

For more information on which methods are available please go to [Information Machine](http://iamdata.co/swagger/ui/index)