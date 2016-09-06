package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPmidIterator theProceedings = (ProceedingsPmidIterator)findAncestorWithClass(this, ProceedingsPmidIterator.class);
			pageContext.getOut().print(theProceedings.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for pmid tag ");
		}
		return SKIP_BODY;
	}
}

