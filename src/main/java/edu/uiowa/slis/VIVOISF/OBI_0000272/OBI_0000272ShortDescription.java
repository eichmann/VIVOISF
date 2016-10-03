package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272ShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272ShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272ShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272ShortDescriptionIterator theOBI_0000272 = (OBI_0000272ShortDescriptionIterator)findAncestorWithClass(this, OBI_0000272ShortDescriptionIterator.class);
			pageContext.getOut().print(theOBI_0000272.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

