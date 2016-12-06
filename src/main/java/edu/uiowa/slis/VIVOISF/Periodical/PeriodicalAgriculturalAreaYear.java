package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAgriculturalAreaYearIterator thePeriodical = (PeriodicalAgriculturalAreaYearIterator)findAncestorWithClass(this, PeriodicalAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thePeriodical.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

