package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperOwnerIterator theNewspaperOwnerIterator = (NewspaperOwnerIterator)findAncestorWithClass(this, NewspaperOwnerIterator.class);
			pageContext.getOut().print(theNewspaperOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for owner tag ");
		}
		return SKIP_BODY;
	}
}

