package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameShortARIterator theGovernmentAgency = (GovernmentAgencyNameShortARIterator)findAncestorWithClass(this, GovernmentAgencyNameShortARIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

