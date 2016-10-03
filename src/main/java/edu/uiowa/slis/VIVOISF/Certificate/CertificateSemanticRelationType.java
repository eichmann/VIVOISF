package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateSemanticRelationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateSemanticRelationIterator theCertificateSemanticRelationIterator = (CertificateSemanticRelationIterator)findAncestorWithClass(this, CertificateSemanticRelationIterator.class);
			pageContext.getOut().print(theCertificateSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

