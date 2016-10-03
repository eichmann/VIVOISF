package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsCodenIterator theProceedings = (ProceedingsCodenIterator)findAncestorWithClass(this, ProceedingsCodenIterator.class);
			pageContext.getOut().print(theProceedings.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for coden tag ");
		}
		return SKIP_BODY;
	}
}

