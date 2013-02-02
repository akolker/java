
public class binTree<T> {

	private T info;
	private binTree<T> left=null;
	private binTree<T> right=null;
	
	public binTree(T info)
	{
		this.info=info;
		this.left=null;
		this.right=null;
	}
	
	public binTree(T info, binTree<T> left, binTree<T> right)
	{
		this.info=info;
		this.left=left;
		this.right=right;
	}
	
	public T getInfo()
	{
		return this.info;
	}
	
	public binTree getLeft()
	{
		return this.left;
	}
	
	public binTree getRight()
	{
		return this.right;
	}
	
	public void setInfo(T info)
	{
		this.info=info;
	}
	
	public void setLeft(binTree<T> left)
	{
		this.left=left;
	}
	
	public void setRight(binTree<T> right)
	{
		this.right=right;
	}

	public String toString()
	{
		return this.info+" ";
	}
	
	public int getLength()
	{
		if(this.getLeft()==null && this.getRight()==null)
			return 1;
		else
			if(this.getLeft()!=null && this.getRight()!=null)
			{
				if(this.getLeft().getLength()>this.getRight().getLength())
					return 1+this.getLeft().getLength();
				else
					return 1+this.getRight().getLength();
			}
			else
				if(this.getLeft()==null)
					return 1+this.getRight().getLength();
				else
					return 1+this.getLeft().getLength();
	}
}
