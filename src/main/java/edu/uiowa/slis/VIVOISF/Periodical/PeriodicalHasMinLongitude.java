package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasMinLongitudeIterator thePeriodical = (PeriodicalHasMinLongitudeIterator)findAncestorWithClass(this, PeriodicalHasMinLongitudeIterator.class);
			pageContext.getOut().print(thePeriodical.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

