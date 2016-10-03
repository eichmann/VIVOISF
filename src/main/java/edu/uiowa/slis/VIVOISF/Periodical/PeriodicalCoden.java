package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodenIterator thePeriodical = (PeriodicalCodenIterator)findAncestorWithClass(this, PeriodicalCodenIterator.class);
			pageContext.getOut().print(thePeriodical.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for coden tag ");
		}
		return SKIP_BODY;
	}
}
