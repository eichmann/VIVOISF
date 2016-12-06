package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameOfficialRUIterator thePeriodical = (PeriodicalNameOfficialRUIterator)findAncestorWithClass(this, PeriodicalNameOfficialRUIterator.class);
			pageContext.getOut().print(thePeriodical.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

