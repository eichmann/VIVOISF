package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			if (!theGovernmentAgency.commitNeeded) {
				pageContext.getOut().print(theGovernmentAgency.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			return theGovernmentAgency.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentAgency for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			theGovernmentAgency.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hideFromDisplay tag ");
		}
	}
}

