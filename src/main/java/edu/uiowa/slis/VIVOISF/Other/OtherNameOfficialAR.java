package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameOfficialARIterator theOther = (OtherNameOfficialARIterator)findAncestorWithClass(this, OtherNameOfficialARIterator.class);
			pageContext.getOut().print(theOther.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

