package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionAsinIterator theCollection = (CollectionAsinIterator)findAncestorWithClass(this, CollectionAsinIterator.class);
			pageContext.getOut().print(theCollection.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for asin tag ");
		}
		return SKIP_BODY;
	}
}

