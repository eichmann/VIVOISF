package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			if (!theGovernmentAgency.commitNeeded) {
				pageContext.getOut().print(theGovernmentAgency.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			return theGovernmentAgency.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentAgency for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			theGovernmentAgency.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for abbreviation tag ");
		}
	}
}

