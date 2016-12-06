package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameListZHIterator theGovernmentAgency = (GovernmentAgencyNameListZHIterator)findAncestorWithClass(this, GovernmentAgencyNameListZHIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

