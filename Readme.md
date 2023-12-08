## MVVM

- View holds reference to ViewModel (View-Compose/Activity/Fragment)
- ViewModel is unaware of the views which are subscribed/listening to events
- Repository is the last layer (Model)
- Attach the repository inside ViewModel
- So now we have all the M-V-VM are connected as a complete working pipeline


## Retrofit
- Created Retrofit client and interface where all api endpoints will be added.
- These endpoints will be exposed from WebServiceClass and will be called from viewmodel.
- MainActivity/compose component will be calling the methods present in the VM.
- These methods returns the response to compose and it redraws when response arrives.

## Coroutines
