package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseSemanticRelationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseSemanticRelationIterator theLicenseSemanticRelationIterator = (LicenseSemanticRelationIterator)findAncestorWithClass(this, LicenseSemanticRelationIterator.class);
			pageContext.getOut().print(theLicenseSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing License for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

