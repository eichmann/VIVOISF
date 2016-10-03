package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalPerformerInverseIterator theHospitalPerformerInverseIterator = (HospitalPerformerInverseIterator)findAncestorWithClass(this, HospitalPerformerInverseIterator.class);
			pageContext.getOut().print(theHospitalPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for performer tag ");
		}
		return SKIP_BODY;
	}
}

