package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameOfficialRUIterator theOther = (OtherNameOfficialRUIterator)findAncestorWithClass(this, OtherNameOfficialRUIterator.class);
			pageContext.getOut().print(theOther.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

