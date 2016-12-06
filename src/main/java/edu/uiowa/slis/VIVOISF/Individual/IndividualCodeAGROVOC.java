package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeAGROVOCIterator theIndividual = (IndividualCodeAGROVOCIterator)findAncestorWithClass(this, IndividualCodeAGROVOCIterator.class);
			pageContext.getOut().print(theIndividual.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

