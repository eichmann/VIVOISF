package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRelatesIterator theCollectionRelatesIterator = (CollectionRelatesIterator)findAncestorWithClass(this, CollectionRelatesIterator.class);
			pageContext.getOut().print(theCollectionRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for relates tag ");
		}
		return SKIP_BODY;
	}
}

