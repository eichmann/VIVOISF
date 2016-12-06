package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConceptDescriptionIterator theConcept = (ConceptDescriptionIterator)findAncestorWithClass(this, ConceptDescriptionIterator.class);
			pageContext.getOut().print(theConcept.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for description tag ");
		}
		return SKIP_BODY;
	}
}

