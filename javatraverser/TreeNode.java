//package jTraverser;
import javax.swing.*;
import java.awt.*;

public class TreeNode extends JLabel
{
    Node node;
    static Node selected;
    static Font plain_f, bold_f;
    static {
	plain_f = new Font("Serif", Font.PLAIN, 12);
	bold_f = new Font("Serif" ,Font.BOLD, 12);
    }

    public static void setSelectedNode(Node sel)
    {
	selected = sel;
    }
    public TreeNode(Node _node, String name, Icon icon)
    {
	super(name+"                ", icon, JLabel.LEFT);
	node = _node;
	if(node.isOn())
	    setFont(bold_f);
	else
	    setFont(plain_f);
	setForeground(Color.black);
	if(node.isDefault())
	    //setText(node.getName().trim() + "                                   ");
	    //setForeground(Color.red);
	    setBorder(BorderFactory.createLineBorder(Color.black, 1));
	else
	    setBorder(BorderFactory.createLineBorder(Color.white, 1));
	    //setText(node.getName().trim() + "                                   ");
	    //setForeground(Color.black);
    }
    
    public void paint(Graphics g)
    {
	setText(node.getName());
	if(node.isDefault())
	    setForeground(Color.red);
	else
	    setForeground(Color.black);
    
    	if(node.isOn())
	    setFont(bold_f);
	else
	    setFont(plain_f);
	    
	if(selected == node)
	    setBorder(BorderFactory.createLineBorder(Color.black, 1));
	else
	    setBorder(BorderFactory.createLineBorder(Color.white, 1));
	super.paint(g);
    }
}
