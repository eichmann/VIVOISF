package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Uri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Uri currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Uri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272UriIterator theOBI_0000272 = (OBI_0000272UriIterator)findAncestorWithClass(this, OBI_0000272UriIterator.class);
			pageContext.getOut().print(theOBI_0000272.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for uri tag ");
		}
		return SKIP_BODY;
	}
}

