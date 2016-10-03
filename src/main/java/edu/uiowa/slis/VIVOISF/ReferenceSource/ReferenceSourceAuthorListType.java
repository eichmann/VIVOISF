package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceAuthorListIterator theReferenceSourceAuthorListIterator = (ReferenceSourceAuthorListIterator)findAncestorWithClass(this, ReferenceSourceAuthorListIterator.class);
			pageContext.getOut().print(theReferenceSourceAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for authorList tag ");
		}
		return SKIP_BODY;
	}
}

