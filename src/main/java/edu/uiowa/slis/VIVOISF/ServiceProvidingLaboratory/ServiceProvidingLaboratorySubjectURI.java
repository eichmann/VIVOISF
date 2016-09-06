package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratorySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratorySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratorySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			if (!theServiceProvidingLaboratory.commitNeeded) {
				pageContext.getOut().print(theServiceProvidingLaboratory.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			return theServiceProvidingLaboratory.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ServiceProvidingLaboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			theServiceProvidingLaboratory.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for subjectURI tag ");
		}
	}
}

