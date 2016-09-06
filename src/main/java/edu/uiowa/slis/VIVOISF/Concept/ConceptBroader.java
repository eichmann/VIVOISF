package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptBroader extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptBroader currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptBroader.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptBroaderIterator theConceptBroaderIterator = (ConceptBroaderIterator)findAncestorWithClass(this, ConceptBroaderIterator.class);
			pageContext.getOut().print(theConceptBroaderIterator.getBroader());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for broader tag ");
		}
		return SKIP_BODY;
	}
}

