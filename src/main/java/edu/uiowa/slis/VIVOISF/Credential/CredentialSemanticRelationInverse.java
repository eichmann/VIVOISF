package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialSemanticRelationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialSemanticRelationInverseIterator theCredentialSemanticRelationInverseIterator = (CredentialSemanticRelationInverseIterator)findAncestorWithClass(this, CredentialSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theCredentialSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

