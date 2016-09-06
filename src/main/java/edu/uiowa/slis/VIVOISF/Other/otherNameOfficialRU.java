package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameOfficialRUIterator theother = (otherNameOfficialRUIterator)findAncestorWithClass(this, otherNameOfficialRUIterator.class);
			pageContext.getOut().print(theother.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

