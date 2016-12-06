package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalLandAreaTotalIterator thePeriodical = (PeriodicalLandAreaTotalIterator)findAncestorWithClass(this, PeriodicalLandAreaTotalIterator.class);
			pageContext.getOut().print(thePeriodical.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

