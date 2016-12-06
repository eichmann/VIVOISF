package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasMaxLatitudeIterator thePeriodical = (PeriodicalHasMaxLatitudeIterator)findAncestorWithClass(this, PeriodicalHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thePeriodical.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

