package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272PageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272PageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272PageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272PageEndIterator theOBI_0000272 = (OBI_0000272PageEndIterator)findAncestorWithClass(this, OBI_0000272PageEndIterator.class);
			pageContext.getOut().print(theOBI_0000272.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

