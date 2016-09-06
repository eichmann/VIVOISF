package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272CitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272CitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272CitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272CitesIterator theOBI_0000272CitesIterator = (OBI_0000272CitesIterator)findAncestorWithClass(this, OBI_0000272CitesIterator.class);
			pageContext.getOut().print(theOBI_0000272CitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for cites tag ");
		}
		return SKIP_BODY;
	}
}

