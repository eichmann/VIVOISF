package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRelatesIterator theGovernmentAgencyRelatesIterator = (GovernmentAgencyRelatesIterator)findAncestorWithClass(this, GovernmentAgencyRelatesIterator.class);
			pageContext.getOut().print(theGovernmentAgencyRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for relates tag ");
		}
		return SKIP_BODY;
	}
}

