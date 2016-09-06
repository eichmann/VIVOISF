package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsNumPagesIterator theProceedings = (ProceedingsNumPagesIterator)findAncestorWithClass(this, ProceedingsNumPagesIterator.class);
			pageContext.getOut().print(theProceedings.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for numPages tag ");
		}
		return SKIP_BODY;
	}
}

