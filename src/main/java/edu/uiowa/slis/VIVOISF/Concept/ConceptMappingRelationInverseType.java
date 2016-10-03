package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptMappingRelationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptMappingRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptMappingRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptMappingRelationInverseIterator theConceptMappingRelationInverseIterator = (ConceptMappingRelationInverseIterator)findAncestorWithClass(this, ConceptMappingRelationInverseIterator.class);
			pageContext.getOut().print(theConceptMappingRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for mappingRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for mappingRelation tag ");
		}
		return SKIP_BODY;
	}
}

