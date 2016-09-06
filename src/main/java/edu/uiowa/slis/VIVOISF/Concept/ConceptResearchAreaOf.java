package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptResearchAreaOfIterator theConceptResearchAreaOfIterator = (ConceptResearchAreaOfIterator)findAncestorWithClass(this, ConceptResearchAreaOfIterator.class);
			pageContext.getOut().print(theConceptResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

