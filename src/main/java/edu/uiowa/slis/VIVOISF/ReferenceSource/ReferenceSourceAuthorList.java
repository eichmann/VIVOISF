package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceAuthorListIterator theReferenceSourceAuthorListIterator = (ReferenceSourceAuthorListIterator)findAncestorWithClass(this, ReferenceSourceAuthorListIterator.class);
			pageContext.getOut().print(theReferenceSourceAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for authorList tag ");
		}
		return SKIP_BODY;
	}
}

