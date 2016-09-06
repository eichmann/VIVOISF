package edu.uiowa.slis.VIVOISF.OutreachProviderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OutreachProviderRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OutreachProviderRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OutreachProviderRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OutreachProviderRole theOutreachProviderRole = (OutreachProviderRole)findAncestorWithClass(this, OutreachProviderRole.class);
			if (!theOutreachProviderRole.commitNeeded) {
				pageContext.getOut().print(theOutreachProviderRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OutreachProviderRole theOutreachProviderRole = (OutreachProviderRole)findAncestorWithClass(this, OutreachProviderRole.class);
			return theOutreachProviderRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OutreachProviderRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OutreachProviderRole theOutreachProviderRole = (OutreachProviderRole)findAncestorWithClass(this, OutreachProviderRole.class);
			theOutreachProviderRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for label tag ");
		}
	}
}

