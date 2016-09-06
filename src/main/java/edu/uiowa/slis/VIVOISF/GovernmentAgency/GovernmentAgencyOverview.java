package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			if (!theGovernmentAgency.commitNeeded) {
				pageContext.getOut().print(theGovernmentAgency.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			return theGovernmentAgency.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentAgency for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			theGovernmentAgency.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for overview tag ");
		}
	}
}

