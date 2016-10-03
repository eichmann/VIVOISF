package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptMappingRelation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptMappingRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptMappingRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptMappingRelationIterator theConceptMappingRelationIterator = (ConceptMappingRelationIterator)findAncestorWithClass(this, ConceptMappingRelationIterator.class);
			pageContext.getOut().print(theConceptMappingRelationIterator.getMappingRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for mappingRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for mappingRelation tag ");
		}
		return SKIP_BODY;
	}
}

