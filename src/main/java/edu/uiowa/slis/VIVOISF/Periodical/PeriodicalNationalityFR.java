package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNationalityFRIterator thePeriodical = (PeriodicalNationalityFRIterator)findAncestorWithClass(this, PeriodicalNationalityFRIterator.class);
			pageContext.getOut().print(thePeriodical.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

