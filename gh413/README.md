# GH413 Test Project

See [Support binding to generic typed parameter in action handler method argument list #413](https://github.com/actframework/actframework/issues/413)

To start the app:

```bash
./run_dev
```

To start the app in prod mode:

```bash
./run_prod
```

To test the app:

Open browser go to 

```
http://localhost:5460/test/str?foo.data=abc
```

You should get

```
{
    "data": "123"
}
```

If you go 

```
http://localhost:5460/test/int?foo.data=123
```

then you should get

```
{
    "result": 246
}
```

See the source code for more details.