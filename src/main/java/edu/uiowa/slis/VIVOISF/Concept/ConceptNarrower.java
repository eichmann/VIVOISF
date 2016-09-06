package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptNarrower extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptNarrower currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptNarrower.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptNarrowerIterator theConceptNarrowerIterator = (ConceptNarrowerIterator)findAncestorWithClass(this, ConceptNarrowerIterator.class);
			pageContext.getOut().print(theConceptNarrowerIterator.getNarrower());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for narrower tag ");
		}
		return SKIP_BODY;
	}
}

