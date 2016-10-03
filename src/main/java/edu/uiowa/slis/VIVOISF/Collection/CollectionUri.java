package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionUri currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionUriIterator theCollection = (CollectionUriIterator)findAncestorWithClass(this, CollectionUriIterator.class);
			pageContext.getOut().print(theCollection.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for uri tag ");
		}
		return SKIP_BODY;
	}
}

