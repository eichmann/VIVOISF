package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyIssuerInverseIterator theEmeritusFacultyIssuerInverseIterator = (EmeritusFacultyIssuerInverseIterator)findAncestorWithClass(this, EmeritusFacultyIssuerInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for issuer tag ");
		}
		return SKIP_BODY;
	}
}

