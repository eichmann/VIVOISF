package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAgriculturalAreaUnitIterator thePeriodical = (PeriodicalAgriculturalAreaUnitIterator)findAncestorWithClass(this, PeriodicalAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thePeriodical.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

