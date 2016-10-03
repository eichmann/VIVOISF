package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionOwnerIterator theCollectionOwnerIterator = (CollectionOwnerIterator)findAncestorWithClass(this, CollectionOwnerIterator.class);
			pageContext.getOut().print(theCollectionOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for owner tag ");
		}
		return SKIP_BODY;
	}
}
