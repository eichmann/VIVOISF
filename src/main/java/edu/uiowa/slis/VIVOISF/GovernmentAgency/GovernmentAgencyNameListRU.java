package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameListRUIterator theGovernmentAgency = (GovernmentAgencyNameListRUIterator)findAncestorWithClass(this, GovernmentAgencyNameListRUIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

