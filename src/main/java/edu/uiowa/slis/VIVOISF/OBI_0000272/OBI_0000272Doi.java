package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272DoiIterator theOBI_0000272 = (OBI_0000272DoiIterator)findAncestorWithClass(this, OBI_0000272DoiIterator.class);
			pageContext.getOut().print(theOBI_0000272.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for doi tag ");
		}
		return SKIP_BODY;
	}
}

