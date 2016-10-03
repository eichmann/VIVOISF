package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPagesIterator theProceedings = (ProceedingsPagesIterator)findAncestorWithClass(this, ProceedingsPagesIterator.class);
			pageContext.getOut().print(theProceedings.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for pages tag ");
		}
		return SKIP_BODY;
	}
}

