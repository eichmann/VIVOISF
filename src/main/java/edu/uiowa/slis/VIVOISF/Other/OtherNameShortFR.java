package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameShortFRIterator theOther = (OtherNameShortFRIterator)findAncestorWithClass(this, OtherNameShortFRIterator.class);
			pageContext.getOut().print(theOther.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

