package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalGDPYearIterator thePeriodical = (PeriodicalGDPYearIterator)findAncestorWithClass(this, PeriodicalGDPYearIterator.class);
			pageContext.getOut().print(thePeriodical.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

