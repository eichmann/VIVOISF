package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianIssuerInverseIterator theEmeritusLibrarianIssuerInverseIterator = (EmeritusLibrarianIssuerInverseIterator)findAncestorWithClass(this, EmeritusLibrarianIssuerInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for issuer tag ");
		}
		return SKIP_BODY;
	}
}

