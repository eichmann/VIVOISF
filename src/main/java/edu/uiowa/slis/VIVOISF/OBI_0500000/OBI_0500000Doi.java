package edu.uiowa.slis.VIVOISF.OBI_0500000;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0500000Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0500000Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0500000Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0500000DoiIterator theOBI_0500000 = (OBI_0500000DoiIterator)findAncestorWithClass(this, OBI_0500000DoiIterator.class);
			pageContext.getOut().print(theOBI_0500000.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0500000 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for doi tag ");
		}
		return SKIP_BODY;
	}
}

