package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeUNIterator theIndividual = (IndividualCodeUNIterator)findAncestorWithClass(this, IndividualCodeUNIterator.class);
			pageContext.getOut().print(theIndividual.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

