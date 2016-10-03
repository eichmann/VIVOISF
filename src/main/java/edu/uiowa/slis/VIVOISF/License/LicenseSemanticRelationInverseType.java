package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseSemanticRelationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseSemanticRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseSemanticRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseSemanticRelationInverseIterator theLicenseSemanticRelationInverseIterator = (LicenseSemanticRelationInverseIterator)findAncestorWithClass(this, LicenseSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theLicenseSemanticRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing License for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

