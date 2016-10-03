package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptMemberInverseIterator theConceptMemberInverseIterator = (ConceptMemberInverseIterator)findAncestorWithClass(this, ConceptMemberInverseIterator.class);
			pageContext.getOut().print(theConceptMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for member tag ");
		}
		return SKIP_BODY;
	}
}

