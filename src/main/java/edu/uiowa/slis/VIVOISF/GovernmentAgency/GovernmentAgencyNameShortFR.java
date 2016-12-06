package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameShortFRIterator theGovernmentAgency = (GovernmentAgencyNameShortFRIterator)findAncestorWithClass(this, GovernmentAgencyNameShortFRIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

