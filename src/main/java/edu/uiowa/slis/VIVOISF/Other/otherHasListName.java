package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasListNameIterator theother = (otherHasListNameIterator)findAncestorWithClass(this, otherHasListNameIterator.class);
			pageContext.getOut().print(theother.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

