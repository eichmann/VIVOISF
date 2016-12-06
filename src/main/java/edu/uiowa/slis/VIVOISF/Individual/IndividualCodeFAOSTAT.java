package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeFAOSTATIterator theIndividual = (IndividualCodeFAOSTATIterator)findAncestorWithClass(this, IndividualCodeFAOSTATIterator.class);
			pageContext.getOut().print(theIndividual.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

