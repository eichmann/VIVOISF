package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameListENIterator theOther = (OtherNameListENIterator)findAncestorWithClass(this, OtherNameListENIterator.class);
			pageContext.getOut().print(theOther.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

