package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameShortFRIterator thePeriodical = (PeriodicalNameShortFRIterator)findAncestorWithClass(this, PeriodicalNameShortFRIterator.class);
			pageContext.getOut().print(thePeriodical.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

