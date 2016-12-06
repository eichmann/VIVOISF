package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameShortITIterator theGovernmentAgency = (GovernmentAgencyNameShortITIterator)findAncestorWithClass(this, GovernmentAgencyNameShortITIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

