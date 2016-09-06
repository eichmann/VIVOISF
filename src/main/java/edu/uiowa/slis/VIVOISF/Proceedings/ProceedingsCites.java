package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsCitesIterator theProceedingsCitesIterator = (ProceedingsCitesIterator)findAncestorWithClass(this, ProceedingsCitesIterator.class);
			pageContext.getOut().print(theProceedingsCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for cites tag ");
		}
		return SKIP_BODY;
	}
}

