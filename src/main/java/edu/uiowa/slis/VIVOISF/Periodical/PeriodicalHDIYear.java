package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHDIYearIterator thePeriodical = (PeriodicalHDIYearIterator)findAncestorWithClass(this, PeriodicalHDIYearIterator.class);
			pageContext.getOut().print(thePeriodical.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

