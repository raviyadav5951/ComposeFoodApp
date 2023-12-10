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
- Light weight thread which are used to run task in parallel
- Used for async and for parallel running task(multithreading)

### Concepts of coroutine
- Suspend function, coroutine builders, coroutine scopes and dispatchers.
- Suspend function can be called from other suspend function or from coroutine.

### Coroutine builders
- Coroutine builders are simple functions that can create a coroutine and act as a bridge between normal and suspending world.
they are called on scopes.
- Types : 
- Launch: launches coroutines and forgets.
- async: returns a deferred object
- runBlocking: runs on main thread.
- private fun fetchDetailsAPI(){
    scope.launch(){     
            val result=mysuspedFunction()       
}
    }
- Scope helps us in preventing memory leaks as it destroys the dependencies which are not active.
- Scope determines how long the coroutine should live and wait for results.
- GlobalScope lives as long as activity/fragment lifecycle.
- lifecycleScope, rememberCoroutineScope,viewModelScope
- Custom scope is defined using Job+Dispatcher.
- Job is used to handle to coroutine where we can track the wait time and cancel it.
- Dispatcher: Allows us specify where coroutine will be executed.
- Dispatcher types: Main-UI, Default-CPU, IO-networking or file access