package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameListZHIterator theother = (otherNameListZHIterator)findAncestorWithClass(this, otherNameListZHIterator.class);
			pageContext.getOut().print(theother.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

