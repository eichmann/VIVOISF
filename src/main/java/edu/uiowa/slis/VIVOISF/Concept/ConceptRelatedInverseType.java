package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptRelatedInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptRelatedInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptRelatedInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptRelatedInverseIterator theConceptRelatedInverseIterator = (ConceptRelatedInverseIterator)findAncestorWithClass(this, ConceptRelatedInverseIterator.class);
			pageContext.getOut().print(theConceptRelatedInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for related tag ");
		}
		return SKIP_BODY;
	}
}

