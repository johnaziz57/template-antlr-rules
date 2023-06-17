# TODO

- [ ] Test arrays
- [ ] Handle `unless`
- [ ] This case is not working. The problem is with "+"
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

# Done

1. This case is working

``` 
{
    "template_id": "core0",
    "layout": 
      {{#and p }}
        ""
      {{else}}
          {{#if p}}
            {{{template 'core2' }}}
          {{else}}
              {{{template 'core3' }}}
          {{/if}}
      {{/and}}
    ,
    "context": {}
}
```

while this case is not working

```
{
    "template_id": "core0",
    "layout": 
      {{#and p }}
        {{{template 'core1' }}}
      {{else}}
          {{#if p}}
            {{{template 'core2' }}}
          {{else}}
              "3"
          {{/if}}
      {{/and}}
    ,
    "context": {}
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