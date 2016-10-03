package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptMappingRelationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptMappingRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptMappingRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptMappingRelationInverseIterator theConceptMappingRelationInverseIterator = (ConceptMappingRelationInverseIterator)findAncestorWithClass(this, ConceptMappingRelationInverseIterator.class);
			pageContext.getOut().print(theConceptMappingRelationInverseIterator.getMappingRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for mappingRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for mappingRelation tag ");
		}
		return SKIP_BODY;
	}
}

