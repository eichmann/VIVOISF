package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsReviewOfIterator theProceedingsReviewOfIterator = (ProceedingsReviewOfIterator)findAncestorWithClass(this, ProceedingsReviewOfIterator.class);
			pageContext.getOut().print(theProceedingsReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

