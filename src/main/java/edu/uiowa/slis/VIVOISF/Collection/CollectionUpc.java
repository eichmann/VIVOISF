package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionUpcIterator theCollection = (CollectionUpcIterator)findAncestorWithClass(this, CollectionUpcIterator.class);
			pageContext.getOut().print(theCollection.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for upc tag ");
		}
		return SKIP_BODY;
	}
}

