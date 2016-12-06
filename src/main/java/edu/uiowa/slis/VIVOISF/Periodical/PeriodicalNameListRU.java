package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameListRUIterator thePeriodical = (PeriodicalNameListRUIterator)findAncestorWithClass(this, PeriodicalNameListRUIterator.class);
			pageContext.getOut().print(thePeriodical.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

