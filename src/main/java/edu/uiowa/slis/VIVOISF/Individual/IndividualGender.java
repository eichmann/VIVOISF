package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualGender extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualGender currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualGender.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualGenderIterator theIndividual = (IndividualGenderIterator)findAncestorWithClass(this, IndividualGenderIterator.class);
			pageContext.getOut().print(theIndividual.getGender());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for gender tag ");
		}
		return SKIP_BODY;
	}
}

