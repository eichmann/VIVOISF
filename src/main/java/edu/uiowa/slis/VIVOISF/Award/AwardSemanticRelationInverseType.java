package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardSemanticRelationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardSemanticRelationInverseIterator theAwardSemanticRelationInverseIterator = (AwardSemanticRelationInverseIterator)findAncestorWithClass(this, AwardSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theAwardSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

