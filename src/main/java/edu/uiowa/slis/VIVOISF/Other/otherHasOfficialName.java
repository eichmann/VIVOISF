package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasOfficialNameIterator theother = (otherHasOfficialNameIterator)findAncestorWithClass(this, otherHasOfficialNameIterator.class);
			pageContext.getOut().print(theother.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

