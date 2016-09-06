package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameShortENIterator theother = (otherNameShortENIterator)findAncestorWithClass(this, otherNameShortENIterator.class);
			pageContext.getOut().print(theother.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

