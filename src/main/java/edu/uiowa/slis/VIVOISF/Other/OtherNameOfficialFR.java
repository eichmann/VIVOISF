package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameOfficialFRIterator theOther = (OtherNameOfficialFRIterator)findAncestorWithClass(this, OtherNameOfficialFRIterator.class);
			pageContext.getOut().print(theOther.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

