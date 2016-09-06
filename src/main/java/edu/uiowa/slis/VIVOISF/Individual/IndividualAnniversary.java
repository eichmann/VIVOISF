package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualAnniversary extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualAnniversary currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualAnniversary.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualAnniversaryIterator theIndividual = (IndividualAnniversaryIterator)findAncestorWithClass(this, IndividualAnniversaryIterator.class);
			pageContext.getOut().print(theIndividual.getAnniversary());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for anniversary tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for anniversary tag ");
		}
		return SKIP_BODY;
	}
}

