package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameShortZHIterator theOther = (OtherNameShortZHIterator)findAncestorWithClass(this, OtherNameShortZHIterator.class);
			pageContext.getOut().print(theOther.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

