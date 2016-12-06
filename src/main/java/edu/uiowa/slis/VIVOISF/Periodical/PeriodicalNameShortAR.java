package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameShortARIterator thePeriodical = (PeriodicalNameShortARIterator)findAncestorWithClass(this, PeriodicalNameShortARIterator.class);
			pageContext.getOut().print(thePeriodical.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

