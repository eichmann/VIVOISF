package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalInformationResourceSupportedByIterator thePeriodicalInformationResourceSupportedByIterator = (PeriodicalInformationResourceSupportedByIterator)findAncestorWithClass(this, PeriodicalInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(thePeriodicalInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

