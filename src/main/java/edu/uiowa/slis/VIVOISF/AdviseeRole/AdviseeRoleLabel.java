package edu.uiowa.slis.VIVOISF.AdviseeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdviseeRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdviseeRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AdviseeRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdviseeRole theAdviseeRole = (AdviseeRole)findAncestorWithClass(this, AdviseeRole.class);
			if (!theAdviseeRole.commitNeeded) {
				pageContext.getOut().print(theAdviseeRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AdviseeRole theAdviseeRole = (AdviseeRole)findAncestorWithClass(this, AdviseeRole.class);
			return theAdviseeRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdviseeRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AdviseeRole theAdviseeRole = (AdviseeRole)findAncestorWithClass(this, AdviseeRole.class);
			theAdviseeRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for label tag ");
		}
	}
}

