package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameListESIterator theGovernmentAgency = (GovernmentAgencyNameListESIterator)findAncestorWithClass(this, GovernmentAgencyNameListESIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

