package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsProceedingsOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsProceedingsOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsProceedingsOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsProceedingsOfIterator theProceedingsProceedingsOfIterator = (ProceedingsProceedingsOfIterator)findAncestorWithClass(this, ProceedingsProceedingsOfIterator.class);
			pageContext.getOut().print(theProceedingsProceedingsOfIterator.getProceedingsOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for proceedingsOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for proceedingsOf tag ");
		}
		return SKIP_BODY;
	}
}

