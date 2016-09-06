package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameOfficialENIterator theother = (otherNameOfficialENIterator)findAncestorWithClass(this, otherNameOfficialENIterator.class);
			pageContext.getOut().print(theother.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

