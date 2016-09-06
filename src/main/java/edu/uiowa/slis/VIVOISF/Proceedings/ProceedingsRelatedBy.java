package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsRelatedByIterator theProceedingsRelatedByIterator = (ProceedingsRelatedByIterator)findAncestorWithClass(this, ProceedingsRelatedByIterator.class);
			pageContext.getOut().print(theProceedingsRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

