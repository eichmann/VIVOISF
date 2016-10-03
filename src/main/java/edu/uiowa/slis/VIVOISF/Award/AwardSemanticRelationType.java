package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardSemanticRelationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardSemanticRelationIterator theAwardSemanticRelationIterator = (AwardSemanticRelationIterator)findAncestorWithClass(this, AwardSemanticRelationIterator.class);
			pageContext.getOut().print(theAwardSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

