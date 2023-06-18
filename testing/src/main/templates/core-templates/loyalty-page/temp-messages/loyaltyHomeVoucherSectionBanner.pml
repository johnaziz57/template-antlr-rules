{
  "pml_version": "0.1.0",
  "component": {
    "type": "TOUCHABLE",
    "active_scale": 0.98,
    "on_press": {
      "action_type": "OPEN",
      "target": "nl.picnic-supermarkt://store/page;id=loyalty-page-root"
    },
    "child": {
      "type": "CONTAINER",
      "border_radius": 12,
      "overflow": "hidden",
      "background_color": "WHITE",
      "height": "100%",
      "width": "100%",
      "padding": {},
      "child": {
        "type": "STACK",
        "axis": "HORIZONTAL",
        "alignment": "CENTER",
        "spacing": 12,
        "children": [
          {
            "type": "CONTAINER",
            "absolutePosition": {
              "right": 24,
              "top": 6
            },
            "child": {
              "type": "IMAGE",
              "height": 27,
              "width": 57,
              "resize_mode": "COVER",
              "source": {
                "url": "https://picnic-nl-prod-images.s3.amazonaws.com/picnic-page/65dbf460b54b4bc14e9e593ed5bb66541e54a788bef4b1efe394f700a8e537b5/<DERIVATIVE>.png"
              }
            }
          },
          {
            "type": "CONTAINER",
            "height": "100%",
            "padding": {
              "top": 10
            },
            "child": {
              "type": "IMAGE",
              "aspectRatio": 1.13,
              "height": 70,
              "resize_mode": "CONTAIN",
              "source": {
                "url": "https://picnic-nl-prod-images.s3.amazonaws.com/picnic-page/a7eade6be22fbba67dd879593505fa1746d906db4c6b08137416d26d7038a78c/<DERIVATIVE>.png"
              }
            }
          },
          {
            "type": "STACK",
            "axis": "HORIZONTAL",
            "children": [
              {
                "type": "CONTAINER",
                "width": "100%",
                "child": {
                  "type": "STACK",
                  "children": [
                    {
                      "type": "RICH_TEXT",
                      "markdown": "**#(GREEN1)Nieuw!#(GREEN1)**"
                    },
                    {
                      "type": "RICH_TEXT",
                      "markdown": "Verdien elke maand een kadootje en €5 korting "
                    }
                  ]
                }
              }
            ]
          },
          {
            "type": "CONTAINER",
            "padding": {
              "right": 16,
              "left": 16
            },
            "child": {
              "type": "ICON",
              "width": 24,
              "height": 24,
              "icon_key": "arrowWithCircle",
              "color": "GREY2"
            }
          }
        ]
      }
    }
  }
}
