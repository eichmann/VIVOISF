package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalTheAbstractIterator thePeriodical = (PeriodicalTheAbstractIterator)findAncestorWithClass(this, PeriodicalTheAbstractIterator.class);
			pageContext.getOut().print(thePeriodical.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

