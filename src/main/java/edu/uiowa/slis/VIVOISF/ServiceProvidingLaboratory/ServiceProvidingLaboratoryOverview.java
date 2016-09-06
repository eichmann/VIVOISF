package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			if (!theServiceProvidingLaboratory.commitNeeded) {
				pageContext.getOut().print(theServiceProvidingLaboratory.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			return theServiceProvidingLaboratory.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing ServiceProvidingLaboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			ServiceProvidingLaboratory theServiceProvidingLaboratory = (ServiceProvidingLaboratory)findAncestorWithClass(this, ServiceProvidingLaboratory.class);
			theServiceProvidingLaboratory.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for overview tag ");
		}
	}
}

