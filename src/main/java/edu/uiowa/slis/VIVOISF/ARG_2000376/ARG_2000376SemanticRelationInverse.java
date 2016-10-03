package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376SemanticRelationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376SemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376SemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376SemanticRelationInverseIterator theARG_2000376SemanticRelationInverseIterator = (ARG_2000376SemanticRelationInverseIterator)findAncestorWithClass(this, ARG_2000376SemanticRelationInverseIterator.class);
			pageContext.getOut().print(theARG_2000376SemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

