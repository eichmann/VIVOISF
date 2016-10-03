package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationReviewOfIterator theLegislationReviewOfIterator = (LegislationReviewOfIterator)findAncestorWithClass(this, LegislationReviewOfIterator.class);
			pageContext.getOut().print(theLegislationReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

