package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardPmidIterator theStandard = (StandardPmidIterator)findAncestorWithClass(this, StandardPmidIterator.class);
			pageContext.getOut().print(theStandard.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for pmid tag ");
		}
		return SKIP_BODY;
	}
}

