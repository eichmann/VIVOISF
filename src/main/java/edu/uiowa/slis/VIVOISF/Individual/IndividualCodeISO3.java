package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeISO3Iterator theIndividual = (IndividualCodeISO3Iterator)findAncestorWithClass(this, IndividualCodeISO3Iterator.class);
			pageContext.getOut().print(theIndividual.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

