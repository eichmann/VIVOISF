package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Status extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Status currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Status.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272StatusIterator theOBI_0000272StatusIterator = (OBI_0000272StatusIterator)findAncestorWithClass(this, OBI_0000272StatusIterator.class);
			pageContext.getOut().print(theOBI_0000272StatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for status tag ");
		}
		return SKIP_BODY;
	}
}

