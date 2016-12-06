package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasResearchAreaIterator theIndividualHasResearchAreaIterator = (IndividualHasResearchAreaIterator)findAncestorWithClass(this, IndividualHasResearchAreaIterator.class);
			pageContext.getOut().print(theIndividualHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

