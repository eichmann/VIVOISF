package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardResearchAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardResearchAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardResearchAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardResearchAreaOfIterator theAwardResearchAreaOfIterator = (AwardResearchAreaOfIterator)findAncestorWithClass(this, AwardResearchAreaOfIterator.class);
			pageContext.getOut().print(theAwardResearchAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

