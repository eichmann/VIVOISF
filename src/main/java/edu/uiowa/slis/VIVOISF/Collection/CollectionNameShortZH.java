package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameShortZHIterator theCollection = (CollectionNameShortZHIterator)findAncestorWithClass(this, CollectionNameShortZHIterator.class);
			pageContext.getOut().print(theCollection.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

