package edu.uiowa.slis.VIVOISF.AdvisorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisorRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisorRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisorRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdvisorRole theAdvisorRole = (AdvisorRole)findAncestorWithClass(this, AdvisorRole.class);
			if (!theAdvisorRole.commitNeeded) {
				pageContext.getOut().print(theAdvisorRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AdvisorRole theAdvisorRole = (AdvisorRole)findAncestorWithClass(this, AdvisorRole.class);
			return theAdvisorRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdvisorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AdvisorRole theAdvisorRole = (AdvisorRole)findAncestorWithClass(this, AdvisorRole.class);
			theAdvisorRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for label tag ");
		}
	}
}

