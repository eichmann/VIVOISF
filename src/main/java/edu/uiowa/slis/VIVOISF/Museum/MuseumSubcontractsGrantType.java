package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumSubcontractsGrantIterator theMuseumSubcontractsGrantIterator = (MuseumSubcontractsGrantIterator)findAncestorWithClass(this, MuseumSubcontractsGrantIterator.class);
			pageContext.getOut().print(theMuseumSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

