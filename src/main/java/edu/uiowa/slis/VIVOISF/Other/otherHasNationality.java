package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasNationality extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasNationality currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasNationality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasNationalityIterator theother = (otherHasNationalityIterator)findAncestorWithClass(this, otherHasNationalityIterator.class);
			pageContext.getOut().print(theother.getHasNationality());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasNationality tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasNationality tag ");
		}
		return SKIP_BODY;
	}
}

