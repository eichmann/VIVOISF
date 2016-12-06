package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasResearchAreaIterator thePeriodicalHasResearchAreaIterator = (PeriodicalHasResearchAreaIterator)findAncestorWithClass(this, PeriodicalHasResearchAreaIterator.class);
			pageContext.getOut().print(thePeriodicalHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

