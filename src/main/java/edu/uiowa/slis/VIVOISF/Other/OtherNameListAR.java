package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameListARIterator theOther = (OtherNameListARIterator)findAncestorWithClass(this, OtherNameListARIterator.class);
			pageContext.getOut().print(theOther.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

