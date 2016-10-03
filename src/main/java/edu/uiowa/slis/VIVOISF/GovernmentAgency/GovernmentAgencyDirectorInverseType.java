package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyDirectorInverseIterator theGovernmentAgencyDirectorInverseIterator = (GovernmentAgencyDirectorInverseIterator)findAncestorWithClass(this, GovernmentAgencyDirectorInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for director tag ");
		}
		return SKIP_BODY;
	}
}

