package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameOfficialZHIterator theOther = (OtherNameOfficialZHIterator)findAncestorWithClass(this, OtherNameOfficialZHIterator.class);
			pageContext.getOut().print(theOther.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

