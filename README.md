# material-colors
All the material design colors in one place

### Features
- All material colors available via R.color.*

### How to create MaterialColor
A MaterialColor instance consist of a normal color and its dark variant
```
int normal = R.color.light_blue_500;
int dark = R.color.light_blue_700;
MaterialColor lightBlue = new MaterialColor(normal,dark);
```

### How to get a MaterialColor randomly
```
MaterialColorRandom materialColorRandom = new MaterialColorRandom(myContext);
MaterialColor color = materialColorRandom.nextMaterialColor();
```
