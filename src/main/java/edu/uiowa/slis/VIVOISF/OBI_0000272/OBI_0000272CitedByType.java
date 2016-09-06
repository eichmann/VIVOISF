package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272CitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272CitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272CitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272CitedByIterator theOBI_0000272CitedByIterator = (OBI_0000272CitedByIterator)findAncestorWithClass(this, OBI_0000272CitedByIterator.class);
			pageContext.getOut().print(theOBI_0000272CitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

