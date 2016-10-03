package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeSemanticRelationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeSemanticRelationInverseIterator theThesisDegreeSemanticRelationInverseIterator = (ThesisDegreeSemanticRelationInverseIterator)findAncestorWithClass(this, ThesisDegreeSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theThesisDegreeSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

