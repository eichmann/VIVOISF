package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameListZHIterator thePeriodical = (PeriodicalNameListZHIterator)findAncestorWithClass(this, PeriodicalNameListZHIterator.class);
			pageContext.getOut().print(thePeriodical.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

