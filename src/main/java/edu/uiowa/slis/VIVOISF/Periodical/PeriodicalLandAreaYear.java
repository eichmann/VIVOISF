package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalLandAreaYearIterator thePeriodical = (PeriodicalLandAreaYearIterator)findAncestorWithClass(this, PeriodicalLandAreaYearIterator.class);
			pageContext.getOut().print(thePeriodical.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

