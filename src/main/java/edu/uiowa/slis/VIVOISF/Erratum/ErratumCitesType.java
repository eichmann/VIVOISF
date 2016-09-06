package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumCitesIterator theErratumCitesIterator = (ErratumCitesIterator)findAncestorWithClass(this, ErratumCitesIterator.class);
			pageContext.getOut().print(theErratumCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for cites tag ");
		}
		return SKIP_BODY;
	}
}

