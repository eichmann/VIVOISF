package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyDateTimeValueIterator theGovernmentAgencyDateTimeValueIterator = (GovernmentAgencyDateTimeValueIterator)findAncestorWithClass(this, GovernmentAgencyDateTimeValueIterator.class);
			pageContext.getOut().print(theGovernmentAgencyDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

