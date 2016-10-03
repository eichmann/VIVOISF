package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeSemanticRelationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeSemanticRelationIterator theThesisDegreeSemanticRelationIterator = (ThesisDegreeSemanticRelationIterator)findAncestorWithClass(this, ThesisDegreeSemanticRelationIterator.class);
			pageContext.getOut().print(theThesisDegreeSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

