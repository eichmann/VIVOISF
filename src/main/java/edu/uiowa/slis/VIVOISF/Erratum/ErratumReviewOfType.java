package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumReviewOfIterator theErratumReviewOfIterator = (ErratumReviewOfIterator)findAncestorWithClass(this, ErratumReviewOfIterator.class);
			pageContext.getOut().print(theErratumReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

