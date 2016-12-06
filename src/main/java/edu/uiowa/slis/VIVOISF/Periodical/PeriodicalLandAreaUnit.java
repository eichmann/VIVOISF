package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalLandAreaUnitIterator thePeriodical = (PeriodicalLandAreaUnitIterator)findAncestorWithClass(this, PeriodicalLandAreaUnitIterator.class);
			pageContext.getOut().print(thePeriodical.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

