package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptRelated extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptRelated currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptRelated.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptRelatedIterator theConceptRelatedIterator = (ConceptRelatedIterator)findAncestorWithClass(this, ConceptRelatedIterator.class);
			pageContext.getOut().print(theConceptRelatedIterator.getRelated());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for related tag ");
		}
		return SKIP_BODY;
	}
}

