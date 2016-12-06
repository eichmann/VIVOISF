package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyDateTimeIntervalIterator theGovernmentAgencyDateTimeIntervalIterator = (GovernmentAgencyDateTimeIntervalIterator)findAncestorWithClass(this, GovernmentAgencyDateTimeIntervalIterator.class);
			pageContext.getOut().print(theGovernmentAgencyDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

