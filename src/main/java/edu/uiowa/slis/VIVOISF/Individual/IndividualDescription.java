package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualDescriptionIterator theIndividual = (IndividualDescriptionIterator)findAncestorWithClass(this, IndividualDescriptionIterator.class);
			pageContext.getOut().print(theIndividual.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for description tag ");
		}
		return SKIP_BODY;
	}
}

