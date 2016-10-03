package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPerformerInverseIterator theGovernmentAgencyPerformerInverseIterator = (GovernmentAgencyPerformerInverseIterator)findAncestorWithClass(this, GovernmentAgencyPerformerInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for performer tag ");
		}
		return SKIP_BODY;
	}
}

