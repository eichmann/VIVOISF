package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameShortENIterator theOther = (OtherNameShortENIterator)findAncestorWithClass(this, OtherNameShortENIterator.class);
			pageContext.getOut().print(theOther.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

