package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalRelatedByIterator thePeriodicalRelatedByIterator = (PeriodicalRelatedByIterator)findAncestorWithClass(this, PeriodicalRelatedByIterator.class);
			pageContext.getOut().print(thePeriodicalRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

