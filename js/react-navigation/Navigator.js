import { createMaterialBottomTabNavigator } from '@react-navigation/material-bottom-tabs';

const Tab = createMaterialBottomTabNavigator()

const isHermes = () => !!global.HermesInternal;
if(isHermes)
    console.log("HERMES IN USE!!")
else
    console.log("HERMES NOT IN USE!!")

export const TabNavigator = Tab.Navigator;
export const TabScreen = Tab.Screen;
