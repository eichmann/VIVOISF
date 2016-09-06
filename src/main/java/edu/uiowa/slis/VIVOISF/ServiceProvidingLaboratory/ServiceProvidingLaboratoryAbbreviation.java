package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			if (!theServiceProvidingLaboratory.commitNeeded) {
				pageContext.getOut().print(theServiceProvidingLaboratory.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			return theServiceProvidingLaboratory.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ServiceProvidingLaboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			theServiceProvidingLaboratory.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for abbreviation tag ");
		}
	}
}

