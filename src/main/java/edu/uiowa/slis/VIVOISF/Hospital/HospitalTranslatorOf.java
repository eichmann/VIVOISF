package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalTranslatorOfIterator theHospitalTranslatorOfIterator = (HospitalTranslatorOfIterator)findAncestorWithClass(this, HospitalTranslatorOfIterator.class);
			pageContext.getOut().print(theHospitalTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

