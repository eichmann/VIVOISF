package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameListRUIterator theOther = (OtherNameListRUIterator)findAncestorWithClass(this, OtherNameListRUIterator.class);
			pageContext.getOut().print(theOther.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

