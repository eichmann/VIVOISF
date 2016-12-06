package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalGeographicFocusIterator thePeriodicalGeographicFocusIterator = (PeriodicalGeographicFocusIterator)findAncestorWithClass(this, PeriodicalGeographicFocusIterator.class);
			pageContext.getOut().print(thePeriodicalGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

