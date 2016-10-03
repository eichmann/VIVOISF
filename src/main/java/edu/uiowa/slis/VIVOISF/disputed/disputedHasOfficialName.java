package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasOfficialNameIterator thedisputed = (disputedHasOfficialNameIterator)findAncestorWithClass(this, disputedHasOfficialNameIterator.class);
			pageContext.getOut().print(thedisputed.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

