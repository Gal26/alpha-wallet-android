package com.alphawallet.app.entity.lifi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Connection
{
    @SerializedName("fromChainId")
    @Expose
    public String fromChainId;

    @SerializedName("toChainId")
    @Expose
    public String toChainId;

    @SerializedName("fromTokens")
    @Expose
    public List<LToken> fromTokens;

    @SerializedName("toTokens")
    @Expose
    public List<LToken> toTokens;

    public static class LToken
    {
        @SerializedName("address")
        @Expose
        public String address;

        @SerializedName("symbol")
        @Expose
        public String symbol;

        @SerializedName("decimals")
        @Expose
        public long decimals;

        @SerializedName("chainId")
        @Expose
        public long chainId;

        @SerializedName("name")
        @Expose
        public String name;

        @SerializedName("coinKey")
        @Expose
        public String coinKey;

        @SerializedName("priceUSD")
        @Expose
        public String priceUSD;

        @SerializedName("logoURI")
        @Expose
        public String logoURI;

        public String balance;

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LToken lToken = (LToken) o;
            return address.equals(lToken.address) && symbol.equals(lToken.symbol);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(address, symbol);
        }
    }
}
