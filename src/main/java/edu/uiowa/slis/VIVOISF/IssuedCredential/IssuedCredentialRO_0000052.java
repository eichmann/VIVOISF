package edu.uiowa.slis.VIVOISF.IssuedCredential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuedCredentialRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuedCredentialRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuedCredentialRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssuedCredentialRO_0000052Iterator theIssuedCredentialRO_0000052Iterator = (IssuedCredentialRO_0000052Iterator)findAncestorWithClass(this, IssuedCredentialRO_0000052Iterator.class);
			pageContext.getOut().print(theIssuedCredentialRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing IssuedCredential for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssuedCredential for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

