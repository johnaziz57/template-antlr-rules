# TODO

- [ ] Handle `else if ()`
- [ ] Handle commas at the end of a value
- [ ] Test arrays
- [ ] Handle if condition in the middle of object with no commas after `{{/if}}`
```
{
    "component": {
            "type": "TOUCHABLE",
            {{#if accessibilityLabel}}
                "accessibilityLabel": "{{accessibilityLabel}}",
            {{/if}}
            "activeOpacity": 0.8
        }
}
```
- [ ] Handle if the one clause helper is dynamic. We still need a way to exclude `else`
```
{
    "type": "PML",
    "pml": {{item}}
}
```

# Done
- [x] Handle math helper without double quotes
- [x] Handle `unless`
- [x] This case is not working. The problem is with "+"
```
{
  "layout": {
        "layout": {},
        {{#with "+" }}
        "children": []
        {{/with}}
    }
}
```

# How to

To generate a new set of rules after updating the grammar
```bash
antlr -Dlanguage=Java JSON.g4
```

To generate a new set of rules after updating the grammar with visitor
```bash
antlr -Dlanguage=Java JSON.g4 -visitor
```


# Dependencies

Used this command to add `antlr` to maven local repo

```
mvn install:install-file \
-Dfile='/Users/john/Desktop/antlr-4.13.0-complete.jar' \
-DgroupId=org.antlr \
-DartifactId=antlr4-runtime \
-Dversion=4.13.0 \
-Dpackaging=jar \
-DgeneratePom=true
```