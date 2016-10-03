package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptOwnerIterator theExcerptOwnerIterator = (ExcerptOwnerIterator)findAncestorWithClass(this, ExcerptOwnerIterator.class);
			pageContext.getOut().print(theExcerptOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for owner tag ");
		}
		return SKIP_BODY;
	}
}

