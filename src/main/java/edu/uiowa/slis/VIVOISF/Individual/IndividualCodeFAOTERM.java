package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeFAOTERMIterator theIndividual = (IndividualCodeFAOTERMIterator)findAncestorWithClass(this, IndividualCodeFAOTERMIterator.class);
			pageContext.getOut().print(theIndividual.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

