package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameListENIterator theother = (otherNameListENIterator)findAncestorWithClass(this, otherNameListENIterator.class);
			pageContext.getOut().print(theother.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

