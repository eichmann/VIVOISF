package edu.uiowa.slis.VIVOISF.OrganizingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizingProcessLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizingProcessLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizingProcessLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizingProcess theOrganizingProcess = (OrganizingProcess)findAncestorWithClass(this, OrganizingProcess.class);
			if (!theOrganizingProcess.commitNeeded) {
				pageContext.getOut().print(theOrganizingProcess.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OrganizingProcess theOrganizingProcess = (OrganizingProcess)findAncestorWithClass(this, OrganizingProcess.class);
			return theOrganizingProcess.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OrganizingProcess theOrganizingProcess = (OrganizingProcess)findAncestorWithClass(this, OrganizingProcess.class);
			theOrganizingProcess.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for label tag ");
		}
	}
}

