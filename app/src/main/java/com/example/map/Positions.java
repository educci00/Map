package com.example.map;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class Positions {
    public static final LatLng ROKUBUN = new LatLng(41.4025209,2.194333);

    public static final PolylineOptions polyline = new PolylineOptions()
                                    .add(new LatLng(41.402634, 2.194727))
                                    .add(new LatLng(41.402567, 2.194812))
                                    .add(new LatLng(41.402324, 2.194802))
                                    .add(new LatLng(41.401737, 2.194040))
                                    .add(new LatLng(41.401727, 2.193654))
                                    .add(new LatLng(41.402445, 2.192742));


}
