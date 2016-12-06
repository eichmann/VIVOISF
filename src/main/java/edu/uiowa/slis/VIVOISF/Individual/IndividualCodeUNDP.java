package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCodeUNDPIterator theIndividual = (IndividualCodeUNDPIterator)findAncestorWithClass(this, IndividualCodeUNDPIterator.class);
			pageContext.getOut().print(theIndividual.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

