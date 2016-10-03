package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialSemanticRelationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialSemanticRelationIterator theCredentialSemanticRelationIterator = (CredentialSemanticRelationIterator)findAncestorWithClass(this, CredentialSemanticRelationIterator.class);
			pageContext.getOut().print(theCredentialSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

