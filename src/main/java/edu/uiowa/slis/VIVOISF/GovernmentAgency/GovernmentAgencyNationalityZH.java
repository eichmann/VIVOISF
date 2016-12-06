package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNationalityZHIterator theGovernmentAgency = (GovernmentAgencyNationalityZHIterator)findAncestorWithClass(this, GovernmentAgencyNationalityZHIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

