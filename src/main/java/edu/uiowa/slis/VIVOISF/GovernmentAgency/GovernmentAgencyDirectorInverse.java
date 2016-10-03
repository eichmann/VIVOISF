package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyDirectorInverseIterator theGovernmentAgencyDirectorInverseIterator = (GovernmentAgencyDirectorInverseIterator)findAncestorWithClass(this, GovernmentAgencyDirectorInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for director tag ");
		}
		return SKIP_BODY;
	}
}

