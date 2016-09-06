package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalSubcontractsGrantIterator theHospitalSubcontractsGrantIterator = (HospitalSubcontractsGrantIterator)findAncestorWithClass(this, HospitalSubcontractsGrantIterator.class);
			pageContext.getOut().print(theHospitalSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

