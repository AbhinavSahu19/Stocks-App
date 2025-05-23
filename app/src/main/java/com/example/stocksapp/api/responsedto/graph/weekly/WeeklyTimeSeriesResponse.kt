package com.example.stocksapp.api.responsedto.graph.weekly

import com.example.stocksapp.api.responsedto.graph.StockGraphDataItem
import com.google.gson.annotations.SerializedName

data class WeeklyTimeSeriesResponse (
    @SerializedName("Meta Data" )
    var metaData   : WeeklyTimeSeriesMetaData,
    @SerializedName("Weekly Time Series" )
    val timeSeriesWeekly: Map<String, StockGraphDataItem>
)