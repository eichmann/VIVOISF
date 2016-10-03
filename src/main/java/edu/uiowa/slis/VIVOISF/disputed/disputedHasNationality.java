package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasNationality extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasNationality currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasNationality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasNationalityIterator thedisputed = (disputedHasNationalityIterator)findAncestorWithClass(this, disputedHasNationalityIterator.class);
			pageContext.getOut().print(thedisputed.getHasNationality());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasNationality tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasNationality tag ");
		}
		return SKIP_BODY;
	}
}

