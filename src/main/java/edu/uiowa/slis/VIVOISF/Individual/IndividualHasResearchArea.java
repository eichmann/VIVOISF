package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasResearchAreaIterator theIndividualHasResearchAreaIterator = (IndividualHasResearchAreaIterator)findAncestorWithClass(this, IndividualHasResearchAreaIterator.class);
			pageContext.getOut().print(theIndividualHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

