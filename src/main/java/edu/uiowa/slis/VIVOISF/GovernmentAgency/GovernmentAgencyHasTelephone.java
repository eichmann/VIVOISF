package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasTelephoneIterator theGovernmentAgencyHasTelephoneIterator = (GovernmentAgencyHasTelephoneIterator)findAncestorWithClass(this, GovernmentAgencyHasTelephoneIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

