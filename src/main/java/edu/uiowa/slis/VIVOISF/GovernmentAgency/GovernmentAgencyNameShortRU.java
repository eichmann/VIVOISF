package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameShortRUIterator theGovernmentAgency = (GovernmentAgencyNameShortRUIterator)findAncestorWithClass(this, GovernmentAgencyNameShortRUIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

