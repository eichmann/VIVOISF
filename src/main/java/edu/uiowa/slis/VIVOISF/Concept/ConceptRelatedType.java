package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptRelatedType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptRelatedType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptRelatedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptRelatedIterator theConceptRelatedIterator = (ConceptRelatedIterator)findAncestorWithClass(this, ConceptRelatedIterator.class);
			pageContext.getOut().print(theConceptRelatedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for related tag ");
		}
		return SKIP_BODY;
	}
}

