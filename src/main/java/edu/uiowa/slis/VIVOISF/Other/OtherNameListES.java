package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameListESIterator theOther = (OtherNameListESIterator)findAncestorWithClass(this, OtherNameListESIterator.class);
			pageContext.getOut().print(theOther.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

