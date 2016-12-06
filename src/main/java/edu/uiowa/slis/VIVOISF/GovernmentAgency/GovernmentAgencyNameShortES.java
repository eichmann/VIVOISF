package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameShortESIterator theGovernmentAgency = (GovernmentAgencyNameShortESIterator)findAncestorWithClass(this, GovernmentAgencyNameShortESIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

