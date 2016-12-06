package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalDescriptionIterator thePeriodical = (PeriodicalDescriptionIterator)findAncestorWithClass(this, PeriodicalDescriptionIterator.class);
			pageContext.getOut().print(thePeriodical.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for description tag ");
		}
		return SKIP_BODY;
	}
}

