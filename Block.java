import java.util.*;
/**
 * Block = 
 * hash of current data 
 * hash of previous data 
 * list of transactions
 * 
 */
public class Block {
  
  private int previousHash;
  private String[] transactions;
  private int blockHash;
  
  public Block (int previousHash, String[] transactions)
  {
    this.previousHash = previousHash;
    this.transactions = transactions;
    Object[] content = {Arrays.hashCode(transactions), previousHash};
    this.blockHash = Arrays.hashCode(content);
  }
  
  public int getPreviousHash()
  {
   return previousHash; 
  }
  
 public String[] getTransactions()
  {
   return transactions;
  }
 
  public int getBlockHash()
  {
   return blockHash;
  }
}
