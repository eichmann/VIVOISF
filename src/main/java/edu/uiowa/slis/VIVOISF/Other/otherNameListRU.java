package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameListRUIterator theother = (otherNameListRUIterator)findAncestorWithClass(this, otherNameListRUIterator.class);
			pageContext.getOut().print(theother.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

