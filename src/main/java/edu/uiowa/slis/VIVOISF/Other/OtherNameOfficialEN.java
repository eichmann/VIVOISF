package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherNameOfficialENIterator theOther = (OtherNameOfficialENIterator)findAncestorWithClass(this, OtherNameOfficialENIterator.class);
			pageContext.getOut().print(theOther.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

