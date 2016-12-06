package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeGAULIterator theIndividual = (IndividualCodeGAULIterator)findAncestorWithClass(this, IndividualCodeGAULIterator.class);
			pageContext.getOut().print(theIndividual.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

