package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasMaxLongitudeIterator thePeriodical = (PeriodicalHasMaxLongitudeIterator)findAncestorWithClass(this, PeriodicalHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thePeriodical.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

