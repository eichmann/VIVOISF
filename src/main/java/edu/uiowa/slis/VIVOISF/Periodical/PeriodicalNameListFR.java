package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameListFRIterator thePeriodical = (PeriodicalNameListFRIterator)findAncestorWithClass(this, PeriodicalNameListFRIterator.class);
			pageContext.getOut().print(thePeriodical.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

