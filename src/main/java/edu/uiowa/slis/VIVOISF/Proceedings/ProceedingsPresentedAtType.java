package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPresentedAtIterator theProceedingsPresentedAtIterator = (ProceedingsPresentedAtIterator)findAncestorWithClass(this, ProceedingsPresentedAtIterator.class);
			pageContext.getOut().print(theProceedingsPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

