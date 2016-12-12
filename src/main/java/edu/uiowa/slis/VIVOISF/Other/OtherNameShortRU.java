package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameShortRUIterator theOther = (OtherNameShortRUIterator)findAncestorWithClass(this, OtherNameShortRUIterator.class);
			pageContext.getOut().print(theOther.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

