package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554DoiIterator theOBI_0001554 = (OBI_0001554DoiIterator)findAncestorWithClass(this, OBI_0001554DoiIterator.class);
			pageContext.getOut().print(theOBI_0001554.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for doi tag ");
		}
		return SKIP_BODY;
	}
}

