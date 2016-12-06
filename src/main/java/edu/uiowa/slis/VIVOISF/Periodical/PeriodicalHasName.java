package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasNameIterator thePeriodicalHasNameIterator = (PeriodicalHasNameIterator)findAncestorWithClass(this, PeriodicalHasNameIterator.class);
			pageContext.getOut().print(thePeriodicalHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasName tag ");
		}
		return SKIP_BODY;
	}
}

