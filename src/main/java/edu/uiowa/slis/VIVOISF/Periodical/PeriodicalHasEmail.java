package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasEmailIterator thePeriodicalHasEmailIterator = (PeriodicalHasEmailIterator)findAncestorWithClass(this, PeriodicalHasEmailIterator.class);
			pageContext.getOut().print(thePeriodicalHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

