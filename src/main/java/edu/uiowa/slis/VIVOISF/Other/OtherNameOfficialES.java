package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameOfficialESIterator theOther = (OtherNameOfficialESIterator)findAncestorWithClass(this, OtherNameOfficialESIterator.class);
			pageContext.getOut().print(theOther.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

