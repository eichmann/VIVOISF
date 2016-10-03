package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionOclcnumIterator theCollection = (CollectionOclcnumIterator)findAncestorWithClass(this, CollectionOclcnumIterator.class);
			pageContext.getOut().print(theCollection.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

