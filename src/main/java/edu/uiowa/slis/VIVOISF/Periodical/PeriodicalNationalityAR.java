package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNationalityARIterator thePeriodical = (PeriodicalNationalityARIterator)findAncestorWithClass(this, PeriodicalNationalityARIterator.class);
			pageContext.getOut().print(thePeriodical.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

