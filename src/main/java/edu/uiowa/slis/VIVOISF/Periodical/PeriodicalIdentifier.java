package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIdentifierIterator thePeriodical = (PeriodicalIdentifierIterator)findAncestorWithClass(this, PeriodicalIdentifierIterator.class);
			pageContext.getOut().print(thePeriodical.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for identifier tag ");
		}
		return SKIP_BODY;
	}
}

