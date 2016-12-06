package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasResearchAreaIterator thePeriodicalHasResearchAreaIterator = (PeriodicalHasResearchAreaIterator)findAncestorWithClass(this, PeriodicalHasResearchAreaIterator.class);
			pageContext.getOut().print(thePeriodicalHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

