package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumSubcontractsGrantIterator theMuseumSubcontractsGrantIterator = (MuseumSubcontractsGrantIterator)findAncestorWithClass(this, MuseumSubcontractsGrantIterator.class);
			pageContext.getOut().print(theMuseumSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

