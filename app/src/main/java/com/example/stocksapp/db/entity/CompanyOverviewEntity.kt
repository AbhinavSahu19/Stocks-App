package com.example.stocksapp.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.stocksapp.db.MapConverter
import com.example.stocksapp.presentation.details.CompanyOverviewScreenData


@Entity("company_overview")
data class CompanyOverviewEntity(
    @PrimaryKey(autoGenerate = false)
    var symbol: String,
    var assetType: String,
    var name: String,
    var description: String,
    var cik: String,
    var exchange: String,
    var currency: String,
    var country: String,
    var sector: String,
    var industry: String,
    var address: String,
    var officialSite: String,
    var fiscalYearEnd: String,
    var latestQuarter: String,
    var marketCapitalization: String,
    var ebitda: String,
    var PERatio: String,
    var PEGRatio: String,
    var bookValue: String,
    var dividendPerShare: String,
    var dividendYield: String,
    var eps: String,
    var revenuePerShareTTM: String,
    var profitMargin: String,
    var operatingMarginTTM: String,
    var returnOnAssetsTTM: String,
    var returnOnEquityTTM: String,
    var revenueTTM: String,
    var grossProfitTTM: String,
    var dilutedEPSTTM: String,
    var quarterlyEarningsGrowthYOY: String,
    var quarterlyRevenueGrowthYOY: String,
    var analystTargetPrice: String,
    var analystRatingStrongBuy: String,
    var analystRatingBuy: String,
    var analystRatingHold: String,
    var analystRatingSell: String,
    var analystRatingStrongSell: String,
    var trailingPE: String,
    var forwardPE: String,
    var priceToSalesRatioTTM: String,
    var priceToBookRatio: String,
    var EVToRevenue: String,
    var EVToEBITDA: String,
    var beta: String,
    var weekHigh52: String,
    var weekLow52: String,
    var dayMovingAverage50: String,
    var dayMovingAverage200: String,
    var sharesOutstanding: String,
    var dividendDate: String,
    var exDividendDate: String,

    val dailyGraphData: String,
    val weeklyGraphData: String? = null,
    val monthlyGraphData: String? = null
) {
    fun toScreenData(): CompanyOverviewScreenData {
        return CompanyOverviewScreenData(
            symbol,
            assetType,
            name,
            description,
            cik,
            exchange,
            currency,
            country,
            sector,
            industry,
            address,
            officialSite,
            fiscalYearEnd,
            latestQuarter,
            marketCapitalization,
            ebitda,
            PERatio,
            PEGRatio,
            bookValue,
            dividendPerShare,
            dividendYield,
            eps,
            revenuePerShareTTM,
            profitMargin,
            operatingMarginTTM,
            returnOnAssetsTTM,
            returnOnEquityTTM,
            revenueTTM,
            grossProfitTTM,
            dilutedEPSTTM,
            quarterlyEarningsGrowthYOY,
            quarterlyRevenueGrowthYOY,
            analystTargetPrice,
            analystRatingStrongBuy,
            analystRatingBuy,
            analystRatingHold,
            analystRatingSell,
            analystRatingStrongSell,
            trailingPE,
            forwardPE,
            priceToSalesRatioTTM,
            priceToBookRatio,
            EVToRevenue,
            EVToEBITDA,
            beta,
            weekHigh52,
            weekLow52,
            dayMovingAverage50,
            dayMovingAverage200,
            sharesOutstanding,
            dividendDate,
            exDividendDate,

            MapConverter.toMap(dailyGraphData)
        )
    }
}
