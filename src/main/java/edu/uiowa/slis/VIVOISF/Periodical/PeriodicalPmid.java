package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPmidIterator thePeriodical = (PeriodicalPmidIterator)findAncestorWithClass(this, PeriodicalPmidIterator.class);
			pageContext.getOut().print(thePeriodical.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for pmid tag ");
		}
		return SKIP_BODY;
	}
}

