package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptNarrowerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptNarrowerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptNarrowerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptNarrowerIterator theConceptNarrowerIterator = (ConceptNarrowerIterator)findAncestorWithClass(this, ConceptNarrowerIterator.class);
			pageContext.getOut().print(theConceptNarrowerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for narrower tag ");
		}
		return SKIP_BODY;
	}
}

