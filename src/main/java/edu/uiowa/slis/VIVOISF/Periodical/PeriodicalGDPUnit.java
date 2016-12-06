package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalGDPUnitIterator thePeriodical = (PeriodicalGDPUnitIterator)findAncestorWithClass(this, PeriodicalGDPUnitIterator.class);
			pageContext.getOut().print(thePeriodical.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

