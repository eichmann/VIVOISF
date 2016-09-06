package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			if (!theGovernmentAgency.commitNeeded) {
				pageContext.getOut().print(theGovernmentAgency.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			return theGovernmentAgency.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentAgency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			theGovernmentAgency.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for label tag ");
		}
	}
}

