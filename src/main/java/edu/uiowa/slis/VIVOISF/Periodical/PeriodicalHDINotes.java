package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHDINotesIterator thePeriodical = (PeriodicalHDINotesIterator)findAncestorWithClass(this, PeriodicalHDINotesIterator.class);
			pageContext.getOut().print(thePeriodical.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

