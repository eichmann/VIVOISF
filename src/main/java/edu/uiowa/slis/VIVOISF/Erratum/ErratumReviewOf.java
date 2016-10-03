package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumReviewOfIterator theErratumReviewOfIterator = (ErratumReviewOfIterator)findAncestorWithClass(this, ErratumReviewOfIterator.class);
			pageContext.getOut().print(theErratumReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

