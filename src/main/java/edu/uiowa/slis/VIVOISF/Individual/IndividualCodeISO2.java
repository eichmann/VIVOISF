package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeISO2Iterator theIndividual = (IndividualCodeISO2Iterator)findAncestorWithClass(this, IndividualCodeISO2Iterator.class);
			pageContext.getOut().print(theIndividual.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

