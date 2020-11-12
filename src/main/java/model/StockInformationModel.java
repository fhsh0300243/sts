package model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockInformationModel {

  @JsonProperty("usersId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(columnDefinition = "serial", name = "id" )
  private Long id;
  
  @JsonProperty("stockCode")
  @Column(name = "stock_code")
  private String stockCode;
  
  @JsonProperty("stockName")
  @Column(name = "stock_name")
  private String stockName;
  
  @JsonProperty("trade_price")
  @Column(name = "tradePrice")
  private BigDecimal tradePrice;
  
  @JsonProperty("change")
  @Column(name = "change")
  private BigDecimal change;
  
  @JsonProperty("tradeVolume")
  @Column(name = "trade_volume")
  private Integer tradeVolume;
  
  @JsonProperty("accTradeVolume")
  @Column(name = "acc_trade_volume")
  private Integer accTradeVolume;
  
  @JsonProperty("openingPrice")
  @Column(name = "opening_price")
  private BigDecimal openingPrice;
  
  @JsonProperty("highestPrice")
  @Column(name = "highest_price")
  private BigDecimal highestPrice;
  
  @JsonProperty("lowestPrice")
  @Column(name = "lowest_price")
  private BigDecimal lowestPrice;
}
