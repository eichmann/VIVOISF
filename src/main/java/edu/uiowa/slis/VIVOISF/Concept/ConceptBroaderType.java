package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptBroaderType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptBroaderType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptBroaderType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptBroaderIterator theConceptBroaderIterator = (ConceptBroaderIterator)findAncestorWithClass(this, ConceptBroaderIterator.class);
			pageContext.getOut().print(theConceptBroaderIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for broader tag ");
		}
		return SKIP_BODY;
	}
}

