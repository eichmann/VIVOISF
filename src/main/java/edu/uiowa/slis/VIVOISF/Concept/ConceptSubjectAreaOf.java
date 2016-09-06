package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSubjectAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptSubjectAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSubjectAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptSubjectAreaOfIterator theConceptSubjectAreaOfIterator = (ConceptSubjectAreaOfIterator)findAncestorWithClass(this, ConceptSubjectAreaOfIterator.class);
			pageContext.getOut().print(theConceptSubjectAreaOfIterator.getSubjectAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

