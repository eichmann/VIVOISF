package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardIsbn10Iterator theStandard = (StandardIsbn10Iterator)findAncestorWithClass(this, StandardIsbn10Iterator.class);
			pageContext.getOut().print(theStandard.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

