package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameListZHIterator theOther = (OtherNameListZHIterator)findAncestorWithClass(this, OtherNameListZHIterator.class);
			pageContext.getOut().print(theOther.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

