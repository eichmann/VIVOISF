package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameListESIterator thePeriodical = (PeriodicalNameListESIterator)findAncestorWithClass(this, PeriodicalNameListESIterator.class);
			pageContext.getOut().print(thePeriodical.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

