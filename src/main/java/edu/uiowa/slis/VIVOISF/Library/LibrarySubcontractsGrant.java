package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarySubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarySubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarySubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarySubcontractsGrantIterator theLibrarySubcontractsGrantIterator = (LibrarySubcontractsGrantIterator)findAncestorWithClass(this, LibrarySubcontractsGrantIterator.class);
			pageContext.getOut().print(theLibrarySubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

