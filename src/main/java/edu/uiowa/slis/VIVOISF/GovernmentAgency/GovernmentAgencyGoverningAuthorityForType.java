package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyGoverningAuthorityForIterator theGovernmentAgencyGoverningAuthorityForIterator = (GovernmentAgencyGoverningAuthorityForIterator)findAncestorWithClass(this, GovernmentAgencyGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theGovernmentAgencyGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

