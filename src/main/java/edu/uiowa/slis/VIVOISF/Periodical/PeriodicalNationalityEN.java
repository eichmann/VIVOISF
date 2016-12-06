package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNationalityENIterator thePeriodical = (PeriodicalNationalityENIterator)findAncestorWithClass(this, PeriodicalNationalityENIterator.class);
			pageContext.getOut().print(thePeriodical.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

