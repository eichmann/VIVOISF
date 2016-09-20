package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeIssuerInverseIterator theCommitteeIssuerInverseIterator = (CommitteeIssuerInverseIterator)findAncestorWithClass(this, CommitteeIssuerInverseIterator.class);
			pageContext.getOut().print(theCommitteeIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for issuer tag ");
		}
		return SKIP_BODY;
	}
}

