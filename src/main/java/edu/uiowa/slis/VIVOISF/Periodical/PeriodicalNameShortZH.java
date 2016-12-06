package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameShortZHIterator thePeriodical = (PeriodicalNameShortZHIterator)findAncestorWithClass(this, PeriodicalNameShortZHIterator.class);
			pageContext.getOut().print(thePeriodical.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

