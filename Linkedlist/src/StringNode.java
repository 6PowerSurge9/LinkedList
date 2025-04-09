public class StringNode
{
private String data;
private StringNode link;
public StringNode()
{
data = null;
link = null;
}
public StringNode(String data)
{
this.data = data;
link = null;
}
public StringNode(String data, StringNode link)
{
this.data = data;
this.link = link;
}
public void setLink (StringNode newLink)
{
link = newLink;
}
public void setData (String newData)
{
data = newData;
}
public StringNode getLink ()
{
return link;
}
public String getData ()
{
return data;
}
}