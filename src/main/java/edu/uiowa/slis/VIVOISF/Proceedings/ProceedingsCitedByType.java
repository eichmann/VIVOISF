package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsCitedByIterator theProceedingsCitedByIterator = (ProceedingsCitedByIterator)findAncestorWithClass(this, ProceedingsCitedByIterator.class);
			pageContext.getOut().print(theProceedingsCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

