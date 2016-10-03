package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIssnIterator thePeriodical = (PeriodicalIssnIterator)findAncestorWithClass(this, PeriodicalIssnIterator.class);
			pageContext.getOut().print(thePeriodical.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for issn tag ");
		}
		return SKIP_BODY;
	}
}

