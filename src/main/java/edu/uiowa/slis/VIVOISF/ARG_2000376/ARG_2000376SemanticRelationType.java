package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376SemanticRelationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376SemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376SemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376SemanticRelationIterator theARG_2000376SemanticRelationIterator = (ARG_2000376SemanticRelationIterator)findAncestorWithClass(this, ARG_2000376SemanticRelationIterator.class);
			pageContext.getOut().print(theARG_2000376SemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

