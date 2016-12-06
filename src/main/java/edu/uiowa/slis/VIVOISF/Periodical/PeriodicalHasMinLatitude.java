package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasMinLatitudeIterator thePeriodical = (PeriodicalHasMinLatitudeIterator)findAncestorWithClass(this, PeriodicalHasMinLatitudeIterator.class);
			pageContext.getOut().print(thePeriodical.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

