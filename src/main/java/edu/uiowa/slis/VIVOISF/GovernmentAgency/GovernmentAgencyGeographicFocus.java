package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyGeographicFocusIterator theGovernmentAgencyGeographicFocusIterator = (GovernmentAgencyGeographicFocusIterator)findAncestorWithClass(this, GovernmentAgencyGeographicFocusIterator.class);
			pageContext.getOut().print(theGovernmentAgencyGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

