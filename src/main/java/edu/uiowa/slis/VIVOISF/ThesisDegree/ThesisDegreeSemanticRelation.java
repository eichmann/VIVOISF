package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeSemanticRelation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeSemanticRelationIterator theThesisDegreeSemanticRelationIterator = (ThesisDegreeSemanticRelationIterator)findAncestorWithClass(this, ThesisDegreeSemanticRelationIterator.class);
			pageContext.getOut().print(theThesisDegreeSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

