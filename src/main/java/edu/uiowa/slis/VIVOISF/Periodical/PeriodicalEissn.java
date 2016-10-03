package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalEissnIterator thePeriodical = (PeriodicalEissnIterator)findAncestorWithClass(this, PeriodicalEissnIterator.class);
			pageContext.getOut().print(thePeriodical.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for eissn tag ");
		}
		return SKIP_BODY;
	}
}

