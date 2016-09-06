package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272PresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272PresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272PresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272PresentedAtIterator theOBI_0000272PresentedAtIterator = (OBI_0000272PresentedAtIterator)findAncestorWithClass(this, OBI_0000272PresentedAtIterator.class);
			pageContext.getOut().print(theOBI_0000272PresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

