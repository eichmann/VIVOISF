package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameListITIterator thePeriodical = (PeriodicalNameListITIterator)findAncestorWithClass(this, PeriodicalNameListITIterator.class);
			pageContext.getOut().print(thePeriodical.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

