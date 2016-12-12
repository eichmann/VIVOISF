package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameListFRIterator theOther = (OtherNameListFRIterator)findAncestorWithClass(this, OtherNameListFRIterator.class);
			pageContext.getOut().print(theOther.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

