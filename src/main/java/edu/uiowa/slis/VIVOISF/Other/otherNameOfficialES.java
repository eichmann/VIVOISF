package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameOfficialESIterator theother = (otherNameOfficialESIterator)findAncestorWithClass(this, otherNameOfficialESIterator.class);
			pageContext.getOut().print(theother.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

