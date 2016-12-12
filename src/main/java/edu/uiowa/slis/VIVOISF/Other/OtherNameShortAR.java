package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameShortARIterator theOther = (OtherNameShortARIterator)findAncestorWithClass(this, OtherNameShortARIterator.class);
			pageContext.getOut().print(theOther.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

