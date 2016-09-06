package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameOfficialZHIterator theother = (otherNameOfficialZHIterator)findAncestorWithClass(this, otherNameOfficialZHIterator.class);
			pageContext.getOut().print(theother.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

