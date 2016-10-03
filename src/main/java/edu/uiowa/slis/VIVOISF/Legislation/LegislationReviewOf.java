package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationReviewOfIterator theLegislationReviewOfIterator = (LegislationReviewOfIterator)findAncestorWithClass(this, LegislationReviewOfIterator.class);
			pageContext.getOut().print(theLegislationReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

