package edu.uiowa.slis.VIVOISF.PresenterRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresenterRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresenterRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PresenterRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PresenterRole thePresenterRole = (PresenterRole)findAncestorWithClass(this, PresenterRole.class);
			if (!thePresenterRole.commitNeeded) {
				pageContext.getOut().print(thePresenterRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PresenterRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PresenterRole thePresenterRole = (PresenterRole)findAncestorWithClass(this, PresenterRole.class);
			return thePresenterRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PresenterRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PresenterRole thePresenterRole = (PresenterRole)findAncestorWithClass(this, PresenterRole.class);
			thePresenterRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PresenterRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for label tag ");
		}
	}
}

