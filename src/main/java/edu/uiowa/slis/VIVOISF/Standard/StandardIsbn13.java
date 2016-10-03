package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardIsbn13Iterator theStandard = (StandardIsbn13Iterator)findAncestorWithClass(this, StandardIsbn13Iterator.class);
			pageContext.getOut().print(theStandard.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

