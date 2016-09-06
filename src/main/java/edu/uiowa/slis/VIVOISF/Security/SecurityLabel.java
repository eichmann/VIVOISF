package edu.uiowa.slis.VIVOISF.Security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SecurityLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SecurityLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SecurityLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Security theSecurity = (Security)findAncestorWithClass(this, Security.class);
			if (!theSecurity.commitNeeded) {
				pageContext.getOut().print(theSecurity.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Security for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Security for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Security theSecurity = (Security)findAncestorWithClass(this, Security.class);
			return theSecurity.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Security for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Security for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Security theSecurity = (Security)findAncestorWithClass(this, Security.class);
			theSecurity.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Security for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Security for label tag ");
		}
	}
}

