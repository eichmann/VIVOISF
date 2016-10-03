package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCourtInverseIterator theGovernmentAgencyCourtInverseIterator = (GovernmentAgencyCourtInverseIterator)findAncestorWithClass(this, GovernmentAgencyCourtInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for court tag ");
		}
		return SKIP_BODY;
	}
}

