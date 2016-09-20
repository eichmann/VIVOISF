package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeIssuerInverseIterator theCommitteeIssuerInverseIterator = (CommitteeIssuerInverseIterator)findAncestorWithClass(this, CommitteeIssuerInverseIterator.class);
			pageContext.getOut().print(theCommitteeIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for issuer tag ");
		}
		return SKIP_BODY;
	}
}

