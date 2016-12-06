package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNationalityITIterator thePeriodical = (PeriodicalNationalityITIterator)findAncestorWithClass(this, PeriodicalNationalityITIterator.class);
			pageContext.getOut().print(thePeriodical.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

