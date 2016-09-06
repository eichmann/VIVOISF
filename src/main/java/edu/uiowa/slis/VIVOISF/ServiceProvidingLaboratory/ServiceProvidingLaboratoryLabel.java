package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			if (!theServiceProvidingLaboratory.commitNeeded) {
				pageContext.getOut().print(theServiceProvidingLaboratory.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			return theServiceProvidingLaboratory.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ServiceProvidingLaboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			theServiceProvidingLaboratory.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for label tag ");
		}
	}
}

