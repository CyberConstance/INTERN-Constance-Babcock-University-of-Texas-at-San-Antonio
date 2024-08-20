import java.util.*;

public class Main{
  
  
  public Main() 
  { 
    ArrayList<Block> blockchain = new ArrayList<>();
    
  }
  
  public static void main(String[] args) 
  { 
    /*String[] list1 = {"a", "b", "c"};
     String[] list2 = {"a", "b", "c"};
     
     System.out.println(Arrays.hashCode(list1));
     System.out.println(Arrays.hashCode(list2));
     */
    
    
    String[] genesisTransactions = {"connie gave mom $2", "mom gave dad $1"};
    Block genesisBlock = new Block(0, genesisTransactions);
    System.out.println("Hash of Genesis Block: ");
    System.out.println(genesisBlock.getBlockHash());
    
    String[] block2Transactions = {"dad gave brother $4", "brother gave connie $5"};
    Block block2 = new Block(genesisBlock.getBlockHash(),block2Transactions);
    System.out.println("Hash of Block 2: ");
    System.out.println(block2.getBlockHash());
    
  }
  
  
}

/* Heavily Inspired by Ivan on Tech */