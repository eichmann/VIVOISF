package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasTelephoneIterator theGovernmentAgencyHasTelephoneIterator = (GovernmentAgencyHasTelephoneIterator)findAncestorWithClass(this, GovernmentAgencyHasTelephoneIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

